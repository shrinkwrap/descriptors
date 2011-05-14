package org.jboss.shrinkwrap.descriptor.api.jsp22;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * TaglibType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface TaglibType<T> extends Child<T>
{
   public TaglibType<T> taglibUri(String taglibUri);

   public TaglibType<T> taglibLocation(String taglibLocation);
}
