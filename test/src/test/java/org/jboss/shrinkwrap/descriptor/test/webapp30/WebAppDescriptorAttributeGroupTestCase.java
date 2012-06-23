package org.jboss.shrinkwrap.descriptor.test.webapp30;

import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertPresenceUsingXPath;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.MutableWebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.junit.Test;


public class WebAppDescriptorAttributeGroupTestCase
{

   @SuppressWarnings("unused")
   private final Logger log = Logger.getLogger(WebAppDescriptorAttributeGroupTestCase.class.getName());

   /*
    * to test:
    * 
    * web-common-attributes (used in web-appType, web-fragmentType)
    * 
    */
   
   @Test
   public void testDescription() throws Exception
   {
      final MutableWebAppDescriptor webApp = create().getRoot()
         .createServlet()
            .description("Description1")
            .description("Description2").up().up();
      
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/servlet/description[1]", "Description1");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/servlet/description[2]", "Description2");
      
      assertTrue(webApp.getRoot().getAllServlet().get(0).getAllDescription().size() == 2);
      webApp.getRoot().getAllServlet().get(0).removeAllDescription();
      assertTrue(webApp.getRoot().getAllServlet().get(0).getAllDescription().size() == 0);
   }
   
   @Test
   public void testDisplayName() throws Exception
   {
      final MutableWebAppDescriptor webApp = create().getRoot()
         .createFilter()
            .displayName("displayName1")
            .displayName("displayName2").up().up();
      
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/filter/display-name[1]", "displayName1");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/filter/display-name[2]", "displayName2");
      
      assertTrue(webApp.getRoot().getAllFilter().get(0).getAllDisplayName().size() == 2);
      webApp.getRoot().getAllFilter().get(0).removeAllDisplayName();
      assertTrue(webApp.getRoot().getAllFilter().get(0).getAllDisplayName().size() == 0);
   }
   
   @Test
   public void testIcon() throws Exception
   {
      final MutableWebAppDescriptor webApp = create().getRoot()
         .createFilter().createIcon().largeIcon("largeIcon1").up()
                  .createIcon().smallIcon("smallIcon2").up().up().up();
      
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/filter/icon[1]/large-icon", "largeIcon1");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/filter/icon[2]/small-icon", "smallIcon2");
      
      assertTrue(webApp.getRoot().getAllFilter().get(0).getAllIcon().size() == 2);
      
      webApp.getRoot().getAllFilter().get(0).getAllIcon().get(0).removeLargeIcon();
      assertTrue(webApp.exportAsString().indexOf("<large-icon>") == -1);
      
      webApp.getRoot().getAllFilter().get(0).getAllIcon().get(1).removeSmallIcon();
      assertTrue(webApp.exportAsString().indexOf("<small-icon>") == -1);
      
      webApp.getRoot().getAllFilter().get(0).removeAllIcon();
      assertTrue(webApp.getRoot().createFilter().getAllIcon().size() == 0);
   }
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private MutableWebAppDescriptor create()
   {
      return Descriptors.create(MutableWebAppDescriptor.class);
   }
}
