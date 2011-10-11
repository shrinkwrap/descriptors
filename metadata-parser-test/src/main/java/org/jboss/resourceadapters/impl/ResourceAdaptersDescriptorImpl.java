package org.jboss.resourceadapters.impl; 

import org.jboss.resourceadapters.api.ResourceAdaptersDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.resourceadapters.api.ResourceAdapterType;
import org.jboss.resourceadapters.impl.ResourceAdapterTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ResourceAdaptersDescriptor descriptor = Descriptors.create(ResourceAdaptersDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:31.029-07:00
 */
public class ResourceAdaptersDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<ResourceAdaptersDescriptor>, ResourceAdaptersDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceAdaptersDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("resource-adapters"));
   }

   public ResourceAdaptersDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
      addDefaultNamespaces();
   }

   // -------------------------------------------------------------------------------------||
   // Methods 
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }



   // -------------------------------------------------------------------------------------||
   // Namespace 
   // -------------------------------------------------------------------------------------||


   /**
    * Adds the default namespaces as defined in the specification 
    * @return the current instance of <code>ResourceAdaptersDescriptor</code> 
    */
   public ResourceAdaptersDescriptor addDefaultNamespaces()
   {
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>ResourceAdaptersDescriptor</code> 
    */
   public ResourceAdaptersDescriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   /**
    * Returns all defined namespaces. 
    * @return all defined namespaces 
    */
   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (String name: attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://")) 
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   /**
    * Removes all existing namespaces. 
    * @return the current instance of <code>ResourceAdaptersDescriptor</code> 
    */
   public ResourceAdaptersDescriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (String name: attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://")) 
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name: nameSpaceKeys)
      {
         model.removeAttribute(name);
      }
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdaptersDescriptor ElementName: resourceadapters:resource-adapterType ElementType : resource-adapter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-adapter</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-adapter</code> element will be returned.
    * @return the instance defined for the element <code>resource-adapter</code> 
    */
   public ResourceAdapterType<ResourceAdaptersDescriptor> getOrCreateResourceAdapter()
   {
      List<Node> nodeList = model.get("resource-adapter");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ResourceAdapterTypeImpl<ResourceAdaptersDescriptor>(this, "resource-adapter", model, nodeList.get(0));
      }
      return createResourceAdapter();
   }

   /**
    * Creates a new <code>resource-adapter</code> element 
    * @return the new created instance of <code>ResourceAdapterType<ResourceAdaptersDescriptor></code> 
    */
   public ResourceAdapterType<ResourceAdaptersDescriptor> createResourceAdapter()
   {
      return new ResourceAdapterTypeImpl<ResourceAdaptersDescriptor>(this, "resource-adapter", model);
   }

   /**
    * Returns all <code>resource-adapter</code> elements
    * @return list of <code>resource-adapter</code> 
    */
   public List<ResourceAdapterType<ResourceAdaptersDescriptor>> getAllResourceAdapter()
   {
      List<ResourceAdapterType<ResourceAdaptersDescriptor>> list = new ArrayList<ResourceAdapterType<ResourceAdaptersDescriptor>>();
      List<Node> nodeList = model.get("resource-adapter");
      for(Node node: nodeList)
      {
         ResourceAdapterType<ResourceAdaptersDescriptor>  type = new ResourceAdapterTypeImpl<ResourceAdaptersDescriptor>(this, "resource-adapter", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-adapter</code> elements 
    * @return the current instance of <code>ResourceAdapterType<ResourceAdaptersDescriptor></code> 
    */
   public ResourceAdaptersDescriptor removeAllResourceAdapter()
   {
      model.removeChildren("resource-adapter");
      return this;
   }

}
