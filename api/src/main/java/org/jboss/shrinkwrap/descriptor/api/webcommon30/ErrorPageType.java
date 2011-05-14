package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * ErrorPageType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface ErrorPageType<T> extends Child<T>
{
   public ErrorPageType<T> location(int errorCode, String location);
   
   public ErrorPageType<T> location(String exceptionType, String Location);
}


