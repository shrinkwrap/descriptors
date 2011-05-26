package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum SessionTypeType {
   _SINGLETON("Singleton"), _STATEFUL("Stateful"), _STATELESS("Stateless");

   private String value;

   SessionTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
