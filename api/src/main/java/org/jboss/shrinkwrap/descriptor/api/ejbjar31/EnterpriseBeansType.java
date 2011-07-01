package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The enterprise-beansType declares one or more enterprise
 * beans. Each bean can be a session, entity or message-driven
 * bean.
 *
 *
 *
 */
public interface EnterpriseBeansType<T> extends Child<T>
{

   public EnterpriseBeansType<T> removeAllSession();

   public SessionBeanType<EnterpriseBeansType<T>> session();

   public List<SessionBeanType<EnterpriseBeansType<T>>> getSessionList();

   public EnterpriseBeansType<T> removeAllEntity();

   public EntityBeanType<EnterpriseBeansType<T>> entity();

   public List<EntityBeanType<EnterpriseBeansType<T>>> getEntityList();

   public EnterpriseBeansType<T> removeAllMessageDriven();

   public MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven();

   public List<MessageDrivenBeanType<EnterpriseBeansType<T>>> getMessageDrivenList();

}
