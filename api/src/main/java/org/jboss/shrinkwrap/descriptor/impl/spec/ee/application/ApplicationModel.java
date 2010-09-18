/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.impl.spec.ee.application;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlType;

import org.jboss.shrinkwrap.descriptor.spi.SchemaModel;

/**
 * ApplicationModel
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
})
@XmlRootElement(name = "application")
public class ApplicationModel implements SchemaModel
{
   public static final String DEFAULT_VERSION = "6";
   
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||
   
   @XmlAttribute(name = "version")
   private String version = DEFAULT_VERSION;

   @XmlElement(name = "description")
   private String description;
   
   @XmlElement(name = "display-name")
   private String displayName;
   
   @XmlElement(name = "library-directory")
   private String libraryDirectory;
   
   @XmlElementWrapper(name = "module")
   @XmlElement(name = "ejb")
   private List<String> ejbModules;
   
   @XmlElementWrapper(name = "module")
   @XmlElement(name = "web")
   private List<WebModuleImpl> webModules;
   
   @XmlElementWrapper(name = "module")
   @XmlElement(name = "connector")
   private List<String> connectorModules;
   
   @XmlElementWrapper(name = "module")
   @XmlElement(name = "java")
   private List<String> javaModules;
   
   @XmlElement(name = "security-role")
   private List<SecurityRole> securityRoles;
   
   /**
    * @param description the description to set
    */
   public void setDescription(String description)
   {
      this.description = description;
   }
   
   /**
    * @return the description
    */
   public String getDescription()
   {
      return description;
   }
   
   /**
    * @param displayName the displayName to set
    */
   public void setDisplayName(String displayName)
   {
      this.displayName = displayName;
   }

   /**
    * @return the displayName
    */
   public String getDisplayName()
   {
      return displayName;
   }
   
   /**
    * @param version the version to set
    */
   public void setVersion(String version)
   {
      this.version = version;
   }
   
   /**
    * @param libraryDirectory the libraryDirectory to set
    */
   public void setLibraryDirectory(String libraryDirectory)
   {
      this.libraryDirectory = libraryDirectory;
   }
   
   /**
    * @return the libraryDirectory
    */
   public String getLibraryDirectory()
   {
      return libraryDirectory;
   }
   
   /**
    * @return the ejbModules
    */
   public List<String> getEjbModules()
   {
      if(ejbModules == null)
      {
         ejbModules = new ArrayList<String>();
      }
      return ejbModules;
   }
   
   /**
    * @return the webModules
    */
   public List<WebModuleImpl> getWebModules()
   {
      if(webModules == null)
      {
         webModules = new ArrayList<WebModuleImpl>();
      }
      return webModules;
   }
   
   /**
    * @return the javaModules
    */
   public List<String> getJavaModules()
   {
      if(javaModules == null)
      {
         javaModules = new ArrayList<String>();
      }
      return javaModules;
   }
   
   /**
    * @return the connectorModules
    */
   public List<String> getConnectorModules()
   {
      if(connectorModules == null)
      {
         connectorModules = new ArrayList<String>();
      }
      return connectorModules;
   }
   
   /**
    * @return the securityRoles
    */
   public List<SecurityRole> getSecurityRoles()
   {
      if(securityRoles == null)
      {
         securityRoles = new ArrayList<SecurityRole>();
      }
      return securityRoles;
   }
   
   //-------------------------------------------------------------------------------------||
   // Required Implementations - SchemaModel ---------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.spi.SchemaModel#getVersion()
    */
   @Override
   public String getVersion()
   {
      return version;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.spi.SchemaModel#getNamespace()
    */
   @Override
   public String getNamespace()
   {
      return ApplicationModel.class.getPackage().getAnnotation(XmlSchema.class).namespace();
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.spi.SchemaModel#getSchemaLocation()
    */
   @Override
   public String getSchemaLocation()
   {
      final String namespace = getNamespace();
      return new StringBuilder().append(namespace).append(" ").append(namespace).append("/application_")
            .append(getVersion().replace('.', '_')).append(".xsd").toString();
   }
}
