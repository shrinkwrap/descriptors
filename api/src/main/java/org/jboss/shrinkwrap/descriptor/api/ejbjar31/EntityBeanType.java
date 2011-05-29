package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.JndiEnvironmentRefsGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface EntityBeanType<T> extends Child<T>, DescriptionGroup<T>, JndiEnvironmentRefsGroup<T>

{
   public EntityBeanType<T> setEjbName(String ejbName);

   public String getEjbName();

   public EntityBeanType<T> setMappedName(String mappedName);

   public String getMappedName();

   public EntityBeanType<T> setHome(String home);

   public String getHome();

   public EntityBeanType<T> setRemote(String remote);

   public String getRemote();

   public EntityBeanType<T> setLocalHome(String localHome);

   public String getLocalHome();

   public EntityBeanType<T> setLocal(String local);

   public String getLocal();

   public EntityBeanType<T> setEjbClass(String ejbClass);

   public String getEjbClass();

   public EntityBeanType<T> setPersistenceType(PersistenceTypeType persistenceType);

   public PersistenceTypeType getPersistenceType();

   public EntityBeanType<T> setPrimKeyClass(String primKeyClass);

   public String getPrimKeyClass();

   public EntityBeanType<T> setReentrant(Boolean reentrant);

   public Boolean getReentrant();

   public EntityBeanType<T> setCmpVersion(CmpVersionType cmpVersion);

   public CmpVersionType getCmpVersion();

   public EntityBeanType<T> setAbstractSchemaName(String abstractSchemaName);

   public String getAbstractSchemaName();

   public CmpFieldType<EntityBeanType<T>> setCmpField(CmpFieldType<T> cmpField);

   public CmpFieldType<EntityBeanType<T>> getCmpField();

   public EntityBeanType<T> setPrimkeyField(String primkeyField);

   public String getPrimkeyField();

   public SecurityRoleRefType<EntityBeanType<T>> setSecurityRoleRef(SecurityRoleRefType<T> securityRoleRef);

   public SecurityRoleRefType<EntityBeanType<T>> getSecurityRoleRef();

   public SecurityIdentityType<EntityBeanType<T>> setSecurityIdentity(SecurityIdentityType<T> securityIdentity);

   public SecurityIdentityType<EntityBeanType<T>> getSecurityIdentity();

   public QueryType<EntityBeanType<T>> setQuery(QueryType<T> query);

   public QueryType<EntityBeanType<T>> getQuery();
}
