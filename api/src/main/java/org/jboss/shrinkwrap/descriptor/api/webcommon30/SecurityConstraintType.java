package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.javaee6.Child;

public interface SecurityConstraintType<T> extends Child<T>
{

   public SecurityConstraintType<T> displayName(String displayName);

   /*
     <xsd:element name="web-resource-collection"
                  type="javaee:web-resource-collectionType"
                  maxOccurs="unbounded"/>
    
     <xsd:element name="user-data-constraint"
                  type="javaee:user-data-constraintType"
                  minOccurs="0"/>
   </xsd:sequence>
   */

   public AuthConstraintType<SecurityConstraintType<T>> authConstraint();
}
