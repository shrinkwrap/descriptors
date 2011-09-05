package org.jboss.shrinkwrap.descriptor.spi.node;
import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * {@link Node} related assertions.
 * 
 * @author <a href="mailto:bartosz.majsak@gmail.com">Bartosz Majsak</a>
 *
 */
public final class NodeAssert
{

   private NodeAssert()
   {}
   
   /**
    * Verifies if all nodes have expected name.
    * 
    * @param nodes
    * @param expectedName
    * 
    * @throws Exception Assertion error when one of node does not match
    */
   public static void assertEqualsByName(Iterable<Node> nodes, String expectedName)
   {
      for (Node node : nodes) 
      {
         Assert.assertEquals(expectedName, node.getName());
      }
   }
   
   /**
    * Verifies if all nodes contain attribute with given value.
    * 
    * @param nodes
    * @param name Name of the node attribute
    * @param expectedValue 
    * 
    * @throws Exception Assertion error when one of node does not match
    */
   public static void assertContainsAttribute(Iterable<Node> nodes, String name, String expectedValue)
   {
      for (Node node : nodes) 
      {
         Assert.assertEquals(expectedValue, node.getAttribute(name));
      }
   }
   
}
