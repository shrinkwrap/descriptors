package org.jboss.shrinkwrap.descriptor.impl.base;

import java.lang.annotation.Annotation;

import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

public class NodeInfoExtractor
{

   public static String getNodeInfo(Class<?> clazz)
   {
      String xmlName = "";
      Annotation[] annotations = clazz.getDeclaredAnnotations();
      
      for (Annotation annotation: annotations)
      {
         if (annotation.annotationType() == NodeInfo.class)
         {
            NodeInfo nodeInfo = (NodeInfo)annotation;
            xmlName = nodeInfo.xmlName();
            break;
         }
      }
      
      return xmlName;
   }
}
