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
package org.jboss.shrinkwrap.descriptor.api.query;

import java.util.List;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.junit.Test;


/**
 * ExpressionTestCase
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @version $Revision: $
 */
public class QueryTestCase
{
   private static final String ATTR_NAME = "attr_name";
   private static final String ROOT_NODE = "root";
   private static final String CHILD_1_NODE = "child-1";
   private static final String CHILD_1_1_NODE = "child-1.1";
   private static final String CHILD_1_2_NODE = "child-1.2";
   private static final String CHILD_2_NODE = "child-2";
   private static final String CHILD_2_1_NODE = "child-2.1";
   private static final String CHILD_2_2_NODE = "child-2.2";
   private static final String CHILD_3_TEXT = "child-3-text";
   private static final String CHILD_3_NODE = "child-3";

   @Test
   public void shouldBeAbleToFindAChildWithTextValue() throws Exception
   {
      Node root = createTree();
      Node found = root.getSingle(CHILD_3_NODE + "=" + CHILD_3_TEXT);

      Assert.assertNotNull("Verify a node as found", found);

      Assert.assertEquals(
               "Verify correct node found",
               CHILD_3_NODE, found.name());
      Assert.assertEquals(
               "Verify correct node value",
               CHILD_3_TEXT, found.text());
   }
   
   @Test
   public void shouldBeAbleToFindAExpressedChild() throws Exception
   {
      Node root = createTree();
      Node found = root.getSingle(CHILD_1_NODE + "/" + CHILD_1_1_NODE);
      
      Assert.assertNotNull("Verify a node as found", found);
      
      Assert.assertEquals(
            "Verify correct node found",
            CHILD_1_1_NODE, found.name());      
   }
   
   @Test
   public void shouldBeAbleToFindAExpressedFromRoot() throws Exception
   {
      Node root = createTree();
      Node found = root.getSingle("/" + ROOT_NODE + "/" + CHILD_1_NODE + "/" + CHILD_1_1_NODE);
      
      Assert.assertNotNull("Verify a node was found", found);
      
      Assert.assertEquals(
            "Verify correct node found",
            CHILD_1_1_NODE, found.name());      
   }

   @Test
   public void shouldBeAbleToFindAExpressedFromRootWithExpression() throws Exception
   {
      Node root = createTree();
      Node found = root.getSingle("/" + ROOT_NODE + "/" + CHILD_2_NODE + "/" + CHILD_2_1_NODE + "@" + ATTR_NAME + "=" + CHILD_2_2_NODE);
      
      Assert.assertNotNull("Verify a node was found", found);
      
      Assert.assertEquals(
            "Verify correct node found",
            CHILD_2_1_NODE, found.name());      

      Assert.assertEquals(
            "Verify correct node found",
            CHILD_2_2_NODE, found.attribute(ATTR_NAME));      
   }

   @Test
   public void shouldBeAbleToCreateOrGetNodes()
   {
      Node root = new Node(ROOT_NODE);
      root.create(CHILD_2_NODE);
      
      Node created = root.getOrCreate(("/" + ROOT_NODE + "/" + CHILD_2_NODE + "/" + CHILD_2_1_NODE + "@" + ATTR_NAME + "=" + CHILD_2_2_NODE));
      
      Assert.assertNotNull("Verify a node was created", created);
      
      Assert.assertEquals(
            "Verify correct node created",
            CHILD_2_1_NODE, created.name());      

      Assert.assertEquals(
            "Verify correct node created",
            CHILD_2_2_NODE, created.attribute(ATTR_NAME));      
   
      Assert.assertEquals(
            "Verify root only has one child node",
            1, root.children().size());
   }

   @Test
   public void shouldBeAbleToCreateOrGetNodesWithTextValues()
   {
      Node root = new Node(ROOT_NODE);
      root.create(CHILD_3_NODE);

      Node created = root.getOrCreate(("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));

      Assert.assertNotNull("Verify a node was created", created);

      Assert.assertEquals(
               "Verify correct node created",
               CHILD_3_NODE, created.name());

      Assert.assertEquals(
               "Verify correct value set",
               CHILD_3_TEXT, created.text());

      Assert.assertEquals(
               "Verify root only has one child node",
               2, root.children().size());
   }

   @Test
   public void shouldBeAbleToGetNodesWithTextValues()
   {
      Node root = new Node(ROOT_NODE);
      root.getOrCreate(("/" + ROOT_NODE + "/" + CHILD_2_NODE));
      root.getOrCreate(("/" + ROOT_NODE + "/" + CHILD_3_NODE));
      root.getOrCreate(("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));
      root.getOrCreate(("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT + "diff"));

      List<Node> nodes = root.get(("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));

      Assert.assertNotNull("Verify nodes were found", nodes);
      
      Assert.assertEquals("Verify found a single node", 1, nodes.size());

      Node found = nodes.get(0);
      Assert.assertEquals(
               "Verify correct node created",
               CHILD_3_NODE, found.name());

      Assert.assertEquals(
               "Verify correct value set",
               CHILD_3_TEXT, found.text());

      Assert.assertEquals(
               "Verify root only has four children",
               4, root.children().size());
   }
   
   @Test
   public void shouldBeAbleToGetNodeWithTextValues()
   {
      Node root = new Node(ROOT_NODE);
      root.getOrCreate(("/" + ROOT_NODE + "/" + CHILD_2_NODE));
      root.getOrCreate(("/" + ROOT_NODE + "/" + CHILD_3_NODE));
      root.getOrCreate(("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));
      root.getOrCreate(("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT + "diff"));

      Node found = root.getSingle(("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));

      Assert.assertNotNull("Verify node was found", found);
      
      Assert.assertEquals(
               "Verify correct node created",
               CHILD_3_NODE, found.name());

      Assert.assertEquals(
               "Verify correct value set",
               CHILD_3_TEXT, found.text());

      Assert.assertEquals(
               "Verify root only has four children",
               4, root.children().size());
   }
   
   private Node createTree()
   {
      Node root = new Node(ROOT_NODE);
      Node child1 = root.create(CHILD_1_NODE);

      child1.create(CHILD_1_1_NODE).attribute(ATTR_NAME, CHILD_1_1_NODE);
      child1.create(CHILD_1_2_NODE).attribute(ATTR_NAME, CHILD_1_2_NODE);
      
      Node child2 = root.create(CHILD_2_NODE);
      child2.create(CHILD_2_1_NODE).attribute(ATTR_NAME, CHILD_2_1_NODE);
      
      // same node name, but different attribute value
      child2.create(CHILD_2_1_NODE).attribute(ATTR_NAME, CHILD_2_2_NODE);
      
      root.create(CHILD_3_NODE).text(CHILD_3_TEXT);
      return root;
   }
}
