package org.jboss.shrinkwrap.descriptor.api;

import java.util.List;

public interface DescriptorNamespace<T>
{
   /**
    * Adds the default namespaces as defined in the specification.
    * @return the current instance of <code>T</code>.
    */
   public T addDefaultNamespaces();

   /**
    * Adds a new namespace.
    * @param name the name of the namespace
    * @param value the value of the namespace
    * @return the current instance of <code>T</code>.
    */
   public T addNamespace(String name, String value);

   /**
    * Returns all existing namespaces.
    * @return a list of all existing namespaces.
    */
   public List<String> getNamespaces();

   /**
    * Removes all existing namespaces.
    * @return the current instance of <code>T</code>.
    */
   public T removeAllNamespaces();
}
