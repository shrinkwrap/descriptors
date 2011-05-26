package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum TimeUnitTypeType {
   _DAYS("Days"), _HOURS("Hours"), _MINUTES("Minutes"), _SECONDS("Seconds"), _MILLISECONDS("Milliseconds"), _MICROSECONDS(
         "Microseconds"), _NANOSECONDS("Nanoseconds");

   private String value;

   TimeUnitTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
