package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security-constraintType", propOrder = {
      "displayNames",
      "webResourceCollections",
      "authConstraint",
      "userDataConstraint"
})
public class SecurityConstraint
{
   @XmlElement(name = "display-name")
   protected List<LocalizedText> displayNames;
   
   @XmlElement(name = "web-resource-collection", required = true)
   protected List<WebResourceCollection> webResourceCollections;
   
   @XmlElement(name = "auth-constraint")
   protected AuthConstraint authConstraint;
   
   @XmlElement(name = "user-data-constraint")
   protected UserDataConstraint userDataConstraint;

   public SecurityConstraint() {}
   
   public List<LocalizedText> getDisplayNames()
   {
      if (displayNames == null)
      {
         displayNames = new ArrayList<LocalizedText>();
      }
      return displayNames;
   }
   
   public List<WebResourceCollection> getWebResourceCollections()
   {
      if (webResourceCollections == null)
      {
         webResourceCollections = new ArrayList<WebResourceCollection>();
      }
      return webResourceCollections;
   }
   
   public AuthConstraint getAuthConstraint()
   {
      return authConstraint;
   }

   public void setAuthConstraint(AuthConstraint authConstraint)
   {
      this.authConstraint = authConstraint;
   }

   public UserDataConstraint getUserDataConstraint()
   {
      return userDataConstraint;
   }

   public void setUserDataConstraint(UserDataConstraint userDataConstraint)
   {
      this.userDataConstraint = userDataConstraint;
   }
}
