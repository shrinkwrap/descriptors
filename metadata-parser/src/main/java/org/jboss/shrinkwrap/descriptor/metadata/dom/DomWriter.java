/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.shrinkwrap.descriptor.metadata.dom;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataDescriptor;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataEnum;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataItem;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataJavaDoc;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.thoughtworks.qdox.JavaProjectBuilder;
import com.thoughtworks.qdox.model.JavaAnnotation;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.JavaSource;
import com.thoughtworks.qdox.model.expression.AnnotationValue;

/**
 * This class writes an XML file based on the meta-data information.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class DomWriter {

    private static final Logger log = Logger.getLogger(DomWriter.class.getName());

    /**
     * Writes an XML file based on the given meta-data information at the specified location.
     *
     * TODO: a lot of recurring code is here, needs to be refactored.
     *
     * @param metadata
     * @param pathToMetadata
     */
    public void write(final Metadata metadata, final String pathToMetadata,
        final List<? extends MetadataJavaDoc> javadocTags) {
        try {
            final DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root elements
            final Document doc = docBuilder.newDocument();
            final Element rootElement = doc.createElement("metadata");
            doc.appendChild(rootElement);

            final Element javadocsElement = doc.createElement("javadocs");
            rootElement.appendChild(javadocsElement);

            final Set<String> commonPathSet = new HashSet<String>();
            final List<File> fileList = new ArrayList<File>();
            for (final MetadataDescriptor descr : metadata.getMetadataDescriptorList()) {
                if (descr.getCommon() != null) {
                    final String pathTo = descr.getCommon().getPathToCommonApi();
                    final String commonApi = descr.getCommon().getCommonApi().replace('.', '/');
                    commonPathSet.add(pathTo + "/" + commonApi);
                }
            }

            for (final String pathCommonApi : commonPathSet) {
                listFiles(fileList, pathCommonApi);
            }

            final JavaProjectBuilder builder = new JavaProjectBuilder();
            final Element generatedElement = doc.createElement("generatedClasses");
            rootElement.appendChild(generatedElement);
            for (final File file : fileList) {
                final Element generatedClassElement = doc.createElement("generatedClass");
                generatedClassElement.setAttribute("name", file.getName());
                generatedElement.appendChild(generatedClassElement);
                final JavaSource src = builder.addSource(file);
                final JavaClass class1  = src.getClasses().get(0);
                generatedClassElement.setAttribute("commonPackage", class1.getPackageName());
                final List<JavaAnnotation> annotationList = class1.getAnnotations();
                for (JavaAnnotation annotation : annotationList) {
                    final  AnnotationValue value = annotation.getProperty("common");
                    final List<String> commonExtendsList = (List<String>)value.getParameterValue();
                    for (String commonClass : commonExtendsList) {
                        final Element extendsElement = doc.createElement("commonExtends");
                        extendsElement.setAttribute("extends", commonClass.replace('"', ' ').trim());
                        generatedClassElement.appendChild(extendsElement);
                    }
                }
            }

            final Element commonPackagesElement = doc.createElement("commonPackages");
            rootElement.appendChild(commonPackagesElement);
            for (final MetadataDescriptor descr : metadata.getMetadataDescriptorList()) {
                if (descr.isGenerateCommonClasses() != null && !descr.isGenerateCommonClasses()) {
                    final Element generateElement = doc.createElement("package");
                    generateElement.setAttribute("packageApi", descr.getPackageApi());
                    generateElement.setAttribute("generate", Boolean.toString(descr.isGenerateCommonClasses()));
                    commonPackagesElement.appendChild(generateElement);
                }
            }

            final List<String> commonNewFiles = findCommonClasses(metadata);
            final Element commonNewFilesElement = doc.createElement("commonClasses");
            rootElement.appendChild(commonNewFilesElement);
            for (final String type : commonNewFiles) {
                final Element commonType = doc.createElement("typeName");
                commonType.setAttribute("name", type);
                commonNewFilesElement.appendChild(commonType);
            }

            if (javadocTags != null) {
                for (final MetadataJavaDoc javaDoc : javadocTags) {
                    final Attr javadocName = doc.createAttribute("tag");
                    javadocName.setValue(javaDoc.getTag());

                    final Attr javadocValue = doc.createAttribute("value");
                    javadocValue.setValue(javaDoc.getValue());

                    final Element tagElement = doc.createElement("tag");
                    tagElement.setAttributeNode(javadocName);
                    tagElement.setAttributeNode(javadocValue);

                    javadocsElement.appendChild(tagElement);
                }
            }

            // add packages
            final Element packages = doc.createElement("packages");
            rootElement.appendChild(packages);

            for (MetadataDescriptor descriptor : metadata.getMetadataDescriptorList()) {
                final Element packageApi = doc.createElement("api");
                final Attr packageApiName = doc.createAttribute("name");
                packageApiName.setValue(descriptor.getPackageApi());
                packageApi.setAttributeNode(packageApiName);

                final Attr schemaNameApi = doc.createAttribute("schema");
                schemaNameApi.setValue(descriptor.getSchemaName());
                packageApi.setAttributeNode(schemaNameApi);

                final Attr generateClassApi = doc.createAttribute("generateClass");
                generateClassApi.setValue(Boolean.toString(descriptor.isGenerateClasses()));
                packageApi.setAttributeNode(generateClassApi);

                if (descriptor.getPathToPackageInfoApi() != null) {
                    final Attr pathToPackageInfoApi = doc.createAttribute("packageInfo");
                    pathToPackageInfoApi.setValue(descriptor.getPathToPackageInfoApi());
                    packageApi.setAttributeNode(pathToPackageInfoApi);
                }

                if (descriptor.getCommonImports() != null) {
                    final Element commonImport = doc.createElement("commonImport");
                    for (String importDescl : descriptor.getCommonImports()) {
                        final Element importElement = doc.createElement("import");
                        importElement.setAttribute("package", importDescl);
                        commonImport.appendChild(importElement);
                    }
                    packageApi.appendChild(commonImport);
                }

                packages.appendChild(packageApi);
            }

            for (MetadataDescriptor descriptor : metadata.getMetadataDescriptorList()) {
                final Element packageImpl = doc.createElement("impl");
                final Attr packageImplName = doc.createAttribute("name");
                packageImplName.setValue(descriptor.getPackageImpl());
                packageImpl.setAttributeNode(packageImplName);

                final Attr schemaNameImpl = doc.createAttribute("schema");
                schemaNameImpl.setValue(descriptor.getSchemaName());
                packageImpl.setAttributeNode(schemaNameImpl);

                final Attr generateClassImpl = doc.createAttribute("generateClass");
                generateClassImpl.setValue(Boolean.toString(descriptor.isGenerateClasses()));
                packageImpl.setAttributeNode(generateClassImpl);

                if (descriptor.getPathToPackageInfoImpl() != null) {
                    final Attr pathToPackageInfoImpl = doc.createAttribute("packageInfo");
                    pathToPackageInfoImpl.setValue(descriptor.getPathToPackageInfoImpl());
                    packageImpl.setAttributeNode(pathToPackageInfoImpl);
                }

                packages.appendChild(packageImpl);
            }

            // add datatypes
            final Element datatypes = doc.createElement("datatypes");
            rootElement.appendChild(datatypes);
            for (MetadataItem metadataType : metadata.getDataTypeList()) {
                final Element datatype = doc.createElement("datatype");
                final Attr attrName = doc.createAttribute("name");
                attrName.setValue(metadataType.getName());
                datatype.setAttributeNode(attrName);

                final Attr attrMappedTo = doc.createAttribute("mappedTo");
                attrMappedTo.setValue(metadataType.getMappedTo());
                datatype.setAttributeNode(attrMappedTo);

                final Attr attrNamespace = doc.createAttribute("namespace");
                attrNamespace.setValue(metadataType.getNamespace());
                datatype.setAttributeNode(attrNamespace);

                final Attr attrSchemaName = doc.createAttribute("schemaName");
                attrSchemaName.setValue(metadataType.getSchemaName());
                datatype.setAttributeNode(attrSchemaName);

                datatypes.appendChild(datatype);
            }

            final Element enums = doc.createElement("enums");
            rootElement.appendChild(enums);
            for (MetadataEnum metadataEnum : metadata.getEnumList()) {
                final Element enumElement = doc.createElement("enum");
                final Attr attrName = doc.createAttribute("name");
                attrName.setValue(metadataEnum.getName());
                enumElement.setAttributeNode(attrName);

                final Attr attrNamespace = doc.createAttribute("namespace");
                attrNamespace.setValue(metadataEnum.getNamespace());
                enumElement.setAttributeNode(attrNamespace);

                final Attr attrSchemaName = doc.createAttribute("schemaName");
                attrSchemaName.setValue(metadataEnum.getSchemaName());
                enumElement.setAttributeNode(attrSchemaName);

                final Attr attrPackage = doc.createAttribute("package");
                attrPackage.setValue(metadataEnum.getPackageApi());
                enumElement.setAttributeNode(attrPackage);

                final Attr attrDocumentation = doc.createAttribute("documentation");
                attrDocumentation.setValue("");
                enumElement.setAttributeNode(attrDocumentation);

                for (String value : metadataEnum.getValueList()) {
                    final Element valueElement = doc.createElement("value");
                    valueElement.setTextContent(value);
                    enumElement.appendChild(valueElement);
                }

                enums.appendChild(enumElement);
            }

            final Element groups = doc.createElement("groups");
            rootElement.appendChild(groups);
            for (MetadataItem metadataClass : metadata.getGroupList()) {
                final Element classElement = doc.createElement("class");

                final Attr attrName = doc.createAttribute("name");
                attrName.setValue(metadataClass.getName());
                classElement.setAttributeNode(attrName);

                final Attr attrNamespace = doc.createAttribute("namespace");
                attrNamespace.setValue(metadataClass.getNamespace());
                classElement.setAttributeNode(attrNamespace);

                final Attr attrSchemaName = doc.createAttribute("schemaName");
                attrSchemaName.setValue(metadataClass.getSchemaName());
                classElement.setAttributeNode(attrSchemaName);

                final Attr attrPackageApi = doc.createAttribute("package");
                attrPackageApi.setValue(metadataClass.getPackageApi());
                classElement.setAttributeNode(attrPackageApi);

                final Attr attrDocumentation = doc.createAttribute("documentation");
                attrDocumentation.setValue("");
                classElement.setAttributeNode(attrDocumentation);

                for (MetadataElement element : metadataClass.getElements()) {
                    final Element childElement = doc.createElement("element");

                    final Attr elName = doc.createAttribute("name");
                    elName.setValue(element.getName());
                    childElement.setAttributeNode(elName);

                    final Attr elType = doc.createAttribute("type");
                    elType.setValue(element.getType());
                    childElement.setAttributeNode(elType);

                    if (element.getIsAttribute() == true) {
                        final Attr elAttribute = doc.createAttribute("attribute");
                        elAttribute.setValue(Boolean.toString(element.getIsAttribute()));
                        childElement.setAttributeNode(elAttribute);
                    }

                    if (element.getDefaultValue() != null) {
                        final Attr elAttribute = doc.createAttribute("default");
                        elAttribute.setValue(element.getDefaultValue());
                        childElement.setAttributeNode(elAttribute);
                    }

                    if (element.getFixedValue() != null) {
                        final Attr elAttribute = doc.createAttribute("fixed");
                        elAttribute.setValue(element.getFixedValue());
                        childElement.setAttributeNode(elAttribute);
                    }

                    if (element.getUse() != null) {
                        final Attr elAttribute = doc.createAttribute("use");
                        elAttribute.setValue(element.getUse());
                        childElement.setAttributeNode(elAttribute);
                    }

                    if (element.getMaxOccurs() != null) {
                        final Attr elMaxOccurs = doc.createAttribute("maxOccurs");
                        elMaxOccurs.setValue(element.getMaxOccurs());
                        childElement.setAttributeNode(elMaxOccurs);
                    }

                    classElement.appendChild(childElement);
                }

                for (MetadataElement element : metadataClass.getReferences()) {
                    final Element childElement = doc.createElement("include");

                    final Attr elName = doc.createAttribute("name");
                    elName.setValue(element.getRef());
                    childElement.setAttributeNode(elName);

                    classElement.appendChild(childElement);
                }

                groups.appendChild(classElement);
            }

            final Element classes = doc.createElement("classes");
            rootElement.appendChild(classes);
            for (MetadataItem metadataClass : metadata.getClassList()) {
                final Element classElement = doc.createElement("class");

                final Attr attrName = doc.createAttribute("name");
                attrName.setValue(metadataClass.getName());
                classElement.setAttributeNode(attrName);

                final Attr attrNamespace = doc.createAttribute("namespace");
                attrNamespace.setValue(metadataClass.getNamespace());
                classElement.setAttributeNode(attrNamespace);

                final Attr attrSchemaName = doc.createAttribute("schemaName");
                attrSchemaName.setValue(metadataClass.getSchemaName());
                classElement.setAttributeNode(attrSchemaName);

                final Attr attrPackageApi = doc.createAttribute("packageApi");
                attrPackageApi.setValue(metadataClass.getPackageApi());
                classElement.setAttributeNode(attrPackageApi);

                final Attr attrPackageImpl = doc.createAttribute("packageImpl");
                attrPackageImpl.setValue(metadataClass.getPackageImpl());
                classElement.setAttributeNode(attrPackageImpl);

                final Attr attrDocumentation = doc.createAttribute("documentation");
                attrDocumentation.setValue("");
                classElement.setAttributeNode(attrDocumentation);

                for (MetadataElement element : metadataClass.getElements()) {
                    final Element childElement = doc.createElement("element");

                    final Attr elName = doc.createAttribute("name");
                    elName.setValue(element.getName());
                    childElement.setAttributeNode(elName);

                    final Attr elType = doc.createAttribute("type");
                    elType.setValue(element.getType());
                    childElement.setAttributeNode(elType);

                    if (element.getMaxOccurs() != null) {
                        final Attr elMaxOccurs = doc.createAttribute("maxOccurs");
                        elMaxOccurs.setValue(element.getMaxOccurs());
                        childElement.setAttributeNode(elMaxOccurs);
                    }

                    if (element.getIsAttribute() == true) {
                        final Attr elAttribute = doc.createAttribute("attribute");
                        elAttribute.setValue(Boolean.toString(element.getIsAttribute()));
                        childElement.setAttributeNode(elAttribute);
                    }

                    if (element.getDefaultValue() != null) {
                        final Attr elAttribute = doc.createAttribute("default");
                        elAttribute.setValue(element.getDefaultValue());
                        childElement.setAttributeNode(elAttribute);
                    }

                    if (element.getFixedValue() != null) {
                        final Attr elAttribute = doc.createAttribute("fixed");
                        elAttribute.setValue(element.getFixedValue());
                        childElement.setAttributeNode(elAttribute);
                    }

                    if (element.getUse() != null) {
                        final Attr elAttribute = doc.createAttribute("use");
                        elAttribute.setValue(element.getUse());
                        childElement.setAttributeNode(elAttribute);
                    }

                    classElement.appendChild(childElement);
                }

                for (MetadataElement element : metadataClass.getReferences()) {
                    final Element childElement = doc.createElement("include");

                    final Attr elName = doc.createAttribute("name");
                    elName.setValue(element.getRef());
                    childElement.setAttributeNode(elName);

                    if (element.getMaxOccurs() != null) {
                        final Attr elMaxOccurs = doc.createAttribute("maxOccurs");
                        elMaxOccurs.setValue(element.getMaxOccurs());
                        childElement.setAttributeNode(elMaxOccurs);
                    }

                    classElement.appendChild(childElement);
                }

                classes.appendChild(classElement);
            }

            final Element descriptors = doc.createElement("descriptors");
            rootElement.appendChild(descriptors);

            for (MetadataDescriptor descriptor : metadata.getMetadataDescriptorList()) {
                if (descriptor.getRootElementName() != null && descriptor.getRootElementType() != null) {
                    final Element descriptorElement = doc.createElement("descriptor");
                    descriptors.appendChild(descriptorElement);

                    final Attr attrName = doc.createAttribute("name");
                    attrName.setValue(descriptor.getName());
                    descriptorElement.setAttributeNode(attrName);

                    final Attr attrSchemaName = doc.createAttribute("schemaName");
                    attrSchemaName.setValue(descriptor.getSchemaName());
                    descriptorElement.setAttributeNode(attrSchemaName);

                    final Attr attrPackageApi = doc.createAttribute("packageApi");
                    attrPackageApi.setValue(descriptor.getPackageApi());
                    descriptorElement.setAttributeNode(attrPackageApi);

                    final Attr attrPackageImpl = doc.createAttribute("packageImpl");
                    attrPackageImpl.setValue(descriptor.getPackageImpl());
                    descriptorElement.setAttributeNode(attrPackageImpl);

                    final Element element = doc.createElement("element");
                    descriptorElement.appendChild(element);

                    final Attr attElementName = doc.createAttribute("name");
                    attElementName.setValue(descriptor.getRootElementName());
                    element.setAttributeNode(attElementName);

                    final Attr attElementType = doc.createAttribute("type");
                    attElementType.setValue(descriptor.getRootElementType());
                    element.setAttributeNode(attElementType);

                    final Enumeration<?> em = descriptor.getNamespaces().keys();
                    while (em.hasMoreElements()) {
                        final String key = (String) em.nextElement();
                        final String value = (String) descriptor.getNamespaces().get(key);
                        final Attr namespaceAttrName = doc.createAttribute("name");
                        namespaceAttrName.setValue(key);

                        final Attr namespaceAttrValue = doc.createAttribute("value");
                        namespaceAttrValue.setValue(value);

                        final Element namespaceElement = doc.createElement("namespace");
                        namespaceElement.setAttributeNode(namespaceAttrName);
                        namespaceElement.setAttributeNode(namespaceAttrValue);

                        descriptorElement.appendChild(namespaceElement);
                    }

                    if (descriptor.getCommonRef() != null) {
                        final Element commonRefElement = doc.createElement("commonRef");
                        commonRefElement.setAttribute("refid", descriptor.getCommonRef().getRefid());
                        descriptorElement.appendChild(commonRefElement);
                    }

                    if (descriptor.getCommon() != null) {
                        final Element commonElement = doc.createElement("common");
                        commonElement.setAttribute("pathToCommonApi", descriptor.getCommon().getPathToCommonApi());
                        commonElement.setAttribute("commonDescriptorName", descriptor.getCommon().getCommonDescriptorName());
                        commonElement.setAttribute("commonApi", descriptor.getCommon().getCommonApi());
                        commonElement.setAttribute("commonNamespace", descriptor.getCommon().getCommonNamespace());
                        commonElement.setAttribute("id", descriptor.getCommon().getId());
                        commonElement.setAttribute("generate", descriptor.getCommon().getGenerate().toString());

                        if (descriptor.getCommon().getCommonImports() != null) {
                            final Element commonImport = doc.createElement("commonImport");
                            for (String importDescl : descriptor.getCommon().getCommonImports()) {
                                final Element importElement = doc.createElement("import");
                                importElement.setAttribute("package", importDescl);
                                commonImport.appendChild(importElement);
                            }
                            commonElement.appendChild(commonImport);
                        }

                        if (descriptor.getCommon().getTypes() != null) {
                            final Element commonTypes = doc.createElement("commonTypes");
                            for (String type : descriptor.getCommon().getTypes()) {
                                final Element typeElement = doc.createElement("type");
                                final String[] items = type.split(":", -1);
                                if (items.length == 2) {
                                    typeElement.setAttribute("namespace", items[0]);
                                    typeElement.setAttribute("name", items[1]);
                                    commonTypes.appendChild(typeElement);
                                } else if (items.length == 3) {
                                    typeElement.setAttribute("namespace", items[0]);
                                    typeElement.setAttribute("name", items[1]);
                                    typeElement.setAttribute("maxOccurs", items[2]);
                                    commonTypes.appendChild(typeElement);
                                } else if (items.length == 4) {
                                    typeElement.setAttribute("namespace", items[0]);
                                    typeElement.setAttribute("name", items[1]);
                                    typeElement.setAttribute("maxOccurs", items[2]);
                                    typeElement.setAttribute("methodName", items[3]);
                                    commonTypes.appendChild(typeElement);
                                }
                            }
                            commonElement.appendChild(commonTypes);
                        }

                        if (descriptor.getCommon().getExcludes() != null) {
                            final Element excludeTypes = doc.createElement("commonExcludes");
                            for (String exclude : descriptor.getCommon().getExcludes()) {
                                final Element excludeElement = doc.createElement("exclude");
                                final String[] items = exclude.split(":", -1);
                                if (items.length == 2) {
                                    excludeElement.setAttribute("namespace", items[0]);
                                    excludeElement.setAttribute("name", items[1]);
                                    excludeTypes.appendChild(excludeElement);
                                }
                            }
                            commonElement.appendChild(excludeTypes);
                        }

                        descriptorElement.appendChild(commonElement);
                    }
                }
            }

            final TransformerFactory transformerFactory = TransformerFactory.newInstance();
            final Transformer transformer = transformerFactory.newTransformer();
            final DOMSource source = new DOMSource(doc);
            final File file = new File(pathToMetadata);
            final StreamResult result = new StreamResult(file);

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);

            transformer.transform(source, result);

            if (log.isLoggable(Level.FINE)) {
                log.fine("Saved: " + file.getAbsolutePath());
            }

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listFiles(final List<File> list, final String directoryName) {
        final File directory = new File(directoryName);
        if (directory.isDirectory()) {
            final File[] fList = directory.listFiles();
            for (final File file : fList) {
                if (file.isFile()) {
                    list.add(file);
                } else if (file.isDirectory()) {
                    listFiles(list, file.getAbsolutePath());
                }
            }
        }
    }

    private List<String> findCommonClasses(final Metadata metadata) {
        final List<String> classList = new ArrayList<String>();
        for (MetadataDescriptor descr : metadata.getMetadataDescriptorList()) {
            if (descr.getCommon() != null) {
                traverseClasses(metadata, classList, descr.getRootElementType());
            } else {
                if (descr.isGenerateClasses()) {
                    final String packageApi = descr.getPackageApi();
                    for (MetadataItem item : metadata.getClassList()) {
                        if (packageApi.equals(item.getPackageApi())) {
                            final String type = item.getNamespace() + ":" + item.getName();
                            if (!classList.contains(type)) {
                                classList.add(type);
                            }
                        }
                    }
                }
            }
        }
        return classList;
    }

    private void traverseClasses(final Metadata metadata, final List<String> classList, final String elementType) {
        final String[] elItems = elementType.split(":", -1);
        if (elItems.length == 2) {
            for (MetadataItem item : metadata.getClassList()) {
                if (item.getNamespace().equals(elItems[0]) && item.getName().equals(elItems[1])) {
                    for (MetadataElement element : item.getElements()) {
                        if (!isDataType(element.getType(), metadata)) {
                            if (!classList.contains(element.getType())) {
                                classList.add(element.getType());
                                traverseClasses(metadata, classList, element.getType());
                            }
                        }
                    }
                    for (MetadataElement element : item.getReferences()) {
                        if (!isDataType(element.getType(), metadata)) {
                            if (!classList.contains(element.getRef())) {
                                classList.add(element.getRef());
                                traverseClasses(metadata, classList, element.getRef());
                            }
                        }
                    }
                }
            }
            for (MetadataItem item : metadata.getGroupList()) {
                if (item.getNamespace().equals(elItems[0]) && item.getName().equals(elItems[1])) {
                    for (MetadataElement element : item.getElements()) {
                        if (!isDataType(element.getType(), metadata)) {
                            if (!classList.contains(element.getType())) {
                                classList.add(element.getType());
                                traverseClasses(metadata, classList, element.getType());
                            }
                        }
                    }
                    for (MetadataElement element : item.getReferences()) {
                        if (!isDataType(element.getType(), metadata)) {
                            if (!classList.contains(element.getRef())) {
                                classList.add(element.getRef());
                                traverseClasses(metadata, classList, element.getRef());
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean isDataType(final String type, final Metadata metadata) {
        for (MetadataItem item : metadata.getDataTypeList()) {
            if (item.getMappedTo().equals(type) || item.getName().equals(type)) {
                return true;
            }
        }
        return false;
    }
}
