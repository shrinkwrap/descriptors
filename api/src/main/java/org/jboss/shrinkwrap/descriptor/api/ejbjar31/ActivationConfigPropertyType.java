package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ActivationConfigPropertyType<T> extends Child<T>
{
   public ActivationConfigPropertyType<T> setActivationConfigPropertyName(String activationConfigPropertyName);

   @NodeInfo(xmlName = "activation-config-property-name")
   public String getActivationConfigPropertyName();

   public ActivationConfigPropertyType<T> setActivationConfigPropertyValue(String activationConfigPropertyValue);

   @NodeInfo(xmlName = "activation-config-property-value")
   public String getActivationConfigPropertyValue();
}
