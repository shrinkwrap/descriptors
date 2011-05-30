package org.jboss.shrinkwrap.descriptor.api.webcommon30; 
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public enum TrackingModeType
{
   _COOKIE("COOKIE"),
   _URL("URL"),
   _SSL("SSL");

   private String value;

   TrackingModeType (String value) { this.value = value; }

   public String toString() {return value;}
}

