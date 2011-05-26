package org.jboss.shrinkwrap.descriptor.api.connector16;

public enum TransactionSupportType {
   _NOTRANSACTION("NoTransaction"), _LOCALTRANSACTION("LocalTransaction"), _XATRANSACTION("XATransaction");

   private String value;

   TransactionSupportType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
