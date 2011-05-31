package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface EnterpriseBeansType<T> extends Child<T>
{
   public EnterpriseBeansType<T> setSession(SessionBeanType<T> session);
   public SessionBeanType<T> getSession();

   public EnterpriseBeansType<T> setEntity(EntityBeanType<T> entity);
   public EntityBeanType<T> getEntity();

   public EnterpriseBeansType<T> setMessageDriven(MessageDrivenBeanType<T> messageDriven);
   public MessageDrivenBeanType<T> getMessageDriven();
}
