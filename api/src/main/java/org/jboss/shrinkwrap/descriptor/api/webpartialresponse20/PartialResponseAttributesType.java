package org.jboss.shrinkwrap.descriptor.api.webpartialresponse20; 
public interface PartialResponseAttributesType<T> extends Child<T>
{
   public PartialResponseAttributesType<T> setAttribute(<T> attribute);
   public <PartialResponseAttributesType<T>> getAttribute();
}
