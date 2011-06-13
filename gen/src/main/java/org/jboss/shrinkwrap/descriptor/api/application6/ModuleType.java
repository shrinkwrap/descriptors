package org.jboss.shrinkwrap.descriptor.api.application6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-13T14:03:48.938+02:00
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
