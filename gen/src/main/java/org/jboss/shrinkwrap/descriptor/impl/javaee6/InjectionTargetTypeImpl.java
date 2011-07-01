package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
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
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.persistence20.*;
import org.jboss.shrinkwrap.descriptor.impl.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.*;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 *
 * An injection target specifies a class and a name within
 * that class into which a resource should be injected.
 *
 * The injection target class specifies the fully qualified
 * class name that is the target of the injection. The
 * Java EE specifications describe which classes can be an
 * injection target.
 *
 * The injection target name specifies the target within
 * the specified class. The target is first looked for as a
 * JavaBeans property name. If not found, the target is
 * looked for as a field name.
 *
 * The specified resource will be injected into the target
 * during initialization of the class by either calling the
 * set method for the target property or by setting a value
 * into the named field.
 *
 *
 *
 */
public class InjectionTargetTypeImpl<T> implements Child<T>, InjectionTargetType<T>
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

   public InjectionTargetTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public InjectionTargetTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : injection-target-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InjectionTargetType<T> setInjectionTargetClass(String injectionTargetClass)
   {
      childNode.getOrCreate("injection-target-class").text(injectionTargetClass);
      return this;
   }
   public InjectionTargetType<T> removeInjectionTargetClass()
   {
      childNode.remove("injection-target-class");
      return this;
   }

   public String getInjectionTargetClass()
   {
      return childNode.textValue("injection-target-class");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : injection-target-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public InjectionTargetType<T> setInjectionTargetName(String injectionTargetName)
   {
      childNode.getOrCreate("injection-target-name").text(injectionTargetName);
      return this;
   }
   public InjectionTargetType<T> removeInjectionTargetName()
   {
      childNode.remove("injection-target-name");
      return this;
   }

   public String getInjectionTargetName()
   {
      return childNode.textValue("injection-target-name");
   }

}
