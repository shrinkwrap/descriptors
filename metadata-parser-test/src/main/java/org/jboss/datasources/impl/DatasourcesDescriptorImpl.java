package org.jboss.datasources.impl; 

import org.jboss.datasources.api.DatasourcesDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.DatasourceType;
import org.jboss.datasources.impl.DatasourceTypeImpl;
import org.jboss.datasources.api.XaDatasourceType;
import org.jboss.datasources.impl.XaDatasourceTypeImpl;
import org.jboss.datasources.api.DriversType;
import org.jboss.datasources.impl.DriversTypeImpl;
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
 *     DatasourcesDescriptor descriptor = Descriptors.create(DatasourcesDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public class DatasourcesDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<DatasourcesDescriptor>, DatasourcesDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DatasourcesDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("datasources"));
   }

   public DatasourcesDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>DatasourcesDescriptor</code> 
    */
   public DatasourcesDescriptor addDefaultNamespaces()
   {
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>DatasourcesDescriptor</code> 
    */
   public DatasourcesDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>DatasourcesDescriptor</code> 
    */
   public DatasourcesDescriptor removeAllNamespaces()
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
   // ClassName: DatasourcesDescriptor ElementName: datasources:datasourceType ElementType : datasource
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>datasource</code> element will be created and returned.
    * Otherwise, the first existing <code>datasource</code> element will be returned.
    * @return the instance defined for the element <code>datasource</code> 
    */
   public DatasourceType<DatasourcesDescriptor> getOrCreateDatasource()
   {
      List<Node> nodeList = model.get("datasource");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new DatasourceTypeImpl<DatasourcesDescriptor>(this, "datasource", model, nodeList.get(0));
      }
      return createDatasource();
   }

   /**
    * Creates a new <code>datasource</code> element 
    * @return the new created instance of <code>DatasourceType<DatasourcesDescriptor></code> 
    */
   public DatasourceType<DatasourcesDescriptor> createDatasource()
   {
      return new DatasourceTypeImpl<DatasourcesDescriptor>(this, "datasource", model);
   }

   /**
    * Returns all <code>datasource</code> elements
    * @return list of <code>datasource</code> 
    */
   public List<DatasourceType<DatasourcesDescriptor>> getAllDatasource()
   {
      List<DatasourceType<DatasourcesDescriptor>> list = new ArrayList<DatasourceType<DatasourcesDescriptor>>();
      List<Node> nodeList = model.get("datasource");
      for(Node node: nodeList)
      {
         DatasourceType<DatasourcesDescriptor>  type = new DatasourceTypeImpl<DatasourcesDescriptor>(this, "datasource", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>datasource</code> elements 
    * @return the current instance of <code>DatasourceType<DatasourcesDescriptor></code> 
    */
   public DatasourcesDescriptor removeAllDatasource()
   {
      model.removeChildren("datasource");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesDescriptor ElementName: datasources:xa-datasourceType ElementType : xa-datasource
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-datasource</code> element will be created and returned.
    * Otherwise, the first existing <code>xa-datasource</code> element will be returned.
    * @return the instance defined for the element <code>xa-datasource</code> 
    */
   public XaDatasourceType<DatasourcesDescriptor> getOrCreateXaDatasource()
   {
      List<Node> nodeList = model.get("xa-datasource");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new XaDatasourceTypeImpl<DatasourcesDescriptor>(this, "xa-datasource", model, nodeList.get(0));
      }
      return createXaDatasource();
   }

   /**
    * Creates a new <code>xa-datasource</code> element 
    * @return the new created instance of <code>XaDatasourceType<DatasourcesDescriptor></code> 
    */
   public XaDatasourceType<DatasourcesDescriptor> createXaDatasource()
   {
      return new XaDatasourceTypeImpl<DatasourcesDescriptor>(this, "xa-datasource", model);
   }

   /**
    * Returns all <code>xa-datasource</code> elements
    * @return list of <code>xa-datasource</code> 
    */
   public List<XaDatasourceType<DatasourcesDescriptor>> getAllXaDatasource()
   {
      List<XaDatasourceType<DatasourcesDescriptor>> list = new ArrayList<XaDatasourceType<DatasourcesDescriptor>>();
      List<Node> nodeList = model.get("xa-datasource");
      for(Node node: nodeList)
      {
         XaDatasourceType<DatasourcesDescriptor>  type = new XaDatasourceTypeImpl<DatasourcesDescriptor>(this, "xa-datasource", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>xa-datasource</code> elements 
    * @return the current instance of <code>XaDatasourceType<DatasourcesDescriptor></code> 
    */
   public DatasourcesDescriptor removeAllXaDatasource()
   {
      model.removeChildren("xa-datasource");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesDescriptor ElementName: datasources:driversType ElementType : drivers
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>drivers</code> element with the given value will be created.
    * Otherwise, the existing <code>drivers</code> element will be returned.
    * @return  a new or existing instance of <code>DriversType<DatasourcesDescriptor></code> 
    */
   public DriversType<DatasourcesDescriptor> getOrCreateDrivers()
   {
      Node node = model.getOrCreate("drivers");
      DriversType<DatasourcesDescriptor> drivers = new DriversTypeImpl<DatasourcesDescriptor>(this, "drivers", model, node);
      return drivers;
   }

   /**
    * Removes the <code>drivers</code> element 
    * @return the current instance of <code>DatasourcesDescriptor</code> 
    */
   public DatasourcesDescriptor removeDrivers()
   {
      model.removeChildren("drivers");
      return this;
   }

}
