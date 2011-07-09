package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The loader-repository-config element specifies any arbitrary configuration
 * fragment for use in configuring the loader-repository instance. The actual content of this
 * element is specific to the loaderRepositoryClass and the code parsing the element.
 *
 *
 */
public class LoaderRepositoryConfigTypeImpl<T> implements Child<T>, LoaderRepositoryConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public LoaderRepositoryConfigTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public LoaderRepositoryConfigTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : configParserClass
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public LoaderRepositoryConfigType<T> setConfigParserClass(String configParserClass)
   {
      childNode.attribute("configParserClass", configParserClass);
      return this;
   }

   public LoaderRepositoryConfigType<T> removeConfigParserClass()
   {
      childNode.attributes().remove("configParserClass");
      return this;
   }

   public String getConfigParserClass()
   {
      return childNode.attributes().get("configParserClass");
   }

}
