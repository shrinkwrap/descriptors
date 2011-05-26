package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface TldExtensionType<T> extends Child<T>
{
   public TldExtensionType<T> setExtensionElement(ExtensibleType<T> extensionElement);

   public ExtensibleType<TldExtensionType<T>> getExtensionElement();
}
