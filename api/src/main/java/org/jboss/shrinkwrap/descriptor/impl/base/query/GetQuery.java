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
package org.jboss.shrinkwrap.descriptor.impl.base.query;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Node;
import org.jboss.shrinkwrap.descriptor.api.query.Query;
import org.jboss.shrinkwrap.descriptor.api.query.NodeQuery;

/**
 * GetExpression
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class GetQuery extends AbstractQueryExecuter<List<Node>>
{
   /**
    * @param isAbsolute
    * @param paths
    */
   public GetQuery(Query def)
   {
      super(def);
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.Expression#execute(org.jboss.shrinkwrap.descriptor.api.Node)
    */
   @Override
   public List<Node> execute(Node node)
   {
      Query def = getDefinition();
      List<NodeQuery> nodeDefs = def.getDefinitions();

      Node current = def.isAbsolute() ? findRoot(node) : node;
      int startIndex = def.isAbsolute() ? 1 : 0;

      if (def.isAbsolute())
      {
         // match the first path with the 'root' node name.
         if (!nodeDefs.get(0).matches(current))
         {
            return null;
         }
      }
      
      return findMatch(current, nodeDefs.listIterator(startIndex));
   }
   
   private List<Node> findMatch(Node parent, Iterator<NodeQuery> definitions)
   {
      List<Node> nodes = new ArrayList<Node>();
      NodeQuery def = definitions.hasNext() ? definitions.next():null;
      if(def == null)
      {
         nodes.add(parent);
         return nodes;
      }
      for (Node child : parent.children())
      {
         if(def.matches(child))
         {
            nodes.addAll(findMatch(child, definitions));
         }
      }
      return nodes;
   }
}
