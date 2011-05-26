package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface TagType<T> extends Child<T>, DescriptionGroup<T>
{
   public TagType<T> setName(String name);

   public String getName();

   public TagType<T> setTagClazz(String tagClass);

   public String getTagClazz();

   public TagType<T> setTeiClazz(String teiClass);

   public String getTeiClazz();

   public TagType<T> setBodyContent(String bodyContent);

   public String getBodyContent();

   public TagType<T> setVariable(VariableType<T> variable);

   public VariableType<TagType<T>> getVariable();

   public TagType<T> setAttribute(TldAttributeType<T> attribute);

   public TldAttributeType<TagType<T>> getAttribute();

   public TagType<T> setDynamicAttributes(String dynamicAttributes);

   public String getDynamicAttributes();

   public TagType<T> setExample(String example);

   public String getExample();

   public TagType<T> setTagExtension(TldExtensionType<T> tagExtension);

   public TldExtensionType<TagType<T>> getTagExtension();
}
