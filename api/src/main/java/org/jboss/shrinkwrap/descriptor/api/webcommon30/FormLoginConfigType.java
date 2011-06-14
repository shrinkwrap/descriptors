package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-15T01:04:55.579+02:00
 */
public interface FormLoginConfigType<T> extends Child<T>
{

   public FormLoginConfigType<T> setFormLoginPage(String formLoginPage);
   public FormLoginConfigType<T> removeFormLoginPage();

   public String getFormLoginPage();



   public FormLoginConfigType<T> setFormErrorPage(String formErrorPage);
   public FormLoginConfigType<T> removeFormErrorPage();

   public String getFormErrorPage();

}
