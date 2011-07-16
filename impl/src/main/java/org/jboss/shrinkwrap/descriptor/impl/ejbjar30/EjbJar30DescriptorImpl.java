package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbJar30Descriptor;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 */
public class EjbJar30DescriptorImpl extends NodeProviderImplBase implements
		DescriptorNamespace<EjbJar30Descriptor>, EjbJar30Descriptor {
	// -------------------------------------------------------------------------------------||
	// Instance Members
	// --------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	private Node model;

	// -------------------------------------------------------------------------------------||
	// Constructor
	// -------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public EjbJar30DescriptorImpl(String descriptorName) {
		this(descriptorName, new Node("ejb-jar"));
	}

	public EjbJar30DescriptorImpl(String descriptorName, Node node) {
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

    public EjbJar30Descriptor addDefaultNamespaces() {
		addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
		addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		addNamespace(
				"xsi:schemaLocation",
				"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/ejb-jar_3_0.xsd");
		return this;
	}

	public EjbJar30Descriptor addNamespace(String name, String value) {
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

	public EjbJar30Descriptor removeAllNamespaces() {
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
	// Element type : enterprise-beans
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar30Descriptor removeEnterpriseBeans() {
		model.remove("enterprise-beans");
		return this;
	}

	public EnterpriseBeansType<EjbJar30Descriptor> enterpriseBeans() {
		Node node = model.getOrCreate("enterprise-beans");
		EnterpriseBeansType<EjbJar30Descriptor> enterpriseBeans = new EnterpriseBeansTypeImpl<EjbJar30Descriptor>(
				this, "enterprise-beans", model, node);
		return enterpriseBeans;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : interceptors
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar30Descriptor removeInterceptors() {
		model.remove("interceptors");
		return this;
	}

	public InterceptorsType<EjbJar30Descriptor> interceptors() {
		Node node = model.getOrCreate("interceptors");
		InterceptorsType<EjbJar30Descriptor> interceptors = new InterceptorsTypeImpl<EjbJar30Descriptor>(
				this, "interceptors", model, node);
		return interceptors;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : relationships
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar30Descriptor removeRelationships() {
		model.remove("relationships");
		return this;
	}

	public RelationshipsType<EjbJar30Descriptor> relationships() {
		Node node = model.getOrCreate("relationships");
		RelationshipsType<EjbJar30Descriptor> relationships = new RelationshipsTypeImpl<EjbJar30Descriptor>(
				this, "relationships", model, node);
		return relationships;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : assembly-descriptor
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar30Descriptor removeAssemblyDescriptor() {
		model.remove("assembly-descriptor");
		return this;
	}

	public AssemblyDescriptorType<EjbJar30Descriptor> assemblyDescriptor() {
		Node node = model.getOrCreate("assembly-descriptor");
		AssemblyDescriptorType<EjbJar30Descriptor> assemblyDescriptor = new AssemblyDescriptorTypeImpl<EjbJar30Descriptor>(
				this, "assembly-descriptor", model, node);
		return assemblyDescriptor;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-client-jar
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public EjbJar30Descriptor setEjbClientJar(String ejbClientJar) {
		model.getOrCreate("ejb-client-jar").text(ejbClientJar);
		return this;
	}

	public EjbJar30Descriptor removeEjbClientJar() {
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
	public EjbJar30Descriptor setVersion(String version) {
		model.attribute("version", version);
		return this;
	}

	public EjbJar30Descriptor removeVersion() {
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
	public EjbJar30Descriptor setMetadataComplete(Boolean metadataComplete) {
		model.attribute("metadata-complete", metadataComplete);
		return this;
	}

	public EjbJar30Descriptor removeMetadataComplete() {
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
	public EjbJar30Descriptor setDescription(String description) {
		model.create("description").text(description);
		return this;
	}

	public EjbJar30Descriptor setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public EjbJar30Descriptor removeAllDescription() {
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
	public EjbJar30Descriptor setDisplayName(String displayName) {
		model.create("display-name").text(displayName);
		return this;
	}

	public EjbJar30Descriptor setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public EjbJar30Descriptor removeAllDisplayName() {
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
	public EjbJar30Descriptor removeAllIcon() {
		model.remove("icon");
		return this;
	}

	public IconType<EjbJar30Descriptor> icon() {
		return new IconTypeImpl<EjbJar30Descriptor>(this, "icon", model);
	}

	public List<IconType<EjbJar30Descriptor>> getIconList() {
		List<IconType<EjbJar30Descriptor>> list = new ArrayList<IconType<EjbJar30Descriptor>>();
		List<Node> nodeList = model.get("icon");
		for (Node node : nodeList) {
			IconType<EjbJar30Descriptor> type = new IconTypeImpl<EjbJar30Descriptor>(
					this, "icon", model, node);
			list.add(type);
		}
		return list;
	}

}
