package org.jboss.shrinkwrap.descriptors.test.webapp30;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
import org.junit.Test;


public class WebApp30DescriptorSimpleTypeTestCase
{

   @SuppressWarnings("unused")
   private final Logger log = Logger.getLogger(WebApp30DescriptorSimpleTypeTestCase.class.getName());

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
      final WebApp30Descriptor webApp = create().createServlet().loadOnStartup(1).up();      
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
      final WebApp30Descriptor webApp = create().version("3.0");
      assertEquals(webApp.getVersionAsString(), "3.0");
      assertXPath(webApp.exportAsString(), "/web-app/@version", "3.0");
      
      webApp.version("3.x");
      assertEquals(webApp.getVersionAsString(), "3.x");
      assertXPath(webApp.exportAsString(), "/web-app/@version", "3.x");
   }
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private WebApp30Descriptor create()
   {
      return Descriptors.create(WebApp30Descriptor.class);
   }
}
