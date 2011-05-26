package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum MultiplicityType {
   _ONE("One"), _MANY("Many");

   private String value;

   MultiplicityType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
