package org.jboss.shrinkwrap.descriptor.api.javaee5;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * 
 * The message-destination-ref element contains a declaration of Deployment
 * Component's reference to a message destination associated with a resource in
 * Deployment Component's environment. It consists of:
 * 
 * - an optional description - the message destination reference name - an
 * optional message destination type - an optional specification as to whether
 * the destination is used for consuming or producing messages, or both. if not
 * specified, "both" is assumed. - an optional link to the message destination -
 * optional injection targets
 * 
 * The message destination type must be supplied unless an injection target is
 * specified, in which case the type of the target is used. If both are
 * specified, the type must be assignment compatible with the type of the
 * injection target.
 * 
 * Examples:
 * 
 * <message-destination-ref> <message-destination-ref-name>jms/StockQueue
 * </message-destination-ref-name> <message-destination-type>javax.jms.Queue
 * </message-destination-type> <message-destination-usage>Consumes
 * </message-destination-usage> <message-destination-link>CorporateStocks
 * </message-destination-link> </message-destination-ref>
 * 
 * 
 * 
 * 
 */
public interface MessageDestinationRefType<T> extends Child<T> {

	public MessageDestinationRefType<T> setMappedName(String mappedName);

	public MessageDestinationRefType<T> removeMappedName();

	public String getMappedName();

	public MessageDestinationRefType<T> removeAllInjectionTarget();

	public InjectionTargetType<MessageDestinationRefType<T>> injectionTarget();

	public List<InjectionTargetType<MessageDestinationRefType<T>>> getInjectionTargetList();

	public MessageDestinationRefType<T> setDescription(String description);

	public MessageDestinationRefType<T> setDescriptionList(String... values);

	public MessageDestinationRefType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public MessageDestinationRefType<T> setMessageDestinationRefName(
			String messageDestinationRefName);

	public MessageDestinationRefType<T> removeMessageDestinationRefName();

	public String getMessageDestinationRefName();

	public MessageDestinationRefType<T> setMessageDestinationType(
			String messageDestinationType);

	public MessageDestinationRefType<T> removeMessageDestinationType();

	public String getMessageDestinationType();

	public MessageDestinationRefType<T> setMessageDestinationUsage(
			MessageDestinationUsageType messageDestinationUsage);

	public MessageDestinationRefType<T> setMessageDestinationUsage(
			String messageDestinationUsage);

	public MessageDestinationUsageType getMessageDestinationUsage();

	public String getMessageDestinationUsageAsString();

	public MessageDestinationRefType<T> setMessageDestinationLink(
			String messageDestinationLink);

	public MessageDestinationRefType<T> removeMessageDestinationLink();

	public String getMessageDestinationLink();

}
