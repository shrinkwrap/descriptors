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
public interface CacheConfigType<T> extends Child<T> {

	public CacheConfigType<T> setCacheValue(String cacheValue);

	public CacheConfigType<T> removeCacheValue();

	public String getCacheValue();

	public CacheConfigType<T> setCacheMaxSize(Integer cacheMaxSize);

	public CacheConfigType<T> removeCacheMaxSize();

	public Integer getCacheMaxSize();

	public CacheConfigType<T> setIdleTimeoutSeconds(Integer idleTimeoutSeconds);

	public CacheConfigType<T> removeIdleTimeoutSeconds();

	public Integer getIdleTimeoutSeconds();

	public CacheConfigType<T> setRemoveTimeoutSeconds(
			Integer removeTimeoutSeconds);

	public CacheConfigType<T> removeRemoveTimeoutSeconds();

	public Integer getRemoveTimeoutSeconds();

	public CacheConfigType<T> setCacheName(String cacheName);

	public CacheConfigType<T> removeCacheName();

	public String getCacheName();

	public CacheConfigType<T> setPersistenceManager(String persistenceManager);

	public CacheConfigType<T> removePersistenceManager();

	public String getPersistenceManager();

	public CacheConfigType<T> setReplicationIsPassivation(
			String replicationIsPassivation);

	public CacheConfigType<T> removeReplicationIsPassivation();

	public String getReplicationIsPassivation();

}
