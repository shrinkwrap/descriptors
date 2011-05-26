package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface HandlerChainsType<T> extends Child<T>
{
   public HandlerChainsType<T> setHandlerChain(HandlerChainType<T> handlerChain);

   public HandlerChainType<HandlerChainsType<T>> getHandlerChain();
}
