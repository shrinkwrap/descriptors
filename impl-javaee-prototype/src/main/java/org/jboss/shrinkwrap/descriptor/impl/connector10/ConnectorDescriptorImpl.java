package org.jboss.shrinkwrap.descriptor.impl.connector10;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.connector10.ConnectorDescriptor;
import org.jboss.shrinkwrap.descriptor.api.connector10.Factory;
import org.jboss.shrinkwrap.descriptor.api.connector10.Icon;
import org.jboss.shrinkwrap.descriptor.api.connector10.License;
import org.jboss.shrinkwrap.descriptor.api.connector10.Resourceadapter;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/**
 * <p>
 * This deployment descriptor provides the functionalities as described in the
 * specification
 * <p>
 * Example:
 * <p>
 * <code> 
 *     ConnectorDescriptor descriptor = Descriptors.create(ConnectorDescriptor.class);
 * </code>
 * 
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConnectorDescriptorImpl extends NodeDescriptorImplBase implements
		DescriptorNamespace<ConnectorDescriptor>, ConnectorDescriptor {
	// -------------------------------------------------------------------------------------||
	// Instance Members
	// -------------------------------------------------------------------------------------||

	private Node model;

	// -------------------------------------------------------------------------------------||
	// Constructor
	// -------------------------------------------------------------------------------------||

	public ConnectorDescriptorImpl(String descriptorName) {
		this(descriptorName, new Node("connector"));
	}

	public ConnectorDescriptorImpl(String descriptorName, Node node) {
		super(descriptorName);
		this.model = node;
		addDefaultNamespaces();
	}

	// -------------------------------------------------------------------------------------||
	// Methods
	// -------------------------------------------------------------------------------------||

	public Node getRootNode() {
		return model;
	}

	// -------------------------------------------------------------------------------------||
	// Namespace
	// -------------------------------------------------------------------------------------||

	/**
	 * Adds the default namespaces as defined in the specification
	 * 
	 * @return the current instance of <code>ConnectorDescriptor</code>
	 */
	public ConnectorDescriptor addDefaultNamespaces() {
		return this;
	}

	/**
	 * Adds a new namespace
	 * 
	 * @return the current instance of <code>ConnectorDescriptor</code>
	 */
	public ConnectorDescriptor addNamespace(String name, String value) {
		model.attribute(name, value);
		return this;
	}

	/**
	 * Returns all defined namespaces.
	 * 
	 * @return all defined namespaces
	 */
	public List<String> getNamespaces() {
		List<String> namespaceList = new ArrayList<String>();
		java.util.Map<String, String> attributes = model.getAttributes();
		for (String name : attributes.keySet()) {
			String value = attributes.get(name);
			if (value != null && value.startsWith("http://")) {
				namespaceList.add(name + "=" + value);
			}
		}
		return namespaceList;
	}

	/**
	 * Removes all existing namespaces.
	 * 
	 * @return the current instance of <code>ConnectorDescriptor</code>
	 */
	public ConnectorDescriptor removeAllNamespaces() {
		List<String> nameSpaceKeys = new ArrayList<String>();
		java.util.Map<String, String> attributes = model.getAttributes();
		for (String name : attributes.keySet()) {
			String value = attributes.get(name);
			if (value != null && value.startsWith("http://")) {
				nameSpaceKeys.add(name);
			}
		}
		for (String name : nameSpaceKeys) {
			model.removeAttribute(name);
		}
		return this;
	}
	
	@Override
	public Factory getFactory() {
		return new FactoryImpl();
	}

	@Override
	public ConnectorDescriptor description(String description) {
		model.getOrCreate("description").text(description);
	    return this;
	}

	@Override
	public String getDescription() {
		return model.getTextValueForPatternName("description");
	}

	@Override
	public ConnectorDescriptor removeDescription() {
		model.removeChildren("description");
	    return this;
	}

	@Override
	public ConnectorDescriptor setResourceadapter(Resourceadapter resourceadapter) {
		if (resourceadapter instanceof ChildNodeInitializer) {
			if (model.getSingle("resourceadapter") == null) {
				((ChildNodeInitializer)resourceadapter).initialize("resourceadapter", model);
			} else {
				throw new IllegalArgumentException("Single child already assigned");
			}
		}
		return this;
	}

	@Override
	public Resourceadapter getResourceadapter() {
		final Node node = model.getSingle("resourceadapter");
		final ResourceadapterImpl resourceadapter = new ResourceadapterImpl();
		resourceadapter.assign("resourceadapter", node);
		return resourceadapter;
	}

	@Override
	public ConnectorDescriptor removeResourceadapter() {
		model.removeChildren("resourceadapter");
	    return this;
	}

}
