package org.jboss.shrinkwrap.descriptors.test.webapp30;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
import org.junit.Test;


public class WebApp30DescriptorAttributeGroupTestCase
{

   private final Logger log = Logger.getLogger(WebApp30DescriptorAttributeGroupTestCase.class.getName());

   /*
    * to test:
    * 
    * web-common-attributes (used in web-appType, web-fragmentType)
    * 
    */
   
   @Test
   public void testDescription() throws Exception
   {
      final WebApp30Descriptor webApp = create()
         .servlet()
            .setDescription("Description1")
            .setDescription("Description2").up();
      
      assertXPath(webApp.exportAsString(), "/web-app/servlet/description[1]", "Description1");
      assertXPath(webApp.exportAsString(), "/web-app/servlet/description[2]", "Description2");
      
      assertTrue(webApp.getServletList().get(0).getDescriptionList().size() == 2);
      webApp.getServletList().get(0).removeAllDescription();
      assertTrue(webApp.getServletList().get(0).getDescriptionList().size() == 0);
   }
   
   @Test
   public void testDisplayName() throws Exception
   {
      final WebApp30Descriptor webApp = create()
         .filter()
            .setDisplayName("displayName1")
            .setDisplayName("displayName2").up();
      
      assertXPath(webApp.exportAsString(), "/web-app/filter/display-name[1]", "displayName1");
      assertXPath(webApp.exportAsString(), "/web-app/filter/display-name[2]", "displayName2");
      
      assertTrue(webApp.getFilterList().get(0).getDisplayNameList().size() == 2);
      webApp.getFilterList().get(0).removeAllDisplayName();
      assertTrue(webApp.getFilterList().get(0).getDisplayNameList().size() == 0);
   }
   
   @Test
   public void testIcon() throws Exception
   {
      final WebApp30Descriptor webApp = create()
         .filter().icon().setLargeIcon("largeIcon1").up()
                  .icon().setSmallIcon("smallIcon2").up().up();
      
      assertXPath(webApp.exportAsString(), "/web-app/filter/icon[1]/large-icon", "largeIcon1");
      assertXPath(webApp.exportAsString(), "/web-app/filter/icon[2]/small-icon", "smallIcon2");
      
      assertTrue(webApp.getFilterList().get(0).getIconList().size() == 2);
      
      webApp.getFilterList().get(0).getIconList().get(0).removeLargeIcon();
      assertTrue(webApp.exportAsString().indexOf("<large-icon>") == -1);
      
      webApp.getFilterList().get(0).getIconList().get(1).removeSmallIcon();
      assertTrue(webApp.exportAsString().indexOf("<small-icon>") == -1);
      
      webApp.getFilterList().get(0).removeAllIcon();
      assertTrue(webApp.filter().getIconList().size() == 0);
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
