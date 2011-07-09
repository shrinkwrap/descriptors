package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.WebserviceDescriptionType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 */
public interface WebservicesType<T> extends Child<T>
{

   public WebservicesType<T> setContextRoot(String contextRoot);

   public WebservicesType<T> removeContextRoot();

   public String getContextRoot();

   public WebservicesType<T> removeAllWebserviceDescription();

   public WebserviceDescriptionType<WebservicesType<T>> webserviceDescription();

   public List<WebserviceDescriptionType<WebservicesType<T>>> getWebserviceDescriptionList();

}
