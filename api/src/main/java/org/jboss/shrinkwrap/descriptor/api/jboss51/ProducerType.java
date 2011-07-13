package org.jboss.shrinkwrap.descriptor.api.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The producer element holds all of the information
 * specific about a producer interface for a consumer bean Used in: consumer
 * 
 */
public interface ProducerType<T> extends Child<T> {

	public ProducerType<T> setClazz(String clazz);

	public ProducerType<T> removeClazz();

	public String getClazz();

	public ProducerType<T> setConnectionFactory(String connectionFactory);

	public ProducerType<T> removeConnectionFactory();

	public String getConnectionFactory();

}
