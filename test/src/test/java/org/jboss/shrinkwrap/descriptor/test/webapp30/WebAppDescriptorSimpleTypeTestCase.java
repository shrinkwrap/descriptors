package org.jboss.shrinkwrap.descriptor.test.webapp30;

import static org.jboss.shrinkwrap.descriptor.test.util.AssertXPath.assertXPath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.junit.Test;


public class WebAppDescriptorSimpleTypeTestCase
{

   @SuppressWarnings("unused")
   private final Logger log = Logger.getLogger(WebAppDescriptorSimpleTypeTestCase.class.getName());

   /*
    * to test:
    * 
    * load-on-startupType, 
    * web-app-versionType
    * 
    */
   
   @Test
   public void testLoadOnStartupType() throws Exception
   {
      final WebAppDescriptor webApp = create().createServlet().loadOnStartup(1).up();      
      assertTrue(webApp.getAllServlet().get(0).getLoadOnStartup()==1);
      webApp.exportAsString();
      assertXPath(webApp.exportAsString(), "/web-app/servlet/load-on-startup", "1");
      
      webApp.getAllServlet().get(0).loadOnStartup(0);
      assertXPath(webApp.exportAsString(), "/web-app/servlet/load-on-startup", "0");
      
      webApp.getAllServlet().get(0).removeLoadOnStartup();
      assertTrue(webApp.exportAsString().indexOf("load-on-startup") == -1);
   }
   
   @Test
   public void testWebAppVersionType() throws Exception
   {
      final WebAppDescriptor webApp = create().version("3.0");
      assertEquals(webApp.getVersionAsString(), "3.0");
      assertXPath(webApp.exportAsString(), "/web-app/@version", "3.0");
      
      webApp.version("3.x");
      assertEquals(webApp.getVersionAsString(), "3.x");
      assertXPath(webApp.exportAsString(), "/web-app/@version", "3.x");
   }
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private WebAppDescriptor create()
   {
      return Descriptors.create(WebAppDescriptor.class);
   }
}
