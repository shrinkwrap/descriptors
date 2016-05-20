package org.jboss.shrinkwrap.descriptor.api.connector10; 

/**
 * This interface defines the contract for the <code> authentication-mechanism </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AuthenticationMechanism {
 
   public AuthenticationMechanism authenticationMechanismType(String authenticationMechanismType);
   public String getAuthenticationMechanismType();
   public AuthenticationMechanism removeAuthenticationMechanismType();
 
   public AuthenticationMechanism description(String description);
   public String getDescription();
   public AuthenticationMechanism removeDescription();

   public AuthenticationMechanism credentialInterface(String credentialInterface);
   public String getCredentialInterface();
   public AuthenticationMechanism removeCredentialInterface();
}
