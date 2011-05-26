package org.jboss.shrinkwrap.descriptor.api.persistence20; 
public enum PersistenceUnitTransactionType
{
   _JTA("JTA"),
   _RESOURCE_LOCAL("RESOURCE_LOCAL");

   private String value;

   PersistenceUnitTransactionType (String value) { this.value = value; }

   public String toString() {return value;}
}

