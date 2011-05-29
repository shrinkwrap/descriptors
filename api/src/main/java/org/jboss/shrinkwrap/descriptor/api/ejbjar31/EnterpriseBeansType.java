package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface EnterpriseBeansType<T> extends Child<T>
{
   public SessionBeanType<EnterpriseBeansType<T>> setSession(SessionBeanType<T> session);

   public SessionBeanType<EnterpriseBeansType<T>> getSession();

   public EntityBeanType<EnterpriseBeansType<T>> setEntity(EntityBeanType<T> entity);

   public EntityBeanType<EnterpriseBeansType<T>> getEntity();

   public MessageDrivenBeanType<EnterpriseBeansType<T>> setMessageDriven(MessageDrivenBeanType<T> messageDriven);

   public MessageDrivenBeanType<EnterpriseBeansType<T>> getMessageDriven();
}
