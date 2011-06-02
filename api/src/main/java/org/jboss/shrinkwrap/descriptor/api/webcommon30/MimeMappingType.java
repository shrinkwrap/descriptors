package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface MimeMappingType<T> extends Child<T>
{
   public MimeMappingType<T> setExtension(String extension);

   @NodeInfo(xmlName = "extension")
   public String getExtension();

   public MimeMappingType<T> setMimeType(String mimeType);

   @NodeInfo(xmlName = "mime-type")
   public String getMimeType();
}
