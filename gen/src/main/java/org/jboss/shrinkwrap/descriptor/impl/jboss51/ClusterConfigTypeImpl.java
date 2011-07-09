package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ClusterConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The cluster-config element allows to specify cluster specific settings.
 *
 *
 */
public class ClusterConfigTypeImpl<T> implements Child<T>, ClusterConfigType<T>
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

   public ClusterConfigTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ClusterConfigTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ClusterConfigType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public ClusterConfigType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public ClusterConfigType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : partition-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ClusterConfigType<T> setPartitionName(String partitionName)
   {
      childNode.getOrCreate("partition-name").text(partitionName);
      return this;
   }

   public ClusterConfigType<T> removePartitionName()
   {
      childNode.remove("partition-name");
      return this;
   }

   public String getPartitionName()
   {
      return childNode.textValue("partition-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : home-load-balance-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ClusterConfigType<T> setHomeLoadBalancePolicy(String homeLoadBalancePolicy)
   {
      childNode.getOrCreate("home-load-balance-policy").text(homeLoadBalancePolicy);
      return this;
   }

   public ClusterConfigType<T> removeHomeLoadBalancePolicy()
   {
      childNode.remove("home-load-balance-policy");
      return this;
   }

   public String getHomeLoadBalancePolicy()
   {
      return childNode.textValue("home-load-balance-policy");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : session-state-manager-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ClusterConfigType<T> setSessionStateManagerJndiName(String sessionStateManagerJndiName)
   {
      childNode.getOrCreate("session-state-manager-jndi-name").text(sessionStateManagerJndiName);
      return this;
   }

   public ClusterConfigType<T> removeSessionStateManagerJndiName()
   {
      childNode.remove("session-state-manager-jndi-name");
      return this;
   }

   public String getSessionStateManagerJndiName()
   {
      return childNode.textValue("session-state-manager-jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : bean-load-balance-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ClusterConfigType<T> setBeanLoadBalancePolicy(String beanLoadBalancePolicy)
   {
      childNode.getOrCreate("bean-load-balance-policy").text(beanLoadBalancePolicy);
      return this;
   }

   public ClusterConfigType<T> removeBeanLoadBalancePolicy()
   {
      childNode.remove("bean-load-balance-policy");
      return this;
   }

   public String getBeanLoadBalancePolicy()
   {
      return childNode.textValue("bean-load-balance-policy");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : load-balance-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ClusterConfigType<T> setLoadBalancePolicy(String loadBalancePolicy)
   {
      childNode.getOrCreate("load-balance-policy").text(loadBalancePolicy);
      return this;
   }

   public ClusterConfigType<T> removeLoadBalancePolicy()
   {
      childNode.remove("load-balance-policy");
      return this;
   }

   public String getLoadBalancePolicy()
   {
      return childNode.textValue("load-balance-policy");
   }

}
