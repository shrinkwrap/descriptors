package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T07:43:58.376-04:00
 *
 * Original Documentation:
 *
 *
 * The ejb-local-refType is used by ejb-local-ref elements for
 * the declaration of a reference to an enterprise bean's local
 * home or to the local business interface of a 3.0 bean.
 * The declaration consists of:
 *
 * - an optional description
 * - the EJB reference name used in the code of the Deployment
 * Component that's referencing the enterprise bean.
 * - the optional expected type of the referenced enterprise bean
 * - the optional expected local interface of the referenced
 * enterprise bean or the local business interface of the
 * referenced enterprise bean.
 * - the optional expected local home interface of the referenced
 * enterprise bean. Not applicable if this ejb-local-ref refers
 * to the local business interface of a 3.0 bean.
 * - optional ejb-link information, used to specify the
 * referenced enterprise bean
 * - optional elements to define injection of the named enterprise
 * bean into a component field or property.
 *
 *
 *
 */
public interface EjbLocalRefType<T> extends Child<T>
{

   public EjbLocalRefType<T> setLookupName(String lookupName);

   public EjbLocalRefType<T> removeLookupName();

   public String getLookupName();

   public EjbLocalRefType<T> setMappedName(String mappedName);

   public EjbLocalRefType<T> removeMappedName();

   public String getMappedName();

   public EjbLocalRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<EjbLocalRefType<T>> injectionTarget();

   public List<InjectionTargetType<EjbLocalRefType<T>>> getInjectionTargetList();

   public EjbLocalRefType<T> setDescription(String description);

   public EjbLocalRefType<T> setDescriptionList(String... values);

   public EjbLocalRefType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public EjbLocalRefType<T> setEjbRefName(String ejbRefName);

   public EjbLocalRefType<T> removeEjbRefName();

   public String getEjbRefName();

   public EjbLocalRefType<T> setEjbRefType(EjbRefTypeType ejbRefType);

   public EjbLocalRefType<T> setEjbRefType(String ejbRefType);

   public EjbRefTypeType getEjbRefType();

   public String getEjbRefTypeAsString();

   public EjbLocalRefType<T> setLocalHome(String localHome);

   public EjbLocalRefType<T> removeLocalHome();

   public String getLocalHome();

   public EjbLocalRefType<T> setLocal(String local);

   public EjbLocalRefType<T> removeLocal();

   public String getLocal();

   public EjbLocalRefType<T> setEjbLink(String ejbLink);

   public EjbLocalRefType<T> removeEjbLink();

   public String getEjbLink();

}
