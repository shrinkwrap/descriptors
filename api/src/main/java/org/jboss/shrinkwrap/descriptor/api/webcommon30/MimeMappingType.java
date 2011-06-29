package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-29T17:02:36.405-04:00
 *
 * Original Documentation:
 *
 *
 * The mime-mappingType defines a mapping between an extension
 * and a mime type.
 *
 * Used in: web-app
 *
 *
 *
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
