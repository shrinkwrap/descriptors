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
package org.jboss.shrinkwrap.descriptor.spi.node;

import static org.jboss.shrinkwrap.descriptor.spi.testutils.TestTreeBuilder.*;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.Pattern;
import org.jboss.shrinkwrap.descriptor.spi.node.Patterns;
import org.jboss.shrinkwrap.descriptor.spi.node.RelativeGetSingleQuery;
import org.jboss.shrinkwrap.descriptor.spi.testutils.NodeAssert;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @version $Revision: $
 */
public class RelativeGetSingleQueryTestCase
{

   @Test
   public void shouldBeAbleToFindAChildWithTextValueUsingRelativeQuery() throws Exception
   {
      // given
      Node root = createTree();
      System.out.println(root.toString(true));
      
      // when
      Node found = RelativeGetSingleQuery.INSTANCE.execute(root, Patterns.from(CHILD_3_NODE + "=" + CHILD_3_TEXT));

      
      // then
      Assert.assertEquals(
               "Verify correct node found",
               CHILD_3_NODE, found.getName());
      Assert.assertEquals(
               "Verify correct node value",
               CHILD_3_TEXT, found.getText());
   }
   
   @Test
   public void shouldBeAbleToFindANodeUsingRelativeQuery() throws Exception
   {
      // given
      Node root = createTree();
      Pattern pattern = new Pattern(CHILD_2_1_1_NODE);
      pattern.attribute(ATTR_NAME, ATTR_VALUE_2);
      
      // when
      Node found = RelativeGetSingleQuery.INSTANCE.execute(root, pattern);

      // then
      NodeAssert.assertEqualsByName(found, CHILD_2_1_1_NODE);
   }
   
   @Test
   public void shouldBeAbleToFindANodeUsingMultiPatternRelativeQuery() throws Exception
   {
      // given
      Node root = createTree();
      
      // when
      Node found = RelativeGetSingleQuery.INSTANCE.execute(root, Patterns.from("/" + CHILD_2_1_NODE + "/" + CHILD_2_1_1_NODE + "@" + ATTR_NAME + "=" + ATTR_VALUE_1));

      // then
      NodeAssert.assertEqualsByName(found, CHILD_2_1_1_NODE);
   }
   
   @Test
   public void shouldNotFindNonExistingNode() throws Exception
   {
      // given
      Node root = createTree();
      
      // when
      Node found = RelativeGetSingleQuery.INSTANCE.execute(root, new Pattern("Non existing node"));

      // then
      Assert.assertNull(found);
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void shouldThrowExceptionWhenMoreThanOneNodeFound() throws Exception
   {
      // given
      Node root = new Node(ROOT_NODE).createChild(Patterns.from("/A/B/A/B")).getRoot();
      
      System.out.println(root.toString(true));
      // when
      Node found = RelativeGetSingleQuery.INSTANCE.execute(root, new Pattern("A"));

      // then
      Assert.assertNull(found);
   }

}
