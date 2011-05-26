package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

public enum BodyContentType {
   _TAGDEPENDENT("tagdependent"), _JSP("JSP"), _EMPTY("empty"), _SCRIPTLESS("scriptless");

   private String value;

   BodyContentType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}
