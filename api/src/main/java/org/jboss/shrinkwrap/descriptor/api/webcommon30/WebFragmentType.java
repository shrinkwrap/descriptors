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
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;

/**
 * This interface defines the contract for the <code> web-fragmentType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface WebFragmentType<T> extends Child<T>
{
   public WebFragmentType<T> distributable();

   public Boolean isDistributable();

   // -------------------------------------------------------------------------------------||
   // Element type : context-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>context-param</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllContextParam();

   /**
    * Returns the <code>context-param</code> element
    * @return the node defined for the element <code>context-param</code> 
    */
   public ParamValueType<WebFragmentType<T>> contextParam();

   /**
    * Returns all <code>context-param</code> elements
    * @return list of <code>context-param</code> 
    */
   public List<ParamValueType<WebFragmentType<T>>> getContextParamList();

   // -------------------------------------------------------------------------------------||
   // Element type : filter
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllFilter();

   /**
    * Returns the <code>filter</code> element
    * @return the node defined for the element <code>filter</code> 
    */
   public FilterType<WebFragmentType<T>> filter();

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<WebFragmentType<T>>> getFilterList();

   // -------------------------------------------------------------------------------------||
   // Element type : filter-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllFilterMapping();

   /**
    * Returns the <code>filter-mapping</code> element
    * @return the node defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<WebFragmentType<T>> filterMapping();

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<WebFragmentType<T>>> getFilterMappingList();

   // -------------------------------------------------------------------------------------||
   // Element type : listener
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllListener();

   /**
    * Returns the <code>listener</code> element
    * @return the node defined for the element <code>listener</code> 
    */
   public ListenerType<WebFragmentType<T>> listener();

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebFragmentType<T>>> getListenerList();

   // -------------------------------------------------------------------------------------||
   // Element type : servlet
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>servlet</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllServlet();

   /**
    * Returns the <code>servlet</code> element
    * @return the node defined for the element <code>servlet</code> 
    */
   public ServletType<WebFragmentType<T>> servlet();

   /**
    * Returns all <code>servlet</code> elements
    * @return list of <code>servlet</code> 
    */
   public List<ServletType<WebFragmentType<T>>> getServletList();

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>servlet-mapping</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllServletMapping();

   /**
    * Returns the <code>servlet-mapping</code> element
    * @return the node defined for the element <code>servlet-mapping</code> 
    */
   public ServletMappingType<WebFragmentType<T>> servletMapping();

   /**
    * Returns all <code>servlet-mapping</code> elements
    * @return list of <code>servlet-mapping</code> 
    */
   public List<ServletMappingType<WebFragmentType<T>>> getServletMappingList();

   // -------------------------------------------------------------------------------------||
   // Element type : session-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>session-config</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllSessionConfig();

   /**
    * Returns the <code>session-config</code> element
    * @return the node defined for the element <code>session-config</code> 
    */
   public SessionConfigType<WebFragmentType<T>> sessionConfig();

   /**
    * Returns all <code>session-config</code> elements
    * @return list of <code>session-config</code> 
    */
   public List<SessionConfigType<WebFragmentType<T>>> getSessionConfigList();

   // -------------------------------------------------------------------------------------||
   // Element type : mime-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>mime-mapping</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllMimeMapping();

   /**
    * Returns the <code>mime-mapping</code> element
    * @return the node defined for the element <code>mime-mapping</code> 
    */
   public MimeMappingType<WebFragmentType<T>> mimeMapping();

   /**
    * Returns all <code>mime-mapping</code> elements
    * @return list of <code>mime-mapping</code> 
    */
   public List<MimeMappingType<WebFragmentType<T>>> getMimeMappingList();

   // -------------------------------------------------------------------------------------||
   // Element type : welcome-file-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>welcome-file-list</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllWelcomeFileList();

   /**
    * Returns the <code>welcome-file-list</code> element
    * @return the node defined for the element <code>welcome-file-list</code> 
    */
   public WelcomeFileListType<WebFragmentType<T>> welcomeFileList();

   /**
    * Returns all <code>welcome-file-list</code> elements
    * @return list of <code>welcome-file-list</code> 
    */
   public List<WelcomeFileListType<WebFragmentType<T>>> getWelcomeFileListList();

   // -------------------------------------------------------------------------------------||
   // Element type : error-page
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>error-page</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllErrorPage();

   /**
    * Returns the <code>error-page</code> element
    * @return the node defined for the element <code>error-page</code> 
    */
   public ErrorPageType<WebFragmentType<T>> errorPage();

   /**
    * Returns all <code>error-page</code> elements
    * @return list of <code>error-page</code> 
    */
   public List<ErrorPageType<WebFragmentType<T>>> getErrorPageList();

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>jsp-config</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllJspConfig();

   /**
    * Returns the <code>jsp-config</code> element
    * @return the node defined for the element <code>jsp-config</code> 
    */
   public JspConfigType<WebFragmentType<T>> jspConfig();

   /**
    * Returns all <code>jsp-config</code> elements
    * @return list of <code>jsp-config</code> 
    */
   public List<JspConfigType<WebFragmentType<T>>> getJspConfigList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-constraint
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllSecurityConstraint();

   /**
    * Returns the <code>security-constraint</code> element
    * @return the node defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<WebFragmentType<T>> securityConstraint();

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<WebFragmentType<T>>> getSecurityConstraintList();

   // -------------------------------------------------------------------------------------||
   // Element type : login-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>login-config</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllLoginConfig();

   /**
    * Returns the <code>login-config</code> element
    * @return the node defined for the element <code>login-config</code> 
    */
   public LoginConfigType<WebFragmentType<T>> loginConfig();

   /**
    * Returns all <code>login-config</code> elements
    * @return list of <code>login-config</code> 
    */
   public List<LoginConfigType<WebFragmentType<T>>> getLoginConfigList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllSecurityRole();

   /**
    * Returns the <code>security-role</code> element
    * @return the node defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<WebFragmentType<T>> securityRole();

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<WebFragmentType<T>>> getSecurityRoleList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllMessageDestination();

   /**
    * Returns the <code>message-destination</code> element
    * @return the node defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<WebFragmentType<T>> messageDestination();

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<WebFragmentType<T>>> getMessageDestinationList();

   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>locale-encoding-mapping-list</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllLocaleEncodingMappingList();

   /**
    * Returns the <code>locale-encoding-mapping-list</code> element
    * @return the node defined for the element <code>locale-encoding-mapping-list</code> 
    */
   public LocaleEncodingMappingListType<WebFragmentType<T>> localeEncodingMappingList();

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * @return list of <code>locale-encoding-mapping-list</code> 
    */
   public List<LocaleEncodingMappingListType<WebFragmentType<T>>> getLocaleEncodingMappingListList();

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllDisplayName();

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList();

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<WebFragmentType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebFragmentType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllEnvEntry();

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<WebFragmentType<T>> envEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<WebFragmentType<T>>> getEnvEntryList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllEjbRef();

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<WebFragmentType<T>> ejbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<WebFragmentType<T>>> getEjbRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllEjbLocalRef();

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<WebFragmentType<T>> ejbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<WebFragmentType<T>>> getEjbLocalRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllResourceRef();

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<WebFragmentType<T>> resourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<WebFragmentType<T>>> getResourceRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllResourceEnvRef();

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<WebFragmentType<T>> resourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<WebFragmentType<T>>> getResourceEnvRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllMessageDestinationRef();

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<WebFragmentType<T>> messageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<WebFragmentType<T>>> getMessageDestinationRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllPersistenceContextRef();

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<WebFragmentType<T>> persistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<WebFragmentType<T>>> getPersistenceContextRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllPersistenceUnitRef();

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<WebFragmentType<T>> persistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<WebFragmentType<T>>> getPersistenceUnitRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllPostConstruct();

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<WebFragmentType<T>> postConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<WebFragmentType<T>>> getPostConstructList();

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllPreDestroy();

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<WebFragmentType<T>> preDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<WebFragmentType<T>>> getPreDestroyList();

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllDataSource();

   /**
    * Returns the <code>data-source</code> element
    * @return the node defined for the element <code>data-source</code> 
    */
   public DataSourceType<WebFragmentType<T>> dataSource();

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<WebFragmentType<T>>> getDataSourceList();

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> setVersion(WebAppVersionType version);

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> setVersion(String version);

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeVersion();

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public WebAppVersionType getVersion();

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersionAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> setMetadataComplete(Boolean metadataComplete);

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeMetadataComplete();

   /**
    * Returns the <code>metadata-complete</code> element
    * @return the node defined for the element <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete();

   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>name</code> element 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> setName(String name);

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param list of <code>name</code> objects 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> setNameList(String... values);

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllName();

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
   public List<String> getNameList();

   // -------------------------------------------------------------------------------------||
   // Element type : ordering
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ordering</code> elements 
    * @return the current instance of {@link WebFragmentType<T>} 
    */
   public WebFragmentType<T> removeAllOrdering();

   /**
    * Returns the <code>ordering</code> element
    * @return the node defined for the element <code>ordering</code> 
    */
   public OrderingType<WebFragmentType<T>> ordering();

   /**
    * Returns all <code>ordering</code> elements
    * @return list of <code>ordering</code> 
    */
   public List<OrderingType<WebFragmentType<T>>> getOrderingList();

}
