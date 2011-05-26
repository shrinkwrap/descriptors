package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum ConcurrentLockTypeType {
   _READ("Read"), _WRITE("Write");

   private String value;

   ConcurrentLockTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
