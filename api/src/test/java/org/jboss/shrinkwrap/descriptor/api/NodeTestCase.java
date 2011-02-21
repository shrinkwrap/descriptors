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
package org.jboss.shrinkwrap.descriptor.api;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * NodeTestCase
 * 
 * 
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class NodeTestCase
{
   private static final String ROOT_NAME = "test_root";
   private static final String CHILD_1_NAME = "test_child_1";
   private static final String CHILD_2_NAME = "test_child_2";

   private static final String ATTR_NAME = "test_attr_name";
   private static final String ATTR_VALUE = "test_attr_value";

   private static final String BODY = "test_body";

   @Test
   public void shouldBeAbleToGetParentNode() throws Exception
   {
      Node root = new Node(ROOT_NAME);
      Node child = root.create(CHILD_1_NAME);

      Assert.assertEquals(
               "Verify ability to get parent node",
               root, child.parent());
   }

   @Test
   public void shouldBeAbleToGetOrCreateExistingNode() throws Exception
   {
      Node root = new Node(ROOT_NAME);
      Node child1 = root.getOrCreate(CHILD_1_NAME);
      Node child1_ref = root.getOrCreate(CHILD_1_NAME);

      Assert.assertEquals(
               "Verify root only has one child",
               1, root.children().size());

      Assert.assertEquals(
               "Verify the previous created node was returned",
               child1, child1_ref);
   }

   @Test
   public void shouldBeAbleToCreateMultipleEquallyNamedChildren() throws Exception
   {
      Node root = new Node(ROOT_NAME);
      Node child1 = root.create(CHILD_1_NAME);
      Node child2 = root.create(CHILD_1_NAME);

      Assert.assertEquals(
               "Verify root only has two children",
               2, root.children().size());

      Assert.assertNotSame(
               "Verify the children are not the same object",
               child1, child2);
   }

   @Test
   public void shouldBeAbleToGetChildNodesByName() throws Exception
   {
      Node root = new Node(ROOT_NAME);
      Node child1 = root.create(CHILD_1_NAME);
      Node child2 = root.create(CHILD_1_NAME);
      root.create(CHILD_2_NAME);

      List<Node> found = root.get(CHILD_1_NAME);

      Assert.assertEquals(
               "Verify only the named nodes were found",
               2, found.size());

      Assert.assertEquals(
               "Verify the correct node was found",
               child1, found.get(0));

      Assert.assertEquals(
               "Verify the correct node was found",
               child2, found.get(1));
   }

   @Test
   public void shouldBeAbleToGetASingleNode() throws Exception
   {
      Node root = new Node(ROOT_NAME);
      Node child = root.create(CHILD_1_NAME);

      Node found = root.getSingle(CHILD_1_NAME);

      Assert.assertEquals(
               "Verify correct node was found",
               child, found);
   }

   @Test(expected = IllegalArgumentException.class)
   public void shouldThrowExceptionIfMultipleNamedNodesFoundOnGetSingle() throws Exception
   {
      Node root = new Node(ROOT_NAME);
      root.create(CHILD_1_NAME);
      root.create(CHILD_1_NAME);

      // throws Exception, multiple nodes with same name
      root.getSingle(CHILD_1_NAME);
   }

   @Test
   public void shouldBeAbleToReadAndWriteAttribute() throws Exception
   {
      Node root = new Node(ROOT_NAME)
               .attribute(ATTR_NAME, ATTR_VALUE);

      Assert.assertEquals(
               "Verify abillity to store attribues",
               root.attribute(ATTR_NAME), ATTR_VALUE);
   }

   @Test
   public void shouldBeAbleToReadAndWriteAttributeObject() throws Exception
   {
      Node root = new Node(ROOT_NAME)
               .attribute(ATTR_NAME, new StringBuilder(ATTR_VALUE));

      Assert.assertEquals(
               "Verify abillity to store attribues",
               root.attribute(ATTR_NAME), ATTR_VALUE);
   }

   @Test
   public void shouldBeAbleToReadWriteTextBody() throws Exception
   {
      Node root = new Node(ROOT_NAME)
               .text(BODY);

      Assert.assertEquals(
               "Verify abillity to store text body",
               BODY, root.text());
   }

   @Test
   public void shouldBeAbleToReadWriteTextBodyObject() throws Exception
   {
      Node root = new Node(ROOT_NAME)
               .text(new StringBuilder(BODY));

      Assert.assertEquals(
               "Verify abillity to store text body",
               BODY, root.text());
   }

   @Test
   public void shouldBeAbleToReadAllChildTextBodyValues() throws Exception
   {
      Node root = new Node(ROOT_NAME);

      for (int i = 0; i < 10; i++)
      {
         root.create("subject").text(i);
      }

      List<String> textValues = root.textValues("subject");
      for (int i = 0; i < 10; i++)
      {
         Assert.assertTrue(textValues.contains(String.valueOf(i)));
      }
   }
}
