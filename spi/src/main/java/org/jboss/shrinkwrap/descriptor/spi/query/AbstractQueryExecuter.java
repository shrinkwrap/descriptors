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
package org.jboss.shrinkwrap.descriptor.spi.query;

import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * AbstractExpression
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public abstract class AbstractQueryExecuter<T> implements QueryExecuter<T>
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private Query def;
   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   public AbstractQueryExecuter(Query def)
   {
      this.def = def;
   }
   
   /**
    * @return the definition
    */
   public Query getDefinition()
   {
      return def;
   }

   protected Node findRoot(Node child)
   {
      if(child.parent() == null)
      {
         return child;
      }
      Node root = null;
      do
      {
         root = child.parent();
      }
      while(root.parent() != null);
      
      return root;
    }
}
