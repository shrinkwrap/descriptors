package org.jboss.shrinkwrap.descriptor.api.javaee6; 

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
 * The listenerType indicates the deployment properties for a web
 * application listener bean.
 *
 *
 *
 */
public interface ListenerType<T> extends Child<T>
{

   public ListenerType<T> setDescription(String description);
   public ListenerType<T> setDescriptionList(String ... values);
   public ListenerType<T> removeAllDescription();

   public List<String> getDescriptionList();


   public ListenerType<T> setDisplayName(String displayName);
   public ListenerType<T> setDisplayNameList(String ... values);
   public ListenerType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();


   public ListenerType<T> removeAllIcon();

   public IconType<ListenerType<T>> icon();
   public List<IconType<ListenerType<T>>> getIconList();



   public ListenerType<T> setListenerClass(String listenerClass);
   public ListenerType<T> removeListenerClass();

   public String getListenerClass();

}
