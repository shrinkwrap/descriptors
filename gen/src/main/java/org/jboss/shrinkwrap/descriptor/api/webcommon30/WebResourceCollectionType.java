package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public interface WebResourceCollectionType<T> extends Child<T>
{

   public WebResourceCollectionType<T> setWebResourceName(String webResourceName);
   public WebResourceCollectionType<T> removeWebResourceName();

   public String getWebResourceName();



   public WebResourceCollectionType<T> setDescription(String description);
   public WebResourceCollectionType<T> setDescriptionList(String ... values);
   public WebResourceCollectionType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public WebResourceCollectionType<T> setUrlPattern(String urlPattern);
   public WebResourceCollectionType<T> setUrlPatternList(String ... values);
   public WebResourceCollectionType<T> removeAllUrlPattern();

   public List<String> getUrlPatternList();



   public WebResourceCollectionType<T> setHttpMethod(String httpMethod);
   public WebResourceCollectionType<T> setHttpMethodList(String ... values);
   public WebResourceCollectionType<T> removeAllHttpMethod();

   public List<String> getHttpMethodList();



   public WebResourceCollectionType<T> setHttpMethodOmission(String httpMethodOmission);
   public WebResourceCollectionType<T> setHttpMethodOmissionList(String ... values);
   public WebResourceCollectionType<T> removeAllHttpMethodOmission();

   public List<String> getHttpMethodOmissionList();

}
