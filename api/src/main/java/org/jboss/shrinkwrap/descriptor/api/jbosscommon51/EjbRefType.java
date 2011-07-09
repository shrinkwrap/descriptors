package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefTypeType;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The ejb-ref element is used to give the jndi-name of an external ejb
 * reference. In the case of an external ejb reference, you don't provide a ejb-link element in
 * ejb-jar.xml, but you provide a jndi-name in jboss.xml Used in: entity, session,
 * message-driven, consumer, and service
 *
 */
public interface EjbRefType<T> extends Child<T>
{

   public EjbRefType<T> setJndiName(String jndiName);

   public EjbRefType<T> removeJndiName();

   public String getJndiName();

   public EjbRefType<T> setMappedName(String mappedName);

   public EjbRefType<T> removeMappedName();

   public String getMappedName();

   public EjbRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<EjbRefType<T>> injectionTarget();

   public List<InjectionTargetType<EjbRefType<T>>> getInjectionTargetList();

   public EjbRefType<T> ignoreDependency();

   public Boolean isIgnoreDependency();

   public EjbRefType<T> setDescription(String description);

   public EjbRefType<T> setDescriptionList(String... values);

   public EjbRefType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public EjbRefType<T> setEjbRefName(String ejbRefName);

   public EjbRefType<T> removeEjbRefName();

   public String getEjbRefName();

   public EjbRefType<T> setEjbRefType(EjbRefTypeType ejbRefType);

   public EjbRefType<T> setEjbRefType(String ejbRefType);

   public EjbRefTypeType getEjbRefType();

   public String getEjbRefTypeAsString();

   public EjbRefType<T> setHome(String home);

   public EjbRefType<T> removeHome();

   public String getHome();

   public EjbRefType<T> setRemote(String remote);

   public EjbRefType<T> removeRemote();

   public String getRemote();

   public EjbRefType<T> setEjbLink(String ejbLink);

   public EjbRefType<T> removeEjbLink();

   public String getEjbLink();

}
