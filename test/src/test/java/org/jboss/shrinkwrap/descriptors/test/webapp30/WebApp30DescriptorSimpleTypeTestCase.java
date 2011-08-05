package org.jboss.shrinkwrap.descriptors.test.webapp30;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
import org.junit.Test;


public class WebApp30DescriptorSimpleTypeTestCase
{

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
      final WebApp30Descriptor webApp = create().servlet().setLoadOnStartup(1).up();      
      assertTrue(webApp.getServletList().get(0).getLoadOnStartup()==1);
      webApp.exportAsString();
      assertXPath(webApp.exportAsString(), "/web-app/servlet/load-on-startup", "1");
      
      webApp.getServletList().get(0).setLoadOnStartup(0);
      assertXPath(webApp.exportAsString(), "/web-app/servlet/load-on-startup", "0");
      
      webApp.getServletList().get(0).removeLoadOnStartup();
      assertTrue(webApp.exportAsString().indexOf("load-on-startup") == -1);
   }
   
   @Test
   public void testWebAppVersionType() throws Exception
   {
      final WebApp30Descriptor webApp = create().setVersion("3.0");
      assertEquals(webApp.getVersionAsString(), "3.0");
      assertXPath(webApp.exportAsString(), "/web-app/@version", "3.0");
      
      webApp.setVersion("3.x");
      assertEquals(webApp.getVersionAsString(), "3.x");
      assertXPath(webApp.exportAsString(), "/web-app/@version", "3.x");
   }
   
   
   private String getResourceContents(String resource) throws Exception
   {
      assert resource != null && resource.length() > 0 : "Resource must be specified";
      final BufferedReader reader = new BufferedReader(new FileReader(resource));
      final StringBuilder builder = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null)
      {
         builder.append(line);
         builder.append("\n");
      }
      return builder.toString();
   }
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private WebApp30Descriptor create()
   {
      return Descriptors.create(WebApp30Descriptor.class);
   }
}
