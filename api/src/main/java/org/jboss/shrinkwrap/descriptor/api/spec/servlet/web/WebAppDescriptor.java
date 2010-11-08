package org.jboss.shrinkwrap.descriptor.api.spec.servlet.web;

import java.util.EventListener;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;

/**
 * DSL Grammar to construct / alter Web Application
 * XML Descriptors
 * 
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public interface WebAppDescriptor extends Descriptor
{

   WebAppDescriptor version(String version);
   
   WebAppDescriptor metadataComplete();

   WebAppDescriptor moduleName(String name);

   WebAppDescriptor description(String description);

   WebAppDescriptor displayName(String displayName);

   WebAppDescriptor distributable();

   WebAppDescriptor contextParam(String name, Object value);

   WebAppDescriptor facesDevelopmentMode();

   WebAppDescriptor facesStateSavingMethod(String value);

   WebAppDescriptor facesConfigFiles(String... paths);

   WebAppDescriptor listener(Class<? extends EventListener> clazz);

   WebAppDescriptor listener(String clazz);

   WebAppDescriptor filter(Class<? extends javax.servlet.Filter> clazz, String... urlPatterns);

   FilterDef filter(String clazz, String... urlPatterns);

   WebAppDescriptor filter(String name, Class<? extends javax.servlet.Filter> clazz, String[] urlPatterns);

   FilterDef filter(String name, String clazz, String[] urlPatterns);
   
   /**
    * Returns an immutable view of the {@link javax.servlet.Filter}s configured
    * @return
    */
   List<Filter> getFilters();
   
   /**
    * Returns an immutable view of the filter mappings configured
    * @return
    */
   List<FilterMapping> getFilterMappings();

   WebAppDescriptor servlet(Class<? extends javax.servlet.Servlet> clazz, String... urlPatterns);

   WebAppDescriptor servlet(String clazz, String... urlPatterns);

   WebAppDescriptor servlet(String name, Class<? extends javax.servlet.Servlet> clazz, String[] urlPatterns);

   WebAppDescriptor servlet(String name, String clazz, String[] urlPatterns);

   WebAppDescriptor facesServlet();

   WebAppDescriptor welcomeFiles(String... servletPaths);

   WebAppDescriptor welcomeFile(String servletPath);

   WebAppDescriptor sessionTimeout(int timeout);

   WebAppDescriptor sessionTrackingModes(TrackingModeType... sessionTrackingModes);

   CookieConfigDef sessionCookieConfig();

   WebAppDescriptor errorPage(int errorCode, String location);

   WebAppDescriptor errorPage(String exceptionClass, String location);

   WebAppDescriptor errorPage(Class<? extends Throwable> exceptionClass, String location);

   WebAppDescriptor loginConfig(AuthMethodType authMethod, String realmName);

   WebAppDescriptor loginConfig(String authMethod, String realmName);

   WebAppDescriptor formLoginConfig(String loginPage, String errorPage);

   SecurityConstraintDef securityConstraint();

   SecurityConstraintDef securityConstraint(String displayName);

   WebAppDescriptor securityRole(String roleName);

   WebAppDescriptor securityRole(String roleName, String description);

   WebAppDescriptor absoluteOrdering(boolean others, String... names);

   WebAppDescriptor absoluteOrdering(String... names);

}