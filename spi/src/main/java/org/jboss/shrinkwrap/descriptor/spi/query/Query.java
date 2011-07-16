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

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public final class Query
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||
   
   private boolean isAbsolute = false;

   private List<NodeQuery> definitions;
   
   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||
   
   public Query(boolean isAbsolute)
   {
      this.isAbsolute = isAbsolute;
      this.definitions = new ArrayList<NodeQuery>();
   }

   @Override
   public String toString()
   {
      return "Query [isAbsolute=" + isAbsolute + ", definitions=" + definitions + "]";
   }

   /**
    * @return
    */
   public List<NodeQuery> getDefinitions()
   {
      return definitions;
   }
   
   public void addDefinition(final NodeQuery def)
   {
      getDefinitions().add(def);
   }
   
   /**
    * @return the isAbsolute
    */
   public boolean isAbsolute()
   {
      return isAbsolute;
   }
}
