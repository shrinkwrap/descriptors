package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * MultipartConfigType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface MultipartConfigType<T> extends Child<T>
{
   public MultipartConfigType<T> Location(String Location);

   public MultipartConfigType<T> MaxFileSize(long MaxFileSize);

   public MultipartConfigType<T> MaxRequestSize(long MaxRequestSize);

   public MultipartConfigType<T> FileSizeThreshold(int FileSizeThreshold);
}