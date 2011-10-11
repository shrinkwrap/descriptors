package org.jboss.resourceadapters.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.resourceadapters.api.ResourceAdaptersType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.resourceadapters.api.ResourceAdapterType;
import org.jboss.resourceadapters.impl.ResourceAdapterTypeImpl;

/**
 * This class implements the <code> resource-adaptersType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:31.029-07:00
 */
public class ResourceAdaptersTypeImpl<T> implements Child<T>, ResourceAdaptersType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceAdaptersTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ResourceAdaptersTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdaptersType ElementName: resourceadapters:resource-adapterType ElementType : resource-adapter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-adapter</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-adapter</code> element will be returned.
    * @return the instance defined for the element <code>resource-adapter</code> 
    */
   public ResourceAdapterType<ResourceAdaptersType<T>> getOrCreateResourceAdapter()
   {
      List<Node> nodeList = childNode.get("resource-adapter");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ResourceAdapterTypeImpl<ResourceAdaptersType<T>>(this, "resource-adapter", childNode, nodeList.get(0));
      }
      return createResourceAdapter();
   }

   /**
    * Creates a new <code>resource-adapter</code> element 
    * @return the new created instance of <code>ResourceAdapterType<ResourceAdaptersType<T>></code> 
    */
   public ResourceAdapterType<ResourceAdaptersType<T>> createResourceAdapter()
   {
      return new ResourceAdapterTypeImpl<ResourceAdaptersType<T>>(this, "resource-adapter", childNode);
   }

   /**
    * Returns all <code>resource-adapter</code> elements
    * @return list of <code>resource-adapter</code> 
    */
   public List<ResourceAdapterType<ResourceAdaptersType<T>>> getAllResourceAdapter()
   {
      List<ResourceAdapterType<ResourceAdaptersType<T>>> list = new ArrayList<ResourceAdapterType<ResourceAdaptersType<T>>>();
      List<Node> nodeList = childNode.get("resource-adapter");
      for(Node node: nodeList)
      {
         ResourceAdapterType<ResourceAdaptersType<T>>  type = new ResourceAdapterTypeImpl<ResourceAdaptersType<T>>(this, "resource-adapter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-adapter</code> elements 
    * @return the current instance of <code>ResourceAdapterType<ResourceAdaptersType<T>></code> 
    */
   public ResourceAdaptersType<T> removeAllResourceAdapter()
   {
      childNode.removeChildren("resource-adapter");
      return this;
   }
}
