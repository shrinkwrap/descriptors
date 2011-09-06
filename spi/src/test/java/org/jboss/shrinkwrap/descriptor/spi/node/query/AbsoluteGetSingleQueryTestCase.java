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
package org.jboss.shrinkwrap.descriptor.spi.node.query;

import static org.jboss.shrinkwrap.descriptor.spi.node.query.TestTreeBuilder.*;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.query.queries.AbsoluteGetSingleQuery;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @version $Revision: $
 */
public class AbsoluteGetSingleQueryTestCase
{

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
