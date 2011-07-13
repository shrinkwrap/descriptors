package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The message-destination element is used to configure
 * the jndi-name for a message-destination in ejb-jar.xml Used in:
 * assembly-descriptor
 * 
 */
public interface MessageDestinationType<T> extends Child<T> {

	public MessageDestinationType<T> setDescription(String description);

	public MessageDestinationType<T> setDescriptionList(String... values);

	public MessageDestinationType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public MessageDestinationType<T> setDisplayName(String displayName);

	public MessageDestinationType<T> setDisplayNameList(String... values);

	public MessageDestinationType<T> removeAllDisplayName();

	public List<String> getDisplayNameList();

	public MessageDestinationType<T> removeAllIcon();

	public IconType<MessageDestinationType<T>> icon();

	public List<IconType<MessageDestinationType<T>>> getIconList();

	public MessageDestinationType<T> setMessageDestinationName(
			String messageDestinationName);

	public MessageDestinationType<T> removeMessageDestinationName();

	public String getMessageDestinationName();

	public MessageDestinationType<T> setJndiName(String jndiName);

	public MessageDestinationType<T> removeJndiName();

	public String getJndiName();

	public MessageDestinationType<T> setMappedName(String mappedName);

	public MessageDestinationType<T> removeMappedName();

	public String getMappedName();

}
