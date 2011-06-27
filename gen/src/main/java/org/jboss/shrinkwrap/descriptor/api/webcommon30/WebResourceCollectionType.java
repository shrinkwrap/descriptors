package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:30:58.763-04:00
 *
 * Original Documentation:
 *
 *
 * The web-resource-collectionType is used to identify the
 * resources and HTTP methods on those resources to which a
 * security constraint applies. If no HTTP methods are specified,
 * then the security constraint applies to all HTTP methods.
 * If HTTP methods are specified by http-method-omission
 * elements, the security constraint applies to all methods
 * except those identified in the collection.
 * http-method-omission and http-method elements are never
 * mixed in the same collection.
 *
 * Used in: security-constraint
 *
 *
 *
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
