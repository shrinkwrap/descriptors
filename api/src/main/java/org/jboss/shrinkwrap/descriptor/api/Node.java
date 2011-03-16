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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.query.Queries;
import org.jboss.shrinkwrap.descriptor.api.query.Query;
import org.jboss.shrinkwrap.descriptor.impl.base.query.CreateQuery;
import org.jboss.shrinkwrap.descriptor.impl.base.query.GetOrCreateQuery;
import org.jboss.shrinkwrap.descriptor.impl.base.query.GetQuery;
import org.jboss.shrinkwrap.descriptor.impl.base.query.GetSingleQuery;

/**
 * A Node is a
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @version $Revision: $
 */
public class Node
{
   // -------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private final Node parent;

   private List<Node> children = new ArrayList<Node>();

   private final String name;

   private Map<String, String> attributes;

   private String text;

   // -------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

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

      if (this.parent != null)
      {
         this.parent.children.add(this);
      }
   }

   // -------------------------------------------------------------------------------------||
   // Attributes -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

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
      if (attributes == null)
      {
         attributes = new HashMap<String, String>();
      }
      return attributes;
   }

   // -------------------------------------------------------------------------------------||
   // Node creation / retrieval ----------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

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
      return create(Queries.from(name));
   }

   public Node create(Query query)
   {
      return new CreateQuery(query).execute(this);
   }

   /**
    * Get or create a named child node. <br/>
    * <br/>
    * If a named node is found using {@link #getSingle(String)} it is returned, else a new child node is created.
    * 
    * @param name The child node name.
    * @return The existing node or a new node, never null.
    * @see #getSingle(String)
    * @see #create(String)
    * @throws IllegalArgumentException if multiple children with name exists.
    */
   public Node getOrCreate(String name)
   {
      return getOrCreate(Queries.from(name));
   }

   public Node getOrCreate(Query query)
   {
      return new GetOrCreateQuery(query).execute(this);
   }

   /**
    * Get a single child node.<br/>
    * <br/>
    * If multiple children are found with same name it is considered a IllegalArgumentException.
    * 
    * @param name The child node name
    * @return The named child node or null if non found
    * @throws IllegalArgumentException if multiple children with name exist.
    */
   public Node getSingle(String name)
   {
      return getSingle(Queries.from(name));
   }

   public Node getSingle(Query query)
   {
      return new GetSingleQuery(query).execute(this);
   }

   /**
    * Get all children with a specific name.
    * 
    * @param name The child node name.
    * @return All found children, or empty list if none found.
    */
   public List<Node> get(String name)
   {
      return get(Queries.from(name));
   }

   public List<Node> get(Query query)
   {
      return new GetQuery(query).execute(this);
   }

   // -------------------------------------------------------------------------------------||
   // Local data -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

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
    * Get the text value of the element found at the given query name. If no element is found, or no text exists, return
    * null;
    */
   public String textValue(String name)
   {
      Node n = this.getSingle(name);
      String text = n == null ? null : n.text();
      return text;
   }

   /**
    * Get the text values of all elements found at the given query name. If no elements are found, or no text exists,
    * return an empty list;
    */
   public List<String> textValues(String name)
   {
      List<String> result = new ArrayList<String>();
      List<Node> jars = this.get(name);
      for (Node node : jars)
      {
         String text = node.text();
         if (text != null)
         {
            result.add(text);
         }
      }
      return Collections.unmodifiableList(result);
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
      if (children == null)
      {
         children = new ArrayList<Node>();
      }
      return Collections.unmodifiableList(children);
   }

   /**
    * Remove all child nodes found at the given query.
    * 
    * @return the {@link List} of removed children.
    */
   public List<Node> remove(String name)
   {
      if (name == null || name.trim().isEmpty())
      {
         throw new IllegalArgumentException("Path must not be null or empty");
      }

      List<Node> found = get(name);
      for (Node child : found)
      {
         children.remove(child);
      }
      return found;
   }

   /**
    * Remove all child nodes found at the given {@link Query}.
    * 
    * @return the {@link List} of removed children.
    */
   public List<Node> remove(Query query)
   {
      if (query == null)
      {
         throw new IllegalArgumentException("Query must not be null");
      }

      List<Node> found = get(query);
      for (Node child : found)
      {
         children.remove(child);
      }
      return found;
   }

   /**
    * Remove a single child from this {@link Node}
    * 
    * @return true if this node contained the given child
    */
   public boolean removeSingle(Node child)
   {
      return children.remove(child);
   }

   /**
    * Remove a single child from this {@link Node}
    * 
    * @return true if this node contained the given child
    * @throws IllegalArgumentException if multiple children with name exist.
    */
   public Node removeSingle(String name)
   {
      Node node = getSingle(name);
      if (node != null)
      {
         removeSingle(node);
      }
      return node;
   }

   // -------------------------------------------------------------------------------------||
   // Override ---------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   @Override
   public String toString()
   {
      return "Node[" + name + "] " +
               "children[" + (children != null ? children.size() : 0) + "] " +
               (attributes != null ? "attributes[" + attributes + "] " : "");
   }
}
