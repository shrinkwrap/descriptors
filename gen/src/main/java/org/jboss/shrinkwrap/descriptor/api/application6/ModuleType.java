package org.jboss.shrinkwrap.descriptor.api.application6; 

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
 * The moduleType defines a single Java EE module and contains a
 * connector, ejb, java, or web element, which indicates the
 * module type and contains a path to the module file, and an
 * optional alt-dd element, which specifies an optional URI to
 * the post-assembly version of the deployment descriptor.
 *
 *
 *
 */
public interface ModuleType<T> extends Child<T>
{

   public ModuleType<T> setAltDd(String altDd);
   public ModuleType<T> removeAltDd();

   public String getAltDd();



   public ModuleType<T> setConnector(String connector);
   public ModuleType<T> removeConnector();

   public String getConnector();



   public ModuleType<T> setEjb(String ejb);
   public ModuleType<T> removeEjb();

   public String getEjb();



   public ModuleType<T> setJava(String java);
   public ModuleType<T> removeJava();

   public String getJava();



   public ModuleType<T> removeWeb();

   public WebType<ModuleType<T>> web();


}
