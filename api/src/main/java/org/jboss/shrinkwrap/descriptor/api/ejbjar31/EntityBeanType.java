package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.JndiEnvironmentRefsGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

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

   public EntityBeanType<T> setEjbClazz(String ejbClass);

   public String getEjbClazz();

   public EntityBeanType<T> setPersistenceType(String persistenceType);

   public String getPersistenceType();

   public EntityBeanType<T> setPrimKeyClazz(String primKeyClass);

   public String getPrimKeyClazz();

   public EntityBeanType<T> setReentrant(Boolean reentrant);

   public Boolean getReentrant();

   public EntityBeanType<T> setCmpVersion(String cmpVersion);

   public String getCmpVersion();

   public EntityBeanType<T> setAbstractSchemaName(String abstractSchemaName);

   public String getAbstractSchemaName();

   public EntityBeanType<T> setCmpField(CmpFieldType<T> cmpField);

   public CmpFieldType<EntityBeanType<T>> getCmpField();

   public EntityBeanType<T> setPrimkeyField(String primkeyField);

   public String getPrimkeyField();

   public EntityBeanType<T> setSecurityRoleRef(SecurityRoleRefType<T> securityRoleRef);

   public SecurityRoleRefType<EntityBeanType<T>> getSecurityRoleRef();

   public EntityBeanType<T> setSecurityIdentity(SecurityIdentityType<T> securityIdentity);

   public SecurityIdentityType<EntityBeanType<T>> getSecurityIdentity();

   public EntityBeanType<T> setQuery(QueryType<T> query);

   public QueryType<EntityBeanType<T>> getQuery();
}
