package org.jboss.shrinkwrap.descriptor.spi.node.query.queries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.query.Pattern;

/**
 * Form of {@link GetQuery} for retrieving nodes matching
 * relative patterns like '//node1/node2'.
 * 
 * If no matches are found, <code>null</code> is returned.
 *
 * @author <a href="mailto:bartosz.majsak@gmail.com">Bartosz Majsak</a>
 */
public class GetRelativeQuery extends GetQuery
{
   
   @Override
   List<Node> findMatch(final Node start, final List<Pattern> patterns)
   {
      if (patterns.isEmpty())
      {
         return Collections.emptyList();
      }
      
      // Hold the matched Nodes
      final List<Node> matchedNodes = new ArrayList<Node>();

      // Get the next pattern in sequence
      final Pattern pattern = patterns.get(0);

      // See if we've got a match
      if (pattern.matches(start))
      {

         // If no more patterns to check, we're at the end of the line; just add this Node
         if (patterns.size() == 1)
         {
            matchedNodes.add(start);
            return matchedNodes;
         }
         
         for (final Node child : start.getChildren())
         {
            // Only use patterns that haven't already matched
            final List<Pattern> sub = patterns.subList(1, patterns.size());

            // Recursion point
            matchedNodes.addAll(findMatch(child, sub));
         }
         
      }
      
      // Apply whole pattern sequence
      // starting from the subtrees created by
      // node's children
      for (final Node child : start.getChildren())
      {
         matchedNodes.addAll(findMatch(child, patternSequence));
      }


      return matchedNodes;
   }

}
