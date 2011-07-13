package org.jboss.shrinkwrap.descriptor.api.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: Element for specifying the class used to provide the
 * caching mechanism for a bean, and the cache parameters
 * 
 * 
 */
public interface PoolConfigType<T> extends Child<T> {

	public PoolConfigType<T> setPoolValue(String poolValue);

	public PoolConfigType<T> removePoolValue();

	public String getPoolValue();

	public PoolConfigType<T> setPoolMaxSize(Integer poolMaxSize);

	public PoolConfigType<T> removePoolMaxSize();

	public Integer getPoolMaxSize();

	public PoolConfigType<T> setPoolTimeout(Integer poolTimeout);

	public PoolConfigType<T> removePoolTimeout();

	public Integer getPoolTimeout();

}
