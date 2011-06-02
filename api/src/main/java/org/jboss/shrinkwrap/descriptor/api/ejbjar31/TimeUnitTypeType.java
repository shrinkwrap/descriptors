package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

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
