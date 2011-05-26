package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface TagFileType<T> extends Child<T>, DescriptionGroup<T>
{
   public TagFileType<T> setName(String name);

   public String getName();

   public TagFileType<T> setPath(String path);

   public String getPath();

   public TagFileType<T> setExample(String example);

   public String getExample();

   public TagFileType<T> setTagExtension(TldExtensionType<T> tagExtension);

   public TldExtensionType<TagFileType<T>> getTagExtension();
}
