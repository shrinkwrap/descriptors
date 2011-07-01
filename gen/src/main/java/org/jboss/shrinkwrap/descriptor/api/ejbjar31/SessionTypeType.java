package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 *
 * The session-typeType describes whether the session bean is a
 * singleton, stateful or stateless session. It is used by
 * session-type elements.
 *
 * The value must be one of the three following:
 *
 * Singleton
 * Stateful
 * Stateless
 *
 *
 *
 */
public enum SessionTypeType
{
   _SINGLETON("Singleton"),
   _STATEFUL("Stateful"),
   _STATELESS("Stateless");

   private String value;

   SessionTypeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static SessionTypeType getFromStringValue(String value)
   {
      for(SessionTypeType type: SessionTypeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

