package org.jboss.shrinkwrap.descriptor.impl.xsd.ejbjar31;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbJar31Descriptor;
import org.junit.Test;

public class EjbJar31DescriptorImplTestCase
{
   @Test
   public void testInterceptors() throws Exception
   {
      EjbJar31Descriptor ejbJarGenerated = create().addDefaultNamespaces().setVersion("3.1").interceptors()
            .interceptor().setInterceptorClass(" enterprise.annot_ovd_interceptor_ejb.NullChecker ").up().up()
            .assemblyDescriptor().interceptorBinding().setEjbName("*").setInterceptorClass(
                  " enterprise.annot_ovd_interceptor_ejb.NullChecker ").up().interceptorBinding().setEjbName(
                  "StatelessSessionBean").setExcludeClassInterceptors(true).method().setMethodName("isOddNumber").up()
            .up().up();

      String descr = ejbJarGenerated.exportAsString();

      //      System.out.println(descr);
      assertTrue(descr != null);

      String ejbJar_source_imported = getResourceContents("src/test/resources/test-ejb-jar.xml");

      final EjbJar31Descriptor ejbJarImported = Descriptors.importAs(EjbJar31Descriptor.class).from(
            ejbJar_source_imported);

      assertEquals(ejbJarImported.getVersion(), "3.1");
      assertEquals(ejbJarImported.getVersion(), ejbJarGenerated.getVersion());
      assertTrue(ejbJarImported.interceptors().getInterceptorList().size() == 1);
      assertTrue(ejbJarImported.interceptors().getInterceptorList().size() == ejbJarGenerated.interceptors()
            .getInterceptorList().size());
      assertEquals(ejbJarImported.interceptors().getInterceptorList().get(0).getInterceptorClass(),
            " enterprise.annot_ovd_interceptor_ejb.NullChecker ");
      assertEquals(ejbJarImported.interceptors().getInterceptorList().get(0).getInterceptorClass(), ejbJarGenerated
            .interceptors().getInterceptorList().get(0).getInterceptorClass());
      assertTrue(ejbJarImported.assemblyDescriptor().getInterceptorBindingList().size() == 2);
      assertTrue(ejbJarImported.assemblyDescriptor().getInterceptorBindingList().size() == ejbJarGenerated
            .assemblyDescriptor().getInterceptorBindingList().size());
      assertEquals(ejbJarImported.assemblyDescriptor().getInterceptorBindingList().get(0).getEjbName(), "*");
      assertEquals(ejbJarImported.assemblyDescriptor().getInterceptorBindingList().get(0).getEjbName(), ejbJarGenerated
            .assemblyDescriptor().getInterceptorBindingList().get(0).getEjbName());
      assertEquals(ejbJarImported.assemblyDescriptor().getInterceptorBindingList().get(1).isExcludeClassInterceptors(),
            true);
      assertEquals(ejbJarImported.assemblyDescriptor().getInterceptorBindingList().get(1).isExcludeClassInterceptors(),
            ejbJarGenerated.assemblyDescriptor().getInterceptorBindingList().get(1).isExcludeClassInterceptors());
      assertEquals(ejbJarImported.assemblyDescriptor().getInterceptorBindingList().get(1).method().getMethodName(),
            ejbJarGenerated.assemblyDescriptor().getInterceptorBindingList().get(1).method().getMethodName());
      assertEquals(ejbJarImported.assemblyDescriptor().getInterceptorBindingList().get(1).method().getMethodName(),
            "isOddNumber");
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

   private EjbJar31Descriptor create()
   {
      return Descriptors.create(EjbJar31Descriptor.class);
   }

}
