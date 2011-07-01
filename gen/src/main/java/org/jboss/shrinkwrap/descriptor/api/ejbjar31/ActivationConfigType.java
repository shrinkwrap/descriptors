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
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 *
 * The activation-configType defines information about the
 * expected configuration properties of the message-driven bean
 * in its operational environment. This may include information
 * about message acknowledgement, message selector, expected
 * destination type, etc.
 *
 * The configuration information is expressed in terms of
 * name/value configuration properties.
 *
 * The properties that are recognized for a particular
 * message-driven bean are determined by the messaging type.
 *
 *
 *
 */
public interface ActivationConfigType<T> extends Child<T>
{

   public ActivationConfigType<T> setDescription(String description);
   public ActivationConfigType<T> setDescriptionList(String ... values);
   public ActivationConfigType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public ActivationConfigType<T> removeAllActivationConfigProperty();

   public ActivationConfigPropertyType<ActivationConfigType<T>> activationConfigProperty();
   public List<ActivationConfigPropertyType<ActivationConfigType<T>>> getActivationConfigPropertyList();


}
