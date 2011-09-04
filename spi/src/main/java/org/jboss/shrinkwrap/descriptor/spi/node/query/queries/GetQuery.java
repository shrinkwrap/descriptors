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

import java.util.Arrays;
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
 */
public abstract class GetQuery implements Query<List<Node>>
{

   protected List<Pattern> patternSequence;

   public static GetQuery relative()
   {
      return new GetRelativeQuery();
   }

   public static GetQuery absolute()
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
   abstract List<Node> findMatch(final Node start, final List<Pattern> patterns);


}
