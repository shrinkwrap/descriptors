package org.jboss.shrinkwrap.descriptor.api.application6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ModuleType<T> extends Child<T>
{
   public ModuleType<T> setAltDd(String altDd);

   @NodeInfo(xmlName = "alt-dd")
   public String getAltDd();

   public ModuleType<T> setConnector(String connector);

   @NodeInfo(xmlName = "connector")
   public String getConnector();

   public ModuleType<T> setEjb(String ejb);

   @NodeInfo(xmlName = "ejb")
   public String getEjb();

   public ModuleType<T> setJava(String java);

   @NodeInfo(xmlName = "java")
   public String getJava();

   @NodeInfo(xmlName = "web")
   public WebType<ModuleType<T>> web();
}
