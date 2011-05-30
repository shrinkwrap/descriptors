package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface WebservicesType<T> extends Child<T>, DescriptionGroup<T>
{
   public WebservicesType<T> setWebserviceDescription(WebserviceDescriptionType<T> webserviceDescription);
   public WebserviceDescriptionType<T> getWebserviceDescription();
}
