package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 *
 * Original Documentation:
 *
 *
 * The method-intf element allows a method element to
 * differentiate between the methods with the same name and
 * signature that are multiply defined across the home and
 * component interfaces (e.g, in both an enterprise bean's
 * remote and local interfaces or in both an enterprise bean's
 * home and remote interfaces, etc.); the component and web
 * service endpoint interfaces, and so on.
 *
 * Local applies to the local component interface, local business
 * interfaces, and the no-interface view.
 *
 * Remote applies to both remote component interface and the remote
 * business interfaces.
 *
 * ServiceEndpoint refers to methods exposed through a web service
 * endpoint.
 *
 * Timer refers to the bean's timeout callback methods.
 *
 * MessageEndpoint refers to the methods of a message-driven bean's
 * message-listener interface.
 *
 * The method-intf element must be one of the following:
 *
 * Home
 * Remote
 * LocalHome
 * Local
 * ServiceEndpoint
 * Timer
 * MessageEndpoint
 *
 *
 *
 */
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

   public static MethodIntfType getFromStringValue(String value)
   {
      for (MethodIntfType type : MethodIntfType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
