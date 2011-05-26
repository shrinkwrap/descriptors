package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface AuthenticationMechanismType<T> extends Child<T>
{
   public AuthenticationMechanismType<T> setDescription(String description);

   public String getDescription();

   public AuthenticationMechanismType<T> setAuthenticationMechanismType(String authenticationMechanismType);

   public String getAuthenticationMechanismType();

   public AuthenticationMechanismType<T> setCredentialInterface(String credentialInterface);

   public String getCredentialInterface();
}
