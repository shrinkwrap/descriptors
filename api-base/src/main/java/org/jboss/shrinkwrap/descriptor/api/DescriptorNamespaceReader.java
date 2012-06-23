package org.jboss.shrinkwrap.descriptor.api;

import java.util.List;

public interface DescriptorNamespaceReader<T>
{
  
   /**
    * Returns all existing namespaces.
    * @return a list of all existing namespaces.
    */
   public List<String> getNamespaces();

}
