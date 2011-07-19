/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbJarType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> ejb-jarType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The ejb-jarType defines the root element of the EJB <br> 
 * deployment descriptor. It contains <br> 
 *<br>
 * - an optional description of the ejb-jar file <br> 
 * - an optional display name <br> 
 * - an optional icon that contains a small and a large <br> 
 * icon file name <br> 
 * - an optional module name. Only applicable to <br> 
 * stand-alone ejb-jars or ejb-jars packaged in an ear. <br> 
 * Ignored if specified for an ejb-jar.xml within a .war. <br> 
 * In that case, standard .war module-name rules apply. <br> 
 * - structural information about all included <br> 
 * enterprise beans that is not specified through <br> 
 * annotations <br> 
 * - structural information about interceptor classes <br> 
 * - a descriptor for container managed relationships, <br> 
 * if any. <br> 
 * - an optional application-assembly descriptor <br> 
 * - an optional name of an ejb-client-jar file for the <br> 
 * ejb-jar. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class EjbJarTypeImpl<T> implements Child<T>, EjbJarType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EjbJarTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public EjbJarTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
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

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setDescriptionList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDescription(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
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
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setDisplayNameList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDisplayName(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<EjbJarType<T>> icon()
   {
      return new IconTypeImpl<EjbJarType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EjbJarType<T>>> getIconList()
   {
      List<IconType<EjbJarType<T>>> list = new ArrayList<IconType<EjbJarType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<EjbJarType<T>> type = new IconTypeImpl<EjbJarType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : module-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>module-name</code> element with the given value will be created.
    * Otherwise, the existing <code>module-name</code> element will be updated with the given value.
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setModuleName(String moduleName)
   {
      childNode.getOrCreate("module-name").text(moduleName);
      return this;
   }

   /**
    * Removes the <code>module-name</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeModuleName()
   {
      childNode.remove("module-name");
      return this;
   }

   /**
    * Returns the <code>module-name</code> element
    * @return the node defined for the element <code>module-name</code> 
    */
   public String getModuleName()
   {
      return childNode.textValue("module-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : enterprise-beans
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>enterprise-beans</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeEnterpriseBeans()
   {
      childNode.remove("enterprise-beans");
      return this;
   }

   /**
    * If not already created, a new <code>enterprise-beans</code> element will be created and returned.
    * Otherwise, the existing <code>enterprise-beans</code> element will be returned.
    * @return the node defined for the element <code>enterprise-beans</code> 
    */
   public EnterpriseBeansType<EjbJarType<T>> enterpriseBeans()
   {
      Node node = childNode.getOrCreate("enterprise-beans");
      EnterpriseBeansType<EjbJarType<T>> enterpriseBeans = new EnterpriseBeansTypeImpl<EjbJarType<T>>(this,
            "enterprise-beans", childNode, node);
      return enterpriseBeans;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : interceptors
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeInterceptors()
   {
      childNode.remove("interceptors");
      return this;
   }

   /**
    * If not already created, a new <code>interceptors</code> element will be created and returned.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return the node defined for the element <code>interceptors</code> 
    */
   public InterceptorsType<EjbJarType<T>> interceptors()
   {
      Node node = childNode.getOrCreate("interceptors");
      InterceptorsType<EjbJarType<T>> interceptors = new InterceptorsTypeImpl<EjbJarType<T>>(this, "interceptors",
            childNode, node);
      return interceptors;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : relationships
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>relationships</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeRelationships()
   {
      childNode.remove("relationships");
      return this;
   }

   /**
    * If not already created, a new <code>relationships</code> element will be created and returned.
    * Otherwise, the existing <code>relationships</code> element will be returned.
    * @return the node defined for the element <code>relationships</code> 
    */
   public RelationshipsType<EjbJarType<T>> relationships()
   {
      Node node = childNode.getOrCreate("relationships");
      RelationshipsType<EjbJarType<T>> relationships = new RelationshipsTypeImpl<EjbJarType<T>>(this, "relationships",
            childNode, node);
      return relationships;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : assembly-descriptor
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>assembly-descriptor</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeAssemblyDescriptor()
   {
      childNode.remove("assembly-descriptor");
      return this;
   }

   /**
    * If not already created, a new <code>assembly-descriptor</code> element will be created and returned.
    * Otherwise, the existing <code>assembly-descriptor</code> element will be returned.
    * @return the node defined for the element <code>assembly-descriptor</code> 
    */
   public AssemblyDescriptorType<EjbJarType<T>> assemblyDescriptor()
   {
      Node node = childNode.getOrCreate("assembly-descriptor");
      AssemblyDescriptorType<EjbJarType<T>> assemblyDescriptor = new AssemblyDescriptorTypeImpl<EjbJarType<T>>(this,
            "assembly-descriptor", childNode, node);
      return assemblyDescriptor;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-client-jar
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-client-jar</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-client-jar</code> element will be updated with the given value.
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setEjbClientJar(String ejbClientJar)
   {
      childNode.getOrCreate("ejb-client-jar").text(ejbClientJar);
      return this;
   }

   /**
    * Removes the <code>ejb-client-jar</code> element 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeEjbClientJar()
   {
      childNode.remove("ejb-client-jar");
      return this;
   }

   /**
    * Returns the <code>ejb-client-jar</code> element
    * @return the node defined for the element <code>ejb-client-jar</code> 
    */
   public String getEjbClientJar()
   {
      return childNode.textValue("ejb-client-jar");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setVersion(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeVersion()
   {
      childNode.attributes().remove("version");
      return this;
   }

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion()
   {
      return childNode.attributes().get("version");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> setMetadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of {@link EjbJarType<T>} 
    */
   public EjbJarType<T> removeMetadataComplete()
   {
      childNode.attributes().remove("metadata-complete");
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> element
    * @return the node defined for the element <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.attribute("metadata-complete"));
   }

}
