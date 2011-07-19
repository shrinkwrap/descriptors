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
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> user-data-constraintType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The user-data-constraintType is used to indicate how <br> 
 * data communicated between the client and container should be <br> 
 * protected. <br> 
 *<br>
 * Used in: security-constraint <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface UserDataConstraintType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link UserDataConstraintType<T>} 
    */
   public UserDataConstraintType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link UserDataConstraintType<T>} 
    */
   public UserDataConstraintType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link UserDataConstraintType<T>} 
    */
   public UserDataConstraintType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : transport-guarantee
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transport-guarantee</code> element with the given value will be created.
    * Otherwise, the existing <code>transport-guarantee</code> element will be updated with the given value.
    * @return the current instance of {@link UserDataConstraintType<T>} 
    */
   public UserDataConstraintType<T> setTransportGuarantee(TransportGuaranteeType transportGuarantee);

   /**
    * If not already created, a new <code>transport-guarantee</code> element with the given value will be created.
    * Otherwise, the existing <code>transport-guarantee</code> element will be updated with the given value.
    * @return the current instance of {@link UserDataConstraintType<T>} 
    */
   public UserDataConstraintType<T> setTransportGuarantee(String transportGuarantee);

   /**
    * Returns the <code>transport-guarantee</code> element
    * @return the node defined for the element <code>transport-guarantee</code> 
    */
   public TransportGuaranteeType getTransportGuarantee();

   /**
    * Returns the <code>transport-guarantee</code> element
    * @return the node defined for the element <code>transport-guarantee</code> 
    */
   public String getTransportGuaranteeAsString();

}
