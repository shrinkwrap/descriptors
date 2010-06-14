package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auth-constraintType")
public class AuthConstraint extends Describable
{
   @XmlElement(name = "role-name")
   protected List<String> roleNames;
   
   public AuthConstraint() {}
   
   public AuthConstraint(String... roleName) {
      for (String r : roleName) {
         getRoleNames().add(r);
      }
   }
   
   public List<String> getRoleNames()
   {
      if (roleNames == null)
      {
         roleNames = new ArrayList<String>();
      }
      return roleNames;
   }
}
