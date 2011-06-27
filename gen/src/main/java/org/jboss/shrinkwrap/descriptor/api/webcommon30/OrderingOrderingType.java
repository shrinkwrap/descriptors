package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:30:58.763-04:00
 *
 * Original Documentation:
 *
 *
 * This element contains a sequence of "name" elements, each of
 * which
 * refers to an application configuration resource by the "name"
 * declared on its web.xml fragment. This element can also contain
 * a single "others" element which specifies that this document
 * comes
 * before or after other documents within the application.
 * See section 8.2.2 of the specification for details.
 *
 *
 *
 */
public interface OrderingOrderingType<T> extends Child<T>
{

   public OrderingOrderingType<T> setName(String name);
   public OrderingOrderingType<T> setNameList(String ... values);
   public OrderingOrderingType<T> removeAllName();

   public List<String> getNameList();


   public OrderingOrderingType<T> others();
   public Boolean isOthers();
}
