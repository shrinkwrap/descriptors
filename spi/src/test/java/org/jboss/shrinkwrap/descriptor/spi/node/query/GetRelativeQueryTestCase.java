package org.jboss.shrinkwrap.descriptor.spi.node.query;

import static org.jboss.shrinkwrap.descriptor.spi.node.query.TestTreeBuilder.ATTR_NAME;
import static org.jboss.shrinkwrap.descriptor.spi.node.query.TestTreeBuilder.ATTR_VALUE_1;
import static org.jboss.shrinkwrap.descriptor.spi.node.query.TestTreeBuilder.ATTR_VALUE_2;
import static org.jboss.shrinkwrap.descriptor.spi.node.query.TestTreeBuilder.CHILD_1_1_NODE;
import static org.jboss.shrinkwrap.descriptor.spi.node.query.TestTreeBuilder.CHILD_2_1_1_NODE;
import static org.jboss.shrinkwrap.descriptor.spi.node.query.TestTreeBuilder.CHILD_2_1_NODE;
import static org.jboss.shrinkwrap.descriptor.spi.node.query.TestTreeBuilder.OTHER_NAME;
import static org.jboss.shrinkwrap.descriptor.spi.node.query.TestTreeBuilder.ROOT_NODE;
import static org.jboss.shrinkwrap.descriptor.spi.node.query.TestTreeBuilder.createTree;

import java.util.List;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeAssert;
import org.jboss.shrinkwrap.descriptor.spi.node.query.queries.GetQuery;
import org.junit.Test;

public class GetRelativeQueryTestCase
{

   @Test
   public void shouldReturnRootFromSingleNodeTreeWhenMatchingNodeName()
   {
      // given
      Node root = new Node(ROOT_NODE);
      
      // when
      List<Node> matchingNodes = GetQuery.relative().execute(root, new Pattern(ROOT_NODE));
      
      // then
      Assert.assertEquals("Should return only one node", 1, matchingNodes.size());
      Assert.assertEquals("Should find only root node", root, matchingNodes.get(0));
   }
   
   @Test
   public void shouldReturnTwoNodesMatchingGivenNamePattern()
   {
      // given
      Node root = createTree();
                        
      // when
      List<Node> matchingNodes = GetQuery.relative().execute(root, new Pattern(CHILD_2_1_NODE));
      
      // then
      Assert.assertEquals("Should return two nodes", 2, matchingNodes.size());
      NodeAssert.assertEqualsByName(matchingNodes, CHILD_2_1_NODE);
   }
   
   @Test
   public void shouldReturnOneLeafNodesMatchingGivenNamePattern()
   {
      // given
      Node root = createTree();
                        
      // when
      List<Node> matchingNodes = GetQuery.relative().execute(root, new Pattern(CHILD_1_1_NODE));
      
      // then
      Assert.assertEquals("Should find exactly one node.", 1, matchingNodes.size());
      NodeAssert.assertEqualsByName(matchingNodes, CHILD_1_1_NODE);
   }
   
   @Test
   public void shouldReturnTwoNodesMatchingGivenNameAndAttributePattern()
   {
      // given
      Node root = createTree();
      Pattern pattern = new Pattern(CHILD_2_1_1_NODE);
      pattern.attribute(OTHER_NAME, ATTR_VALUE_1);
                        
      // when
      List<Node> matchingNodes = GetQuery.relative().execute(root, pattern);
      
      // then
      Assert.assertEquals("Should return two nodes", 2, matchingNodes.size());
      NodeAssert.assertEqualsByName(matchingNodes, CHILD_2_1_1_NODE);
      NodeAssert.assertContainsAttribute(matchingNodes, OTHER_NAME, ATTR_VALUE_1);
   }
   
   @Test
   public void shouldReturnTwoNodesMatchingGivenTwoPatterns()
   {
      // given
      Node root = createTree();
      Pattern endPatternWithAttribute = new Pattern(CHILD_2_1_1_NODE);
      endPatternWithAttribute.attribute(OTHER_NAME, ATTR_VALUE_1);
                        
      // when
      List<Node> matchingNodes = GetQuery.relative().execute(root, new Pattern(CHILD_2_1_NODE), endPatternWithAttribute);
      
      // then
      Assert.assertEquals("Should return two nodes", 2, matchingNodes.size());
      NodeAssert.assertEqualsByName(matchingNodes, CHILD_2_1_1_NODE);
      NodeAssert.assertContainsAttribute(matchingNodes, OTHER_NAME, ATTR_VALUE_1);
   }
   
   @Test
   public void shouldReturnOneNodeMatchingUniquePattern()
   {
      // given
      Node root = createTree();
                        
      // when
      List<Node> matchingNodes = GetQuery.relative().execute(root, new Pattern(CHILD_2_1_NODE).attribute(ATTR_NAME, ATTR_VALUE_2), 
               new Pattern(CHILD_2_1_1_NODE).attribute(OTHER_NAME, ATTR_VALUE_1));
      
      // then
      Assert.assertEquals("Should return two nodes", 1, matchingNodes.size());
      NodeAssert.assertEqualsByName(matchingNodes, CHILD_2_1_1_NODE);
      NodeAssert.assertContainsAttribute(matchingNodes, OTHER_NAME, ATTR_VALUE_1);
   }
   
}
