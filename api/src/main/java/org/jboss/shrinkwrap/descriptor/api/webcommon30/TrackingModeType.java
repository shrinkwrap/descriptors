package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The tracking modes for sessions created by this web
 * application
 *
 * Used in: session-config
 *
 *
 *
 */
public enum TrackingModeType {
   _COOKIE("COOKIE"), _URL("URL"), _SSL("SSL");

   private String value;

   TrackingModeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static TrackingModeType getFromStringValue(String value)
   {
      for (TrackingModeType type : TrackingModeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
