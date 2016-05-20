package org.jboss.shrinkwrap.descriptor.impl.connector10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jboss.shrinkwrap.descriptor.api.connector10.ConfigProperty;
import org.jboss.shrinkwrap.descriptor.api.connector10.Resourceadapter;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> resourceadapter </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ResourceadapterImpl implements Resourceadapter, ChildNodeInitializer {
	private boolean isDetached = true;
	private Node detachedNode;
	private Node childNode;	

	public void initialize(String nodeName, Node node) {
		if (isDetached) {
			if (detachedNode != null) {	
				childNode = node.createChild(nodeName);
				Node.copyFromTo(detachedNode, childNode); // setters already called
			} else {
				childNode = node.createChild(nodeName); // just created no setters called
			}
			isDetached = false;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void assign(String nodeName, Node node) {
		childNode = node;
		isDetached = false;
	}

	/**
	 * Creates a new <code>config-property</code> element
	 * 
	 * @return the new created instance of <code>ConfigProperty</code>
	 */
	public Resourceadapter addConfigProperty(ConfigProperty configProperty) {
		if (configProperty instanceof ChildNodeInitializer) {
			((ChildNodeInitializer)configProperty).initialize("config-property", getNode());
		}
		return this;
	}

	/**
	 * Returns all <code>config-property</code> elements
	 * 
	 * @return list of <code>config-property</code>
	 */
	public List<ConfigProperty> getAllConfigProperty() {
		List<ConfigProperty> list = new ArrayList<ConfigProperty>();
		List<Node> nodeList = childNode.get("config-property");
		for (Node node : nodeList) {
			ConfigPropertyImpl type = new ConfigPropertyImpl();
			type.assign("config-property", getNode());
			list.add(type);
		}
		return list;
	}

	/**
	 * Removes all <code>config-property</code> elements
	 * 
	 * @return the current instance of <code>ConfigProperty</code>
	 */
	public Resourceadapter removeAllConfigProperty() {
		getNode().removeChildren("config-property");
		return this;
	}

	private Node getNode() {		
		if (!isDetached) {
			return childNode;
		} 
		
		if (detachedNode == null) {
			detachedNode = new Node("DetachedNode");
		}
		
		return detachedNode;
	}

	//-----------------------------------------------------------------------||
	//-- TransactionSupport -------------------------------------------------||
	//-----------------------------------------------------------------------||
	
	@Override
	public Resourceadapter transactionSupport(String transactionSupport) {
		childNode.getOrCreate("transaction-support").text(transactionSupport);
	    return this;
	}

	@Override
	public String getTransactionSupport() {
		return childNode.getTextValueForPatternName("transaction-support");
	}

	@Override
	public Resourceadapter removeTransactionSupport() {
		childNode.removeChildren("transaction-support");
	    return this;
	}

	//-----------------------------------------------------------------------||
	//-- ConnectionFactory  -------------------------------------------------||
	//-----------------------------------------------------------------------||
	
	@Override
	public Resourceadapter connectionfactoryImplClass(String connectionfactoryImplClass) {
		childNode.getOrCreate("connectionfactory-impl-class").text(connectionfactoryImplClass);
	    return this;
	}

	@Override
	public String getConnectionfactoryImplClass() {
		return childNode.getTextValueForPatternName("connectionfactory-impl-class");
	}
	
	@Override
	public Resourceadapter removeConnectionfactoryImplClass() {
		childNode.removeChildren("connectionfactory-impl-class");
	    return this;
	}

	//-----------------------------------------------------------------------||
	//-- ConnectionImplClass ------------------------------------------------||
	//-----------------------------------------------------------------------||
	
	@Override
	public Resourceadapter connectionImplClass(String connectionImplClass) {
		childNode.getOrCreate("connection-impl-class").text(connectionImplClass);
	    return this;
	}

	@Override
	public String getConnectionImplClass() {
		return childNode.getTextValueForPatternName("connection-impl-class");
	}

	@Override
	public Resourceadapter removeConnectionImplClass() {
		childNode.removeChildren("connection-impl-class");
	    return this;
	}

	//-----------------------------------------------------------------------||
	//-- ConnectionInterface ------------------------------------------------||
	//-----------------------------------------------------------------------||
	
	@Override
	public Resourceadapter connectionInterface(String connectionInterface) {
		childNode.getOrCreate("connection-interface").text(connectionInterface);
	    return this;
	}

	@Override
	public String getConnectionInterface() {
		return childNode.getTextValueForPatternName("connection-interface");
	}

	@Override
	public Resourceadapter removeConnectionInterface() {
		childNode.removeChildren("connection-interface");
	    return this;
	}

	//-----------------------------------------------------------------------||
	//-- ConnectionInterface ------------------------------------------------||
	//-----------------------------------------------------------------------||
	
	@Override
	public Resourceadapter connectionfactoryInterface(String connectionfactoryInterface) {
		childNode.getOrCreate("connectionfactory-interface").text(connectionfactoryInterface);
	    return this;
	}

	@Override
	public String getConnectionfactoryInterface() {
		return childNode.getTextValueForPatternName("connectionfactory-interface");
	}

	@Override
	public Resourceadapter removeConnectionfactoryInterface() {
		childNode.removeChildren("connectionfactory-interface");
	    return this;
	}

	//-----------------------------------------------------------------------||
	//-- ReauthenticationSupport --------------------------------------------||
	//-----------------------------------------------------------------------||
	
	@Override
	public Resourceadapter reauthenticationSupport(String reauthenticationSupport) {
		childNode.getOrCreate("reauthentication-support").text(reauthenticationSupport);
	      return this;
	}

	@Override
	public String getReauthenticationSupport() {
		return childNode.getTextValueForPatternName("reauthentication-support");
	}

	@Override
	public Resourceadapter removeReauthenticationSupport() {
		childNode.removeChildren("reauthentication-support");
	    return this;
	}

	//-----------------------------------------------------------------------||
	//-- ManagedconnectionfactoryClass --------------------------------------||
	//-----------------------------------------------------------------------||
	
	@Override
	public Resourceadapter managedconnectionfactoryClass(String managedconnectionfactoryClass) {
		childNode.getOrCreate("managedconnectionfactory-class").text(managedconnectionfactoryClass);
	    return this;
	}

	@Override
	public String getManagedconnectionfactoryClass() {
		return childNode.getTextValueForPatternName("managedconnectionfactory-class");
	}

	@Override
	public Resourceadapter removeManagedconnectionfactoryClass() {
		childNode.removeChildren("managedconnectionfactory-class");
	    return this;
	}
}
