package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
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