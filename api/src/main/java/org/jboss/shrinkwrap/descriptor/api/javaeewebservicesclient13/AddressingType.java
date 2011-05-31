package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface AddressingType<T> extends Child<T>
{
   public AddressingType<T> setEnabled(Boolean enabled);
   public Boolean getEnabled();

   public AddressingType<T> setRequired(Boolean required);
   public Boolean getRequired();

   public AddressingType<T> setResponses(AddressingResponsesType responses);
   public AddressingResponsesType getResponses();
}
