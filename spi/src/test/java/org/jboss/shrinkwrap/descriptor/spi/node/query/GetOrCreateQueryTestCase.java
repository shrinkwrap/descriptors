package org.jboss.shrinkwrap.descriptor.spi.node.query;

import java.util.List;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.query.queries.GetOrCreateQuery;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @version $Revision: $
 */
public class GetOrCreateQueryTestCase extends QueryTestCaseBase
{

   @Test
   public void shouldBeAbleToCreateOrGetNodes()
   {
      // given
      Node root = new Node(ROOT_NODE);
      root.createChild(CHILD_2_NODE);
      
      // when
      Node created = GetOrCreateQuery.create().execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_2_NODE + "/" + CHILD_2_1_NODE + "@" + ATTR_NAME + "=" + CHILD_2_2_NODE));
      log.info(root.toString(true));

      // then
      Assert.assertNotNull("Verify a node was created", created);
      
      Assert.assertEquals(
            "Verify correct node created",
            CHILD_2_1_NODE, created.getName());      

      Assert.assertEquals(
            "Verify correct node created",
            CHILD_2_2_NODE, created.getAttribute(ATTR_NAME));      
      
      Assert.assertEquals(
            "Verify node created has correct parent",
            CHILD_2_NODE, created.getParent().getName());      
   
      Assert.assertEquals(
            "Verify root only has one child node",
            1, root.getChildren().size());
   }

   @Test
   public void shouldBeAbleToCreateOrGetNodesWithTextValues()
   {
      // given
      Node root = new Node(ROOT_NODE);
      root.createChild(CHILD_3_NODE);

      // when
      Node created = GetOrCreateQuery.create().execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));
      log.info(root.toString(true));

      // then
      Assert.assertNotNull("Verify a node was created", created);

      Assert.assertEquals(
               "Verify correct node created",
               CHILD_3_NODE, created.getName());

      Assert.assertEquals(
               "Verify correct value set",
               CHILD_3_TEXT, created.getText());
      
      Assert.assertEquals(
            "Verify root only has two child nodes",
            2, root.getChildren().size());

      Assert.assertEquals("Created node has wrong parent",
               root,
               created.getParent());
   }

   @Test
   public void shouldBeAbleToGetNodesWithTextValues()
   {
      // given
      Node root = new Node(ROOT_NODE);
      GetOrCreateQuery.create().execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_2_NODE));
      GetOrCreateQuery.create().execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_3_NODE));
      GetOrCreateQuery.create().execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));
      GetOrCreateQuery.create().execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT + "diff"));

      // when
      List<Node> nodes = root.get("/" + CHILD_3_NODE + "=" + CHILD_3_TEXT);
      log.info(root.toString(true));
      
      // then
      Assert.assertNotNull("Verify nodes were found", nodes);
      
      Assert.assertEquals("Verify found a single node", 1, nodes.size());

      Node found = nodes.get(0);
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
   
   @Test
   public void shouldCreateTwoChildrenUsingGetOrCreateQueryWhenOnlyRootDefined()
   {
      // given
      Node root = new Node(ROOT_NODE);
      
      // when
      GetOrCreateQuery.create().execute(root, Patterns.from("/" + CHILD_1_NODE));
      GetOrCreateQuery.create().execute(root, Patterns.from("/" + CHILD_2_NODE));
      
      // then
      Assert.assertEquals("Should have two children created", 2, root.getChildren().size());
      
   }
   
}
