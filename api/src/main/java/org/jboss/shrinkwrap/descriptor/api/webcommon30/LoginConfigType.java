package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * LoginConfigType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface LoginConfigType<T> extends Child<T>
{
   public LoginConfigType<T> authMethod(AuthMethodType authMethod);

   public LoginConfigType<T> realmName(String RealmName);

   public FormLoginConfigType<LoginConfigType<T>> formLoginConfig();
}
