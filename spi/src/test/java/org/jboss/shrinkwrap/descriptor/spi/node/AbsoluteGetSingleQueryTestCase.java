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

import static org.jboss.shrinkwrap.descriptor.spi.testutils.TestTreeBuilder.ATTR_NAME;
import static org.jboss.shrinkwrap.descriptor.spi.testutils.TestTreeBuilder.ATTR_VALUE_1;
import static org.jboss.shrinkwrap.descriptor.spi.testutils.TestTreeBuilder.CHILD_1_1_NODE;
import static org.jboss.shrinkwrap.descriptor.spi.testutils.TestTreeBuilder.CHILD_1_NODE;
import static org.jboss.shrinkwrap.descriptor.spi.testutils.TestTreeBuilder.CHILD_2_1_NODE;
import static org.jboss.shrinkwrap.descriptor.spi.testutils.TestTreeBuilder.CHILD_2_NODE;
import static org.jboss.shrinkwrap.descriptor.spi.testutils.TestTreeBuilder.CHILD_3_NODE;
import static org.jboss.shrinkwrap.descriptor.spi.testutils.TestTreeBuilder.CHILD_3_TEXT;
import static org.jboss.shrinkwrap.descriptor.spi.testutils.TestTreeBuilder.ROOT_NODE;
import static org.jboss.shrinkwrap.descriptor.spi.testutils.TestTreeBuilder.createTree;
import junit.framework.Assert;

import org.junit.Test;

/**
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @version $Revision: $
 */
public class AbsoluteGetSingleQueryTestCase
{

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotAllowNullNode()
   {
      // given
      Node root = new Node(ROOT_NODE);
      
      // when
      Node matchingNode = AbsoluteGetSingleQuery.INSTANCE.execute(null, new Pattern(ROOT_NODE));
      
      // then
      // exception should be thrown
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void shouldNotAllowNullPatternSequencToBeUsedForMatching()
   {
      // given
      Node root = new Node(ROOT_NODE);
      
      // when
      Node matchingNode = AbsoluteGetSingleQuery.INSTANCE.execute(root, null);
      
      // then
      // exception should be thrown
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void shouldNotAllowEmptyPatternSequencToBeUsedForMatching()
   {
      // given
      Node root = new Node(ROOT_NODE);
      
      // when
      Node matchingNode = AbsoluteGetSingleQuery.INSTANCE.execute(root, new Pattern[]{});
      
      // then
      // exception should be thrown
   }
   
   @Test
   public void shouldBeAbleToFindAChildWithTextValueUsingAbsoluteQuery() throws Exception
   {
      // given
      Node root = createTree();
      
      // when
      Node found = AbsoluteGetSingleQuery.INSTANCE.execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));

      
      // then
      Assert.assertEquals(
               "Verify correct node found",
               CHILD_3_NODE, found.getName());
      Assert.assertEquals(
               "Verify correct node value",
               CHILD_3_TEXT, found.getText());
   }
   
   @Test
   public void shouldBeAbleToFindAExpressedChild() throws Exception
   {
      Node root = createTree();
      System.out.println(root.toString(true));
      Node found = AbsoluteGetSingleQuery.INSTANCE.execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_1_NODE + "/" + CHILD_1_1_NODE));
      
      Assert.assertNotNull("Verify a node as found", found);
      
      Assert.assertEquals(
            "Verify correct node found",
            CHILD_1_1_NODE, found.getName());      
   }
   
   @Test
   public void shouldBeAbleToFindAExpressedFromRoot() throws Exception
   {
      Node root = createTree();
      System.out.println(root.toString(true));
      Node found = AbsoluteGetSingleQuery.INSTANCE.execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_1_NODE + "/" + CHILD_1_1_NODE));
      
      Assert.assertNotNull("Verify a node was found", found);
      
      Assert.assertEquals(
            "Verify correct node found",
            CHILD_1_1_NODE, found.getName());      
   }

   @Test
   public void shouldBeAbleToFindAExpressedFromRootWithExpression() throws Exception
   {
      Node root = createTree();
      Node found = AbsoluteGetSingleQuery.INSTANCE.execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_2_NODE + "/" + CHILD_2_1_NODE + "@" + ATTR_NAME + "=" + ATTR_VALUE_1));
      
      System.out.println(root.toString(true));
      Assert.assertNotNull("Verify a node was found", found);
      
      Assert.assertEquals(
            "Verify correct node found",
            CHILD_2_1_NODE, found.getName());      

      Assert.assertEquals(
            "Verify correct node found",
            ATTR_VALUE_1, found.getAttribute(ATTR_NAME));      
   }


   
   @Test
   public void shouldBeAbleToGetNodeWithTextValues()
   {
      Node root = new Node(ROOT_NODE);
      root.getOrCreate(("/" + CHILD_2_NODE));
      root.getOrCreate(("/" + CHILD_3_NODE));
      root.getOrCreate(("/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));
      root.getOrCreate(("/" + CHILD_3_NODE + "=" + CHILD_3_TEXT + "diff"));

      Node found = AbsoluteGetSingleQuery.INSTANCE.execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));

      Assert.assertNotNull("Verify node was found", found);
      
      Assert.assertEquals(
               "Verify correct node created",
               CHILD_3_NODE, found.getName());

      Assert.assertEquals(
               "Verify correct value set",
               CHILD_3_TEXT, found.getText());

      Assert.assertEquals(
               "Verify root only has four children",
               4, root.getChildren().size());
   }

}
