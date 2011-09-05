package org.jboss.shrinkwrap.descriptor.spi.node.query;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeAssert;
import org.jboss.shrinkwrap.descriptor.spi.node.query.queries.GetSingleQuery;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @version $Revision: $
 */
public class GetSingleQueryTestCase extends QueryTestCaseBase
{

   @Test
   public void shouldBeAbleToFindAChildWithTextValueUsingRelativeQuery() throws Exception
   {
      // given
      Node root = createTree();
      System.out.println(root.toString(true));
      
      // when
      Node found = GetSingleQuery.relative().execute(root, Patterns.from(CHILD_3_NODE + "=" + CHILD_3_TEXT));

      
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
      Node found = GetSingleQuery.relative().execute(root, pattern);

      // then
      NodeAssert.assertEqualsByName(found, CHILD_2_1_1_NODE);
   }
   
   @Test
   public void shouldBeAbleToFindANodeUsingMultiPatternRelativeQuery() throws Exception
   {
      // given
      Node root = createTree();
      
      // when
      Node found = GetSingleQuery.relative().execute(root, Patterns.from("/" + CHILD_2_1_NODE + "/" + CHILD_2_1_1_NODE + "@" + ATTR_NAME + "=" + ATTR_VALUE_1));

      // then
      NodeAssert.assertEqualsByName(found, CHILD_2_1_1_NODE);
   }
   
   @Test
   public void shouldBeAbleToFindAChildWithTextValueUsingAbsoluteQuery() throws Exception
   {
      // given
      Node root = createTree();
      System.out.println(root.toString(true));
      
      // when
      Node found = GetSingleQuery.absolute().execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));

      
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
      Node found = root.getSingle(CHILD_1_NODE + "/" + CHILD_1_1_NODE);
      
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
      Node found = GetSingleQuery.absolute().execute(root, Patterns.from("/" + ROOT_NODE + "/" + CHILD_1_NODE + "/" + CHILD_1_1_NODE));
      
      Assert.assertNotNull("Verify a node was found", found);
      
      Assert.assertEquals(
            "Verify correct node found",
            CHILD_1_1_NODE, found.getName());      
   }

   @Test
   public void shouldBeAbleToFindAExpressedFromRootWithExpression() throws Exception
   {
      Node root = createTree();
      Node found = root.getSingle("/" + CHILD_2_NODE + "/" + CHILD_2_1_NODE + "@" + ATTR_NAME + "=" + ATTR_VALUE_1);
      
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

      Node found = root.getSingle(("/" + CHILD_3_NODE + "=" + CHILD_3_TEXT));

      Assert.assertNotNull("Verify node was found", found);
      
      System.out.println(found.toString(true));
      
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
