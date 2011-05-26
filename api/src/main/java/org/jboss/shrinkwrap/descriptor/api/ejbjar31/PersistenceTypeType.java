package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum PersistenceTypeType {
   _BEAN("Bean"), _CONTAINER("Container");

   private String value;

   PersistenceTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
