package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The enterprise-beans element contains additional information about the
 * beans. These informations, such as jndi names, resource managers and container
 * configurations, are specific to jboss and not described in ejb-jar.xml. jboss will provide a
 * standard behaviour if no enterprise-beans element is found, see container-configurations,
 * jndi-name and resource-managers for defaults. Used in: jboss
 *
 */
public interface EnterpriseBeansType<T> extends Child<T>
{

   public EnterpriseBeansType<T> removeAllSession();

   public SessionBeanType<EnterpriseBeansType<T>> session();

   public List<SessionBeanType<EnterpriseBeansType<T>>> getSessionList();

   public EnterpriseBeansType<T> removeAllMessageDriven();

   public MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven();

   public List<MessageDrivenBeanType<EnterpriseBeansType<T>>> getMessageDrivenList();

   public EnterpriseBeansType<T> removeAllService();

   public ServiceBeanType<EnterpriseBeansType<T>> service();

   public List<ServiceBeanType<EnterpriseBeansType<T>>> getServiceList();

   public EnterpriseBeansType<T> removeAllConsumer();

   public ConsumerBeanType<EnterpriseBeansType<T>> consumer();

   public List<ConsumerBeanType<EnterpriseBeansType<T>>> getConsumerList();

   public EnterpriseBeansType<T> removeAllEjb();

   public GenericBeanType<EnterpriseBeansType<T>> ejb();

   public List<GenericBeanType<EnterpriseBeansType<T>>> getEjbList();

}
