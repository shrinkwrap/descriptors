package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * WebResourceCollectionType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface WebResourceCollectionType<T> extends Child<T>
{
   public WebResourceCollectionType<T> webResourceName(String webResourceName);

   public WebResourceCollectionType<T> description(String description);

   public WebResourceCollectionType<T> httpMethod(String httpMethod);

   public WebResourceCollectionType<T> httpMethodOmission(String httpMethodOmission);

   public WebResourceCollectionType<T> urlPattern(String urlPattern);
}
