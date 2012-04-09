package org.jboss.shrinkwrap.descriptor.test.portlet20;

import java.io.BufferedReader;
import java.io.FileReader;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletDescriptor;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Test;

public class PortletDescriptorTestCase
{

   @Test
   public void testGeneratedPortletXml() throws Exception
   {
      final PortletDescriptor portlet = create()
            .addDefaultNamespaces()
            .version("2.0")
            .createPortlet()
            	.portletName("HelloPortlet")
            	.portletClass("javax.portlet.faces.GenericFacesPortlet")
            	.createInitParam()
            		.name("javax.portlet.faces.defaultViewId.view")
            		.value("/view.jsp").up()
            	.createInitParam()
            		.name("javax.portlet.faces.defaultViewId.edit")
            		.value("/edit.jsp").up()
            	.createInitParam()
            		.name("javax.portlet.faces.defaultViewId.help")
            		.value("/help.jsp").up()
            	.createSupports()
            		.mimeType("text/html")
            		.portletMode("view")
            		.portletMode("edit")
            		.portletMode("help").up()
            	.getOrCreatePortletInfo()
            		.title("Hello Portlet")
            	.up().up();
      String portletXmlGenerated = portlet.exportAsString();
      String portletXmlOriginal = getResourceContents("src/test/resources/test-gen-portlet20.xml");
      System.out.println(portletXmlGenerated);
      XmlAssert.assertIdentical(portletXmlOriginal, portletXmlGenerated);   
   }
   
   
   // -------------------------------------------------------------------------------------||
   // Internal Helper ---------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

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

   private PortletDescriptor create()
   {
      return Descriptors.create(PortletDescriptor.class);
   }
}
