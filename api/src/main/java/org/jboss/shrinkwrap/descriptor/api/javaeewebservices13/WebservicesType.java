package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface WebservicesType<T> extends Child<T>, DescriptionGroup<T>

{
   public WebserviceDescriptionType<WebservicesType<T>> setWebserviceDescription(
         WebserviceDescriptionType<T> webserviceDescription);

   public WebserviceDescriptionType<WebservicesType<T>> getWebserviceDescription();
}
