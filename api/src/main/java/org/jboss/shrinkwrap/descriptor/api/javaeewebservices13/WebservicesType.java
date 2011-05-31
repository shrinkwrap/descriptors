package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface WebservicesType<T> extends Child<T>
{
   public WebservicesType<T> setDescription(String description);
   public String getDescription();

   public WebservicesType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public WebservicesType<T> setIcon(IconType<T> icon);
   public IconType<T> getIcon();

   public WebservicesType<T> setWebserviceDescription(WebserviceDescriptionType<T> webserviceDescription);
   public WebserviceDescriptionType<T> getWebserviceDescription();
}
