package org.jboss.shrinkwrap.descriptor.api.persistence20; 
public enum PersistenceUnitValidationModeType
{
   _AUTO("AUTO"),
   _CALLBACK("CALLBACK"),
   _NONE("NONE");

   private String value;

   PersistenceUnitValidationModeType (String value) { this.value = value; }

   public String toString() {return value;}
}

