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
 * Please see section 8.2.2 of the specification for details.
 *
 *
 *
 */
public interface AbsoluteOrderingType<T> extends Child<T>
{

   public AbsoluteOrderingType<T> setName(String name);
   public AbsoluteOrderingType<T> setNameList(String ... values);
   public AbsoluteOrderingType<T> removeAllName();

   public List<String> getNameList();


   public AbsoluteOrderingType<T> others();
   public Boolean isOthers();
}
