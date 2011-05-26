package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;

public interface TldTaglibType<T> extends Child<T>, DescriptionGroup<T>
{
   public TldTaglibType<T> setTlibVersion(DeweyVersionType<T> tlibVersion);

   public DeweyVersionType<TldTaglibType<T>> getTlibVersion();

   public TldTaglibType<T> setShortName(String shortName);

   public String getShortName();

   public TldTaglibType<T> setUri(String uri);

   public String getUri();

   public TldTaglibType<T> setValidator(ValidatorType<T> validator);

   public ValidatorType<TldTaglibType<T>> getValidator();

   public TldTaglibType<T> setListener(ListenerType<T> listener);

   public ListenerType<TldTaglibType<T>> getListener();

   public TldTaglibType<T> setTag(TagType<T> tag);

   public TagType<TldTaglibType<T>> getTag();

   public TldTaglibType<T> setTagFile(TagFileType<T> tagFile);

   public TagFileType<TldTaglibType<T>> getTagFile();

   public TldTaglibType<T> setFunction(FunctionType<T> function);

   public FunctionType<TldTaglibType<T>> getFunction();

   public TldTaglibType<T> setTaglibExtension(TldExtensionType<T> taglibExtension);

   public TldExtensionType<TldTaglibType<T>> getTaglibExtension();
}
