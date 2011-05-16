package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.webcommon30.AbsoluteOrderingType;

public class AbsoluteOrderingTypeImpl<T> implements AbsoluteOrderingType<T>
{
   private T t;
   private String name;
   private String[] names;
   private boolean others = false;

   public AbsoluteOrderingTypeImpl(T t)
   {
      this.t = t;
   }

   @Override
   public AbsoluteOrderingType<T> name(String name)
   {
      this.name = name;
      return this;
   }

   @Override
   public AbsoluteOrderingType<T> name(String... names)
   {
      this.names = names;
      return this;
   }

   @Override
   public AbsoluteOrderingType<T> others()
   {
      this.others = true;
      return this;
   }

   @Override
   public T up()
   {
      return t;
   }

}
