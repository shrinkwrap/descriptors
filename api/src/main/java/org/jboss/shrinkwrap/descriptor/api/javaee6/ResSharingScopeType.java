package org.jboss.shrinkwrap.descriptor.api.javaee6;

public enum ResSharingScopeType {
   _SHAREABLE("Shareable"), _UNSHAREABLE("Unshareable");

   private String value;

   ResSharingScopeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
