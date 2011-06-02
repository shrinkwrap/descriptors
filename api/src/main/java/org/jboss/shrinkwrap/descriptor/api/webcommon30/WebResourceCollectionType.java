package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface WebResourceCollectionType<T> extends Child<T>
{
   public WebResourceCollectionType<T> setWebResourceName(String webResourceName);

   @NodeInfo(xmlName = "web-resource-name")
   public String getWebResourceName();

   public WebResourceCollectionType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public WebResourceCollectionType<T> setUrlPattern(String urlPattern);

   @NodeInfo(xmlName = "url-pattern")
   public String getUrlPattern();

   public WebResourceCollectionType<T> setHttpMethod(String httpMethod);

   @NodeInfo(xmlName = "http-method")
   public String getHttpMethod();

   public WebResourceCollectionType<T> setHttpMethodOmission(String httpMethodOmission);

   @NodeInfo(xmlName = "http-method-omission")
   public String getHttpMethodOmission();
}
