package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface AddressingType<T> extends Child<T>
{
   public AddressingType<T> setEnabled(Boolean enabled);

   public Boolean getEnabled();

   public AddressingType<T> setRequired(Boolean required);

   public Boolean getRequired();

   public AddressingType<T> setResponses(String responses);

   public String getResponses();
}
