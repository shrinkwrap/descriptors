package org.jboss.shrinkwrap.descriptor.impl.webapp30;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.AuthMethodType;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.DispatcherType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.TrackingModeType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;
import org.junit.Test;


public class WebAppDescriptorImplTest
{
   @Test
   public void testNavigation() throws Exception
   {
      final String webApp = Descriptors.create(WebApp30Descriptor.class)
         .getEjbLocalRef()
            .setLocal("")
            .setMappedName("")
            .setLookupName("").up()
         .setVersion(WebAppVersionType._3_0).setVersion(WebAppVersionType._3_0)
         .setMetadataComplete(false)
         .setModuleName("")
         .setDescription("description1")
         .setDisplayName("displayName1")
         .getIcon().setSmallIcon("smallIcon1").setLargeIcon("largeIcon1").up().up()
         .distributable()
         .getContextParam()
               .setDescription("description")
               .setParamName("paramName")
               .setParamValue("paramValue").up()
         .getFilter()
               .setFilterName("filterName")
               .setFilterClass("org.jboss.arquillian.class")               
               .setAsyncSupported(false)
//               .setDescription("")
//               .setDisplayName("")
//               .getIcon()
//                     .setSmallIcon("")
//                     .setLargeIcon("").
//               .up()
               .getInitParam()
                     .setDescription("description")
                     .setParamName("")
                     .setParamValue("").up()
               .up()
         .filterMapping()
               .filterName("")
               .servletName("")
               .urlPattern("")
               .Dispatcher(DispatcherType.FORWARD).up()
         .listener()
               .listenerClass("").up()
         .servlet()
               .asyncSupported(false)
               .enabled(true)
               .jspFile("")
               .loadOnStartup(true)
               .multipartConfig()
                     .location("")
                     .maxFileSize(10000)
                     .maxRequestSize(10000)
                     .fileSizeThreshold(100).up()
               .up()
         .servletMapping()
               .servletName("")
               .urlPattern("")
               .up()
         .sessionConfig()
               .cookieConfig()
                     .comment("")
                     .domain("")
                     .httpOnly(true)
                     .maxAge(10)
                     .name("")
                     .secure(true)
                     .path("")
                     .up()
               .sessionTimeout(100000)
               .trackingMode(TrackingModeType.URL)
               .up()
         .mimeMapping()
               .extension("")
               .mimeType("")
               .up()
         .welcomeFileList()
               .welcomeFile("")
               .welcomeFile("")
               .up()
         .errorPage()
               .location(23, "")
               .location("", "")
               .up()
         .jspConfig()
               .jspPropertyGroup()
                     .buffer("")
                     .defaultContentType("")
                     .deferredSyntaxAllowedAsLiteral(false)
                     .elIgnored(false)
                     .up()
               .up()
         .securityConstraint()
               .authConstraint()
                     .roleName("")
                     .description("")
                     .up()
               .displayName("")
               .userDataConstraint()
                     .description("")
                     .TransportGuarantee("")
                     .up()
               .up()
         .loginConfig()
               .authMethod(AuthMethodType.BASIC) 
               .up()
         .securityRole()
               .description("")
               .roleName("")
               .up()
         .envEntry()
               .description("")
               .envEntryName("")
               .envEntryType("")
               .envEntryValue("")
               .up()
         .envEntry()
               .description("")
               .envEntryName("")
               .envEntryType("")
               .envEntryValue("")
               .up()
         .absoluteOrdering()
               .name("name1")
               .name("name2")
               .name("","","")
               .others().up()
         .exportAsString();
      
     
   }
   
   @Test
   public void testAbsoluteOrdering() throws Exception
   {
//      WebAppDescriptor<WebAppDescriptorImpl> webAppDescriptor = new WebAppDescriptorImpl();
//      webAppDescriptor.absoluteOrdering().name("myName").up().moduleName("moduleName");
       
   }
}
