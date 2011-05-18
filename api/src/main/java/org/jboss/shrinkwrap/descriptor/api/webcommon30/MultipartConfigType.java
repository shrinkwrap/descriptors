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
   public MultipartConfigType<T> location(String location);

   public MultipartConfigType<T> maxFileSize(long maxFileSize);

   public MultipartConfigType<T> maxRequestSize(long maxRequestSize);

   public MultipartConfigType<T> fileSizeThreshold(int fileSizeThreshold);
}