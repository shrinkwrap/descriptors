package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The time-unit-typeType represents a time duration at a given
 * unit of granularity.
 *
 * The time unit type must be one of the following :
 *
 * Days
 * Hours
 * Minutes
 * Seconds
 * Milliseconds
 * Microseconds
 * Nanoseconds
 *
 *
 *
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

   public static TimeUnitTypeType getFromStringValue(String value)
   {
      for (TimeUnitTypeType type : TimeUnitTypeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
