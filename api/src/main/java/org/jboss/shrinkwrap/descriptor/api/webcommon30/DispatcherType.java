package org.jboss.shrinkwrap.descriptor.api.webcommon30;

public enum DispatcherType {
   _FORWARD("FORWARD"), _INCLUDE("INCLUDE"), _REQUEST("REQUEST"), _ASYNC("ASYNC"), _ERROR("ERROR");

   private String value;

   DispatcherType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
