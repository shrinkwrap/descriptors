package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface MimeMappingType<T> extends Child<T>
{

   public MimeMappingType<T> setExtension(String extension);
   public String getExtension();


   public MimeMappingType<T> setMimeType(String mimeType);
   public String getMimeType();
}