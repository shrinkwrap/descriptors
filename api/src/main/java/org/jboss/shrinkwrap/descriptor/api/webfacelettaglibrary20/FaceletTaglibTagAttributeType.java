package org.jboss.shrinkwrap.descriptor.api.webfacelettaglibrary20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FaceletTaglibTagAttributeType<T> extends Child<T>, DescriptionGroup<T>
{
   public FaceletTaglibTagAttributeType<T> setName(String name);

   public String getName();

   public FaceletTaglibTagAttributeType<T> setRequired(String required);

   public String getRequired();
}
