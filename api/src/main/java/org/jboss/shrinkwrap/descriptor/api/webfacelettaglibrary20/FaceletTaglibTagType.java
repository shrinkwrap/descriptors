package org.jboss.shrinkwrap.descriptor.api.webfacelettaglibrary20; 
public interface FaceletTaglibTagType<T> extends Child<T>
, DescriptionGroup<T>
{
   public FaceletTaglibTagType<T> setTagName(xsd:NCName tagName);
   public xsd:NCName getTagName();
   public FaceletTaglibTagType<T> setAttribute(FaceletTaglibTagAttributeType<T> attribute);
   public FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>> getAttribute();
   public FaceletTaglibTagType<T> setTagExtension(FaceletTaglibTagExtensionType<T> tagExtension);
   public FaceletTaglibTagExtensionType<FaceletTaglibTagType<T>> getTagExtension();
}
