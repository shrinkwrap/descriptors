/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
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

package org.jboss.shrinkwrap.descriptor.metadata;

import java.util.HashMap;
import java.util.Map;


/**
 * This class holds the information used for generating a descriptor interface and implementation class.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataDescriptor extends BaseMetadataItem
{
   private String rootElementName;

   private String rootElementType;

   private Map<String, String> namespaces = new HashMap<String, String>();

   public MetadataDescriptor(String name)
   {
      super(name);
   }
   
   public String getRootElementName()
   {
      return rootElementName;
   }

   public void setRootElementName(String rootElementName)
   {
      this.rootElementName = rootElementName;
   }

   public String getRootElementType()
   {
      return rootElementType;
   }

   public void setRootElementType(String rootElementType)
   {
      this.rootElementType = rootElementType;
   }

   public Map<String, String> getNamespaces()
   {
      return namespaces;
   }
   
   public void setNamespaces(final Map<String, String> namespaces)
   {
      this.namespaces = namespaces;
   }
}
