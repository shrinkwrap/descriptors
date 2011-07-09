package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The concurrent-lock-typeType specifies how the container must
 * manage concurrent access to a method of a Singleton bean
 * with container-managed concurrency.
 *
 * The container managed concurrency lock type must be one
 * of the following :
 *
 * Read
 * Write
 *
 *
 *
 */
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

   public static ConcurrentLockTypeType getFromStringValue(String value)
   {
      for (ConcurrentLockTypeType type : ConcurrentLockTypeType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
