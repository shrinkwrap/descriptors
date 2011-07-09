package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The dispatcher has five legal values: FORWARD, REQUEST,
 * INCLUDE, ASYNC, and ERROR.
 *
 * A value of FORWARD means the Filter will be applied under
 * RequestDispatcher.forward() calls.
 * A value of REQUEST means the Filter will be applied under
 * ordinary client calls to the path or servlet.
 * A value of INCLUDE means the Filter will be applied under
 * RequestDispatcher.include() calls.
 * A value of ASYNC means the Filter will be applied under
 * calls dispatched from an AsyncContext.
 * A value of ERROR means the Filter will be applied under the
 * error page mechanism.
 *
 * The absence of any dispatcher elements in a filter-mapping
 * indicates a default of applying filters only under ordinary
 * client calls to the path or servlet.
 *
 *
 *
 */
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

   public static DispatcherType getFromStringValue(String value)
   {
      for (DispatcherType type : DispatcherType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
