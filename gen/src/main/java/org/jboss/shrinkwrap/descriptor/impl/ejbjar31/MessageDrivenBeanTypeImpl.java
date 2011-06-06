package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class MessageDrivenBeanTypeImpl<T> implements Child<T>, MessageDrivenBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String ejbName;
   private String mappedName;
   private String ejbClass;
   private String messagingType;
   private NamedMethodType<MessageDrivenBeanType<T>> timeoutMethod;
   private TimerType<MessageDrivenBeanType<T>> timer;
   private String transactionType;
   private String messageDestinationType;
   private String messageDestinationLink;
   private ActivationConfigType<MessageDrivenBeanType<T>> activationConfig;
   private AroundInvokeType<MessageDrivenBeanType<T>> aroundInvoke;
   private AroundTimeoutType<MessageDrivenBeanType<T>> aroundTimeout;
   private SecurityRoleRefType<MessageDrivenBeanType<T>> securityRoleRef;
   private SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity;

   private String description;
   private String displayName;
   private IconType<MessageDrivenBeanType<T>> icon;
   private EnvEntryType<MessageDrivenBeanType<T>> envEntry;
   private EjbRefType<MessageDrivenBeanType<T>> ejbRef;
   private EjbLocalRefType<MessageDrivenBeanType<T>> ejbLocalRef;
   private ResourceRefType<MessageDrivenBeanType<T>> resourceRef;
   private ResourceEnvRefType<MessageDrivenBeanType<T>> resourceEnvRef;
   private MessageDestinationRefType<MessageDrivenBeanType<T>> messageDestinationRef;
   private PersistenceContextRefType<MessageDrivenBeanType<T>> persistenceContextRef;
   private PersistenceUnitRefType<MessageDrivenBeanType<T>> persistenceUnitRef;
   private LifecycleCallbackType<MessageDrivenBeanType<T>> postConstruct;
   private LifecycleCallbackType<MessageDrivenBeanType<T>> preDestroy;
   private DataSourceType<MessageDrivenBeanType<T>> dataSource;
   private ServiceRefType<MessageDrivenBeanType<T>> serviceRef;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MessageDrivenBeanTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("message-driven");   }


   public T up()
   {
      return t;
   }



   public MessageDrivenBeanType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public MessageDrivenBeanType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public MessageDrivenBeanType<T> setIcon(IconType<MessageDrivenBeanType<T>> icon)
   {
      childNode.create("icon").text(icon);
      return this;
   }

   public IconType<MessageDrivenBeanType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return icon;
   }



   public MessageDrivenBeanType<T> setEnvEntry(EnvEntryType<MessageDrivenBeanType<T>> envEntry)
   {
      childNode.create("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<MessageDrivenBeanType<T>> getEnvEntry()
   {
      if( envEntry == null)
      {
          envEntry = new EnvEntryTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return envEntry;
   }



   public MessageDrivenBeanType<T> setEjbRef(EjbRefType<MessageDrivenBeanType<T>> ejbRef)
   {
      childNode.create("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<MessageDrivenBeanType<T>> getEjbRef()
   {
      if( ejbRef == null)
      {
          ejbRef = new EjbRefTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return ejbRef;
   }



   public MessageDrivenBeanType<T> setEjbLocalRef(EjbLocalRefType<MessageDrivenBeanType<T>> ejbLocalRef)
   {
      childNode.create("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<MessageDrivenBeanType<T>> getEjbLocalRef()
   {
      if( ejbLocalRef == null)
      {
          ejbLocalRef = new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return ejbLocalRef;
   }



   public MessageDrivenBeanType<T> setResourceRef(ResourceRefType<MessageDrivenBeanType<T>> resourceRef)
   {
      childNode.create("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<MessageDrivenBeanType<T>> getResourceRef()
   {
      if( resourceRef == null)
      {
          resourceRef = new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return resourceRef;
   }



   public MessageDrivenBeanType<T> setResourceEnvRef(ResourceEnvRefType<MessageDrivenBeanType<T>> resourceEnvRef)
   {
      childNode.create("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<MessageDrivenBeanType<T>> getResourceEnvRef()
   {
      if( resourceEnvRef == null)
      {
          resourceEnvRef = new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return resourceEnvRef;
   }



   public MessageDrivenBeanType<T> setMessageDestinationRef(MessageDestinationRefType<MessageDrivenBeanType<T>> messageDestinationRef)
   {
      childNode.create("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<MessageDrivenBeanType<T>> getMessageDestinationRef()
   {
      if( messageDestinationRef == null)
      {
          messageDestinationRef = new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return messageDestinationRef;
   }



   public MessageDrivenBeanType<T> setPersistenceContextRef(PersistenceContextRefType<MessageDrivenBeanType<T>> persistenceContextRef)
   {
      childNode.create("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<MessageDrivenBeanType<T>> getPersistenceContextRef()
   {
      if( persistenceContextRef == null)
      {
          persistenceContextRef = new PersistenceContextRefTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return persistenceContextRef;
   }



   public MessageDrivenBeanType<T> setPersistenceUnitRef(PersistenceUnitRefType<MessageDrivenBeanType<T>> persistenceUnitRef)
   {
      childNode.create("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<MessageDrivenBeanType<T>> getPersistenceUnitRef()
   {
      if( persistenceUnitRef == null)
      {
          persistenceUnitRef = new PersistenceUnitRefTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return persistenceUnitRef;
   }



   public MessageDrivenBeanType<T> setPostConstruct(LifecycleCallbackType<MessageDrivenBeanType<T>> postConstruct)
   {
      childNode.create("post-construct").text(postConstruct);
      return this;
   }

   public LifecycleCallbackType<MessageDrivenBeanType<T>> getPostConstruct()
   {
      if( postConstruct == null)
      {
          postConstruct = new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return postConstruct;
   }



   public MessageDrivenBeanType<T> setPreDestroy(LifecycleCallbackType<MessageDrivenBeanType<T>> preDestroy)
   {
      childNode.create("pre-destroy").text(preDestroy);
      return this;
   }

   public LifecycleCallbackType<MessageDrivenBeanType<T>> getPreDestroy()
   {
      if( preDestroy == null)
      {
          preDestroy = new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return preDestroy;
   }



   public MessageDrivenBeanType<T> setDataSource(DataSourceType<MessageDrivenBeanType<T>> dataSource)
   {
      childNode.create("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<MessageDrivenBeanType<T>> getDataSource()
   {
      if( dataSource == null)
      {
          dataSource = new DataSourceTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return dataSource;
   }



   public MessageDrivenBeanType<T> setServiceRef(ServiceRefType<MessageDrivenBeanType<T>> serviceRef)
   {
      childNode.create("service-ref").text(serviceRef);
      return this;
   }

   public ServiceRefType<MessageDrivenBeanType<T>> getServiceRef()
   {
      if( serviceRef == null)
      {
          serviceRef = new ServiceRefTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return serviceRef;
   }



   public MessageDrivenBeanType<T> setEjbName(String ejbName)
   {
      this.ejbName = ejbName;
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   public String getEjbName()
   {
      return ejbName;
   }



   public MessageDrivenBeanType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }



   public MessageDrivenBeanType<T> setEjbClass(String ejbClass)
   {
      this.ejbClass = ejbClass;
      childNode.getOrCreate("ejb-class").text(ejbClass);
      return this;
   }

   public String getEjbClass()
   {
      return ejbClass;
   }



   public MessageDrivenBeanType<T> setMessagingType(String messagingType)
   {
      this.messagingType = messagingType;
      childNode.getOrCreate("messaging-type").text(messagingType);
      return this;
   }

   public String getMessagingType()
   {
      return messagingType;
   }



   public MessageDrivenBeanType<T> setTimeoutMethod(NamedMethodType<MessageDrivenBeanType<T>> timeoutMethod)
   {
      this.timeoutMethod = timeoutMethod;
      childNode.getOrCreate("timeout-method").text(timeoutMethod);
      return this;
   }

   public NamedMethodType<MessageDrivenBeanType<T>> getTimeoutMethod()
   {
      if( timeoutMethod == null)
      {
          timeoutMethod = new NamedMethodTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return timeoutMethod;
   }




   public MessageDrivenBeanType<T> setTimer(TimerType<MessageDrivenBeanType<T>> timer)
   {
      childNode.create("timer").text(timer);
      return this;
   }

   public TimerType<MessageDrivenBeanType<T>> getTimer()
   {
      if( timer == null)
      {
          timer = new TimerTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return timer;
   }




   public MessageDrivenBeanType<T> setTransactionType(String transactionType)
   {
      this.transactionType = transactionType;
      childNode.getOrCreate("transaction-type").text(transactionType);
      return this;
   }

   public String getTransactionType()
   {
      return transactionType;
   }



   public MessageDrivenBeanType<T> setMessageDestinationType(String messageDestinationType)
   {
      this.messageDestinationType = messageDestinationType;
      childNode.getOrCreate("message-destination-type").text(messageDestinationType);
      return this;
   }

   public String getMessageDestinationType()
   {
      return messageDestinationType;
   }



   public MessageDrivenBeanType<T> setMessageDestinationLink(String messageDestinationLink)
   {
      this.messageDestinationLink = messageDestinationLink;
      childNode.getOrCreate("message-destination-link").text(messageDestinationLink);
      return this;
   }

   public String getMessageDestinationLink()
   {
      return messageDestinationLink;
   }



   public MessageDrivenBeanType<T> setActivationConfig(ActivationConfigType<MessageDrivenBeanType<T>> activationConfig)
   {
      this.activationConfig = activationConfig;
      childNode.getOrCreate("activation-config").text(activationConfig);
      return this;
   }

   public ActivationConfigType<MessageDrivenBeanType<T>> getActivationConfig()
   {
      if( activationConfig == null)
      {
          activationConfig = new ActivationConfigTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return activationConfig;
   }




   public MessageDrivenBeanType<T> setAroundInvoke(AroundInvokeType<MessageDrivenBeanType<T>> aroundInvoke)
   {
      childNode.create("around-invoke").text(aroundInvoke);
      return this;
   }

   public AroundInvokeType<MessageDrivenBeanType<T>> getAroundInvoke()
   {
      if( aroundInvoke == null)
      {
          aroundInvoke = new AroundInvokeTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return aroundInvoke;
   }




   public MessageDrivenBeanType<T> setAroundTimeout(AroundTimeoutType<MessageDrivenBeanType<T>> aroundTimeout)
   {
      childNode.create("around-timeout").text(aroundTimeout);
      return this;
   }

   public AroundTimeoutType<MessageDrivenBeanType<T>> getAroundTimeout()
   {
      if( aroundTimeout == null)
      {
          aroundTimeout = new AroundTimeoutTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return aroundTimeout;
   }




   public MessageDrivenBeanType<T> setSecurityRoleRef(SecurityRoleRefType<MessageDrivenBeanType<T>> securityRoleRef)
   {
      childNode.create("security-role-ref").text(securityRoleRef);
      return this;
   }

   public SecurityRoleRefType<MessageDrivenBeanType<T>> getSecurityRoleRef()
   {
      if( securityRoleRef == null)
      {
          securityRoleRef = new SecurityRoleRefTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return securityRoleRef;
   }




   public MessageDrivenBeanType<T> setSecurityIdentity(SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity)
   {
      this.securityIdentity = securityIdentity;
      childNode.getOrCreate("security-identity").text(securityIdentity);
      return this;
   }

   public SecurityIdentityType<MessageDrivenBeanType<T>> getSecurityIdentity()
   {
      if( securityIdentity == null)
      {
          securityIdentity = new SecurityIdentityTypeImpl<MessageDrivenBeanType<T>>(this, "", childNode);
      }
      return securityIdentity;
   }


}
