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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A Node is a 
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class Node
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private Node parent;
   
   private List<Node> children;
   
   private String name;
   
   private Map<String, String> attributes;
   
   private String text;
   
   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Create a root node.
    * 
    * @param name The name of the node
    */
   public Node(String name) 
   {
      this(name, null);
   }
   
   /**
    * Create a node in the tree.
    * 
    * @param name The name of the node
    * @param parent The parent node
    */
   public Node(String name, Node parent)
   {
      this.name = name;
      this.parent = parent;
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
   public Node attribute(String name, Object value)
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
   public Node attribute(String name, String value)
   {
      attributes().put(name, value);
      return this;
   }

   /**
    * Get a named attribute.<br/>
    * 
    * @param name The attribute name
    * @return The attribute value or null of none defined.
    */
   public String attribute(String name)
   {
      return attributes().get(name);
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
   
   //-------------------------------------------------------------------------------------||
   // Node creation / retrieval ----------------------------------------------------------||
   //-------------------------------------------------------------------------------------||
   
   /**
    * Create a new Node with given name. <br/>
    * <br/>
    * The new Node will have this as parent.
    * 
    * @param name The name of the node.
    * @return A new child node
    */
   public Node create(String name)
   {
      Node child = new Node(name, this);
      children().add(child);
      return child;
   }
   
   /**
    * Get or create a named child node. <br/>
    * <br/>
    * If a named node is found using {@link #getSingle(String)} it is returned,
    * else a new child node is created.
    * 
    * @param name The child node name.
    * @return The existing node or a new node, never null.
    * @see #getSingle(String)
    * @see #create(String)
    * @throws IllegalArgumentException if multiple children with name exists.
    */
   public Node getOrCreate(String name)
   {
      Node child = getSingle(name);
      if(child != null)
      {
         return child;
      }
      return create(name);
   }

   /**
    * Get a single child node.<br/>
    * <br/>
    * If multiple children are found with same name it is considered a IllegalArgumentException.
    * 
    * @param name The child node name
    * @return The named child node or null if non found
    * @throws IllegalArgumentException if multiple children with name exists.
    */
   public Node getSingle(String name)
   {
      List<Node> children = get(name);
      if(children.size() == 0)
      {
         return null;
      }
      if(children.size() > 1)
      {
         throw new IllegalArgumentException("Multiple child nodes found with name: " + name);
      }
      return children.get(0);
   }
   
   /**
    * Get all children with a specific name.
    * 
    * @param name The child node name.
    * @return All found children, or empty list if none found.
    */
   public List<Node> get(String name)
   {
      List<Node> namedChildren = new ArrayList<Node>();
      for(Node child : children())
      {
         if(child.name().equals(name))
         {
            namedChildren.add(child);
         }
      }
      return namedChildren;
   }
   
   //-------------------------------------------------------------------------------------||
   // Local data -------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Set the Nodes text body.<br/>
    * <br/>
    * text will be converted to String using String.valueOf(text);
    * 
    * @param text
    * @return
    * @see #text(String)
    */
   public Node text(Object text)
   {
      return text(String.valueOf(text));
   }

   /**
    * Set the Nodes text body.
    * 
    * @param text The text content
    * @return This
    */
   public Node text(String text)
   {
      this.text = text;
      return this;
   }
   
   /**
    * Get the Nodes text body.
    * 
    * @return Set body or null if none.
    */
   public String text()
   {
      return text;
   }

   /**
    * Get the Nodes name.
    * 
    * @return Given name.
    */
   public String name()
   {
      return name;
   }
   
   /**
    * Get the Nodes parent.
    * 
    * @return The given parent or null if root node.
    */
   public Node parent()
   {
      return parent;
   }
   
   /**
    * Get all the defined children for this node.
    * 
    * @return All children or empty list if none.
    */
   public List<Node> children()
   {
      if(children == null)
      {
         children = new ArrayList<Node>();
      }
      return children;
   }

   //-------------------------------------------------------------------------------------||
   // Override ---------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Override
   public String toString()
   {
      return "Node[" + name + "] " + 
               (attributes != null ? "attributes[" + attributes + "]":"") + 
               (children != null ? children.size():0) + " children "; 
   }
}
