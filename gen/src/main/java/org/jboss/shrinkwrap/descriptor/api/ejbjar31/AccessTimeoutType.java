package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The access-timeoutType represents the maximum amount of time (in a given time
 * unit) that the container should wait for a concurrency lock before throwing a
 * timeout exception to the client.
 * 
 * A timeout value of 0 means concurrent access is not permitted.
 * 
 * A timeout value of -1 means wait indefinitely to acquire a lock.
 * 
 * 
 * 
 */
public interface AccessTimeoutType<T> extends Child<T> {

	public AccessTimeoutType<T> setTimeout(Integer timeout);

	public AccessTimeoutType<T> removeTimeout();

	public Integer getTimeout();

	public AccessTimeoutType<T> setUnit(TimeUnitTypeType unit);

	public AccessTimeoutType<T> setUnit(String unit);

	public TimeUnitTypeType getUnit();

	public String getUnitAsString();

}
