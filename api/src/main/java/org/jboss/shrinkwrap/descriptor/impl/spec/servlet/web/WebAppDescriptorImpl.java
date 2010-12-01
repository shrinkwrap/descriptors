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
import java.util.List;

import javax.faces.application.ProjectStage;
import javax.faces.application.StateManager;
import javax.faces.webapp.FacesServlet;

import org.jboss.shrinkwrap.descriptor.api.Node;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.AuthMethodType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.CookieConfigDef;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.Filter;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FilterMapping;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.InitParamDef;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.SecurityConstraintDef;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.TrackingModeType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

/**
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public class WebAppDescriptorImpl extends NodeProviderImplBase implements WebAppDescriptor
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private final Node model;

   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   public WebAppDescriptorImpl()
   {
      this(new Node("web-app")
            .attribute("xmlns", "http://java.sun.com/xml/ns/javaee")
            .attribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance"));
      
      version("3.0");
   }

   public WebAppDescriptorImpl(Node model)
   {
      this.model = model;
   }

   //-------------------------------------------------------------------------------------||
   // API --------------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Override
   public WebAppDescriptor version(String version)
   {
      model.attribute("version", version);
      return this;
   }

   @Override
   public WebAppDescriptor metadataComplete()
   {
      model.attribute("metadata-complete", "true");
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
      context.create("param-value").text(String.valueOf(value));
      
      return this;
   }

   @Override
   public WebAppDescriptor facesDevelopmentMode()
   {
      return contextParam(ProjectStage.PROJECT_STAGE_PARAM_NAME, ProjectStage.Development.toString());
   }

   // TODO continue with other known parameters
   @Override
   public WebAppDescriptor facesStateSavingMethod(String value)
   {
      return contextParam(StateManager.STATE_SAVING_METHOD_PARAM_NAME, value);
   }

   @Override
   public WebAppDescriptor facesConfigFiles(String... paths)
   {
      // poor man's way of doing join
      String v = Arrays.asList(paths).toString();
      if (v.length() == 2)
      {
         return this;
      }
      return contextParam(FacesServlet.CONFIG_FILES_ATTR, v.substring(0, v.length() - 1));
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
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebAppDescriptor#getFilters()
    */
   @Override
   public List<Filter> getFilters(){
      List<Filter> filters = new ArrayList<Filter>();
      //filters.addAll(model.getFilters());
      return filters;
   }
   
   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebAppDescriptor#getFilterMappings()
    */
   @Override
   public List<FilterMapping> getFilterMappings(){
      List<FilterMapping> mappings = new ArrayList<FilterMapping>();
      //mappings.addAll(model.getFilterMappings());
      return mappings;
   }

   @Override
   public InitParamDef filter(Class<? extends javax.servlet.Filter> clazz, String... urlPatterns)
   {
      return filter(clazz.getSimpleName(), clazz.getName(), urlPatterns);
   }
   
   @Override
   public InitParamDef filter(String clazz, String... urlPatterns)
   {
      return filter(getSimpleName(clazz), clazz, urlPatterns);
   }

   @Override
   public InitParamDef filter(String name, Class<? extends javax.servlet.Filter> clazz, String[] urlPatterns)
   {
      return filter(name, clazz.getName(), urlPatterns);
   }

   @Override
   public InitParamDef filter(String name, String clazz, String[] urlPatterns)
   {
      Node filter = model.create("filter");
      filter.create("filter-name").text(name);
      filter.create("filter-class").text(clazz);

      for (String p : urlPatterns)
      {
         Node mapping = model.create("filter-mapping");
         mapping.create("filter-name").text(name);
         mapping.create("url-pattern").text(p);
      }
      return new InitParamDefImpl(model, filter);
   }

   @Override
   public InitParamDef servlet(Class<? extends javax.servlet.Servlet> clazz, String... urlPatterns)
   {
      return servlet(clazz.getSimpleName(), clazz.getName(), urlPatterns);
   }

   @Override
   public InitParamDef servlet(String clazz, String... urlPatterns)
   {
      return servlet(getSimpleName(clazz), clazz, urlPatterns);
   }

   @Override
   public InitParamDef servlet(String name, Class<? extends javax.servlet.Servlet> clazz, String[] urlPatterns)
   {
      return servlet(name, clazz.getName(), urlPatterns);
   }

   @Override
   public InitParamDef servlet(String name, String clazz, String[] urlPatterns)
   {
      Node servlet = model.create("servlet");
      servlet.create("servlet-name").text(name);
      servlet.create("servlet-class").text(clazz);
      
      Node mapping = model.create("servlet-mapping");
      mapping.create("servlet-name").text(name);
      for(String p : urlPatterns)
      {
         mapping.create("url-pattern").text(p);
      }
      return new InitParamDefImpl(model, servlet);
   }

   @Override
   public InitParamDef facesServlet()
   {
      return servlet(FacesServlet.class, "*.jsf");
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
      model.getOrCreate("session-config").getOrCreate("session-timeout").text(String.valueOf(timeout));
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
      if(roleName != null)
      {
         security.create("role-name").text(roleName);
      }
      if(description != null)
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
      if(names != null)
      {
         for(String name : names)
         {
            ordering.create("name").text(name);
         }
      }
      if(others)
      {
         ordering.getOrCreate("others");
      }
      return this;
   }
   
 
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.spi.NodeProvider#getRootNode()
    */
   @Override
   public Node getRootNode()
   {
      return model;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase#getExporter()
    */
   @Override
   protected DescriptorExporter getExporter()
   {
      return new XMLExporter();
   }
   
   //-------------------------------------------------------------------------------------||
   // Internal Helper Methods ------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

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
}