package org.jboss.shrinkwrap.descriptor.api.persistence20; 
public enum PersistenceUnitCachingType
{
   _ALL("ALL"),
   _NONE("NONE"),
   _ENABLE_SELECTIVE("ENABLE_SELECTIVE"),
   _DISABLE_SELECTIVE("DISABLE_SELECTIVE"),
   _UNSPECIFIED("UNSPECIFIED");

   private String value;

   PersistenceUnitCachingType (String value) { this.value = value; }

   public String toString() {return value;}
}

