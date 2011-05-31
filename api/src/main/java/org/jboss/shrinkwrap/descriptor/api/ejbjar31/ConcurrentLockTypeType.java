package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public enum ConcurrentLockTypeType
{
   _READ("Read"),
   _WRITE("Write");

   private String value;

   ConcurrentLockTypeType (String value) { this.value = value; }

   public String toString() {return value;}
}

