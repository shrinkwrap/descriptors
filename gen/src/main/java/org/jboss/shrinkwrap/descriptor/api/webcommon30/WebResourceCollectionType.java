package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface WebResourceCollectionType<T> extends Child<T>
{

   public WebResourceCollectionType<T> setWebResourceName(String webResourceName);

   public String getWebResourceName();

   public WebResourceCollectionType<T> setDescription(String description);

   public WebResourceCollectionType<T> setDescription(String... values);

   public List<String> getDescriptionList();

   public WebResourceCollectionType<T> setUrlPattern(String urlPattern);

   public WebResourceCollectionType<T> setUrlPattern(String... values);

   public List<String> getUrlPatternList();

   public WebResourceCollectionType<T> setHttpMethod(String httpMethod);

   public WebResourceCollectionType<T> setHttpMethod(String... values);

   public List<String> getHttpMethodList();

   public WebResourceCollectionType<T> setHttpMethodOmission(String httpMethodOmission);

   public WebResourceCollectionType<T> setHttpMethodOmission(String... values);

   public List<String> getHttpMethodOmissionList();

}
