package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbJar31Descriptor;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 */
public class EjbJar31DescriptorImpl extends NodeProviderImplBase implements
		DescriptorNamespace<EjbJar31Descriptor>, EjbJar31Descriptor {
	// -------------------------------------------------------------------------------------||
	// Instance Members
	// --------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	private Node model;

	// -------------------------------------------------------------------------------------||
	// Constructor
	// -------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public EjbJar31DescriptorImpl(String descriptorName) {
		this(descriptorName, new Node("ejb-jar"));
	}

	public EjbJar31DescriptorImpl(String descriptorName, Node node) {
		super(descriptorName);
		this.model = node;
	}

	// -------------------------------------------------------------------------------------||
	// Methods
	// -----------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public Node getRootNode() {
		return model;
	}

	/**
     * {@inheritDoc}
     * @see org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase#getExporter()
     */
    @Override
    protected DescriptorExporter getExporter() {
        return new XmlDomExporter();
    }

	// -------------------------------------------------------------------------------------||
	// Namespace
	// ---------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public EjbJar31Descriptor addDefaultNamespaces() {
		addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
		addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		addNamespace(
				"xsi:schemaLocation",
				"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/ejb-jar_3_1.xsd");
		return this;
	}

	public EjbJar31Descriptor addNamespace(String name, String value) {
		model.attribute(name, value);
		return this;
	}

	public List<String> getNamespaces() {
		List<String> namespaceList = new ArrayList<String>();
		Map<String, String> attributes = model.attributes();
		for (String name : attributes.keySet()) {
			String value = attributes.get(name);
			if (value != null && value.startsWith("http://")) {
				namespaceList.add(name + "=" + value);
			}
		}
		return namespaceList;
	}

	public EjbJar31Descriptor removeAllNamespaces() {
		List<String> nameSpaceKeys = new ArrayList<String>();
		Map<String, String> attributes = model.attributes();
		for (String name : attributes.keySet()) {
			String value = attributes.get(name);
			if (value != null && value.startsWith("http://")) {
				nameSpaceKeys.add(name);
			}
		}
		for (String name : nameSpaceKeys) {
			model.attributes().remove(name);
		}
		return this;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : module-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar31Descriptor setModuleName(String moduleName) {
		model.getOrCreate("module-name").text(moduleName);
		return this;
	}

	public EjbJar31Descriptor removeModuleName() {
		model.remove("module-name");
		return this;
	}

	public String getModuleName() {
		return model.textValue("module-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : enterprise-beans
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar31Descriptor removeEnterpriseBeans() {
		model.remove("enterprise-beans");
		return this;
	}

	public EnterpriseBeansType<EjbJar31Descriptor> enterpriseBeans() {
		Node node = model.getOrCreate("enterprise-beans");
		EnterpriseBeansType<EjbJar31Descriptor> enterpriseBeans = new EnterpriseBeansTypeImpl<EjbJar31Descriptor>(
				this, "enterprise-beans", model, node);
		return enterpriseBeans;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : interceptors
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar31Descriptor removeInterceptors() {
		model.remove("interceptors");
		return this;
	}

	public InterceptorsType<EjbJar31Descriptor> interceptors() {
		Node node = model.getOrCreate("interceptors");
		InterceptorsType<EjbJar31Descriptor> interceptors = new InterceptorsTypeImpl<EjbJar31Descriptor>(
				this, "interceptors", model, node);
		return interceptors;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : relationships
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar31Descriptor removeRelationships() {
		model.remove("relationships");
		return this;
	}

	public RelationshipsType<EjbJar31Descriptor> relationships() {
		Node node = model.getOrCreate("relationships");
		RelationshipsType<EjbJar31Descriptor> relationships = new RelationshipsTypeImpl<EjbJar31Descriptor>(
				this, "relationships", model, node);
		return relationships;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : assembly-descriptor
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar31Descriptor removeAssemblyDescriptor() {
		model.remove("assembly-descriptor");
		return this;
	}

	public AssemblyDescriptorType<EjbJar31Descriptor> assemblyDescriptor() {
		Node node = model.getOrCreate("assembly-descriptor");
		AssemblyDescriptorType<EjbJar31Descriptor> assemblyDescriptor = new AssemblyDescriptorTypeImpl<EjbJar31Descriptor>(
				this, "assembly-descriptor", model, node);
		return assemblyDescriptor;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-client-jar
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar31Descriptor setEjbClientJar(String ejbClientJar) {
		model.getOrCreate("ejb-client-jar").text(ejbClientJar);
		return this;
	}

	public EjbJar31Descriptor removeEjbClientJar() {
		model.remove("ejb-client-jar");
		return this;
	}

	public String getEjbClientJar() {
		return model.textValue("ejb-client-jar");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : version
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public EjbJar31Descriptor setVersion(String version) {
		model.attribute("version", version);
		return this;
	}

	public EjbJar31Descriptor removeVersion() {
		model.attributes().remove("version");
		return this;
	}

	public String getVersion() {
		return model.attributes().get("version");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : metadata-complete
	// isComplexType: false maxOccurs: - isAttribute: true
	// -------------------------------------------------------------------------------------||
	public EjbJar31Descriptor setMetadataComplete(Boolean metadataComplete) {
		model.attribute("metadata-complete", metadataComplete);
		return this;
	}

	public EjbJar31Descriptor removeMetadataComplete() {
		model.attributes().remove("metadata-complete");
		return this;
	}

	public Boolean isMetadataComplete() {
		return Strings.isTrue(model.attribute("metadata-complete"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar31Descriptor setDescription(String description) {
		model.create("description").text(description);
		return this;
	}

	public EjbJar31Descriptor setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public EjbJar31Descriptor removeAllDescription() {
		model.remove("description");
		return this;
	}

	public List<String> getDescriptionList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = model.get("description");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : display-name
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar31Descriptor setDisplayName(String displayName) {
		model.create("display-name").text(displayName);
		return this;
	}

	public EjbJar31Descriptor setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public EjbJar31Descriptor removeAllDisplayName() {
		model.remove("display-name");
		return this;
	}

	public List<String> getDisplayNameList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = model.get("display-name");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : icon
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar31Descriptor removeAllIcon() {
		model.remove("icon");
		return this;
	}

	public IconType<EjbJar31Descriptor> icon() {
		return new IconTypeImpl<EjbJar31Descriptor>(this, "icon", model);
	}

	public List<IconType<EjbJar31Descriptor>> getIconList() {
		List<IconType<EjbJar31Descriptor>> list = new ArrayList<IconType<EjbJar31Descriptor>>();
		List<Node> nodeList = model.get("icon");
		for (Node node : nodeList) {
			IconType<EjbJar31Descriptor> type = new IconTypeImpl<EjbJar31Descriptor>(
					this, "icon", model, node);
			list.add(type);
		}
		return list;
	}

}
