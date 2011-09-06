/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.query.Pattern;
import org.jboss.shrinkwrap.descriptor.spi.node.query.Query;

/**
 * Form of {@link GetQuery} for retrieving nodes matching
 * absolute patterns like '/root/node1/node2'. Sequence
 * of patterns must much a path from the root, where i-th
 * pattern matches i-th element on the path from the root.
 * 
 * If no matches are found, <code>null</code> is returned.
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum AbsoluteGetQuery implements Query<List<Node>> {
   INSTANCE;

   /**
    * Query used
    */
   private static final GetQuery delegate = GetQuery.absolute();

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.spi.node.query.Query#execute(org.jboss.shrinkwrap.descriptor.spi.node.Node, org.jboss.shrinkwrap.descriptor.spi.node.query.Pattern[])
    */
   @Override
   public List<Node> execute(final Node node, final Pattern... patterns) throws IllegalArgumentException
   {
      return delegate.execute(node, patterns);
   }
}
