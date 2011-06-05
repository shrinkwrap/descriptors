package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmpFieldType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EntityBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.QueryType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
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
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class EntityBeanTypeImpl<T> implements Child<T>, EntityBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String ejbName;
   private String mappedName;
   private String home;
   private String remote;
   private String localHome;
   private String local;
   private String ejbClass;
   private String persistenceType;
   private String primKeyClass;
   private Boolean reentrant;
   private String cmpVersion;
   private String abstractSchemaName;
   private CmpFieldType<EntityBeanType<T>> cmpField;
   private String primkeyField;
   private SecurityRoleRefType<EntityBeanType<T>> securityRoleRef;
   private SecurityIdentityType<EntityBeanType<T>> securityIdentity;
   private QueryType<EntityBeanType<T>> query;

   private String description;
   private String displayName;
   private IconType<EntityBeanType<T>> icon;
   private EnvEntryType<EntityBeanType<T>> envEntry;
   private EjbRefType<EntityBeanType<T>> ejbRef;
   private EjbLocalRefType<EntityBeanType<T>> ejbLocalRef;
   private ResourceRefType<EntityBeanType<T>> resourceRef;
   private ResourceEnvRefType<EntityBeanType<T>> resourceEnvRef;
   private MessageDestinationRefType<EntityBeanType<T>> messageDestinationRef;
   private PersistenceContextRefType<EntityBeanType<T>> persistenceContextRef;
   private PersistenceUnitRefType<EntityBeanType<T>> persistenceUnitRef;
   private LifecycleCallbackType<EntityBeanType<T>> postConstruct;
   private LifecycleCallbackType<EntityBeanType<T>> preDestroy;
   private DataSourceType<EntityBeanType<T>> dataSource;
   private ServiceRefType<EntityBeanType<T>> serviceRef;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EntityBeanTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("entity");   }


   public T up()
   {
      return t;
   }



   public EntityBeanType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public EntityBeanType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public EntityBeanType<T> setIcon(IconType<EntityBeanType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<EntityBeanType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return icon;
   }



   public EntityBeanType<T> setEnvEntry(EnvEntryType<EntityBeanType<T>> envEntry)
   {
      this.envEntry = envEntry;
      childNode.getOrCreate("env-entry").text(envEntry);
      return this;
   }

   public EnvEntryType<EntityBeanType<T>> getEnvEntry()
   {
      if( envEntry == null)
      {
          envEntry = new EnvEntryTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return envEntry;
   }



   public EntityBeanType<T> setEjbRef(EjbRefType<EntityBeanType<T>> ejbRef)
   {
      this.ejbRef = ejbRef;
      childNode.getOrCreate("ejb-ref").text(ejbRef);
      return this;
   }

   public EjbRefType<EntityBeanType<T>> getEjbRef()
   {
      if( ejbRef == null)
      {
          ejbRef = new EjbRefTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return ejbRef;
   }



   public EntityBeanType<T> setEjbLocalRef(EjbLocalRefType<EntityBeanType<T>> ejbLocalRef)
   {
      this.ejbLocalRef = ejbLocalRef;
      childNode.getOrCreate("ejb-local-ref").text(ejbLocalRef);
      return this;
   }

   public EjbLocalRefType<EntityBeanType<T>> getEjbLocalRef()
   {
      if( ejbLocalRef == null)
      {
          ejbLocalRef = new EjbLocalRefTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return ejbLocalRef;
   }



   public EntityBeanType<T> setResourceRef(ResourceRefType<EntityBeanType<T>> resourceRef)
   {
      this.resourceRef = resourceRef;
      childNode.getOrCreate("resource-ref").text(resourceRef);
      return this;
   }

   public ResourceRefType<EntityBeanType<T>> getResourceRef()
   {
      if( resourceRef == null)
      {
          resourceRef = new ResourceRefTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return resourceRef;
   }



   public EntityBeanType<T> setResourceEnvRef(ResourceEnvRefType<EntityBeanType<T>> resourceEnvRef)
   {
      this.resourceEnvRef = resourceEnvRef;
      childNode.getOrCreate("resource-env-ref").text(resourceEnvRef);
      return this;
   }

   public ResourceEnvRefType<EntityBeanType<T>> getResourceEnvRef()
   {
      if( resourceEnvRef == null)
      {
          resourceEnvRef = new ResourceEnvRefTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return resourceEnvRef;
   }



   public EntityBeanType<T> setMessageDestinationRef(MessageDestinationRefType<EntityBeanType<T>> messageDestinationRef)
   {
      this.messageDestinationRef = messageDestinationRef;
      childNode.getOrCreate("message-destination-ref").text(messageDestinationRef);
      return this;
   }

   public MessageDestinationRefType<EntityBeanType<T>> getMessageDestinationRef()
   {
      if( messageDestinationRef == null)
      {
          messageDestinationRef = new MessageDestinationRefTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return messageDestinationRef;
   }



   public EntityBeanType<T> setPersistenceContextRef(PersistenceContextRefType<EntityBeanType<T>> persistenceContextRef)
   {
      this.persistenceContextRef = persistenceContextRef;
      childNode.getOrCreate("persistence-context-ref").text(persistenceContextRef);
      return this;
   }

   public PersistenceContextRefType<EntityBeanType<T>> getPersistenceContextRef()
   {
      if( persistenceContextRef == null)
      {
          persistenceContextRef = new PersistenceContextRefTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return persistenceContextRef;
   }



   public EntityBeanType<T> setPersistenceUnitRef(PersistenceUnitRefType<EntityBeanType<T>> persistenceUnitRef)
   {
      this.persistenceUnitRef = persistenceUnitRef;
      childNode.getOrCreate("persistence-unit-ref").text(persistenceUnitRef);
      return this;
   }

   public PersistenceUnitRefType<EntityBeanType<T>> getPersistenceUnitRef()
   {
      if( persistenceUnitRef == null)
      {
          persistenceUnitRef = new PersistenceUnitRefTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return persistenceUnitRef;
   }



   public EntityBeanType<T> setPostConstruct(LifecycleCallbackType<EntityBeanType<T>> postConstruct)
   {
      this.postConstruct = postConstruct;
      childNode.getOrCreate("post-construct").text(postConstruct);
      return this;
   }

   public LifecycleCallbackType<EntityBeanType<T>> getPostConstruct()
   {
      if( postConstruct == null)
      {
          postConstruct = new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return postConstruct;
   }



   public EntityBeanType<T> setPreDestroy(LifecycleCallbackType<EntityBeanType<T>> preDestroy)
   {
      this.preDestroy = preDestroy;
      childNode.getOrCreate("pre-destroy").text(preDestroy);
      return this;
   }

   public LifecycleCallbackType<EntityBeanType<T>> getPreDestroy()
   {
      if( preDestroy == null)
      {
          preDestroy = new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return preDestroy;
   }



   public EntityBeanType<T> setDataSource(DataSourceType<EntityBeanType<T>> dataSource)
   {
      this.dataSource = dataSource;
      childNode.getOrCreate("data-source").text(dataSource);
      return this;
   }

   public DataSourceType<EntityBeanType<T>> getDataSource()
   {
      if( dataSource == null)
      {
          dataSource = new DataSourceTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return dataSource;
   }



   public EntityBeanType<T> setServiceRef(ServiceRefType<EntityBeanType<T>> serviceRef)
   {
      this.serviceRef = serviceRef;
      childNode.getOrCreate("service-ref").text(serviceRef);
      return this;
   }

   public ServiceRefType<EntityBeanType<T>> getServiceRef()
   {
      if( serviceRef == null)
      {
          serviceRef = new ServiceRefTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return serviceRef;
   }



   public EntityBeanType<T> setEjbName(String ejbName)
   {
      this.ejbName = ejbName;
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   public String getEjbName()
   {
      return ejbName;
   }



   public EntityBeanType<T> setMappedName(String mappedName)
   {
      this.mappedName = mappedName;
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public String getMappedName()
   {
      return mappedName;
   }



   public EntityBeanType<T> setHome(String home)
   {
      this.home = home;
      childNode.getOrCreate("home").text(home);
      return this;
   }

   public String getHome()
   {
      return home;
   }



   public EntityBeanType<T> setRemote(String remote)
   {
      this.remote = remote;
      childNode.getOrCreate("remote").text(remote);
      return this;
   }

   public String getRemote()
   {
      return remote;
   }



   public EntityBeanType<T> setLocalHome(String localHome)
   {
      this.localHome = localHome;
      childNode.getOrCreate("local-home").text(localHome);
      return this;
   }

   public String getLocalHome()
   {
      return localHome;
   }



   public EntityBeanType<T> setLocal(String local)
   {
      this.local = local;
      childNode.getOrCreate("local").text(local);
      return this;
   }

   public String getLocal()
   {
      return local;
   }



   public EntityBeanType<T> setEjbClass(String ejbClass)
   {
      this.ejbClass = ejbClass;
      childNode.getOrCreate("ejb-class").text(ejbClass);
      return this;
   }

   public String getEjbClass()
   {
      return ejbClass;
   }



   public EntityBeanType<T> setPersistenceType(String persistenceType)
   {
      this.persistenceType = persistenceType;
      childNode.getOrCreate("persistence-type").text(persistenceType);
      return this;
   }

   public String getPersistenceType()
   {
      return persistenceType;
   }



   public EntityBeanType<T> setPrimKeyClass(String primKeyClass)
   {
      this.primKeyClass = primKeyClass;
      childNode.getOrCreate("prim-key-class").text(primKeyClass);
      return this;
   }

   public String getPrimKeyClass()
   {
      return primKeyClass;
   }



   public EntityBeanType<T> setReentrant(Boolean reentrant)
   {
      this.reentrant = reentrant;
      childNode.getOrCreate("reentrant").text(reentrant);
      return this;
   }

   public Boolean getReentrant()
   {
      return reentrant;
   }



   public EntityBeanType<T> setCmpVersion(String cmpVersion)
   {
      this.cmpVersion = cmpVersion;
      childNode.getOrCreate("cmp-version").text(cmpVersion);
      return this;
   }

   public String getCmpVersion()
   {
      return cmpVersion;
   }



   public EntityBeanType<T> setAbstractSchemaName(String abstractSchemaName)
   {
      this.abstractSchemaName = abstractSchemaName;
      childNode.getOrCreate("abstract-schema-name").text(abstractSchemaName);
      return this;
   }

   public String getAbstractSchemaName()
   {
      return abstractSchemaName;
   }



   public EntityBeanType<T> setCmpField(CmpFieldType<EntityBeanType<T>> cmpField)
   {
      this.cmpField = cmpField;
      childNode.getOrCreate("cmp-field").text(cmpField);
      return this;
   }

   public CmpFieldType<EntityBeanType<T>> getCmpField()
   {
      if( cmpField == null)
      {
          cmpField = new CmpFieldTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return cmpField;
   }




   public EntityBeanType<T> setPrimkeyField(String primkeyField)
   {
      this.primkeyField = primkeyField;
      childNode.getOrCreate("primkey-field").text(primkeyField);
      return this;
   }

   public String getPrimkeyField()
   {
      return primkeyField;
   }



   public EntityBeanType<T> setSecurityRoleRef(SecurityRoleRefType<EntityBeanType<T>> securityRoleRef)
   {
      this.securityRoleRef = securityRoleRef;
      childNode.getOrCreate("security-role-ref").text(securityRoleRef);
      return this;
   }

   public SecurityRoleRefType<EntityBeanType<T>> getSecurityRoleRef()
   {
      if( securityRoleRef == null)
      {
          securityRoleRef = new SecurityRoleRefTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return securityRoleRef;
   }




   public EntityBeanType<T> setSecurityIdentity(SecurityIdentityType<EntityBeanType<T>> securityIdentity)
   {
      this.securityIdentity = securityIdentity;
      childNode.getOrCreate("security-identity").text(securityIdentity);
      return this;
   }

   public SecurityIdentityType<EntityBeanType<T>> getSecurityIdentity()
   {
      if( securityIdentity == null)
      {
          securityIdentity = new SecurityIdentityTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return securityIdentity;
   }




   public EntityBeanType<T> setQuery(QueryType<EntityBeanType<T>> query)
   {
      this.query = query;
      childNode.getOrCreate("query").text(query);
      return this;
   }

   public QueryType<EntityBeanType<T>> getQuery()
   {
      if( query == null)
      {
          query = new QueryTypeImpl<EntityBeanType<T>>(this, "", childNode);
      }
      return query;
   }


}
