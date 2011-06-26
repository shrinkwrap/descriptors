package org.jboss.shrinkwrap.descriptor.api.jsp22; 

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
 * Generation date :2011-06-26T17:25:18.735-04:00
 *
 * Original Documentation:
 *
 *
 * The taglibType defines the syntax for declaring in
 * the deployment descriptor that a tag library is
 * available to the application. This can be done
 * to override implicit map entries from TLD files and
 * from the container.
 *
 *
 *
 */
public interface TaglibType<T> extends Child<T>
{

   public TaglibType<T> setTaglibUri(String taglibUri);
   public TaglibType<T> removeTaglibUri();

   public String getTaglibUri();



   public TaglibType<T> setTaglibLocation(String taglibLocation);
   public TaglibType<T> removeTaglibLocation();

   public String getTaglibLocation();

}
