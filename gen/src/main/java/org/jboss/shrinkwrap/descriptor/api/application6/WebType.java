package org.jboss.shrinkwrap.descriptor.api.application6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-15T01:04:55.579+02:00
 */
public interface WebType<T> extends Child<T>
{

   public WebType<T> setWebUri(String webUri);
   public WebType<T> removeWebUri();

   public String getWebUri();



   public WebType<T> setContextRoot(String contextRoot);
   public WebType<T> removeContextRoot();

   public String getContextRoot();

}
