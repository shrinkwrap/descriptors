package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum CmpVersionType {
   _1_X("1.x"), _2_X("2.x");

   private String value;

   CmpVersionType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
