/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * This class implements the <code> dispatcherType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The dispatcher has five legal values: FORWARD, REQUEST, <br> 
 * INCLUDE, ASYNC, and ERROR. <br> 
 *<br>
 * A value of FORWARD means the Filter will be applied under <br> 
 * RequestDispatcher.forward() calls. <br> 
 * A value of REQUEST means the Filter will be applied under <br> 
 * ordinary client calls to the path or servlet. <br> 
 * A value of INCLUDE means the Filter will be applied under <br> 
 * RequestDispatcher.include() calls. <br> 
 * A value of ASYNC means the Filter will be applied under <br> 
 * calls dispatched from an AsyncContext. <br> 
 * A value of ERROR means the Filter will be applied under the <br> 
 * error page mechanism. <br> 
 *<br>
 * The absence of any dispatcher elements in a filter-mapping <br> 
 * indicates a default of applying filters only under ordinary <br> 
 * client calls to the path or servlet. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
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
