package org.jboss.shrinkwrap.descriptor.spec.web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security-roleType")
public class SecurityRole extends Describable
{
   @XmlElement(name = "role-name")
   protected String roleName;

   public SecurityRole() {}
   
   public SecurityRole(String roleName)
   {
      this.roleName = roleName;
   }
   
   public SecurityRole(String roleName, String description)
   {
      this(roleName);
      getDescriptions().add(new LocalizedText(description));
   }
   
   public String getRoleName()
   {
      return roleName;
   }

   public void setRoleName(String roleName)
   {
      this.roleName = roleName;
   }
}
