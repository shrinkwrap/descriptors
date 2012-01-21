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


/**
 * This class serves as a base data class holding metadata information.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class BaseMetadataItem
{
   private String name;

   private String namespace;

   private String schemaName;

   private String packageApi;

   private String packageImpl;

   private String documentation;
   
   private String mappedTo;   

   public BaseMetadataItem(final String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void setName(final String name)
   {
      this.name = name;
   }

   public String getNamespace()
   {
      return namespace;
   }

   public void setNamespace(final String namespace)
   {
      this.namespace = namespace;
   }

   public String getSchemaName()
   {
      return schemaName;
   }

   public void setSchemaName(final String schemaName)
   {
      this.schemaName = schemaName;
   }

   public String getPackageApi()
   {
      return packageApi;
   }

   public void setPackageApi(final String packageApi)
   {
      this.packageApi = packageApi;
   }

   public String getPackageImpl()
   {
      return packageImpl;
   }

   public void setPackageImpl(final String packageImpl)
   {
      this.packageImpl = packageImpl;
   }

   public String getDocumentation()
   {
      return documentation;
   }

   public void setDocumentation(final String documentation)
   {
      this.documentation = documentation;
   }

   public String getMappedTo()
   {
      return mappedTo;
   }

   public void setMappedTo(String mappedTo)
   {
      this.mappedTo = mappedTo;
   }

}
