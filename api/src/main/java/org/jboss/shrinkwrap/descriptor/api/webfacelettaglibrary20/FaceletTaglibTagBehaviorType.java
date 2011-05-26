package org.jboss.shrinkwrap.descriptor.api.webfacelettaglibrary20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FaceletTaglibTagBehaviorType<T> extends Child<T>, DescriptionGroup<T>
{
   public FaceletTaglibTagBehaviorType<T> setBehaviorId(String behaviorId);

   public String getBehaviorId();

   public FaceletTaglibTagBehaviorType<T> setHandlerClazz(String handlerClass);

   public String getHandlerClazz();

   public FaceletTaglibTagBehaviorType<T> setBehaviorExtension(
         FaceletTaglibTagBehaviorExtensionType<T> behaviorExtension);

   public FaceletTaglibTagBehaviorExtensionType<FaceletTaglibTagBehaviorType<T>> getBehaviorExtension();
}
