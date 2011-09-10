/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.test.util;

import java.util.Arrays;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;

import junit.framework.Assert;

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
         Assert.assertEquals("Name of node " + node + " does not match!", expectedName, node.getName());
      }
   }
   
   /**
    * Verifies if node has expected name.
    * 
    * @param nodes
    * @param expectedName
    * 
    * @throws Exception Assertion error when one of node does not match
    */
   public static void assertEqualsByName(Node node, String expectedName)
   {
      Assert.assertNotNull(node);
      assertEqualsByName(Arrays.asList(node), expectedName);
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
         Assert.assertEquals("Attribute [" + name + "] value not matching for node " + node, expectedValue, node.getAttribute(name));
      }
   }
   
}
