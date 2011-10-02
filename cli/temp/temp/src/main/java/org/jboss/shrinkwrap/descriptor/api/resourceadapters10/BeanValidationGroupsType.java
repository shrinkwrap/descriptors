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
package org.jboss.shrinkwrap.descriptor.api.resourceadapters10; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> bean-validation-groupsType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public interface BeanValidationGroupsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanValidationGroupsType ElementName: xsd:token ElementType : bean-validation-group
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>bean-validation-group</code> elements, 
    * a new <code>bean-validation-group</code> element 
    * @param values list of <code>bean-validation-group</code> objects 
    * @return the current instance of <code>BeanValidationGroupsType<T></code> 
    */
   public BeanValidationGroupsType<T> beanValidationGroup(String ... values);

   /**
    * Returns all <code>bean-validation-group</code> elements
    * @return list of <code>bean-validation-group</code> 
    */
   public List<String> getAllBeanValidationGroup();

   /**
    * Removes the <code>bean-validation-group</code> element 
    * @return the current instance of <code>BeanValidationGroupsType<T></code> 
    */
   public BeanValidationGroupsType<T> removeAllBeanValidationGroup();
}
