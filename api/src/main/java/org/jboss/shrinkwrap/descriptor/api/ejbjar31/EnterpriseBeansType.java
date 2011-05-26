package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface EnterpriseBeansType<T> extends Child<T>
{
   public EnterpriseBeansType<T> setSession(SessionBeanType<T> session);

   public SessionBeanType<EnterpriseBeansType<T>> getSession();

   public EnterpriseBeansType<T> setEntity(EntityBeanType<T> entity);

   public EntityBeanType<EnterpriseBeansType<T>> getEntity();

   public EnterpriseBeansType<T> setMessageDriven(MessageDrivenBeanType<T> messageDriven);

   public MessageDrivenBeanType<EnterpriseBeansType<T>> getMessageDriven();
}
