package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface MimeMappingType<T> extends Child<T>
{
   public MimeMappingType<T> setExtension(String extension);

   public String getExtension();

   public MimeMappingType<T> setMimeType(String mimeType);

   public String getMimeType();
}
