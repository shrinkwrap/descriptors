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

package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataItem;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;

/**
 * This class analyzes <code>Attribute</code> w3c elements.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class AttributeFilter implements Filter {
    public boolean filter(final Metadata metadata, final TreeWalker walker) {
        final Node parent = walker.getCurrentNode();
        final Element element = (Element) parent;

        if (XsdElementEnum.attribute.isTagNameEqual(element.getTagName())) {
            final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
            if (parentNodeWithName != null) {
                final Element parentElementWithName = (Element) parentNodeWithName;
                final String groupOrClassName = MetadataUtil.getAttributeValue(parentElementWithName, "name");
                if (groupOrClassName != null) {
                    final String ref = MetadataUtil.getAttributeValue(element, "ref");
                    if (XsdElementEnum.group.isTagNameEqual(parentElementWithName.getTagName())
                        || XsdElementEnum.attributeGroup.isTagNameEqual(parentElementWithName.getTagName())) {
                        if (ref != null) {
                            for (MetadataItem dataType : metadata.getDataTypeList()) {
                                if (dataType.getName().equals(ref)) {
                                    final MetadataElement classElement = new MetadataElement();
                                    classElement.setName(ref);
                                    classElement.setType(dataType.getMappedTo());
                                    classElement.setIsAttribute(true);
                                    metadata.addClassElement(groupOrClassName, classElement);
                                    return true;
                                }
                            }
                        } else {
                            final MetadataElement groupElement = new MetadataElement(element);
                            String type = MetadataUtil.getAttributeValue(element, "type");
                            if (type == null) {
                                groupElement.setType("xsd:string");
                            }
                            groupElement.setIsAttribute(true);
                            metadata.addGroupElement(groupOrClassName, groupElement);
                            return true;
                        }
                    } else {
                        if (ref != null) {
                            for (MetadataItem dataType : metadata.getDataTypeList()) {
                                if (dataType.getName().equals(ref)) {
                                    final MetadataElement classElement = new MetadataElement();
                                    classElement.setName(ref);
                                    classElement.setType(dataType.getMappedTo());
                                    classElement.setIsAttribute(true);
                                    metadata.addClassElement(groupOrClassName, classElement);
                                    return true;
                                }
                            }
                        } else {
                            final Node node = element.getAttributes().getNamedItem("type");
                            if (node != null) {
                                final boolean isTextOnlyElement = MetadataUtil.hasParentOf(element,
                                    XsdElementEnum.simpleContent);
                                if (node.getNodeValue().endsWith(":ID")) {
                                    if (isTextOnlyElement) {
                                        return false;
                                    }
                                }

                                if (isTextOnlyElement) {
                                    final MetadataElement classElement = new MetadataElement();
                                    classElement.setName(groupOrClassName);
                                    classElement.setType("text");
                                    classElement.setIsRef(false);
                                    classElement.setIsAttribute(false);
                                    metadata.addClassElement(groupOrClassName, classElement);

                                    MetadataItem removableItem = null;
                                    for (MetadataItem item : metadata.getDataTypeList()) {
                                        if (item.getName().equals(groupOrClassName)) {
                                            removableItem = item;
                                            break;
                                        }
                                    }

                                    if (removableItem != null) {
                                        metadata.getDataTypeList().remove(removableItem);
                                    }
                                }

                                final MetadataElement classAttr = new MetadataElement(element);
                                String type = MetadataUtil.getAttributeValue(element, "type");
                                if (type == null) {
                                    classAttr.setType("xsd:string");
                                }
                                classAttr.setIsAttribute(true);
                                metadata.addClassElement(groupOrClassName, classAttr);
                                return true;
                            }

                            final Node defaultNode = element.getAttributes().getNamedItem("default");
                            if (defaultNode != null) {
                                final MetadataElement classElement = new MetadataElement(element);
                                classElement.setType("xsd:string");
                                classElement.setIsAttribute(true);
                                metadata.addClassElement(groupOrClassName, classElement);
                                return true;
                            }

                            if (MetadataUtil.hasChildOf(element, XsdElementEnum.simpleType)) {
                                final MetadataElement classElement = new MetadataElement(element);
                                classElement.setType("xsd:string");
                                classElement.setIsAttribute(true);
                                metadata.addClassElement(groupOrClassName, classElement);
                                return true;
                            }
                        }
                    }
                } else {
                    // check a global declaration
                    final Element rootElement = (Element) parentNodeWithName;
                    if (XsdElementEnum.schema.isTagNameEqual(rootElement.getTagName())) {
                        final String attrName = MetadataUtil.getAttributeValue(element, "name");
                        String type = MetadataUtil.getAttributeValue(element, "type");
                        final MetadataItem dataType = new MetadataItem(attrName);
                        dataType.setMappedTo(type);
                        if (type == null) {
                            dataType.setMappedTo("xsd:string");
                        }
                        dataType.setNamespace(metadata.getCurrentNamespace());
                        dataType.setSchemaName(metadata.getCurrentSchmema());
                        metadata.getDataTypeList().add(dataType);
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
