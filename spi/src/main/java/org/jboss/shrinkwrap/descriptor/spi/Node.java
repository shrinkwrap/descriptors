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
package org.jboss.shrinkwrap.descriptor.spi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.spi.query.Queries;
import org.jboss.shrinkwrap.descriptor.spi.query.Query;
import org.jboss.shrinkwrap.descriptor.spi.query.queries.CreateQuery;
import org.jboss.shrinkwrap.descriptor.spi.query.queries.GetOrCreateQuery;
import org.jboss.shrinkwrap.descriptor.spi.query.queries.GetQuery;
import org.jboss.shrinkwrap.descriptor.spi.query.queries.GetSingleQuery;

/**
 * {@link Node} is a data structure representing a container in a classic
 * tree.  May sometimes be synonymous with the term "Element" in XML.  
 * It may contain a {@link Map} of attributes ({@link String}s),
 * a reference to a {@link List} of child {@link Node}s, and text data.
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 * @version $Revision: $
 */
public class Node
{
   // -------------------------------------------------------------------------------------||
   // Class Members -----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private static final String SPACE = " ";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   /**
    * Parent node; null represents that this is the root
    */
   private final Node parent;

   private final List<Node> children = new ArrayList<Node>();

   /**
    * Name of the {@link Node}; may not have spaces
    */
   private final String name;

   /**
    * Attributes of the element
    */
   private final Map<String, String> attributes = new HashMap<String, String>();

   /**
    * CDATA
    */
   private String text;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a root {@link Node}
    * 
    * @param name The name of the node
    */
   public Node(final String name) throws IllegalArgumentException
   {
      this(name, null);
   }

   /**
    * Creates a {@link Node}
    * 
    * @param name The name of the node
    * @param parent The parent node.  Use null to 
    *   denote a root.
    * @throws IllegalArgumentException If the name is not specified
    *   or contains any space characters
    */
   public Node(final String name, final Node parent) throws IllegalArgumentException
   {
      // Precondition checks
      if (name == null)
      {
         throw new IllegalArgumentException("name must be specified");
      }
      if (name.contains(SPACE))
      {
         throw new IllegalArgumentException("name may not contain any spaces");
      }

      // Set
      this.name = name;
      this.parent = parent;

      // Set bi-directional relationship if we've got a parent
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
    * @return This {@link Node}
    * @see #attribute(String, String)
    */
   public Node attribute(final String name, final Object value)
   {
      return attribute(name, String.valueOf(value));
   }

   /**
    * Add or override a named attribute.<br/>
    * 
    * @param name The attribute name
    * @param value The given value
    * @return This {@link Node}
    */
   public Node attribute(final String name, final String value)
   {
      this.attributes.put(name, value);
      return this;
   }

   /**
    * Get a named attribute.<br/>
    * 
    * @param name The attribute name
    * @return The attribute value or null of none defined.
    */
   public String getAttribute(final String name)
   {
      return this.attributes.get(name);
   }

   /**
    * Get all defined attributes for this Node in an 
    * immutable view
    * 
    * @return All defined attributes.
    */
   public Map<String, String> getAttributes()
   {
      return Collections.unmodifiableMap(attributes);
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
    * @throws IllegalArgumentException if multiple children with name exists.
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

   /**
    * Get all children matching the specified query.
    *
    * @param query The query to use for finding relevant child nodes
    * @return All found children, or empty list if none found.
    */
   public List<Node> get(Query query)
   {
      return new GetQuery(query).execute(this);
   }

   /**
    * Remove all child nodes found at the given query.
    * 
    * @return the {@link List} of removed children.
    * @throws IllegalArgumentException If the specified name 
    *   is not specified
    */
   public List<Node> remove(final String name) throws IllegalArgumentException
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
      if(found == null)
      {
         return Collections.EMPTY_LIST;
      }
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
   public String textValue(final String name)
   {
      Node n = this.getSingle(name);
      String text = n == null ? null : n.text();
      return text;
   }

   /**
    * Get the text values of all elements found at the given query name. If no elements are found, or no text exists,
    * return an empty list;
    */
   public List<String> textValues(final String name)
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
    * Get all the defined children for this node in an immutable view.
    * 
    * @return All children or empty list if none.
    */
   public List<Node> children()
   {
      return Collections.unmodifiableList(children);
   }

   // -------------------------------------------------------------------------------------||
   // Override ----------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   /**
    * {@inheritDoc}
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return this.getClass().getSimpleName() + "[" + name + "] " + "children["
            + (children != null ? children.size() : 0) + "] "
            + (attributes != null ? "attributes[" + attributes + "] " : "")
            + (text != null ? "text[" + text + "] " : "");
   }
}
