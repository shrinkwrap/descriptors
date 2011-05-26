package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

public enum VariableScopeType {
   _NESTED("NESTED"), _AT_BEGIN("AT_BEGIN"), _AT_END("AT_END");

   private String value;

   VariableScopeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
