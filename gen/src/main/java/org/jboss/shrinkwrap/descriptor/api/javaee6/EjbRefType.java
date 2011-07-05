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
 *
 * The ejb-refType is used by ejb-ref elements for the
 * declaration of a reference to an enterprise bean's home or
 * to the remote business interface of a 3.0 bean.
 * The declaration consists of:
 *
 * - an optional description
 * - the EJB reference name used in the code of
 * the Deployment Component that's referencing the enterprise
 * bean.
 * - the optional expected type of the referenced enterprise bean
 * - the optional remote interface of the referenced enterprise bean
 * or the remote business interface of the referenced enterprise
 * bean
 * - the optional expected home interface of the referenced
 * enterprise bean. Not applicable if this ejb-ref
 * refers to the remote business interface of a 3.0 bean.
 * - optional ejb-link information, used to specify the
 * referenced enterprise bean
 * - optional elements to define injection of the named enterprise
 * bean into a component field or property
 *
 *
 *
 */
public interface EjbRefType<T> extends Child<T>
{

   public EjbRefType<T> setLookupName(String lookupName);
   public EjbRefType<T> removeLookupName();

   public String getLookupName();


   public EjbRefType<T> setMappedName(String mappedName);
   public EjbRefType<T> removeMappedName();

   public String getMappedName();


   public EjbRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<EjbRefType<T>> injectionTarget();
   public List<InjectionTargetType<EjbRefType<T>>> getInjectionTargetList();



   public EjbRefType<T> setDescription(String description);
   public EjbRefType<T> setDescriptionList(String ... values);
   public EjbRefType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public EjbRefType<T> setEjbRefName(String ejbRefName);
   public EjbRefType<T> removeEjbRefName();

   public String getEjbRefName();



   public EjbRefType<T> setEjbRefType(EjbRefTypeType ejbRefType);
   public EjbRefType<T> setEjbRefType(String ejbRefType);

   public EjbRefTypeType getEjbRefType();
   public String  getEjbRefTypeAsString();



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
