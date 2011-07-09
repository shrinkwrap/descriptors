package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EntityBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SessionBeanType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
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
public class EnterpriseBeansTypeImpl<T> implements Child<T>, EnterpriseBeansType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EnterpriseBeansTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public EnterpriseBeansTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : session
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnterpriseBeansType<T> removeAllSession()
   {
      childNode.remove("session");
      return this;
   }

   public SessionBeanType<EnterpriseBeansType<T>> session()
   {
      return new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this, "session", childNode);
   }

   public List<SessionBeanType<EnterpriseBeansType<T>>> getSessionList()
   {
      List<SessionBeanType<EnterpriseBeansType<T>>> list = new ArrayList<SessionBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("session");
      for (Node node : nodeList)
      {
         SessionBeanType<EnterpriseBeansType<T>> type = new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this,
               "session", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : entity
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnterpriseBeansType<T> removeAllEntity()
   {
      childNode.remove("entity");
      return this;
   }

   public EntityBeanType<EnterpriseBeansType<T>> entity()
   {
      return new EntityBeanTypeImpl<EnterpriseBeansType<T>>(this, "entity", childNode);
   }

   public List<EntityBeanType<EnterpriseBeansType<T>>> getEntityList()
   {
      List<EntityBeanType<EnterpriseBeansType<T>>> list = new ArrayList<EntityBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("entity");
      for (Node node : nodeList)
      {
         EntityBeanType<EnterpriseBeansType<T>> type = new EntityBeanTypeImpl<EnterpriseBeansType<T>>(this, "entity",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-driven
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnterpriseBeansType<T> removeAllMessageDriven()
   {
      childNode.remove("message-driven");
      return this;
   }

   public MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven()
   {
      return new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(this, "message-driven", childNode);
   }

   public List<MessageDrivenBeanType<EnterpriseBeansType<T>>> getMessageDrivenList()
   {
      List<MessageDrivenBeanType<EnterpriseBeansType<T>>> list = new ArrayList<MessageDrivenBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("message-driven");
      for (Node node : nodeList)
      {
         MessageDrivenBeanType<EnterpriseBeansType<T>> type = new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(
               this, "message-driven", childNode, node);
         list.add(type);
      }
      return list;
   }

}
