package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface EnterpriseBeansType<T> extends Child<T>
{
   @NodeInfo(xmlName = "session")
   public SessionBeanType<EnterpriseBeansType<T>> session();

   @NodeInfo(xmlName = "entity")
   public EntityBeanType<EnterpriseBeansType<T>> entity();

   @NodeInfo(xmlName = "message-driven")
   public MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven();
}
