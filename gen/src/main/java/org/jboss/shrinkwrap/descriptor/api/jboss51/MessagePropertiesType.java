package org.jboss.shrinkwrap.descriptor.api.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: Element for defining JMS message properties (e.g.
 * persistence, priority) for a consumer bean Used in: consumer
 * 
 */
public interface MessagePropertiesType<T> extends Child<T> {

	public MessagePropertiesType<T> setClazz(String clazz);

	public MessagePropertiesType<T> removeClazz();

	public String getClazz();

	public MessagePropertiesType<T> removeMethod();

	public MethodType<MessagePropertiesType<T>> method();

	public MessagePropertiesType<T> setDelivery(String delivery);

	public MessagePropertiesType<T> removeDelivery();

	public String getDelivery();

	public MessagePropertiesType<T> setPriority(Integer priority);

	public MessagePropertiesType<T> removePriority();

	public Integer getPriority();

}
