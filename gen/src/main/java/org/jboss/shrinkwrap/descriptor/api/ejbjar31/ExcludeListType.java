package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The exclude-listType specifies one or more methods which
 * the Assembler marks to be uncallable.
 *
 * If the method permission relation contains methods that are
 * in the exclude list, the Deployer should consider those
 * methods to be uncallable.
 *
 *
 *
 */
public interface ExcludeListType<T> extends Child<T>
{

   public ExcludeListType<T> setDescription(String description);
   public ExcludeListType<T> setDescriptionList(String ... values);
   public ExcludeListType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public ExcludeListType<T> removeAllMethod();

   public MethodType<ExcludeListType<T>> method();
   public List<MethodType<ExcludeListType<T>>> getMethodList();


}
