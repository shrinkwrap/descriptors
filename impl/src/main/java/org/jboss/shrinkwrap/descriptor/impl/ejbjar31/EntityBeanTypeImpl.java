package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmpFieldType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmpVersionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EntityBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.PersistenceTypeType;
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
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
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
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * The entity-beanType declares an entity bean. The declaration
 * consists of:
 *
 * - an optional description
 * - an optional display name
 * - an optional icon element that contains a small and a large
 * icon file name
 * - a unique name assigned to the enterprise bean
 * in the deployment descriptor
 * - an optional mapped-name element that can be used to provide
 * vendor-specific deployment information such as the physical
 * jndi-name of the entity bean's remote home interface. This
 * element is not required to be supported by all implementations.
 * Any use of this element is non-portable.
 * - the names of the entity bean's remote home
 * and remote interfaces, if any
 * - the names of the entity bean's local home and local
 * interfaces, if any
 * - the entity bean's implementation class
 * - the optional entity bean's persistence management type. If
 * this element is not specified it is defaulted to Container.
 * - the entity bean's primary key class name
 * - an indication of the entity bean's reentrancy
 * - an optional specification of the
 * entity bean's cmp-version
 * - an optional specification of the entity bean's
 * abstract schema name
 * - an optional list of container-managed fields
 * - an optional specification of the primary key
 * field
 * - an optional declaration of the bean's environment
 * entries
 * - an optional declaration of the bean's EJB
 * references
 * - an optional declaration of the bean's local
 * EJB references
 * - an optional declaration of the bean's web
 * service references
 * - an optional declaration of the security role
 * references
 * - an optional declaration of the security identity
 * to be used for the execution of the bean's methods
 * - an optional declaration of the bean's
 * resource manager connection factory references
 * - an optional declaration of the bean's
 * resource environment references
 * - an optional declaration of the bean's message
 * destination references
 * - an optional set of query declarations
 * for finder and select methods for an entity
 * bean with cmp-version 2.x.
 *
 * The optional abstract-schema-name element must be specified
 * for an entity bean with container-managed persistence and
 * cmp-version 2.x.
 *
 * The optional primkey-field may be present in the descriptor
 * if the entity's persistence-type is Container.
 *
 * The optional cmp-version element may be present in the
 * descriptor if the entity's persistence-type is Container. If
 * the persistence-type is Container and the cmp-version
 * element is not specified, its value defaults to 2.x.
 *
 * The optional home and remote elements must be specified if
 * the entity bean cmp-version is 1.x.
 *
 * The optional home and remote elements must be specified if
 * the entity bean has a remote home and remote interface.
 *
 * The optional local-home and local elements must be specified
 * if the entity bean has a local home and local interface.
 *
 * Either both the local-home and the local elements or both
 * the home and the remote elements must be specified.
 *
 * The optional query elements must be present if the
 * persistence-type is Container and the cmp-version is 2.x and
 * query methods other than findByPrimaryKey have been defined
 * for the entity bean.
 *
 * The other elements that are optional are "optional" in the
 * sense that they are omitted if the lists represented by them
 * are empty.
 *
 * At least one cmp-field element must be present in the
 * descriptor if the entity's persistence-type is Container and
 * the cmp-version is 1.x, and none must not be present if the
 * entity's persistence-type is Bean.
 *
 *
 *
 */
