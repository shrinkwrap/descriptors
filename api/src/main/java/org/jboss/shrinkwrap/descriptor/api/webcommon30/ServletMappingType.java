package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * ServletMappingType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface ServletMappingType<T> extends Child<T>
{
   public ServletMappingType<T> servletName(String servletName);

   public ServletMappingType<T> urlPattern(String urlPattern);
}
