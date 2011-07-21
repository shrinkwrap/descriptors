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

import java.util.HashMap;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * A query that may be executed against a {@link Node} to 
 * determine pattern matching
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public final class NodeQuery
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private final Map<String, String> attributes = new HashMap<String, String>();

   private final String name;

   private String text;
   
   //-------------------------------------------------------------------------------------||
   // Constructors -----------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||
   
   public NodeQuery(final String name)
   {
      this.name = name;
   }

   @Override
   public String toString()
   {
      return "NodeQuery [attributes=" + attributes + ", name=" + name + ", text=" + text + "]";
   }

   /**
    * The node name
    * 
    * @return
    */
   public String name() 
   {
      return name;
   }
   
   //-------------------------------------------------------------------------------------||
   // Attributes -------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Add or override a named attribute.<br/>
    * <br/>
    * value will be converted to String using String.valueOf(value);
    * 
    * @param name The attribute name
    * @param value The given value
    * @return This Node
    * @see #attribute(String, String)
    */
   public NodeQuery attribute(final String name, final Object value)
   {
      return attribute(name, String.valueOf(value));
   }

   /**
    * Add or override a named attribute.<br/>
    * 
    * @param name The attribute name
    * @param value The given value
    * @return This Node
    */
   public NodeQuery attribute(final String name, final String value)
   {
      getAttributes().put(name, value);
      return this;
   }

   /**
    * Get all defined attributes for this Node.
    * 
    * @return All defined attributes.
    */
   public Map<String, String> getAttributes()
   {
      return attributes;
   }
   
   public boolean matches(final Node node)
   {
      if(!name.equals(node.name()))
      {
         return false;
      }
      if((text != null && node.text() == null)
         || (text != null && !text.trim().equals(node.text().trim())))
      {
         return false;
      }
      if(attributes != null)
      {
         for(Map.Entry<String, String> attribute : attributes.entrySet())
         {
            if(!attribute.getValue().equals(node.getAttribute(attribute.getKey())))
            {
               return false;
            }
         }
      }
      return true;
   }

   /**
    * The node text to match
    */
   public NodeQuery text(final String text)
   {
      this.text = text;
      return this;
   }

   /**
    * Get the node text query
    */
   public String getText()
   {
      return text;
   }
}
