package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface WebResourceCollectionType<T> extends Child<T>
{
   public WebResourceCollectionType<T> setWebResourceName(String webResourceName);

   public String getWebResourceName();

   public WebResourceCollectionType<T> setDescription(String description);

   public String getDescription();

   public WebResourceCollectionType<T> setUrlPattern(String urlPattern);

   public String getUrlPattern();
}