public class EntityBeanTypeImpl<T> implements Child<T>, EntityBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EntityBeanTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public EntityBeanTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public EntityBeanType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public EntityBeanType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public EntityBeanType<T> setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public EntityBeanType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
      return this;
   }

   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   public IconType<EntityBeanType<T>> icon()
   {
      return new IconTypeImpl<EntityBeanType<T>>(this, "icon", childNode);
   }

   public List<IconType<EntityBeanType<T>>> getIconList()
   {
      List<IconType<EntityBeanType<T>>> list = new ArrayList<IconType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<EntityBeanType<T>> type = new IconTypeImpl<EntityBeanType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   public EnvEntryType<EntityBeanType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<EntityBeanType<T>>(this, "env-entry", childNode);
   }

   public List<EnvEntryType<EntityBeanType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<EntityBeanType<T>>> list = new ArrayList<EnvEntryType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<EntityBeanType<T>> type = new EnvEntryTypeImpl<EntityBeanType<T>>(this, "env-entry", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   public EjbRefType<EntityBeanType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<EntityBeanType<T>>(this, "ejb-ref", childNode);
   }

   public List<EjbRefType<EntityBeanType<T>>> getEjbRefList()
   {
      List<EjbRefType<EntityBeanType<T>>> list = new ArrayList<EjbRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<EntityBeanType<T>> type = new EjbRefTypeImpl<EntityBeanType<T>>(this, "ejb-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   public EjbLocalRefType<EntityBeanType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<EntityBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   public List<EjbLocalRefType<EntityBeanType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<EntityBeanType<T>>> list = new ArrayList<EjbLocalRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<EntityBeanType<T>> type = new EjbLocalRefTypeImpl<EntityBeanType<T>>(this, "ejb-local-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   public ResourceRefType<EntityBeanType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<EntityBeanType<T>>(this, "resource-ref", childNode);
   }

   public List<ResourceRefType<EntityBeanType<T>>> getResourceRefList()
   {
      List<ResourceRefType<EntityBeanType<T>>> list = new ArrayList<ResourceRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<EntityBeanType<T>> type = new ResourceRefTypeImpl<EntityBeanType<T>>(this, "resource-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   public ResourceEnvRefType<EntityBeanType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<EntityBeanType<T>>(this, "resource-env-ref", childNode);
   }

   public List<ResourceEnvRefType<EntityBeanType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<EntityBeanType<T>>> list = new ArrayList<ResourceEnvRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<EntityBeanType<T>> type = new ResourceEnvRefTypeImpl<EntityBeanType<T>>(this,
               "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   public MessageDestinationRefType<EntityBeanType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<EntityBeanType<T>>(this, "message-destination-ref", childNode);
   }

   public List<MessageDestinationRefType<EntityBeanType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<EntityBeanType<T>>> list = new ArrayList<MessageDestinationRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<EntityBeanType<T>> type = new MessageDestinationRefTypeImpl<EntityBeanType<T>>(this,
               "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   public PersistenceContextRefType<EntityBeanType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<EntityBeanType<T>>(this, "persistence-context-ref", childNode);
   }

   public List<PersistenceContextRefType<EntityBeanType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<EntityBeanType<T>>> list = new ArrayList<PersistenceContextRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<EntityBeanType<T>> type = new PersistenceContextRefTypeImpl<EntityBeanType<T>>(this,
               "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   public PersistenceUnitRefType<EntityBeanType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<EntityBeanType<T>>(this, "persistence-unit-ref", childNode);
   }

   public List<PersistenceUnitRefType<EntityBeanType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<EntityBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<EntityBeanType<T>> type = new PersistenceUnitRefTypeImpl<EntityBeanType<T>>(this,
               "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   public LifecycleCallbackType<EntityBeanType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "post-construct", childNode);
   }

   public List<LifecycleCallbackType<EntityBeanType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<EntityBeanType<T>>> list = new ArrayList<LifecycleCallbackType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<EntityBeanType<T>> type = new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this,
               "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   public LifecycleCallbackType<EntityBeanType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "pre-destroy", childNode);
   }

   public List<LifecycleCallbackType<EntityBeanType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<EntityBeanType<T>>> list = new ArrayList<LifecycleCallbackType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<EntityBeanType<T>> type = new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this,
               "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllDataSource()
   {
      childNode.remove("data-source");
      return this;
   }

   public DataSourceType<EntityBeanType<T>> dataSource()
   {
      return new DataSourceTypeImpl<EntityBeanType<T>>(this, "data-source", childNode);
   }

   public List<DataSourceType<EntityBeanType<T>>> getDataSourceList()
   {
      List<DataSourceType<EntityBeanType<T>>> list = new ArrayList<DataSourceType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for (Node node : nodeList)
      {
         DataSourceType<EntityBeanType<T>> type = new DataSourceTypeImpl<EntityBeanType<T>>(this, "data-source",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   public EntityBeanType<T> removeEjbName()
   {
      childNode.remove("ejb-name");
      return this;
   }

   public String getEjbName()
   {
      return childNode.textValue("ejb-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public EntityBeanType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setHome(String home)
   {
      childNode.getOrCreate("home").text(home);
      return this;
   }

   public EntityBeanType<T> removeHome()
   {
      childNode.remove("home");
      return this;
   }

   public String getHome()
   {
      return childNode.textValue("home");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : remote
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setRemote(String remote)
   {
      childNode.getOrCreate("remote").text(remote);
      return this;
   }

   public EntityBeanType<T> removeRemote()
   {
      childNode.remove("remote");
      return this;
   }

   public String getRemote()
   {
      return childNode.textValue("remote");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setLocalHome(String localHome)
   {
      childNode.getOrCreate("local-home").text(localHome);
      return this;
   }

   public EntityBeanType<T> removeLocalHome()
   {
      childNode.remove("local-home");
      return this;
   }

   public String getLocalHome()
   {
      return childNode.textValue("local-home");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setLocal(String local)
   {
      childNode.getOrCreate("local").text(local);
      return this;
   }

   public EntityBeanType<T> removeLocal()
   {
      childNode.remove("local");
      return this;
   }

   public String getLocal()
   {
      return childNode.textValue("local");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setEjbClass(String ejbClass)
   {
      childNode.getOrCreate("ejb-class").text(ejbClass);
      return this;
   }

   public EntityBeanType<T> removeEjbClass()
   {
      childNode.remove("ejb-class");
      return this;
   }

   public String getEjbClass()
   {
      return childNode.textValue("ejb-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setPersistenceType(PersistenceTypeType persistenceType)
   {
      childNode.getOrCreate("persistence-type").text(persistenceType);
      return this;
   }

   public EntityBeanType<T> setPersistenceType(String persistenceType)
   {
      childNode.getOrCreate("persistence-type").text(persistenceType);
      return this;
   }

   public PersistenceTypeType getPersistenceType()
   {
      return PersistenceTypeType.getFromStringValue(childNode.textValue("persistence-type"));
   }

   public String getPersistenceTypeAsString()
   {
      return childNode.textValue("persistence-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : prim-key-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setPrimKeyClass(String primKeyClass)
   {
      childNode.getOrCreate("prim-key-class").text(primKeyClass);
      return this;
   }

   public EntityBeanType<T> removePrimKeyClass()
   {
      childNode.remove("prim-key-class");
      return this;
   }

   public String getPrimKeyClass()
   {
      return childNode.textValue("prim-key-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : reentrant
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setReentrant(Boolean reentrant)
   {
      childNode.getOrCreate("reentrant").text(reentrant);
      return this;
   }

   public EntityBeanType<T> removeReentrant()
   {
      childNode.remove("reentrant");
      return this;
   }

   public Boolean isReentrant()
   {
      return Strings.isTrue(childNode.textValue("reentrant"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cmp-version
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setCmpVersion(CmpVersionType cmpVersion)
   {
      childNode.getOrCreate("cmp-version").text(cmpVersion);
      return this;
   }

   public EntityBeanType<T> setCmpVersion(String cmpVersion)
   {
      childNode.getOrCreate("cmp-version").text(cmpVersion);
      return this;
   }

   public CmpVersionType getCmpVersion()
   {
      return CmpVersionType.getFromStringValue(childNode.textValue("cmp-version"));
   }

   public String getCmpVersionAsString()
   {
      return childNode.textValue("cmp-version");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : abstract-schema-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setAbstractSchemaName(String abstractSchemaName)
   {
      childNode.getOrCreate("abstract-schema-name").text(abstractSchemaName);
      return this;
   }

   public EntityBeanType<T> removeAbstractSchemaName()
   {
      childNode.remove("abstract-schema-name");
      return this;
   }

   public String getAbstractSchemaName()
   {
      return childNode.textValue("abstract-schema-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cmp-field
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllCmpField()
   {
      childNode.remove("cmp-field");
      return this;
   }

   public CmpFieldType<EntityBeanType<T>> cmpField()
   {
      return new CmpFieldTypeImpl<EntityBeanType<T>>(this, "cmp-field", childNode);
   }

   public List<CmpFieldType<EntityBeanType<T>>> getCmpFieldList()
   {
      List<CmpFieldType<EntityBeanType<T>>> list = new ArrayList<CmpFieldType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("cmp-field");
      for (Node node : nodeList)
      {
         CmpFieldType<EntityBeanType<T>> type = new CmpFieldTypeImpl<EntityBeanType<T>>(this, "cmp-field", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : primkey-field
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> setPrimkeyField(String primkeyField)
   {
      childNode.getOrCreate("primkey-field").text(primkeyField);
      return this;
   }

   public EntityBeanType<T> removePrimkeyField()
   {
      childNode.remove("primkey-field");
      return this;
   }

   public String getPrimkeyField()
   {
      return childNode.textValue("primkey-field");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllSecurityRoleRef()
   {
      childNode.remove("security-role-ref");
      return this;
   }

   public SecurityRoleRefType<EntityBeanType<T>> securityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<EntityBeanType<T>>(this, "security-role-ref", childNode);
   }

   public List<SecurityRoleRefType<EntityBeanType<T>>> getSecurityRoleRefList()
   {
      List<SecurityRoleRefType<EntityBeanType<T>>> list = new ArrayList<SecurityRoleRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("security-role-ref");
      for (Node node : nodeList)
      {
         SecurityRoleRefType<EntityBeanType<T>> type = new SecurityRoleRefTypeImpl<EntityBeanType<T>>(this,
               "security-role-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeSecurityIdentity()
   {
      childNode.remove("security-identity");
      return this;
   }

   public SecurityIdentityType<EntityBeanType<T>> securityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<EntityBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<EntityBeanType<T>>(this,
            "security-identity", childNode, node);
      return securityIdentity;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : query
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EntityBeanType<T> removeAllQuery()
   {
      childNode.remove("query");
      return this;
   }

   public QueryType<EntityBeanType<T>> query()
   {
      return new QueryTypeImpl<EntityBeanType<T>>(this, "query", childNode);
   }

   public List<QueryType<EntityBeanType<T>>> getQueryList()
   {
      List<QueryType<EntityBeanType<T>>> list = new ArrayList<QueryType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("query");
      for (Node node : nodeList)
      {
         QueryType<EntityBeanType<T>> type = new QueryTypeImpl<EntityBeanType<T>>(this, "query", childNode, node);
         list.add(type);
      }
      return list;
   }

}
