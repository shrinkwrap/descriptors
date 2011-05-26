package org.jboss.shrinkwrap.descriptor.api.webfacelettaglibrary20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FaceletTaglibType<T> extends Child<T>, DescriptionGroup<T>
{
   public FaceletTaglibType<T> setTaglibExtension(FaceletTaglibExtensionType<T> taglibExtension);

   public FaceletTaglibExtensionType<FaceletTaglibType<T>> getTaglibExtension();
}
