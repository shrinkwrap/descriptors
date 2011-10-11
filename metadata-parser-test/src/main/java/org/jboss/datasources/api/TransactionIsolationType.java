package org.jboss.datasources.api; 

/**
 * This class implements the <code> transaction-isolationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public enum TransactionIsolationType
{
   _TRANSACTION_READ_UNCOMMITTED("TRANSACTION_READ_UNCOMMITTED"),
   _TRANSACTION_READ_COMMITTED("TRANSACTION_READ_COMMITTED"),
   _TRANSACTION_REPEATABLE_READ("TRANSACTION_REPEATABLE_READ"),
   _TRANSACTION_SERIALIZABLE("TRANSACTION_SERIALIZABLE"),
   _TRANSACTION_NONE("TRANSACTION_NONE");

   private String value;

   TransactionIsolationType (String value) { this.value = value; }

   public String toString() {return value;}

   public static TransactionIsolationType getFromStringValue(String value)
   {
      for(TransactionIsolationType type: TransactionIsolationType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

