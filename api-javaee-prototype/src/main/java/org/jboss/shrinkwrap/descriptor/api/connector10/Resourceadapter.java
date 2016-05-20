package org.jboss.shrinkwrap.descriptor.api.connector10;

import java.util.List;

/**
 * This interface defines the contract for the <code> resourceadapter </code>
 * xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Resourceadapter {

	public Resourceadapter connectionInterface(String connectionInterface);
	public String getConnectionInterface();
	public Resourceadapter removeConnectionInterface();

	public Resourceadapter addConfigProperty(final ConfigProperty configProperty);
	public List<ConfigProperty> getAllConfigProperty();
	public Resourceadapter removeAllConfigProperty();

	public Resourceadapter connectionImplClass(String connectionImplClass);
	public String getConnectionImplClass();
	public Resourceadapter removeConnectionImplClass();

	public Resourceadapter connectionfactoryInterface(String connectionfactoryInterface);
	public String getConnectionfactoryInterface();
	public Resourceadapter removeConnectionfactoryInterface();

	public Resourceadapter reauthenticationSupport(String reauthenticationSupport);
	public String getReauthenticationSupport();
	public Resourceadapter removeReauthenticationSupport();

//	
//	public Resourceadapter addAuthenticationMechanism(final AuthenticationMechanism authenticationMechanism);
//	public List<AuthenticationMechanism> getAllAuthenticationMechanism();
//	public Resourceadapter removeAllAuthenticationMechanism();

	public Resourceadapter managedconnectionfactoryClass(String managedconnectionfactoryClass);
	public String getManagedconnectionfactoryClass();
	public Resourceadapter removeManagedconnectionfactoryClass();
	
	public Resourceadapter connectionfactoryImplClass(String connectionfactoryImplClass);
	public String getConnectionfactoryImplClass();
	public Resourceadapter removeConnectionfactoryImplClass();

	public Resourceadapter transactionSupport(String transactionSupport);
	public String getTransactionSupport();
	public Resourceadapter removeTransactionSupport();
//
//	public Resourceadapter addSecurityPermission(final SecurityPermission securityPermission);
//	public List<SecurityPermission> getAllSecurityPermission();
//	public Resourceadapter removeAllSecurityPermission();
}
