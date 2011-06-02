package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface WebservicesType<T> extends Child<T>
{
   public WebservicesType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public WebservicesType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "icon")
   public IconType<WebservicesType<T>> icon();

   @NodeInfo(xmlName = "webservice-description")
   public WebserviceDescriptionType<WebservicesType<T>> webserviceDescription();
}
