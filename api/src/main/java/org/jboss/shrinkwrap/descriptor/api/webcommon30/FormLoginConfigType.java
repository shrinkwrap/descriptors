package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FormLoginConfigType<T> extends Child<T>
{
   public FormLoginConfigType<T> setFormLoginPage(String formLoginPage);

   public String getFormLoginPage();

   public FormLoginConfigType<T> setFormErrorPage(String formErrorPage);

   public String getFormErrorPage();
}
