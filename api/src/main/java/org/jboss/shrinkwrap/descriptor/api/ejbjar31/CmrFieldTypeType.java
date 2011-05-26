package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum CmrFieldTypeType {
   _JAVA_UTIL_COLLECTION("java.util.Collection"), _JAVA_UTIL_SET("java.util.Set");

   private String value;

   CmrFieldTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
