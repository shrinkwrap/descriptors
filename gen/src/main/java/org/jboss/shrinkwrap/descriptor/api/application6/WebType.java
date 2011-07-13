package org.jboss.shrinkwrap.descriptor.api.application6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The webType defines the web-uri and context-root of a web application module.
 * 
 * 
 * 
 */
public interface WebType<T> extends Child<T> {

	public WebType<T> setWebUri(String webUri);

	public WebType<T> removeWebUri();

	public String getWebUri();

	public WebType<T> setContextRoot(String contextRoot);

	public WebType<T> removeContextRoot();

	public String getContextRoot();

}
