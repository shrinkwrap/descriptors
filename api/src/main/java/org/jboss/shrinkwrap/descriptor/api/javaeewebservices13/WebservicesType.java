package org.jboss.shrinkwrap.descriptor.api.javaeewebservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface WebservicesType<T> extends Child<T>, DescriptionGroup<T>
{
   public WebservicesType<T> setWebserviceDescription(WebserviceDescriptionType<T> webserviceDescription);

   public WebserviceDescriptionType<WebservicesType<T>> getWebserviceDescription();
}
