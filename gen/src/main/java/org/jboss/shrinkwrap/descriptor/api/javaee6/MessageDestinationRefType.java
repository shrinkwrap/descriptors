package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 * [
 * The message-destination-ref element contains a declaration
 * of Deployment Component's reference to a message destination
 * associated with a resource in Deployment Component's
 * environment. It consists of:
 *
 * - an optional description
 * - the message destination reference name
 * - an optional message destination type
 * - an optional specification as to whether
 * the destination is used for
 * consuming or producing messages, or both.
 * if not specified, "both" is assumed.
 * - an optional link to the message destination
 * - optional injection targets
 *
 * The message destination type must be supplied unless an
 * injection target is specified, in which case the type
 * of the target is used. If both are specified, the type
 * must be assignment compatible with the type of the injection
 * target.
 *
 * Examples:
 *
 * <message-destination-ref>
 * <message-destination-ref-name>jms/StockQueue
 * </message-destination-ref-name>
 * <message-destination-type>javax.jms.Queue
 * </message-destination-type>
 * <message-destination-usage>Consumes
 * </message-destination-usage>
 * <message-destination-link>CorporateStocks
 * </message-destination-link>
 * </message-destination-ref>
 *
 *
 *
 *
 */
public interface MessageDestinationRefType<T> extends Child<T>
{

   public MessageDestinationRefType<T> setLookupName(String lookupName);
   public MessageDestinationRefType<T> removeLookupName();

   public String getLookupName();


   public MessageDestinationRefType<T> setMappedName(String mappedName);
   public MessageDestinationRefType<T> removeMappedName();

   public String getMappedName();


   public MessageDestinationRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<MessageDestinationRefType<T>> injectionTarget();
   public List<InjectionTargetType<MessageDestinationRefType<T>>> getInjectionTargetList();



   public MessageDestinationRefType<T> setDescription(String description);
   public MessageDestinationRefType<T> setDescriptionList(String ... values);
   public MessageDestinationRefType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName);
   public MessageDestinationRefType<T> removeMessageDestinationRefName();

   public String getMessageDestinationRefName();



   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType);
   public MessageDestinationRefType<T> removeMessageDestinationType();

   public String getMessageDestinationType();



   public MessageDestinationRefType<T> setMessageDestinationUsage(MessageDestinationUsageType messageDestinationUsage);
   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage);

   public MessageDestinationUsageType getMessageDestinationUsage();
   public String  getMessageDestinationUsageAsString();



   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink);
   public MessageDestinationRefType<T> removeMessageDestinationLink();

   public String getMessageDestinationLink();

}