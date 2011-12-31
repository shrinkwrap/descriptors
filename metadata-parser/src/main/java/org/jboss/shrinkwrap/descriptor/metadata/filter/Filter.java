package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.w3c.dom.traversal.TreeWalker;

public interface Filter
{
   public boolean filter(final Metadata metadata, final TreeWalker walker);
}
