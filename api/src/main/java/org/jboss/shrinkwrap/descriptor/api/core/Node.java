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
package org.jboss.shrinkwrap.descriptor.api.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Node
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class Node
{
   private Node parent;
   
   private List<Node> children;
   
   private String name;
   
   private Map<String, String> attributes;
   
   private String text;
   
   public Node(String name) 
   {
      this(name, null);
   }
   
   public Node(String name, Node parent)
   {
      this.name = name;
      this.parent = parent;
   }
   
   public Node text(String text)
   {
      this.text = text;
      return this;
   }
   
   public Node attribute(String name, String value)
   {
      getAttributes().put(name, value);
      return this;
   }

   public Node newChild(String name)
   {
      Node child = new Node(name, this);
      getChildren().add(child);
      return child;
   }
   
   public Node child(String name)
   {
      for(Node child : getChildren())
      {
         if(child.getName().equals(name))
         {
            return child;
         }
      }
      return newChild(name);
   }

   public String getName()
   {
      return name;
   }
   
   public Node getParent()
   {
      return parent;
   }
   
   public List<Node> getChildren()
   {
      if(children == null)
      {
         children = new ArrayList<Node>();
      }
      return children;
   }
   
   public Map<String, String> getAttributes()
   {
      if(attributes == null)
      {
         attributes = new HashMap<String, String>();
      }
      return attributes;
   }
   
   public String getText()
   {
      return text;
   }
   
   @Override
   public String toString()
   {
      return "Node[" + name + "] " + 
               (children != null ? children.size():0) + " children " + 
               (attributes != null ? "attributes[" + attributes + "]":""); 
   }
}
