package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T21:45:00.466-04:00
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
}
