package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FunctionType<T> extends Child<T>, DescriptionGroup<T>
{
   public FunctionType<T> setName(String name);

   public String getName();

   public FunctionType<T> setFunctionClazz(String functionClass);

   public String getFunctionClazz();

   public FunctionType<T> setFunctionSignature(String functionSignature);

   public String getFunctionSignature();

   public FunctionType<T> setExample(String example);

   public String getExample();

   public FunctionType<T> setFunctionExtension(TldExtensionType<T> functionExtension);

   public TldExtensionType<FunctionType<T>> getFunctionExtension();
}
