/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.shrinkwrap.descriptor.impl.spec.jpa.persistence;

import org.jboss.shrinkwrap.descriptor.api.Node;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.Property;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 */
public class PropertyImpl implements Property
{
   private final Node node;

   public PropertyImpl(Node node, String name, Object value)
   {
      this.node = node;
      node.attribute("name", name);
      node.attribute("value", value);
   }

   public PropertyImpl(Node node)
   {
      this.node = node;
   }

   @Override
   public Property name(String name)
   {
      node.attribute("name", name);
      return this;
   }

   @Override
   public String getName()
   {
      return node.attribute("name");
   }

   @Override
   public Property value(Object value)
   {
      node.attribute("value", value);
      return this;
   }

   @Override
   public Object getValue()
   {
      return node.attribute("value");
   }

}
