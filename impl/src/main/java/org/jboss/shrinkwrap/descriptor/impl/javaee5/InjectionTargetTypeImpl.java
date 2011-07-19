/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.impl.javaee5;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> injection-targetType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * An injection target specifies a class and a name within <br> 
 * that class into which a resource should be injected. <br> 
 *<br>
 * The injection target class specifies the fully qualified <br> 
 * class name that is the target of the injection. The <br> 
 * Java EE specifications describe which classes can be an <br> 
 * injection target. <br> 
 *<br>
 * The injection target name specifies the target within <br> 
 * the specified class. The target is first looked for as a <br> 
 * JavaBeans property name. If not found, the target is <br> 
 * looked for as a field name. <br> 
 *<br>
 * The specified resource will be injected into the target <br> 
 * during initialization of the class by either calling the <br> 
 * set method for the target property or by setting a value <br> 
 * into the named field. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class InjectionTargetTypeImpl<T> implements Child<T>, InjectionTargetType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InjectionTargetTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public InjectionTargetTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
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

   /**
    * If not already created, a new <code>injection-target-class</code> element with the given value will be created.
    * Otherwise, the existing <code>injection-target-class</code> element will be updated with the given value.
    * @return the current instance of {@link InjectionTargetType<T>} 
    */
   public InjectionTargetType<T> setInjectionTargetClass(String injectionTargetClass)
   {
      childNode.getOrCreate("injection-target-class").text(injectionTargetClass);
      return this;
   }

   /**
    * Removes the <code>injection-target-class</code> element 
    * @return the current instance of {@link InjectionTargetType<T>} 
    */
   public InjectionTargetType<T> removeInjectionTargetClass()
   {
      childNode.remove("injection-target-class");
      return this;
   }

   /**
    * Returns the <code>injection-target-class</code> element
    * @return the node defined for the element <code>injection-target-class</code> 
    */
   public String getInjectionTargetClass()
   {
      return childNode.textValue("injection-target-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target-name</code> element with the given value will be created.
    * Otherwise, the existing <code>injection-target-name</code> element will be updated with the given value.
    * @return the current instance of {@link InjectionTargetType<T>} 
    */
   public InjectionTargetType<T> setInjectionTargetName(String injectionTargetName)
   {
      childNode.getOrCreate("injection-target-name").text(injectionTargetName);
      return this;
   }

   /**
    * Removes the <code>injection-target-name</code> element 
    * @return the current instance of {@link InjectionTargetType<T>} 
    */
   public InjectionTargetType<T> removeInjectionTargetName()
   {
      childNode.remove("injection-target-name");
      return this;
   }

   /**
    * Returns the <code>injection-target-name</code> element
    * @return the node defined for the element <code>injection-target-name</code> 
    */
   public String getInjectionTargetName()
   {
      return childNode.textValue("injection-target-name");
   }

}
