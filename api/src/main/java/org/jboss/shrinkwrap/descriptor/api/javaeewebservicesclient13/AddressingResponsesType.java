package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

public enum AddressingResponsesType {
   _ANONYMOUS("ANONYMOUS"), _NON_ANONYMOUS("NON_ANONYMOUS"), _ALL("ALL");

   private String value;

   AddressingResponsesType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
