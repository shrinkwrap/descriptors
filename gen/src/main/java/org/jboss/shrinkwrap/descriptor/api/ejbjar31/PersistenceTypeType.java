package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public enum PersistenceTypeType
{
   _BEAN("Bean"),
   _CONTAINER("Container");

   private String value;

   PersistenceTypeType (String value) { this.value = value; }

   public String toString() {return value;}
}

