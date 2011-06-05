package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EntityBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SessionBeanType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class EnterpriseBeansTypeImpl<T> implements Child<T>, EnterpriseBeansType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private SessionBeanType<EnterpriseBeansType<T>> session;
   private EntityBeanType<EnterpriseBeansType<T>> entity;
   private MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EnterpriseBeansTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("enterprise-beans");   }


   public T up()
   {
      return t;
   }



   public EnterpriseBeansType<T> setSession(SessionBeanType<EnterpriseBeansType<T>> session)
   {
      this.session = session;
      childNode.getOrCreate("session").text(session);
      return this;
   }

   public SessionBeanType<EnterpriseBeansType<T>> getSession()
   {
      if( session == null)
      {
          session = new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this, "", childNode);
      }
      return session;
   }




   public EnterpriseBeansType<T> setEntity(EntityBeanType<EnterpriseBeansType<T>> entity)
   {
      this.entity = entity;
      childNode.getOrCreate("entity").text(entity);
      return this;
   }

   public EntityBeanType<EnterpriseBeansType<T>> getEntity()
   {
      if( entity == null)
      {
          entity = new EntityBeanTypeImpl<EnterpriseBeansType<T>>(this, "", childNode);
      }
      return entity;
   }




   public EnterpriseBeansType<T> setMessageDriven(MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven)
   {
      this.messageDriven = messageDriven;
      childNode.getOrCreate("message-driven").text(messageDriven);
      return this;
   }

   public MessageDrivenBeanType<EnterpriseBeansType<T>> getMessageDriven()
   {
      if( messageDriven == null)
      {
          messageDriven = new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(this, "", childNode);
      }
      return messageDriven;
   }


}
