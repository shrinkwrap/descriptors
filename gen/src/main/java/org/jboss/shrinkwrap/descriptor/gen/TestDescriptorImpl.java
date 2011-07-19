package org.jboss.shrinkwrap.descriptor.gen;

import java.lang.reflect.Method;

import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;

public class TestDescriptorImpl extends NodeProviderImplBase
{
   private Node model;

   public TestDescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("some-app"));
   }

   public TestDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
   }

   public Node getRootNode()
   {
      return model;
   }

   protected DescriptorExporter getExporter()
   {
      return new XmlDomExporter();
   }

   public static void testNullArgs(Object obj) throws Exception
   {
      Method[] methods = obj.getClass().getDeclaredMethods();
      for (Method method : methods)
      {
         try
         {
            method.setAccessible(true);
            Class[] parameters = method.getParameterTypes();
            if (parameters != null && parameters.length == 1)
            {
               Object v = null;
               method.invoke(obj, v);
            }
            else if (parameters != null && parameters.length == 2)
            {
               Object v = null;
               method.invoke(obj, v, v);
            }
            else
            {
               method.invoke(obj);
            }
         }
         catch (Exception ex)
         {
            System.out.println("Null arg test failed for class: " + obj.getClass().getSimpleName() + " and method: "
                  + method.getName());
            throw new Exception(ex);
         }
      }
   }
}
