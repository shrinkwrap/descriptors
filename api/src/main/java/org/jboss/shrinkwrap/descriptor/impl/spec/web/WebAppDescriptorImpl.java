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
package org.jboss.shrinkwrap.descriptor.impl.spec.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventListener;
import java.util.List;

import javax.faces.application.ProjectStage;
import javax.faces.application.StateManager;
import javax.faces.webapp.FacesServlet;

import org.jboss.shrinkwrap.descriptor.api.spec.web.AuthMethodType;
import org.jboss.shrinkwrap.descriptor.api.spec.web.CookieConfigDef;
import org.jboss.shrinkwrap.descriptor.api.spec.web.Filter;
import org.jboss.shrinkwrap.descriptor.api.spec.web.FilterDef;
import org.jboss.shrinkwrap.descriptor.api.spec.web.FilterMapping;
import org.jboss.shrinkwrap.descriptor.api.spec.web.SecurityConstraintDef;
import org.jboss.shrinkwrap.descriptor.api.spec.web.TrackingModeType;
import org.jboss.shrinkwrap.descriptor.api.spec.web.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.impl.base.SchemaDescriptorImplBase;

/**
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public class WebAppDescriptorImpl extends SchemaDescriptorImplBase<WebAppModel> implements WebAppDescriptor
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private final WebAppModel model;

   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   public WebAppDescriptorImpl()
   {
      this(new WebAppModel());
   }

   public WebAppDescriptorImpl(WebAppModel webApp)
   {
      this.model = webApp;
   }

   //-------------------------------------------------------------------------------------||
   // API --------------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   public WebAppDescriptor version(String version)
   {
      model.setVersion(version);
      return this;
   }

   @Override
   public WebAppDescriptor metadataComplete()
   {
      model.setMetadataComplete(true);
      return this;
   }

   @Override
   public WebAppDescriptor moduleName(String name)
   {
      model.setModuleName(name);
      return this;
   }

   @Override
   public WebAppDescriptor description(String description)
   {
      model.getDescriptions().add(new LocalizedTextImpl(description));
      return this;
   }

   @Override
   public WebAppDescriptor displayName(String displayName)
   {
      model.getDisplayNames().add(new LocalizedTextImpl(displayName));
      return this;
   }

   @Override
   public WebAppDescriptor distributable()
   {
      model.setDistributable(true);
      return this;
   }

   @Override
   public WebAppDescriptor contextParam(String name, Object value)
   {
      model.getContextParams().add(new ParamImpl(name, value.toString()));
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
      model.getListeners().add(new Listener(clazz));
      return this;
   }

   @Override
   public WebAppDescriptor filter(Class<? extends javax.servlet.Filter> clazz, String... urlPatterns)
   {
      return filter(clazz.getSimpleName(), clazz.getName(), urlPatterns);
   }
   
   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.web.WebAppDescriptor#getFilters()
    */
   @Override
   public List<Filter> getFilters(){
      List<Filter> filters = new ArrayList<Filter>();
      filters.addAll(model.getFilters());
      return filters;
   }
   
   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.web.WebAppDescriptor#getFilterMappings()
    */
   @Override
   public List<FilterMapping> getFilterMappings(){
      List<FilterMapping> mappings = new ArrayList<FilterMapping>();
      mappings.addAll(model.getFilterMappings());
      return mappings;
   }

   @Override
   public FilterDef filter(String clazz, String... urlPatterns)
   {
      return filter(getSimpleName(clazz), clazz, urlPatterns);
   }

   @Override
   public WebAppDescriptor filter(String name, Class<? extends javax.servlet.Filter> clazz, String[] urlPatterns)
   {
      return filter(name, clazz.getName(), urlPatterns);
   }

   @Override
   public FilterDef filter(String name, String clazz, String[] urlPatterns)
   {
      FilterImpl filter = new FilterImpl(name, clazz);
      model.getFilters().add(filter);
      for (String p : urlPatterns)
      {
         model.getFilterMappings().add(new FilterMappingImpl(name, p));
      }
      return new FilterDefImpl(model, filter);
   }

   @Override
   public WebAppDescriptor servlet(Class<? extends javax.servlet.Servlet> clazz, String... urlPatterns)
   {
      return servlet(clazz.getSimpleName(), clazz.getName(), urlPatterns);
   }

   @Override
   public WebAppDescriptor servlet(String clazz, String... urlPatterns)
   {
      return servlet(getSimpleName(clazz), clazz, urlPatterns);
   }

   @Override
   public WebAppDescriptor servlet(String name, Class<? extends javax.servlet.Servlet> clazz, String[] urlPatterns)
   {
      return servlet(name, clazz.getName(), urlPatterns);
   }

   @Override
   public WebAppDescriptor servlet(String name, String clazz, String[] urlPatterns)
   {
      model.getServlets().add(new Servlet(name, clazz));
      model.getServletMappings().add(new ServletMappingImpl(name, urlPatterns));
      return this;
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
         model.getWelcomeFiles().add(p);
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
      model.getSessionConfig().setTimeout(timeout);
      return this;
   }

   @Override
   public WebAppDescriptor sessionTrackingModes(TrackingModeType... sessionTrackingModes)
   {
      for (TrackingModeType m : sessionTrackingModes)
      {
         model.getSessionConfig().getTrackingModes().add(m);
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
      model.getErrorPages().add(new ErrorPage(errorCode, location));
      return this;
   }

   @Override
   public WebAppDescriptor errorPage(String exceptionClass, String location)
   {
      model.getErrorPages().add(new ErrorPage(exceptionClass, location));
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
      model.getLoginConfig().add(new LoginConfig(authMethod, realmName));
      return this;
   }

   @Override
   public WebAppDescriptor formLoginConfig(String loginPage, String errorPage)
   {
      model.getLoginConfig().add(
            new LoginConfig(AuthMethodType.FORM.toString(), new FormLoginConfig(loginPage, errorPage)));
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
      SecurityConstraint securityConstraint = new SecurityConstraint();
      if (displayName != null)
      {
         securityConstraint.getDisplayNames().add(new LocalizedTextImpl(displayName));
      }
      model.getSecurityConstraints().add(securityConstraint);
      return new SecurityConstraintDefImpl(model, securityConstraint);
   }

   @Override
   public WebAppDescriptor securityRole(String roleName)
   {
      model.getSecurityRoles().add(new SecurityRole(roleName));
      return this;
   }

   @Override
   public WebAppDescriptor securityRole(String roleName, String description)
   {
      model.getSecurityRoles().add(new SecurityRole(roleName, description));
      return this;
   }

   @Override
   public WebAppDescriptor absoluteOrdering(boolean others, String... names)
   {
      model.getAbsoluteOrdering().add(new AbsoluteOrdering(others, names));
      return this;
   }

   @Override
   public WebAppDescriptor absoluteOrdering(String... names)
   {
      model.getAbsoluteOrdering().add(new AbsoluteOrdering(names));
      return this;
   }
   
   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.spi.SchemaDescriptorProvider#getSchemaModel()
    */
   @Override
   public WebAppModel getSchemaModel()
   {
      return model;
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