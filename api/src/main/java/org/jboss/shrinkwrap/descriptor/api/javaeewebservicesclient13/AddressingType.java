package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface AddressingType<T> extends Child<T>
{
   public AddressingType<T> setEnabled(Boolean enabled);

   @NodeInfo(xmlName = "enabled")
   public Boolean getEnabled();

   public AddressingType<T> setRequired(Boolean required);

   @NodeInfo(xmlName = "required")
   public Boolean getRequired();

   public AddressingType<T> setResponses(AddressingResponsesType responses);

   public AddressingType<T> setResponses(String responses);

   @NodeInfo(xmlName = "responses")
   public String getResponses();
}
