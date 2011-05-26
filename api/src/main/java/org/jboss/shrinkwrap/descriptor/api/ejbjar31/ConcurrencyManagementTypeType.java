package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum ConcurrencyManagementTypeType {
   _BEAN("Bean"), _CONTAINER("Container");

   private String value;

   ConcurrencyManagementTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
