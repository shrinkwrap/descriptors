package org.jboss.shrinkwrap.descriptor.api.webcommon30;

public enum WebAppVersionType {
   _3_0("3.0");

   private String value;

   WebAppVersionType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
