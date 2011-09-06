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
package org.jboss.shrinkwrap.descriptor.spi.node.query.queries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.query.Pattern;
import org.jboss.shrinkwrap.descriptor.spi.node.query.Query;

/**
 * Obtains the {@link List} of {@link Node}s
 * designated by the specified {@link Pattern}s under the
 * specified root {@link Node}.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 * @author <a href="mailto:bartosz.majsak@gmail.com">Bartosz Majsak</a>
 */
abstract class GetQuery implements Query<List<Node>>
{

   protected List<Pattern> patternSequence;

   /**
    * Returns a new instance of {@link GetRelativeQuery}.
    * @see {@link AbsoluteGetQuery#INSTANCE}
    * @return
    */
   static GetQuery relative()
   {
      return new GetRelativeQuery();
   }

   /**
    * Returns a new instance of {@link GetAbsoluteQuery}.
    * @see {@link AbsoluteGetQuery#INSTANCE}
    * @return
    */
   static GetQuery absolute()
   {
      return new GetAbsoluteQuery();
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.spi.node.query.Query#execute(org.jboss.shrinkwrap.descriptor.spi.node.Node, org.jboss.shrinkwrap.descriptor.spi.node.query.Pattern[])
    */
   @Override
   public List<Node> execute(final Node node, final Pattern... patterns)
   {
      // Precondition checks
      QueryUtil.validateNodeAndPatterns(node, patterns);

      // Represent as a list
      patternSequence = Arrays.asList(patterns);

      // Delegate to recursive handler, starting at the top
      return findMatch(node, patternSequence);
   }

   /**
    * Returns all {@link Node}s descendants matching the specified {@link Pattern}s
    * 
    * @param start Root of the tree
    * @param patterns XPath-like set of patterns to match against the given tree
    * @return
    */
   protected abstract List<Node> findMatch(final Node start, final List<Pattern> patterns);

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
   private static class GetAbsoluteQuery extends GetQuery
   {

      @Override
      protected List<Node> findMatch(Node start, List<Pattern> patterns)
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

   /**
    * Form of {@link GetQuery} for retrieving nodes matching
    * relative patterns like '//node1/node2'.
    * 
    * If no matches are found, <code>null</code> is returned.
    *
    * @author <a href="mailto:bartosz.majsak@gmail.com">Bartosz Majsak</a>
    */
   private static class GetRelativeQuery extends GetQuery
   {
      
      @Override
      protected List<Node> findMatch(final Node start, final List<Pattern> patterns)
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
   
}
