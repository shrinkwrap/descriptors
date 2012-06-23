package org.jboss.shrinkwrap.descriptor.test.webapp30;

import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertPresenceUsingXPath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.MutableWebAppDescriptor;
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
      final MutableWebAppDescriptor webApp = create().getRoot().createServlet().loadOnStartup(1).up().up();      
      assertTrue(webApp.getRoot().getAllServlet().get(0).getLoadOnStartup()==1);
      webApp.exportAsString();
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/servlet/load-on-startup", "1");
      
      webApp.getRoot().getAllServlet().get(0).loadOnStartup(0);
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/servlet/load-on-startup", "0");
      
      webApp.getRoot().getAllServlet().get(0).removeLoadOnStartup();
      assertTrue(webApp.exportAsString().indexOf("load-on-startup") == -1);
   }
   
   @Test
   public void testWebAppVersionType() throws Exception
   {
      final MutableWebAppDescriptor webApp = create().getRoot().version("3.0").up();
      assertEquals(webApp.getRoot().getVersionAsString(), "3.0");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/@version", "3.0");
      
      webApp.getRoot().version("3.x");
      assertEquals(webApp.getRoot().getVersionAsString(), "3.x");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/@version", "3.x");
   }
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private MutableWebAppDescriptor create()
   {
      return Descriptors.create(MutableWebAppDescriptor.class);
   }
}
