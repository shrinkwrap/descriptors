package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public enum TransAttributeType
{
   _NOTSUPPORTED("NotSupported"),
   _SUPPORTS("Supports"),
   _REQUIRED("Required"),
   _REQUIRESNEW("RequiresNew"),
   _MANDATORY("Mandatory"),
   _NEVER("Never");

   private String value;

   TransAttributeType (String value) { this.value = value; }

   public String toString() {return value;}
}

