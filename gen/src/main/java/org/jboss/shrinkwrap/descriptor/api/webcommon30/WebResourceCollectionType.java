package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface WebResourceCollectionType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public WebResourceCollectionType<T> setWebResourceName(String webResourceName);

   public String getWebResourceName();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebResourceCollectionType<T> setDescription(String description);
   public WebResourceCollectionType<T> setDescription(String ... values);

   public List<String> getDescriptionList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebResourceCollectionType<T> setUrlPattern(String urlPattern);
   public WebResourceCollectionType<T> setUrlPattern(String ... values);

   public List<String> getUrlPatternList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebResourceCollectionType<T> setHttpMethod(String httpMethod);
   public WebResourceCollectionType<T> setHttpMethod(String ... values);

   public List<String> getHttpMethodList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WebResourceCollectionType<T> setHttpMethodOmission(String httpMethodOmission);
   public WebResourceCollectionType<T> setHttpMethodOmission(String ... values);

   public List<String> getHttpMethodOmissionList();

}
