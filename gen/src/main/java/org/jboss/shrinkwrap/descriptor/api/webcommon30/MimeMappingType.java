package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public interface MimeMappingType<T> extends Child<T>
{

   public MimeMappingType<T> setExtension(String extension);
   public MimeMappingType<T> removeExtension();

   public String getExtension();



   public MimeMappingType<T> setMimeType(String mimeType);
   public MimeMappingType<T> removeMimeType();

   public String getMimeType();

}
