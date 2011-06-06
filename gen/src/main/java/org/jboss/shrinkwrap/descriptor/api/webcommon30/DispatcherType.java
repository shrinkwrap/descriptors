package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public enum DispatcherType
{
   _FORWARD("FORWARD"),
   _INCLUDE("INCLUDE"),
   _REQUEST("REQUEST"),
   _ASYNC("ASYNC"),
   _ERROR("ERROR");

   private String value;

   DispatcherType (String value) { this.value = value; }

   public String toString() {return value;}
}

