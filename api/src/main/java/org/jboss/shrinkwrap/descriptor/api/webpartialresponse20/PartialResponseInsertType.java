package org.jboss.shrinkwrap.descriptor.api.webpartialresponse20; 
public interface PartialResponseInsertType<T> extends Child<T>
{
   public PartialResponseInsertType<T> setBefore(<T> before);
   public <PartialResponseInsertType<T>> getBefore();
   public PartialResponseInsertType<T> setAfter(<T> after);
   public <PartialResponseInsertType<T>> getAfter();
}
