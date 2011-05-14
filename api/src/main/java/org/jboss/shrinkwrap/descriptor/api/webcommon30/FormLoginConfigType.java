package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * FormLoginConfigType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface FormLoginConfigType<T> extends Child<T>
{
   public FormLoginConfigType<T> formLoginPage(String formLoginPage);

   public FormLoginConfigType<T> formErrorPage(String formErrorPage);
}
