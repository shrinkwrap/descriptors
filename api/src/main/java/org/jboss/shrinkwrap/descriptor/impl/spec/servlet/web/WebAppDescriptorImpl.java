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
import javax.faces.webapp.FacesServlet;

import org.jboss.shrinkwrap.descriptor.api.Node;
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
import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

/**
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public class WebAppDescriptorImpl extends NodeProviderImplBase implements WebAppDescriptor
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

   // -------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private final Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebAppDescriptorImpl()
   {
      this(new Node("web-app")
            .attribute("xmlns", "http://java.sun.com/xml/ns/javaee")
            .attribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")
            .attribute("xsi:schemaLocation",
                  "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"));
      version("3.0");
   }

   public WebAppDescriptorImpl(Node model)
   {
      this.model = model;
   }

   // -------------------------------------------------------------------------------------||
   // API --------------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   @Override
   public WebAppDescriptor version(String version)
   {
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
      model.create("description").text(description);
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
      Node context = model.create("context-param");
      context.create("param-name").text(name);
      context.create("param-value").text(value);

      return this;
   }

   @Override
   public WebAppDescriptor facesProjectStage(FacesProjectStage stage)
   {
      return contextParam(ProjectStage.PROJECT_STAGE_PARAM_NAME, stage.name());
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
      model.create("listener").create("listener-class").text(clazz);
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
         final FilterDef filter = new FilterDefImpl(model, filterNode);
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
         final String filterName = mappingNode.getSingle(NODE_NAME_FILTER_NAME).text();

         FilterDef filterDef = null;
         List<FilterDef> filters = getFilters();
         for (FilterDef filter : filters)
         {
            if (Strings.areEqualTrimmed(filter.getName(), filterName))
            {
               filterDef = filter;
            }
         }

         final FilterMappingDef filterMapping = new FilterMappingDefImpl(getRootNode(),
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
      Node filter = model.create("filter");
      filter.create("filter-name").text(name);
      filter.create("filter-class").text(clazz);

      FilterDef f = new FilterDefImpl(model, filter).mapping().urlPatterns(urlPatterns);
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
      Node servletNode = model.create("servlet");
      servletNode.create("servlet-name").text(name);
      servletNode.create("servlet-class").text(clazz);
      ServletDef servlet = new ServletDefImpl(model, servletNode);

      servlet.mapping().urlPatterns(urlPatterns);
      return servlet;
   }

   @Override
   public WebAppDescriptor facesServlet()
   {
      servlet(FacesServlet.class, "*.jsf");
      return this;
   }

   @Override
   public WebAppDescriptor welcomeFiles(String... servletPaths)
   {
      for (String p : servletPaths)
      {
         model.getOrCreate("welcome-file-list").create("welcome-file").text(p);
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
         model.getOrCreate("session-config").create("tracking-mode").text(m.name());
      }
      return this;
   }

   @Override
   public CookieConfigDef sessionCookieConfig()
   {
      return new CookieConfigDefImpl(model);
   }

   @Override
   public WebAppDescriptor errorPage(int errorCode, String location)
   {
      Node error = model.create("error-page");
      error.create("error-code").text(errorCode);
      error.create("location").text(location);
      return this;
   }

   @Override
   public WebAppDescriptor errorPage(String exceptionClass, String location)
   {
      Node error = model.create("error-page");
      error.create("exception-type").text(exceptionClass);
      error.create("location").text(location);

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
      Node login = model.create("login-config");
      login.create("auth-method").text(authMethod);
      login.create("realm-name").text(realmName);

      return this;
   }

   @Override
   public WebAppDescriptor formLoginConfig(String loginPage, String errorPage)
   {
      Node login = model.create("login-config");
      login.create("auth-method").text(AuthMethodType.FORM);

      Node form = model.create("form-login-config");
      form.create("form-login-page").text(loginPage);
      form.create("form-error-page").text(errorPage);

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
      Node security = model.create("security-constraint");
      if (displayName != null)
      {
         security.create("name").text(displayName);
      }
      return new SecurityConstraintDefImpl(model, security);
   }

   @Override
   public WebAppDescriptor securityRole(String roleName)
   {
      return securityRole(roleName, null);
   }

   @Override
   public WebAppDescriptor securityRole(String roleName, String description)
   {
      Node security = model.create("security-role");
      if (roleName != null)
      {
         security.create("role-name").text(roleName);
      }
      if (description != null)
      {
         security.create("description").text(description);
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
            ordering.create("name").text(name);
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

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase#getExporter()
    */
   @Override
   protected DescriptorExporter getExporter()
   {
      return new XMLExporter();
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
      return model.attributes().get("version");
   }

   @Override
   public String getModuleName()
   {
      return model.attributes().get("module-name");
   }

   @Override
   public String getDescription()
   {
      return model.attributes().get("description");
   }

   @Override
   public String getDisplayName()
   {
      return model.attributes().get("display-name");
   }

   @Override
   public boolean isDistributable()
   {
      return model.attributes().get("distributable") != null;
   }

   @Override
   public boolean isMetadataComplete()
   {
      String complete = model.attributes().get("metadata-complete");
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
         String name = p.textValue("param-name");
         String value = p.textValue("param-value");
         result.put(name, value);
      }

      return result;
   }

   @Override
   public FacesProjectStage getFacesProjectStage()
   {
      return FacesProjectStage.valueOf(getContextParam(ProjectStage.PROJECT_STAGE_PARAM_NAME));
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
      return model.textValues("listener/listener-class");
   }

   @Override
   public List<ServletDef> getServlets()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public List<ServletMappingDef> getServletMappings()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public boolean hasFacesServlet()
   {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public List<String> getWelcomeFiles()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public int getSessionTimeout()
   {
      // TODO Auto-generated method stub
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