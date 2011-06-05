package org.jboss.shrinkwrap.descriptor.api.application6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public interface ModuleType<T> extends Child<T>
{

   public ModuleType<T> setAltDd(String altDd);
   public String getAltDd();


   public ModuleType<T> setConnector(String connector);
   public String getConnector();


   public ModuleType<T> setEjb(String ejb);
   public String getEjb();


   public ModuleType<T> setJava(String java);
   public String getJava();


   public ModuleType<T> setWeb(WebType<ModuleType<T>> web);
   public WebType<ModuleType<T>> getWeb();

}
