package org.jboss.shrinkwrap.descriptor.api.jsp22;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface TaglibType<T> extends Child<T>
{
   public TaglibType<T> setTaglibUri(String taglibUri);

   public String getTaglibUri();

   public TaglibType<T> setTaglibLocation(String taglibLocation);

   public String getTaglibLocation();
}
