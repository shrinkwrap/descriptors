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
package org.jboss.shrinkwrap.descriptor.spec.web;

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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
      "moduleName",
      "descriptions",
      "displayNames",
      // "icons",
      "distributable",
      "contextParams",
      "listeners",
      "filters",
      "filterMappings",
      "servlets",
      "servletMappings",
      "sessionConfig",
      // "mimeMappings",
      "welcomeFiles",
      "errorPages",
      // "taglibs", // deprecated in this location
      // "jspConfig",
      "securityConstraints",
      "loginConfig",
      "securityRoles",
      // "localEncodingMappingList",
      //"envEntries",
      // "ejbRefs",
      // "ejbLocalRefs",
      // "serviceRefs",
      // "resourceRefs",
      // "resourceEnvRefs",
      // "messageDestination",
      // "messageDestinationRefs",
      // "persistenceContextRefs",
      // "persistenceUnitRefs",
      // "postConstruct",
      // "preDestroy",
      "absoluteOrdering"
})
@XmlRootElement(name = "web-app")
public class WebApp
{
   public static final String DEFAULT_VERSION = "3.0";
   
   @XmlAttribute(required = true)
   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
   protected String version = DEFAULT_VERSION;
   
   @XmlAttribute(name = "metadata-complete")
   protected Boolean metadataComplete;
   
   @XmlElement(name = "module-name")
   protected String moduleName;
   
   @XmlElement(name = "description")
   protected List<LocalizedText> descriptions;
   
   @XmlElement(name = "display-name")
   protected List<LocalizedText> displayNames;
   
   protected EmptyType distributable = null;
   
   @XmlElement(name = "context-param")
   protected List<Param> contextParams;
   
   @XmlElement(name = "listener")
   protected List<Listener> listeners;
   
   @XmlElement(name = "filter")
   protected List<Filter> filters;
   
   @XmlElement(name = "filter-mapping")
   protected List<FilterMapping> filterMappings;
   
   @XmlElement(name = "servlet")
   protected List<Servlet> servlets;
   
   @XmlElement(name = "servlet-mapping")
   protected List<ServletMapping> servletMappings;
   
   @XmlElementWrapper(name = "welcome-file-list")
   @XmlElement(name = "welcome-file")
   protected List<String> welcomeFiles;
   
   @XmlElement(name = "session-config")
   protected SessionConfig sessionConfig;
   
   @XmlElement(name = "error-page")
   protected List<ErrorPage> errorPages;
   
   @XmlElement(name = "security-constraint")
   protected List<SecurityConstraint> securityConstraints;
   
   @XmlElement(name = "login-config")
   protected List<LoginConfig> loginConfig;
   
   @XmlElement(name = "security-role")
   protected List<SecurityRole> securityRoles;
   
   @XmlElement(name = "absolute-ordering")
   protected List<AbsoluteOrdering> absoluteOrdering;
   
   public static String getNamespace()
   {
      return WebApp.class.getPackage().getAnnotation(XmlSchema.class).namespace();
   }
   
   // TODO validate?
   public String getVersion()
   {
      return version;
   }

   public void setVersion(String version)
   {
      this.version = version;
   }
   
   public Boolean getMetadataComplete()
   {
      return metadataComplete;
   }

   public void setMetadataComplete(Boolean metadataComplete)
   {
      this.metadataComplete = metadataComplete;
   }

   public String getModuleName()
   {
      return moduleName;
   }

   public void setModuleName(String moduleName)
   {
      this.moduleName = moduleName;
   }

   public List<LocalizedText> getDescriptions()
   {
      if (descriptions == null) {
         descriptions = new ArrayList<LocalizedText>();
      }
      return descriptions;
   }
   
   public List<LocalizedText> getDisplayNames()
   {
      if (displayNames == null) {
         displayNames = new ArrayList<LocalizedText>();
      }
      return displayNames;
   }

   public boolean isDistributable()
   {
      return distributable != null;
   }

   public void setDistributable(boolean distributable)
   {
      if (distributable)
      {
         this.distributable = new EmptyType();
      }
      else
      {
         this.distributable = null;
      }
   }
   
   public List<Param> getContextParams()
   {
      if (contextParams == null)
      {
         contextParams = new ArrayList<Param>();
      }
      return contextParams;
   }
   
   public List<Listener> getListeners()
   {
      if (listeners == null)
      {
         listeners = new ArrayList<Listener>();
      }
      
      return listeners;
   }
   
   public List<Filter> getFilters()
   {
      if (filters == null)
      {
         filters = new ArrayList<Filter>();
      }
      return filters;
   }
   
   public List<FilterMapping> getFilterMappings()
   {
      if (filterMappings == null)
      {
         filterMappings = new ArrayList<FilterMapping>();
      }
      
      return filterMappings;
   }
   
   public List<Servlet> getServlets()
   {
      if (servlets == null)
      {
         servlets = new ArrayList<Servlet>();
      }
      
      return servlets;
   }
   
   public List<ServletMapping> getServletMappings()
   {
      if (servletMappings == null)
      {
         servletMappings = new ArrayList<ServletMapping>();
      }
      
      return servletMappings;
   }
   
   public List<String> getWelcomeFiles()
   {
      if (welcomeFiles == null)
      {
         welcomeFiles = new ArrayList<String>();
      }
      return welcomeFiles;
   }
   
   public SessionConfig getSessionConfig()
   {
      if (sessionConfig == null)
      {
         sessionConfig = new SessionConfig();
      }
      return sessionConfig;
   }

   public void setSessionConfig(SessionConfig sessionConfig)
   {
      this.sessionConfig = sessionConfig;
   }
   
   public List<ErrorPage> getErrorPages()
   {
      if (errorPages == null)
      {
         errorPages = new ArrayList<ErrorPage>();
      }
      
      return errorPages;
   }
   
   public List<SecurityConstraint> getSecurityConstraints()
   {
      if (securityConstraints == null)
      {
         securityConstraints = new ArrayList<SecurityConstraint>();
      }
      return securityConstraints;
   }
   
   public List<LoginConfig> getLoginConfig()
   {
      if (loginConfig == null)
      {
         loginConfig = new ArrayList<LoginConfig>();
      }
      return loginConfig;
   }
   
   public List<SecurityRole> getSecurityRoles()
   {
      if (securityRoles == null)
      {
         securityRoles = new ArrayList<SecurityRole>();
      }
      return securityRoles;
   }
   
   public List<AbsoluteOrdering> getAbsoluteOrdering()
   {
      if (absoluteOrdering == null)
      {
         absoluteOrdering = new ArrayList<AbsoluteOrdering>();
      }
      return absoluteOrdering;
   }
   
   public String getSchemaLocation()
   {
      String namespace = WebApp.getNamespace();
      return new StringBuilder().append(namespace)
            .append(" ")
            .append(namespace)
            .append("/web-app_")
            .append(getVersion().replace('.', '_'))
            .append(".xsd").toString();
   }
}
