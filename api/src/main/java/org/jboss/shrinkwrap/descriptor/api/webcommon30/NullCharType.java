package org.jboss.shrinkwrap.descriptor.api.webcommon30;

public enum NullCharType {
   _("");

   private String value;

   NullCharType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
