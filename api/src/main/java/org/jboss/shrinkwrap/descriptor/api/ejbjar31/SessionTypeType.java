package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
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
