package org.jboss.shrinkwrap.descriptor.api;

import java.util.List;

public interface DescriptorNamespace<T>
{
   public T addDefaultNamespaces();

   public T addNamespace(String name, String value);

   public List<String> getNamespaces();

   public T removeAllNamespaces();
}
