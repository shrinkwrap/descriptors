package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface OutboundResourceadapterType<T> extends Child<T>
{
   public OutboundResourceadapterType<T> setConnectionDefinition(ConnectionDefinitionType<T> connectionDefinition);

   public ConnectionDefinitionType<OutboundResourceadapterType<T>> getConnectionDefinition();

   public OutboundResourceadapterType<T> setTransactionSupport(String transactionSupport);

   public String getTransactionSupport();

   public OutboundResourceadapterType<T> setAuthenticationMechanism(
         AuthenticationMechanismType<T> authenticationMechanism);

   public AuthenticationMechanismType<OutboundResourceadapterType<T>> getAuthenticationMechanism();

   public OutboundResourceadapterType<T> setReauthenticationSupport(Boolean reauthenticationSupport);

   public Boolean getReauthenticationSupport();
}
