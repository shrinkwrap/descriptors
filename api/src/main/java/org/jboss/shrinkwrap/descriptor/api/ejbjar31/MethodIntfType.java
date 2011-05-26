package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

public enum MethodIntfType {
   _HOME("Home"), _REMOTE("Remote"), _LOCALHOME("LocalHome"), _LOCAL("Local"), _SERVICEENDPOINT("ServiceEndpoint"), _TIMER(
         "Timer"), _MESSAGEENDPOINT("MessageEndpoint");

   private String value;

   MethodIntfType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
