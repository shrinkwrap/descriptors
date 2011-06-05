package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public enum MethodIntfType
{
   _HOME("Home"),
   _REMOTE("Remote"),
   _LOCALHOME("LocalHome"),
   _LOCAL("Local"),
   _SERVICEENDPOINT("ServiceEndpoint"),
   _TIMER("Timer"),
   _MESSAGEENDPOINT("MessageEndpoint");

   private String value;

   MethodIntfType (String value) { this.value = value; }

   public String toString() {return value;}
}

