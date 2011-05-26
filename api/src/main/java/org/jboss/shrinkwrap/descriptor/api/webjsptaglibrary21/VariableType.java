package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface VariableType<T> extends Child<T>
{
   public VariableType<T> setDescription(String description);

   public String getDescription();

   public VariableType<T> setVariableClazz(String variableClass);

   public String getVariableClazz();

   public VariableType<T> setDeclare(String declare);

   public String getDeclare();

   public VariableType<T> setScope(String scope);

   public String getScope();
}
