package org.jboss.shrinkwrap.descriptor.api.webfacelettaglibrary20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FaceletTaglibFunctionType<T> extends Child<T>, DescriptionGroup<T>
{
   public FaceletTaglibFunctionType<T> setFunctionName(String functionName);

   public String getFunctionName();

   public FaceletTaglibFunctionType<T> setFunctionClazz(String functionClass);

   public String getFunctionClazz();

   public FaceletTaglibFunctionType<T> setFunctionSignature(String functionSignature);

   public String getFunctionSignature();
}
