package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

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
/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The activation-config-propertyType contains a name/value
 * configuration property pair for a message-driven bean.
 *
 * The properties that are recognized for a particular
 * message-driven bean are determined by the messaging type.
 *
 *
 *
 */
public interface ActivationConfigPropertyType<T> extends Child<T>
{

   public ActivationConfigPropertyType<T> setActivationConfigPropertyName(String activationConfigPropertyName);
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyName();

   public String getActivationConfigPropertyName();



   public ActivationConfigPropertyType<T> setActivationConfigPropertyValue(String activationConfigPropertyValue);
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyValue();

   public String getActivationConfigPropertyValue();

}
