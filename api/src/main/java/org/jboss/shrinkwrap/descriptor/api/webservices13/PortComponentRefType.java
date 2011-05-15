package org.jboss.shrinkwrap.descriptor.api.webservices13;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface PortComponentRefType<T> extends Child<T>
{
   public PortComponentRefType<T> ServiceEndpointInterface(String ServiceEndpointInterface);

   public PortComponentRefType<T> EnableMtom(boolean EnableMtom);

   public PortComponentRefType<T> mtomThreshold(int mtomThreshold);

   public AddressingType<PortComponentRefType<T>> addressing();

   public PortComponentRefType<T> respectBinding(boolean respectBinding);

   public PortComponentRefType<T> portComponentLink(String portComponentLink);

}
