package org.jboss.shrinkwrap.descriptor.api.application6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface WebType<T> extends Child<T>
{
   public WebType<T> setWebUri(String webUri);

   @NodeInfo(xmlName = "web-uri")
   public String getWebUri();

   public WebType<T> setContextRoot(String contextRoot);

   @NodeInfo(xmlName = "context-root")
   public String getContextRoot();
}
