package org.jboss.shrinkwrap.descriptor.api.javaee6;

public enum MessageDestinationUsageType {
   _CONSUMES("Consumes"), _PRODUCES("Produces"), _CONSUMESPRODUCES("ConsumesProduces");

   private String value;

   MessageDestinationUsageType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
