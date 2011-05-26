package org.jboss.shrinkwrap.descriptor.api.webpartialresponse20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface PartialResponseChangesType<T> extends Child<T>
{
   public PartialResponseChangesType<T> setUpdate(String update);

   public String getUpdate();

   public PartialResponseChangesType<T> setInsert(PartialResponseInsertType<T> insert);

   public PartialResponseInsertType<PartialResponseChangesType<T>> getInsert();

   public PartialResponseChangesType<T> setDelete(PartialResponseDeleteType<T> delete);

   public PartialResponseDeleteType<PartialResponseChangesType<T>> getDelete();

   public PartialResponseChangesType<T> setAttributes(PartialResponseAttributesType<T> attributes);

   public PartialResponseAttributesType<PartialResponseChangesType<T>> getAttributes();

   public PartialResponseChangesType<T> setEval(String eval);

   public String getEval();

   public PartialResponseChangesType<T> setExtension(PartialResponseExtensionType<T> extension);

   public PartialResponseExtensionType<PartialResponseChangesType<T>> getExtension();
}
