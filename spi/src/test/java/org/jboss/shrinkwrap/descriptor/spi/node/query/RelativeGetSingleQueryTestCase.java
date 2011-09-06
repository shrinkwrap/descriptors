package org.jboss.shrinkwrap.descriptor.spi.node.query;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeAssert;
import org.jboss.shrinkwrap.descriptor.spi.node.query.queries.AbsoluteGetSingleQuery;
import org.jboss.shrinkwrap.descriptor.spi.node.query.queries.RelativeGetSingleQuery;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @version $Revision: $
 */
public class RelativeGetSingleQueryTestCase extends QueryTestCaseBase
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
   

}
