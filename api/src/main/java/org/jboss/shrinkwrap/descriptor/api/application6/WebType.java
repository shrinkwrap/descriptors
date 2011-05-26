package org.jboss.shrinkwrap.descriptor.api.application6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface WebType<T> extends Child<T>
{
   public WebType<T> setWebUri(String webUri);

   public String getWebUri();

   public WebType<T> setContextRoot(String contextRoot);

   public String getContextRoot();
}
