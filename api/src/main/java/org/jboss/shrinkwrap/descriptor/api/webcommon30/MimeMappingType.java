package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface MimeMappingType<T> extends Child<T>
{
   public MimeMappingType<T> setExtension(String extension);
   public String getExtension();

   public MimeMappingType<T> setMimeType(String mimeType);
   public String getMimeType();
}
