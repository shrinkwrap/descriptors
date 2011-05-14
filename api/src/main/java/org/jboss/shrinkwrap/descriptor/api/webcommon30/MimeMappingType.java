package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * MimeMappingType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface MimeMappingType<T> extends Child<T>
{
   public MimeMappingType<T> extension(String extension);

   public MimeMappingType<T> mimeType(String mimeType);
}
