package org.jboss.shrinkwrap.descriptor.api.javaee6; 
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public enum MessageDestinationUsageType
{
   _CONSUMES("Consumes"),
   _PRODUCES("Produces"),
   _CONSUMESPRODUCES("ConsumesProduces");

   private String value;

   MessageDestinationUsageType (String value) { this.value = value; }

   public String toString() {return value;}
}

