package org.jboss.shrinkwrap.descriptor.spec.web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user-data-constraintType")
public class UserDataConstraint extends Describable
{
   @XmlElement(name = "transport-guarantee")
   protected String transportGuarnatee;

   public UserDataConstraint() {}
   
   public UserDataConstraint(String transportGuarnatee)
   {
      this.transportGuarnatee = transportGuarnatee;
   }
   
   public String getTransportGuarnatee()
   {
      return transportGuarnatee;
   }

   public void setTransportGuarnatee(String transportGuarnatee)
   {
      this.transportGuarnatee = transportGuarnatee;
   }
}
