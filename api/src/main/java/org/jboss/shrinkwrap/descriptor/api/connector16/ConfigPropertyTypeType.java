package org.jboss.shrinkwrap.descriptor.api.connector16;

public enum ConfigPropertyTypeType {
   _JAVA_LANG_BOOLEAN("java.lang.Boolean"), _JAVA_LANG_STRING("java.lang.String"), _JAVA_LANG_INTEGER(
         "java.lang.Integer"), _JAVA_LANG_DOUBLE("java.lang.Double"), _JAVA_LANG_BYTE("java.lang.Byte"), _JAVA_LANG_SHORT(
         "java.lang.Short"), _JAVA_LANG_LONG("java.lang.Long"), _JAVA_LANG_FLOAT("java.lang.Float"), _JAVA_LANG_CHARACTER(
         "java.lang.Character");

   private String value;

   ConfigPropertyTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
