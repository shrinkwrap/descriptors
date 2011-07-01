package org.jboss.shrinkwrap.descriptor.impl.persistence20; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
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
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.persistence20.*;
import org.jboss.shrinkwrap.descriptor.impl.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.*;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
 */
public class PersistenceUnitImpl<T> implements Child<T>, PersistenceUnit<T>
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

   public PersistenceUnitImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public PersistenceUnitImpl(T t, String nodeName, Node node, Node childNode)   {
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
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setDescription(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }
   public PersistenceUnit<T> removeDescription()
   {
      childNode.remove("description");
      return this;
   }

   public String getDescription()
   {
      return childNode.textValue("description");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : provider
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setProvider(String provider)
   {
      childNode.getOrCreate("provider").text(provider);
      return this;
   }
   public PersistenceUnit<T> removeProvider()
   {
      childNode.remove("provider");
      return this;
   }

   public String getProvider()
   {
      return childNode.textValue("provider");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : jta-data-source
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setJtaDataSource(String jtaDataSource)
   {
      childNode.getOrCreate("jta-data-source").text(jtaDataSource);
      return this;
   }
   public PersistenceUnit<T> removeJtaDataSource()
   {
      childNode.remove("jta-data-source");
      return this;
   }

   public String getJtaDataSource()
   {
      return childNode.textValue("jta-data-source");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : non-jta-data-source
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setNonJtaDataSource(String nonJtaDataSource)
   {
      childNode.getOrCreate("non-jta-data-source").text(nonJtaDataSource);
      return this;
   }
   public PersistenceUnit<T> removeNonJtaDataSource()
   {
      childNode.remove("non-jta-data-source");
      return this;
   }

   public String getNonJtaDataSource()
   {
      return childNode.textValue("non-jta-data-source");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : mapping-file
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setMappingFile(String mappingFile)
   {
      childNode.create("mapping-file").text(mappingFile);
      return this;
   }
   public PersistenceUnit<T> setMappingFileList(String ... values)
   {
      for(String name: values)
      {
         setMappingFile(name);
      }
      return this;
   }
   public PersistenceUnit<T> removeAllMappingFile()
   {
      childNode.remove("mapping-file");
      return this;
   }

public List<String> getMappingFileList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("mapping-file");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : jar-file
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setJarFile(String jarFile)
   {
      childNode.create("jar-file").text(jarFile);
      return this;
   }
   public PersistenceUnit<T> setJarFileList(String ... values)
   {
      for(String name: values)
      {
         setJarFile(name);
      }
      return this;
   }
   public PersistenceUnit<T> removeAllJarFile()
   {
      childNode.remove("jar-file");
      return this;
   }

public List<String> getJarFileList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("jar-file");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : class
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setClazz(String clazz)
   {
      childNode.create("class").text(clazz);
      return this;
   }
   public PersistenceUnit<T> setClazzList(String ... values)
   {
      for(String name: values)
      {
         setClazz(name);
      }
      return this;
   }
   public PersistenceUnit<T> removeAllClazz()
   {
      childNode.remove("class");
      return this;
   }

public List<String> getClazzList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("class");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : exclude-unlisted-classes
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setExcludeUnlistedClasses(Boolean excludeUnlistedClasses)
   {
      childNode.getOrCreate("exclude-unlisted-classes").text(excludeUnlistedClasses);
      return this;
   }
   public PersistenceUnit<T> removeExcludeUnlistedClasses()
   {
      childNode.remove("exclude-unlisted-classes");
      return this;
   }

   public Boolean isExcludeUnlistedClasses()
   {
      return Strings.isTrue(childNode.textValue("exclude-unlisted-classes"));
   }



   // -------------------------------------------------------------------------------------||
   // Element type : shared-cache-mode
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setSharedCacheMode(PersistenceUnitCachingType sharedCacheMode)
   {
      childNode.getOrCreate("shared-cache-mode").text(sharedCacheMode);
      return this;
   }
   public PersistenceUnit<T> setSharedCacheMode(String sharedCacheMode)
   {
      childNode.getOrCreate("shared-cache-mode").text(sharedCacheMode);
      return this;
   }

   public PersistenceUnitCachingType getSharedCacheMode()
   {
      return PersistenceUnitCachingType.getFromStringValue(childNode.textValue("shared-cache-mode"));
   }

   public String  getSharedCacheModeAsString()
   {
      return childNode.textValue("shared-cache-mode");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : validation-mode
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setValidationMode(PersistenceUnitValidationModeType validationMode)
   {
      childNode.getOrCreate("validation-mode").text(validationMode);
      return this;
   }
   public PersistenceUnit<T> setValidationMode(String validationMode)
   {
      childNode.getOrCreate("validation-mode").text(validationMode);
      return this;
   }

   public PersistenceUnitValidationModeType getValidationMode()
   {
      return PersistenceUnitValidationModeType.getFromStringValue(childNode.textValue("validation-mode"));
   }

   public String  getValidationModeAsString()
   {
      return childNode.textValue("validation-mode");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : properties
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> removeProperties()
   {
      childNode.remove("properties");
      return this;
   }

   public Properties<PersistenceUnit<T>> properties()
   {
      Node node = childNode.getOrCreate("properties");
      Properties<PersistenceUnit<T>> properties = new PropertiesImpl<PersistenceUnit<T>>(this, "properties", childNode, node);
      return properties;
   }




   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setName(String name)
   {
      childNode.attribute("name", name);
      return this;
   }
   public PersistenceUnit<T> removeName()
   {
      childNode.attributes().remove("name");
      return this;
   }

   public String getName()
   {
      return childNode.attributes().get("name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : transaction-type
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public PersistenceUnit<T> setTransactionType(PersistenceUnitTransactionType transactionType)
   {
      childNode.attribute("transaction-type", transactionType);
      return this;
   }
   public PersistenceUnit<T> setTransactionType(String transactionType)
   {
      childNode.attribute("transaction-type", transactionType);
      return this;
   }
   public PersistenceUnit<T> removeTransactionType()
   {
      childNode.attributes().remove("transaction-type");
      return this;
   }

   public PersistenceUnitTransactionType getTransactionType()
   {
      return PersistenceUnitTransactionType.getFromStringValue(childNode.attribute("transaction-type"));
   }

   public String  getTransactionTypeAsString()
   {
      return childNode.attribute("transaction-type");
   }

}
