package org.jboss.shrinkwrap.descriptor.impl.persistence20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Persistence20Descriptor;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 */
public class Persistence20DescriptorImpl extends NodeProviderImplBase
      implements
         DescriptorNamespace<Persistence20Descriptor>,
         Persistence20Descriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public Persistence20DescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("persistence"));
   }

   public Persistence20DescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
   }

   // -------------------------------------------------------------------------------------||
   // Methods -----------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }

   protected DescriptorExporter getExporter()
   {
      return new XMLExporter();
   }

   // -------------------------------------------------------------------------------------||
   // Namespace ---------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public Persistence20Descriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://java.sun.com/xml/ns/persistence");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation",
            "http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd");
      return this;
   }

   public Persistence20Descriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      Map<String, String> attributes = model.attributes();
      for (String name : attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://"))
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   public Persistence20Descriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      Map<String, String> attributes = model.attributes();
      for (String name : attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://"))
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name : nameSpaceKeys)
      {
         model.attributes().remove(name);
      }
      return this;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Persistence20Descriptor removeAllPersistenceUnit()
   {
      model.remove("persistence-unit");
      return this;
   }

   public PersistenceUnit<Persistence20Descriptor> persistenceUnit()
   {
      return new PersistenceUnitImpl<Persistence20Descriptor>(this, "persistence-unit", model);
   }

   public List<PersistenceUnit<Persistence20Descriptor>> getPersistenceUnitList()
   {
      List<PersistenceUnit<Persistence20Descriptor>> list = new ArrayList<PersistenceUnit<Persistence20Descriptor>>();
      List<Node> nodeList = model.get("persistence-unit");
      for (Node node : nodeList)
      {
         PersistenceUnit<Persistence20Descriptor> type = new PersistenceUnitImpl<Persistence20Descriptor>(this,
               "persistence-unit", model, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Persistence20Descriptor setVersion(String version)
   {
      model.getOrCreate("version").text(version);
      return this;
   }

   public Persistence20Descriptor removeVersion()
   {
      model.remove("version");
      return this;
   }

   public String getVersion()
   {
      return model.textValue("version");
   }

}
