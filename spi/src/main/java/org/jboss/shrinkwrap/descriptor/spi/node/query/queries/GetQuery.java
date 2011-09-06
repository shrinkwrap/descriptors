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
import org.jboss.shrinkwrap.descriptor.spi.node.query.matcher.AbsolutePathMatcher;
import org.jboss.shrinkwrap.descriptor.spi.node.query.matcher.PathMatcher;
import org.jboss.shrinkwrap.descriptor.spi.node.query.matcher.RelativePathMatcher;

/**
 * Obtains the {@link List} of {@link Node}s
 * designated by the specified {@link Pattern}s under the
 * specified root {@link Node}.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 * @author <a href="mailto:bartosz.majsak@gmail.com">Bartosz Majsak</a>
 */
public final class GetQuery implements Query<List<Node>>
{

   private final PathMatcher pathMatcher;
   
   private GetQuery(PathMatcher pathMatcher)
   {
      this.pathMatcher = pathMatcher;
   }
   
   /**
    * Creates form of {@link GetQuery} for retrieving nodes matching
    * relative patterns like '//node1/node2[@attr=value]'. Sequence
    * of patterns must much a path from the root, where i-th
    * pattern matches i-th element on the path from the root.
    * 
    * @see {@link RelativePathMatcher}
    * @return 
    */
   public static GetQuery relative()
   {
      return new GetQuery(new RelativePathMatcher());
   }

   /**
    * Creates form of {@link GetQuery} for retrieving nodes matching
    * absolute patterns like '/root/node1/node2'. Sequence
    * of patterns must much a path from the root, where i-th
    * pattern matches i-th element on the path from the root.
    * 
    * @see {@link AbsolutePathMatcher}
    * @return 
    */
   public static GetQuery absolute()
   {
      return new GetQuery(new AbsolutePathMatcher());
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

      // Delegate to recursive handler, starting at the top
      return pathMatcher.findMatchingNodes(node, Arrays.asList(patterns));
   }

   
}
