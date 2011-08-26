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
package org.jboss.shrinkwrap.descriptor.impl.spec.servlet.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.faces.application.ProjectStage;
import javax.faces.application.StateManager;
import javax.faces.application.ViewHandler;
import javax.faces.webapp.FacesServlet;

import org.jboss.shrinkwrap.descriptor.api.spec.ee.application.SecurityRole;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.AuthMethodType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.CookieConfigDef;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.ErrorPage;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FacesProjectStage;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FacesStateSavingMethod;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FilterDef;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FilterMappingDef;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.LoginConfig;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.SecurityConstraintDef;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.ServletDef;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.ServletMappingDef;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.TrackingModeType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/**
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public class WebAppDescriptorImpl extends NodeDescriptorImplBase implements WebAppDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Class Members ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   /**
    * Node names
    */
   private static final String NODE_NAME_FILTER = "filter";
   private static final String NODE_NAME_FILTER_MAPPINGS = "filter-mapping";
   private static final String NODE_NAME_FILTER_NAME = "filter-name";
   private static final String NODE_NAME_SERVLET = "servlet";
   private static final String NODE_NAME_SERVLET_MAPPINGS = "servlet-mapping";
   private static final String NODE_NAME_SERVLET_NAME = "servlet-name";

   // -------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private final Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebAppDescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("web-app")
            .attribute("xmlns", "http://java.sun.com/xml/ns/javaee")
            .attribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")
            .attribute("xsi:schemaLocation",
                  "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"));
      version("3.0");
   }

   public WebAppDescriptorImpl(String descriptorName, Node model)
   {
      super(descriptorName);
      this.model = model;
   }

   // -------------------------------------------------------------------------------------||
   // API --------------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   @Override
   public WebAppDescriptor version(final String version)
   {
      if (version == null || version.length() == 0)
      {
         throw new IllegalArgumentException("Version must be specified");
      }
      model.attribute("xsi:schemaLocation",
            "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_" + version.replace(".", "_")
                  + ".xsd");
      model.attribute("version", version);
      return this;
   }

   @Override
   public WebAppDescriptor metadataComplete(boolean value)
   {
      model.attribute("metadata-complete", value);
      return this;
   }

   @Override
   public WebAppDescriptor moduleName(String name)
   {
      model.getOrCreate("module-name").text(name);
      return this;
   }

   @Override
   public WebAppDescriptor description(String description)
   {
      model.createChild("description").text(description);
      return this;
   }

   @Override
   public WebAppDescriptor displayName(String displayName)
   {
      model.getOrCreate("display-name").text(displayName);
      return this;
   }

   @Override
   public WebAppDescriptor distributable()
   {
      model.getOrCreate("distributable");
      return this;
   }

   @Override
   public WebAppDescriptor contextParam(String name, Object value)
   {
      List<Node> params = model.get("context-param");
      
      Node param = null;
      for (Node node : params)
      {
         param = node.getSingle("param-name=" + name);
         if(param != null)
         {
            param.getParent().getOrCreate("param-value").text(value);
            break;
         }
      }

      if(param == null)
      {
         param = model.createChild("context-param");
         param.createChild("param-name").text(name);
         param.createChild("param-value").text(value);
      }
      
      return this;
   }

   @Override
   public WebAppDescriptor facesProjectStage(FacesProjectStage stage)
   {
      return contextParam(ProjectStage.PROJECT_STAGE_PARAM_NAME, stage.getStage());
   }

   @Override
   public WebAppDescriptor facesStateSavingMethod(FacesStateSavingMethod method)
   {
      return contextParam(StateManager.STATE_SAVING_METHOD_PARAM_NAME, method.name());
   }

   @Override
   public WebAppDescriptor facesConfigFiles(String... paths)
   {
      if (paths == null || paths.length == 0)
      {
         return this;
      }
      return contextParam(FacesServlet.CONFIG_FILES_ATTR, Strings.join(Arrays.asList(paths), ","));
   }

   @Override
   public WebAppDescriptor listener(Class<? extends EventListener> clazz)
   {
      return listener(clazz.getName());
   }

   @Override
   public WebAppDescriptor listener(String clazz)
   {
      model.createChild("listener").createChild("listener-class").text(clazz);
      return this;
   }

   /**
    * {@inheritDoc}
    * 
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebAppDescriptor#getFilters()
    */
   @Override
   public List<FilterDef> getFilters()
   {
      final List<FilterDef> filters = new ArrayList<FilterDef>();
      for (final Node filterNode : model.get(NODE_NAME_FILTER))
      {
         final FilterDef filter = new FilterDefImpl(getDescriptorName(), model, filterNode);
         filters.add(filter);
      }
      return filters;
   }

   /**
    * {@inheritDoc}
    * 
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebAppDescriptor#getFilterMappings()
    */
   @Override
   public List<FilterMappingDef> getFilterMappings()
   {
      final List<FilterMappingDef> mappings = new ArrayList<FilterMappingDef>();
      for (final Node mappingNode : model.get(NODE_NAME_FILTER_MAPPINGS))
      {
         final String filterName = mappingNode.getSingle(NODE_NAME_FILTER_NAME).getText();

         FilterDef filterDef = null;
         List<FilterDef> filters = getFilters();
         for (FilterDef filter : filters)
         {
            if (Strings.areEqualTrimmed(filter.getName(), filterName))
            {
               filterDef = filter;
            }
         }

         final FilterMappingDef filterMapping = new FilterMappingDefImpl(getDescriptorName(), getRootNode(),
                  ((FilterDefImpl) filterDef).getNode(), mappingNode);
         mappings.add(filterMapping);
      }
      return mappings;
   }

   @Override
   public FilterDef filter(Class<? extends javax.servlet.Filter> clazz, String... urlPatterns)
   {
      return filter(clazz.getSimpleName(), clazz.getName(), urlPatterns);
   }

   @Override
   public FilterDef filter(String clazz, String... urlPatterns)
   {
      return filter(getSimpleName(clazz), clazz, urlPatterns);
   }

   @Override
   public FilterDef filter(String name, Class<? extends javax.servlet.Filter> clazz, String[] urlPatterns)
   {
      return filter(name, clazz.getName(), urlPatterns);
   }

   @Override
   public FilterDef filter(String name, String clazz, String[] urlPatterns)
   {
      Node filter = model.createChild("filter");
      filter.createChild("filter-name").text(name);
      filter.createChild("filter-class").text(clazz);

      FilterDef f = new FilterDefImpl(getDescriptorName(), model, filter).mapping().urlPatterns(urlPatterns);
      return f;
   }

   @Override
   public ServletDef servlet(Class<? extends javax.servlet.Servlet> clazz, String... urlPatterns)
   {
      return servlet(clazz.getSimpleName(), clazz.getName(), urlPatterns);
   }

   @Override
   public ServletDef servlet(String clazz, String... urlPatterns)
   {
      return servlet(getSimpleName(clazz), clazz, urlPatterns);
   }

   @Override
   public ServletDef servlet(String name, Class<? extends javax.servlet.Servlet> clazz, String[] urlPatterns)
   {
      return servlet(name, clazz.getName(), urlPatterns);
   }

   @Override
   public ServletDef servlet(String name, String clazz, String[] urlPatterns)
   {
      Node servletNode = model.createChild("servlet");
      servletNode.createChild("servlet-name").text(name);
      servletNode.createChild("servlet-class").text(clazz);
      ServletDef servlet = new ServletDefImpl(getDescriptorName(), model, servletNode);

      servlet.mapping().urlPatterns(urlPatterns);
      return servlet;
   }

   @Override
   public WebAppDescriptor facesServlet()
   {
      return servlet(FacesServlet.class, "*.jsf");
   }

   @Override
   public WebAppDescriptor welcomeFiles(String... servletPaths)
   {
      for (String p : servletPaths)
      {
         model.getOrCreate("welcome-file-list").createChild("welcome-file").text(p);
      }
      return this;
   }

   @Override
   public WebAppDescriptor welcomeFile(String servletPath)
   {
      return welcomeFiles(servletPath);
   }

   @Override
   public WebAppDescriptor sessionTimeout(int timeout)
   {
      model.getOrCreate("session-config").getOrCreate("session-timeout").text(timeout);
      return this;
   }

   @Override
   public WebAppDescriptor sessionTrackingModes(TrackingModeType... sessionTrackingModes)
   {
      for (TrackingModeType m : sessionTrackingModes)
      {
         model.getOrCreate("session-config").createChild("tracking-mode").text(m.name());
      }
      return this;
   }

   @Override
   public CookieConfigDef sessionCookieConfig()
   {
      return new CookieConfigDefImpl(getDescriptorName(), model);
   }

   @Override
   public WebAppDescriptor errorPage(int errorCode, String location)
   {
      Node error = model.createChild("error-page");
      error.createChild("error-code").text(errorCode);
      error.createChild("location").text(location);
      return this;
   }

   @Override
   public WebAppDescriptor errorPage(String exceptionClass, String location)
   {
      Node error = model.createChild("error-page");
      error.createChild("exception-type").text(exceptionClass);
      error.createChild("location").text(location);

      return this;
   }

   @Override
   public WebAppDescriptor errorPage(Class<? extends Throwable> exceptionClass, String location)
   {
      return errorPage(exceptionClass.getName(), location);
   }

   @Override
   public WebAppDescriptor loginConfig(AuthMethodType authMethod, String realmName)
   {
      return loginConfig(authMethod.toString(), realmName);
   }

   @Override
   public WebAppDescriptor loginConfig(String authMethod, String realmName)
   {
      Node login = model.createChild("login-config");
      login.createChild("auth-method").text(authMethod);
      login.createChild("realm-name").text(realmName);

      return this;
   }

   @Override
   public WebAppDescriptor formLoginConfig(String loginPage, String errorPage)
   {
      Node login = model.createChild("login-config");
      login.createChild("auth-method").text(AuthMethodType.FORM);

      Node form = model.createChild("form-login-config");
      form.createChild("form-login-page").text(loginPage);
      form.createChild("form-error-page").text(errorPage);

      return this;
   }

   @Override
   public SecurityConstraintDef securityConstraint()
   {
      return securityConstraint(null);
   }

   @Override
   public SecurityConstraintDef securityConstraint(String displayName)
   {
      Node security = model.createChild("security-constraint");
      if (displayName != null)
      {
         security.createChild("display-name").text(displayName);
      }
      return new SecurityConstraintDefImpl(getDescriptorName(), model, security);
   }

   @Override
   public WebAppDescriptor securityRole(String roleName)
   {
      return securityRole(roleName, null);
   }

   @Override
   public WebAppDescriptor securityRole(String roleName, String description)
   {
      Node security = model.createChild("security-role");
      if (roleName != null)
      {
         security.createChild("role-name").text(roleName);
      }
      if (description != null)
      {
         security.createChild("description").text(description);
      }
      return this;
   }

   @Override
   public WebAppDescriptor absoluteOrdering(String... names)
   {
      return absoluteOrdering(false, names);
   }

   @Override
   public WebAppDescriptor absoluteOrdering(boolean others, String... names)
   {
      Node ordering = model.getOrCreate("absolute-ordering");
      if (names != null)
      {
         for (String name : names)
         {
            ordering.createChild("name").text(name);
         }
      }
      if (others)
      {
         ordering.getOrCreate("others");
      }
      return this;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spi.NodeProvider#getRootNode()
    */
   @Override
   public Node getRootNode()
   {
      return model;
   }

   // -------------------------------------------------------------------------------------||
   // Internal Helper Methods ------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   /*
    * org.test.MyClass -> MyClass
    */
   private String getSimpleName(String fqcn)
   {
      if (fqcn.indexOf('.') >= 0)
      {
         return fqcn.substring(fqcn.lastIndexOf('.') + 1);
      }
      return fqcn;
   }

   @Override
   public String getVersion()
   {
      return model.getAttributes().get("version");
   }

   @Override
   public String getModuleName()
   {
      return model.getAttributes().get("module-name");
   }

   @Override
   public String getDescription()
   {
      return model.getAttributes().get("description");
   }

   @Override
   public String getDisplayName()
   {
      return model.getAttributes().get("display-name");
   }

   @Override
   public boolean isDistributable()
   {
      return model.getAttributes().get("distributable") != null;
   }

   @Override
   public boolean isMetadataComplete()
   {
      String complete = model.getAttributes().get("metadata-complete");
      if (complete == null)
      {
         complete = "";
      }
      return "true".equalsIgnoreCase(complete);
   }

   @Override
   public String getContextParam(String name)
   {
      Map<String, String> params = getContextParams();
      for (Entry<String, String> e : params.entrySet())
      {
         if (e.getKey() != null && e.getKey().equals(name))
         {
            return e.getValue();
         }
      }
      return null;
   }

   @Override
   public Map<String, String> getContextParams()
   {
      Map<String, String> result = new HashMap<String, String>();

      List<Node> params = model.get("context-param");
      for (Node p : params)
      {
         String name = p.getTextValueForPatternName("param-name");
         String value = p.getTextValueForPatternName("param-value");
         result.put(name, value);
      }

      return result;
   }

   @Override
   public List<String> getFaceletsDefaultSuffixes()
   {
      List<String> suffixes = new ArrayList<String>();
      
      String value = getContextParam(ViewHandler.FACELETS_SUFFIX_PARAM_NAME);
      if(value != null)
      {
         suffixes = Arrays.asList(value.split("\\s+"));
      }
      else
      {
         suffixes = Arrays.asList(ViewHandler.DEFAULT_FACELETS_SUFFIX.split("\\s+"));
      }
      
      return suffixes;
   }
   
   @Override
   public WebAppDescriptor faceletsDefaultSuffixes(String... suffixes)
   {
      contextParam(ViewHandler.FACELETS_SUFFIX_PARAM_NAME, Strings.join(Arrays.asList(suffixes), " "));
      
      return this;
   }

   @Override
   public List<String> getFacesDefaultSuffixes()
   {
      List<String> suffixes = new ArrayList<String>();
      
      String value = getContextParam(ViewHandler.DEFAULT_SUFFIX_PARAM_NAME);
      if(value != null)
      {
         suffixes.addAll(Arrays.asList(value.split("\\s+")));
      }
      else
      {
         suffixes.addAll(Arrays.asList(ViewHandler.DEFAULT_SUFFIX.split("\\s+")));
      }
      
      return suffixes;
   }

   @Override
   public WebAppDescriptor facesDefaultSuffixes(String... suffixes)
   {
      contextParam(ViewHandler.DEFAULT_SUFFIX_PARAM_NAME, Strings.join(Arrays.asList(suffixes), " "));
      return this;
   }

   @Override
   public List<String> getFaceletsViewMappings()
   {
      List<String> mappings = new ArrayList<String>();
      
      String value = getContextParam(ViewHandler.FACELETS_VIEW_MAPPINGS_PARAM_NAME);
      if(value != null)
      {
         mappings.addAll(Arrays.asList(value.split("\\s*;\\s*")));
      }
      
      return mappings;
   }

   @Override
   public WebAppDescriptor faceletsViewMappings(String... mappings)
   {
      contextParam(ViewHandler.FACELETS_VIEW_MAPPINGS_PARAM_NAME, Strings.join(Arrays.asList(mappings), ";"));
      return null;
   }

   @Override
   public FacesProjectStage getFacesProjectStage()
   {
      // JSF uses strict case-sensitive parsing, so we need to be rediculously sensitive here
      String value = getContextParam(ProjectStage.PROJECT_STAGE_PARAM_NAME);
      for (FacesProjectStage stage : FacesProjectStage.values())
      {
         if(stage.getStage().equals(value))
         {
            return stage;
         }
      }
      return FacesProjectStage.PRODUCTION;
   }

   @Override
   public FacesStateSavingMethod getFacesStateSavingMethod()
   {
      return FacesStateSavingMethod.valueOf(getContextParam(StateManager.STATE_SAVING_METHOD_PARAM_NAME));
   }

   @Override
   public List<String> getFacesConfigFiles()
   {
      String value = getContextParam(FacesServlet.CONFIG_FILES_ATTR);
      return value == null ? new ArrayList<String>() : Arrays.asList(value.split(","));
   }

   @Override
   public List<String> getListeners()
   {
      return model.getTextValuesForPatternName("listener/listener-class");
   }

   @Override
   public List<ServletDef> getServlets()
   {
      final List<ServletDef> servlets = new ArrayList<ServletDef>();
      for (final Node servlet : model.get(NODE_NAME_SERVLET))
      {
         final ServletDef filter = new ServletDefImpl(getDescriptorName(), model, servlet);
         servlets.add(filter);
      }
      return servlets;
   }

   @Override
   public List<ServletMappingDef> getServletMappings()
   {
      final List<ServletMappingDef> mappings = new ArrayList<ServletMappingDef>();
      for (final Node mappingNode : model.get(NODE_NAME_SERVLET_MAPPINGS))
      {
         final String servletName = mappingNode.getSingle(NODE_NAME_SERVLET_NAME).getText();

         ServletDef servletDef = null;
         List<ServletDef> servlets = getServlets();
         for (ServletDef servlet : servlets)
         {
            if (Strings.areEqualTrimmed(servlet.getName(), servletName))
            {
               servletDef = servlet;
            }
         }

         final ServletMappingDef servletMapping = new ServletMappingDefImpl(getDescriptorName(), getRootNode(),
                  ((ServletDefImpl) servletDef).getNode(), mappingNode);
         mappings.add(servletMapping);
      }
      return mappings;
   }

   @Override
   public boolean hasFacesServlet()
   {
      List<Node> list = model.get("servlet/servlet-class=javax.faces.webapp.FacesServlet");
      return !list.isEmpty();
   }

   @Override
   public List<String> getWelcomeFiles()
   {
      List<String> results = new ArrayList<String>();
      List<Node> list = model.get("welcome-file-list/welcome-file");
      for (Node file : list)
      {
         results.add(file.getText());
      }
      return results;
   }

   @Override
   public int getSessionTimeout()
   {
      Node single = model.getSingle("session-config/session-timeout");
      if(single != null)
      {
         try
         {
            return Integer.parseInt(single.getText().trim());
         }
         catch (NumberFormatException e)
         {
            throw new RuntimeException("Unable to parse session-timeout from value ["+single.getText().trim()+"]");
         }
      }
      return 0;
   }

   @Override
   public List<TrackingModeType> getSessionTrackingModes()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public List<ErrorPage> getErrorPages()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public List<LoginConfig> getLoginConfigs()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public List<SecurityConstraintDef> getSecurityConstraints()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public List<SecurityRole> getSecurityRoles()
   {
      // TODO Auto-generated method stub
      return null;
   }
}