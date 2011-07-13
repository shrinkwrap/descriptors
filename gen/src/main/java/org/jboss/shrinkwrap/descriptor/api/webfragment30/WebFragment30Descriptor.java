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
package org.jboss.shrinkwrap.descriptor.api.webfragment30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the web-fragment_3_0.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebFragment30Descriptor descriptor = Descriptors.create(WebFragment30Descriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface WebFragment30Descriptor extends Descriptor, DescriptorNamespace<WebFragment30Descriptor>
{
   public WebFragment30Descriptor distributable();

   public Boolean isDistributable();

   // -------------------------------------------------------------------------------------||
   // Element type : context-param
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>context-param</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllContextParam();

   /**
    * Returns the <code>context-param</code> element
    * @return the node defined for the element <code>context-param</code> 
    */
   public ParamValueType<WebFragment30Descriptor> contextParam();

   /**
    * Returns all <code>context-param</code> elements
    * @return list of <code>context-param</code> 
    */
   public List<ParamValueType<WebFragment30Descriptor>> getContextParamList();

   // -------------------------------------------------------------------------------------||
   // Element type : filter
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllFilter();

   /**
    * Returns the <code>filter</code> element
    * @return the node defined for the element <code>filter</code> 
    */
   public FilterType<WebFragment30Descriptor> filter();

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<WebFragment30Descriptor>> getFilterList();

   // -------------------------------------------------------------------------------------||
   // Element type : filter-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllFilterMapping();

   /**
    * Returns the <code>filter-mapping</code> element
    * @return the node defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<WebFragment30Descriptor> filterMapping();

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<WebFragment30Descriptor>> getFilterMappingList();

   // -------------------------------------------------------------------------------------||
   // Element type : listener
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllListener();

   /**
    * Returns the <code>listener</code> element
    * @return the node defined for the element <code>listener</code> 
    */
   public ListenerType<WebFragment30Descriptor> listener();

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebFragment30Descriptor>> getListenerList();

   // -------------------------------------------------------------------------------------||
   // Element type : servlet
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>servlet</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllServlet();

   /**
    * Returns the <code>servlet</code> element
    * @return the node defined for the element <code>servlet</code> 
    */
   public ServletType<WebFragment30Descriptor> servlet();

   /**
    * Returns all <code>servlet</code> elements
    * @return list of <code>servlet</code> 
    */
   public List<ServletType<WebFragment30Descriptor>> getServletList();

   // -------------------------------------------------------------------------------------||
   // Element type : servlet-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>servlet-mapping</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllServletMapping();

   /**
    * Returns the <code>servlet-mapping</code> element
    * @return the node defined for the element <code>servlet-mapping</code> 
    */
   public ServletMappingType<WebFragment30Descriptor> servletMapping();

   /**
    * Returns all <code>servlet-mapping</code> elements
    * @return list of <code>servlet-mapping</code> 
    */
   public List<ServletMappingType<WebFragment30Descriptor>> getServletMappingList();

   // -------------------------------------------------------------------------------------||
   // Element type : session-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>session-config</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllSessionConfig();

   /**
    * Returns the <code>session-config</code> element
    * @return the node defined for the element <code>session-config</code> 
    */
   public SessionConfigType<WebFragment30Descriptor> sessionConfig();

   /**
    * Returns all <code>session-config</code> elements
    * @return list of <code>session-config</code> 
    */
   public List<SessionConfigType<WebFragment30Descriptor>> getSessionConfigList();

   // -------------------------------------------------------------------------------------||
   // Element type : mime-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>mime-mapping</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllMimeMapping();

   /**
    * Returns the <code>mime-mapping</code> element
    * @return the node defined for the element <code>mime-mapping</code> 
    */
   public MimeMappingType<WebFragment30Descriptor> mimeMapping();

   /**
    * Returns all <code>mime-mapping</code> elements
    * @return list of <code>mime-mapping</code> 
    */
   public List<MimeMappingType<WebFragment30Descriptor>> getMimeMappingList();

   // -------------------------------------------------------------------------------------||
   // Element type : welcome-file-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>welcome-file-list</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllWelcomeFileList();

   /**
    * Returns the <code>welcome-file-list</code> element
    * @return the node defined for the element <code>welcome-file-list</code> 
    */
   public WelcomeFileListType<WebFragment30Descriptor> welcomeFileList();

   /**
    * Returns all <code>welcome-file-list</code> elements
    * @return list of <code>welcome-file-list</code> 
    */
   public List<WelcomeFileListType<WebFragment30Descriptor>> getWelcomeFileListList();

   // -------------------------------------------------------------------------------------||
   // Element type : error-page
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>error-page</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllErrorPage();

   /**
    * Returns the <code>error-page</code> element
    * @return the node defined for the element <code>error-page</code> 
    */
   public ErrorPageType<WebFragment30Descriptor> errorPage();

   /**
    * Returns all <code>error-page</code> elements
    * @return list of <code>error-page</code> 
    */
   public List<ErrorPageType<WebFragment30Descriptor>> getErrorPageList();

   // -------------------------------------------------------------------------------------||
   // Element type : jsp-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>jsp-config</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllJspConfig();

   /**
    * Returns the <code>jsp-config</code> element
    * @return the node defined for the element <code>jsp-config</code> 
    */
   public JspConfigType<WebFragment30Descriptor> jspConfig();

   /**
    * Returns all <code>jsp-config</code> elements
    * @return list of <code>jsp-config</code> 
    */
   public List<JspConfigType<WebFragment30Descriptor>> getJspConfigList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-constraint
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllSecurityConstraint();

   /**
    * Returns the <code>security-constraint</code> element
    * @return the node defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<WebFragment30Descriptor> securityConstraint();

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<WebFragment30Descriptor>> getSecurityConstraintList();

   // -------------------------------------------------------------------------------------||
   // Element type : login-config
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>login-config</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllLoginConfig();

   /**
    * Returns the <code>login-config</code> element
    * @return the node defined for the element <code>login-config</code> 
    */
   public LoginConfigType<WebFragment30Descriptor> loginConfig();

   /**
    * Returns all <code>login-config</code> elements
    * @return list of <code>login-config</code> 
    */
   public List<LoginConfigType<WebFragment30Descriptor>> getLoginConfigList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllSecurityRole();

   /**
    * Returns the <code>security-role</code> element
    * @return the node defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<WebFragment30Descriptor> securityRole();

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<WebFragment30Descriptor>> getSecurityRoleList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllMessageDestination();

   /**
    * Returns the <code>message-destination</code> element
    * @return the node defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<WebFragment30Descriptor> messageDestination();

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<WebFragment30Descriptor>> getMessageDestinationList();

   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping-list
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>locale-encoding-mapping-list</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllLocaleEncodingMappingList();

   /**
    * Returns the <code>locale-encoding-mapping-list</code> element
    * @return the node defined for the element <code>locale-encoding-mapping-list</code> 
    */
   public LocaleEncodingMappingListType<WebFragment30Descriptor> localeEncodingMappingList();

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * @return list of <code>locale-encoding-mapping-list</code> 
    */
   public List<LocaleEncodingMappingListType<WebFragment30Descriptor>> getLocaleEncodingMappingListList();

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllDescription();

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
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllDisplayName();

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
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<WebFragment30Descriptor> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebFragment30Descriptor>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllEnvEntry();

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<WebFragment30Descriptor> envEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<WebFragment30Descriptor>> getEnvEntryList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllEjbRef();

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<WebFragment30Descriptor> ejbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<WebFragment30Descriptor>> getEjbRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllEjbLocalRef();

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<WebFragment30Descriptor> ejbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<WebFragment30Descriptor>> getEjbLocalRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllResourceRef();

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<WebFragment30Descriptor> resourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<WebFragment30Descriptor>> getResourceRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllResourceEnvRef();

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<WebFragment30Descriptor> resourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<WebFragment30Descriptor>> getResourceEnvRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllMessageDestinationRef();

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<WebFragment30Descriptor> messageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<WebFragment30Descriptor>> getMessageDestinationRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllPersistenceContextRef();

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<WebFragment30Descriptor> persistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<WebFragment30Descriptor>> getPersistenceContextRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllPersistenceUnitRef();

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<WebFragment30Descriptor> persistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<WebFragment30Descriptor>> getPersistenceUnitRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllPostConstruct();

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<WebFragment30Descriptor> postConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<WebFragment30Descriptor>> getPostConstructList();

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllPreDestroy();

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<WebFragment30Descriptor> preDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<WebFragment30Descriptor>> getPreDestroyList();

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllDataSource();

   /**
    * Returns the <code>data-source</code> element
    * @return the node defined for the element <code>data-source</code> 
    */
   public DataSourceType<WebFragment30Descriptor> dataSource();

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<WebFragment30Descriptor>> getDataSourceList();

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor setVersion(WebAppVersionType version);

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor setVersion(String version);

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeVersion();

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
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor setMetadataComplete(Boolean metadataComplete);

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeMetadataComplete();

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
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor setName(String name);

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param list of <code>name</code> objects 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor setNameList(String... values);

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllName();

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
    * @return the current instance of {@link WebFragment30Descriptor} 
    */
   public WebFragment30Descriptor removeAllOrdering();

   /**
    * Returns the <code>ordering</code> element
    * @return the node defined for the element <code>ordering</code> 
    */
   public OrderingType<WebFragment30Descriptor> ordering();

   /**
    * Returns all <code>ordering</code> elements
    * @return list of <code>ordering</code> 
    */
   public List<OrderingType<WebFragment30Descriptor>> getOrderingList();

}
