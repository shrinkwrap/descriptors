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
package org.jboss.shrinkwrap.descriptor.spi.node;

import java.util.List;

/**
 * Form of {@link GetQuery} used as a convenience to retrieve a single result. If more than one match is found,
 * {@link IllegalArgumentException} will be thrown. If no matches are found, <code>null</code> is returned.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
enum AbsoluteGetSingleQuery implements Query<Node> {

    INSTANCE;

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.shrinkwrap.descriptor.spi.node.Query#execute(org.jboss.shrinkwrap.descriptor.spi.node.Node,
     *      org.jboss.shrinkwrap.descriptor.spi.node.Pattern[])
     */
    @Override
    public Node execute(final Node node, final Pattern... patterns) {
        // Precondition checks
        QueryUtil.validateNodeAndPatterns(node, patterns);

        final List<Node> nodes = AbsoluteGetQuery.INSTANCE.execute(node, patterns);

        if (nodes == null || nodes.isEmpty()) {
            return null;
        }
        if (nodes.size() > 1) {
            throw new IllegalArgumentException("Multiple nodes matching expression found");
        }
        return nodes.get(0);
    }

}
