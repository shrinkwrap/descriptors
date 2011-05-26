package org.jboss.shrinkwrap.descriptor.api.webfacesuicomponent20; 
public interface UicomponentAttributeType<T> extends Child<T>
{
   public UicomponentAttributeType<T> setAttribute(UicomponentAttributeType<T> attribute);
   public UicomponentAttributeType<UicomponentAttributeType<T>> getAttribute();
}
