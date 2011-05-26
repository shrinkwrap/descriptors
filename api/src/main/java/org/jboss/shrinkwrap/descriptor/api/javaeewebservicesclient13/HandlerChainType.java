package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface HandlerChainType<T> extends Child<T>
{
   public HandlerChainType<T> setHandler(HandlerType<T> handler);

   public HandlerType<HandlerChainType<T>> getHandler();
}
