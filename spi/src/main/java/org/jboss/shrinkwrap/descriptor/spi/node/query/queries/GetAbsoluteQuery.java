package org.jboss.shrinkwrap.descriptor.spi.node.query.queries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.query.Pattern;

/**
 * Form of {@link GetQuery} for retrieving nodes matching
 * absolute patterns like '/root/node1/node2'. Sequence
 * of patterns must much a path from the root, where i-th
 * pattern matches i-th element on the path from the root.
 * 
 * If no matches are found, <code>null</code> is returned.
 *
 * @author <a href="mailto:bartosz.majsak@gmail.com">Bartosz Majsak</a>
 */
public class GetAbsoluteQuery extends GetQuery
{

   @Override
   List<Node> findMatch(Node start, List<Pattern> patterns)
   {
      if (patterns.isEmpty())
      {
         return Collections.emptyList();
      }
      
      // Get the next pattern in sequence
      final Pattern pattern = patterns.get(0);
      
      if (!pattern.matches(start))
      {
         return Collections.emptyList();
      }

      // Hold the matched Nodes
      final List<Node> matchedNodes = new ArrayList<Node>();

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
      
      return matchedNodes;
   }

   
}
