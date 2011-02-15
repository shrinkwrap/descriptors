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

import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.Node;
import org.jboss.shrinkwrap.descriptor.api.query.Query;
import org.jboss.shrinkwrap.descriptor.api.query.NodeQuery;

/**
 * CreateExpression
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class CreateQuery extends AbstractQueryExecuter<Node>
{
   /**
    * @param isAbsolute
    * @param paths
    */
   public CreateQuery(Query def)
   {
      super(def);
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.Expression#execute(org.jboss.shrinkwrap.descriptor.api.Node)
    */
   @Override
   public Node execute(Node node)
   {
      Query def = getDefinition();
      Node start = def.isAbsolute() ? findRoot(node):node;

      Node previous = start;
      for(NodeQuery nodeDef : def.getDefinitions())
      {
         previous = new Node(nodeDef.name(), previous);
         for(Map.Entry<String, String> entry : nodeDef.attributes().entrySet())
         {
            previous.attribute(entry.getKey(), entry.getValue());
         }
      }
      return previous;
   }
}
