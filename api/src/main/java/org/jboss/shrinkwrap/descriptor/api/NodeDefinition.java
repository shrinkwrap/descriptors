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
package org.jboss.shrinkwrap.descriptor.api;

import java.util.HashMap;
import java.util.Map;

/**
 * NodeDefinition
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class NodeDefinition
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private Map<String, String> attributes;

   private String name;
   
   //-------------------------------------------------------------------------------------||
   // Constructors -----------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||
   
   public NodeDefinition(String name)
   {
      this.name = name;
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
   public NodeDefinition attribute(String name, Object value)
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
   public NodeDefinition attribute(String name, String value)
   {
      attributes().put(name, value);
      return this;
   }

   /**
    * Get all defined attributes for this Node.
    * 
    * @return All defined attributes.
    */
   public Map<String, String> attributes()
   {
      if(attributes == null)
      {
         attributes = new HashMap<String, String>();
      }
      return attributes;
   }
   
   public boolean matches(Node node)
   {
      if(!name.equals(node.name()))
      {
         return false;
      }
      if(attributes != null)
      {
         for(Map.Entry<String, String> attribute : attributes.entrySet())
         {
            if(!attribute.getValue().equals(node.attribute(attribute.getKey())))
            {
               return false;
            }
         }
      }
      return true;
   }
}
