package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface WebservicesType<T> extends Child<T>
{

   public WebservicesType<T> setDescription(String description);
   public String getDescription();

   public WebservicesType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public WebservicesType<T> setIcon(IconType<WebservicesType<T>> icon);
   public IconType<WebservicesType<T>> getIcon();


   public WebservicesType<T> setWebserviceDescription(WebserviceDescriptionType<WebservicesType<T>> webserviceDescription);
   public WebserviceDescriptionType<WebservicesType<T>> getWebserviceDescription();

}
