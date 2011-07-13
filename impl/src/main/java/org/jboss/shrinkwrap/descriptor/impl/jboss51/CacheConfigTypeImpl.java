package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.CacheConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: Element for specifying the class used to provide the
 * caching mechanism for a bean, and the cache parameters
 * 
 * 
 */
public class CacheConfigTypeImpl<T> implements Child<T>, CacheConfigType<T> {
	// -------------------------------------------------------------------------------------||
	// Instance Members
	// --------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	private T t;
	private Node node;
	private Node childNode;

	// -------------------------------------------------------------------------------------||
	// Constructor
	// -------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public CacheConfigTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public CacheConfigTypeImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : cache-value
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public CacheConfigType<T> setCacheValue(String cacheValue) {
		childNode.getOrCreate("cache-value").text(cacheValue);
		return this;
	}

	public CacheConfigType<T> removeCacheValue() {
		childNode.remove("cache-value");
		return this;
	}

	public String getCacheValue() {
		return childNode.textValue("cache-value");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : cache-max-size
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public CacheConfigType<T> setCacheMaxSize(Integer cacheMaxSize) {
		childNode.getOrCreate("cache-max-size").text(cacheMaxSize);
		return this;
	}

	public CacheConfigType<T> removeCacheMaxSize() {
		childNode.remove("cache-max-size");
		return this;
	}

	public Integer getCacheMaxSize() {
		return Integer.valueOf(childNode.textValue("cache-max-size"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : idle-timeout-seconds
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public CacheConfigType<T> setIdleTimeoutSeconds(Integer idleTimeoutSeconds) {
		childNode.getOrCreate("idle-timeout-seconds").text(idleTimeoutSeconds);
		return this;
	}

	public CacheConfigType<T> removeIdleTimeoutSeconds() {
		childNode.remove("idle-timeout-seconds");
		return this;
	}

	public Integer getIdleTimeoutSeconds() {
		return Integer.valueOf(childNode.textValue("idle-timeout-seconds"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : remove-timeout-seconds
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public CacheConfigType<T> setRemoveTimeoutSeconds(
			Integer removeTimeoutSeconds) {
		childNode.getOrCreate("remove-timeout-seconds").text(
				removeTimeoutSeconds);
		return this;
	}

	public CacheConfigType<T> removeRemoveTimeoutSeconds() {
		childNode.remove("remove-timeout-seconds");
		return this;
	}

	public Integer getRemoveTimeoutSeconds() {
		return Integer.valueOf(childNode.textValue("remove-timeout-seconds"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : cache-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public CacheConfigType<T> setCacheName(String cacheName) {
		childNode.getOrCreate("cache-name").text(cacheName);
		return this;
	}

	public CacheConfigType<T> removeCacheName() {
		childNode.remove("cache-name");
		return this;
	}

	public String getCacheName() {
		return childNode.textValue("cache-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : persistence-manager
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public CacheConfigType<T> setPersistenceManager(String persistenceManager) {
		childNode.getOrCreate("persistence-manager").text(persistenceManager);
		return this;
	}

	public CacheConfigType<T> removePersistenceManager() {
		childNode.remove("persistence-manager");
		return this;
	}

	public String getPersistenceManager() {
		return childNode.textValue("persistence-manager");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : replication-is-passivation
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public CacheConfigType<T> setReplicationIsPassivation(
			String replicationIsPassivation) {
		childNode.getOrCreate("replication-is-passivation").text(
				replicationIsPassivation);
		return this;
	}

	public CacheConfigType<T> removeReplicationIsPassivation() {
		childNode.remove("replication-is-passivation");
		return this;
	}

	public String getReplicationIsPassivation() {
		return childNode.textValue("replication-is-passivation");
	}

}
