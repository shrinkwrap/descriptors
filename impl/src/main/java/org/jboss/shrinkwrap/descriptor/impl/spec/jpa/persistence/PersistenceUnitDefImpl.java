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
package org.jboss.shrinkwrap.descriptor.impl.spec.jpa.persistence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.PersistenceUnitDef;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.Property;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.ProviderType;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.SchemaGenerationModeType;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.SharedCacheModeType;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.TransactionType;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.ValidationModeType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 */
public class PersistenceUnitDefImpl extends PersistenceDescriptorImpl implements PersistenceUnitDef
{
   private final Node persistenceUnit;

   public PersistenceUnitDefImpl(String descriptorName, Node persistence, Node persistenceUnit)
   {
      super(descriptorName, persistence);
      this.persistenceUnit = persistenceUnit;
   }

   @Override
   public PersistenceUnitDef name(String name)
   {
      persistenceUnit.attribute("name", name);
      return this;
   }

   @Override
   public PersistenceUnitDef description(String description)
   {
      persistenceUnit.getOrCreate("description").text(description);
      return this;
   }

   @Override
   public PersistenceUnitDef nonJtaDataSource(String jndiName)
   {
      if (jndiName == null)
      {
         persistenceUnit.removeChildren("non-jta-data-source");
      }
      else
      {
         persistenceUnit.removeChild("jta-data-source");
         persistenceUnit.getOrCreate("non-jta-data-source").text(jndiName);
      }
      return this;
   }

   @Override
   public PersistenceUnitDef jtaDataSource(String jndiName)
   {
      if (jndiName == null)
      {
         persistenceUnit.removeChildren("jta-data-source");
      }
      else
      {
         persistenceUnit.removeChild("non-jta-data-source");
         persistenceUnit.getOrCreate("jta-data-source").text(jndiName);
      }
      return this;
   }

   @Override
   public PersistenceUnitDef transactionType(TransactionType transactionType)
   {
      persistenceUnit.attribute("transaction-type", transactionType.name());
      return this;
   }

   @Override
   public PersistenceUnitDef property(String name, Object value)
   {
      persistenceUnit.getOrCreate("properties")
                  .getOrCreate("property@name=" + name)
                     .attribute("value", value);
      return this;
   }

   @Override
   public List<Property> getProperties()
   {
      List<Property> result = new ArrayList<Property>();

      Node props = persistenceUnit.getSingle("properties");
      if (props != null)
      {
         for (Node node : props.getChildren())
         {
            result.add(new PropertyImpl(node));
         }
      }
      return Collections.unmodifiableList(result);
   }

   @Override
   public Property removeProperty(String name)
   {
      Node props = persistenceUnit.getSingle("properties");

      for (Node node : props.get("property"))
      {
         Property prop = new PropertyImpl(node);
         if (prop.getName().equals(name))
         {
            props.removeChild(node);
            return new PropertyImpl(node);
         }
      }
      return null;
   }

   @Override
   public boolean removeProperty(Property prop)
   {
      return removeProperty(prop.getName()) != null;
   }

   @Override
   public List<Property> clearProperties()
   {
      List<Property> result = new ArrayList<Property>();
      Node props = persistenceUnit.removeChild("properties");
      for (Node node : props.get("property"))
      {
         result.add(new PropertyImpl(node));
      }
      return Collections.unmodifiableList(result);
   }

   @Override
   public PersistenceUnitDef classes(Class<?>... classes)
   {
      for (Class<?> c : classes)
      {
         persistenceUnit.createChild("class").text(c.getName());
      }
      return this;
   }

   @Override
   public PersistenceUnitDef classes(String... classes)
   {
      for (String c : classes)
      {
         persistenceUnit.createChild("class").text(c);
      }
      return this;
   }

   @Override
   public PersistenceUnitDef jarFiles(String... paths)
   {
      for (String p : paths)
      {
         persistenceUnit.createChild("jar-file").text(p);
      }
      return this;
   }

   @Override
   public PersistenceUnitDef jarFile(String path)
   {
      return jarFiles(path);
   }

   @Override
   public PersistenceUnitDef mappingFiles(String... paths)
   {
      for (String p : paths)
      {
         persistenceUnit.createChild("mapping-file").text(p);
      }
      return this;
   }

   @Override
   public PersistenceUnitDef mappingFile(String path)
   {
      return mappingFiles(path);
   }

   @Override
   public PersistenceUnitDef sharedCacheMode(SharedCacheModeType sharedCacheMode)
   {
      persistenceUnit.getOrCreate("shared-cache-mode").text(sharedCacheMode.name());
      return this;
   }

   @Override
   public PersistenceUnitDef validationMode(ValidationModeType validationMode)
   {
      persistenceUnit.getOrCreate("validation-mode").text(validationMode.name());
      return this;
   }

   @Override
   public PersistenceUnitDef excludeUnlistedClasses()
   {
      persistenceUnit.getOrCreate("exclude-unlisted-classes").text("true");
      return this;
   }

   @Override
   public PersistenceUnitDef includeUnlistedClasses()
   {
      persistenceUnit.getOrCreate("exclude-unlisted-classes").text("false");
      return this;
   }

   @Override
   public PersistenceUnitDef provider(ProviderType providerType)
   {
      return provider(providerType.getProviderClass());
   }

   @Override
   public PersistenceUnitDef provider(String provider)
   {
      persistenceUnit.getOrCreate("provider").text(provider);
      return this;
   }

   @Override
   public PersistenceUnitDef showSql()
   {
      ProviderType providerType = ProviderType.fromProviderClass(persistenceUnit.getSingle("provider"));
      if (providerType == null || providerType == ProviderType.HIBERNATE)
      {
         persistenceUnit.getOrCreate("properties")
                     .createChild("property")
                        .attribute("name", "hibernate.show_sql")
                        .attribute("value", "true");
      }
      if (providerType == null || providerType == ProviderType.ECLIPSE_LINK)
      {
         persistenceUnit.getOrCreate("properties")
                     .createChild("property")
                        .attribute("name", "eclipselink.logging.level")
                        .attribute("value", "FINE");
      }
      return this;
   }

   @Override
   public PersistenceUnitDef formatSql()
   {
      ProviderType providerType = ProviderType.fromProviderClass(persistenceUnit.getSingle("provider"));
      if (providerType == null || providerType == ProviderType.HIBERNATE)
      {
         persistenceUnit.getOrCreate("properties")
                     .createChild("property")
                        .attribute("name", "hibernate.format_sql")
                        .attribute("value", "true");
      }
      return this;
   }

   @Override
   public PersistenceUnitDef schemaGenerationMode(SchemaGenerationModeType schemaGenerationMode)
   {
      ProviderType providerType = ProviderType.fromProviderClass(persistenceUnit.getSingle("provider"));
      if (providerType == null || providerType == ProviderType.HIBERNATE)
      {
         String value = null;
         if (SchemaGenerationModeType.CREATE.equals(schemaGenerationMode))
         {
            value = "create";
         }
         else if (SchemaGenerationModeType.CREATE_DROP.equals(schemaGenerationMode))
         {
            value = "create-drop";
         }
         else if (SchemaGenerationModeType.UPDATE.equals(schemaGenerationMode))
         {
            value = "update";
         }
         else if (SchemaGenerationModeType.NONE.equals(schemaGenerationMode))
         {
            value = "none";
         }
         if (value != null)
         {
            persistenceUnit.getOrCreate("properties")
                        .createChild("property")
                           .attribute("name", "hibernate.hbm2ddl.auto")
                           .attribute("value", value);
         }
      }
      if (providerType == null || providerType == ProviderType.ECLIPSE_LINK)
      {
         String value = null;
         if (SchemaGenerationModeType.CREATE.equals(schemaGenerationMode))
         {
            value = "create-tables";
         }
         else if (SchemaGenerationModeType.CREATE_DROP.equals(schemaGenerationMode))
         {
            value = "drop-and-create-tables";
         }
         else if (SchemaGenerationModeType.UPDATE.equals(schemaGenerationMode))
         {
            throw new UnsupportedOperationException(SchemaGenerationModeType.UPDATE + " not supported by provider "
                     + ProviderType.ECLIPSE_LINK);
         }
         else if (SchemaGenerationModeType.NONE.equals(schemaGenerationMode))
         {
            value = "none";
         }
         if (value != null)
         {
            persistenceUnit.getOrCreate("properties")
                     .createChild("property")
                        .attribute("name", "eclipselink.ddl-generation")
                        .attribute("value", value);
         }
      }
      return this;
   }

   @Override
   public String getName()
   {
      return persistenceUnit.getAttributes().get("name");
   }

   @Override
   public String getDescription()
   {
      Node result = persistenceUnit.getSingle("description");
      return result == null ? null : result.getText();
   }

   @Override
   public String getNonJtaDataSource()
   {
      Node result = persistenceUnit.getSingle("non-jta-data-source");
      return result == null ? null : result.getText();
   }

   @Override
   public String getTransactionType()
   {
      return persistenceUnit.getAttributes().get("transaction-type");
   }

   @Override
   public String getJtaDataSource()
   {
      Node result = persistenceUnit.getSingle("jta-data-source");
      return result == null ? null : result.getText();
   }

   @Override
   public List<String> getJarFiles()
   {
      return persistenceUnit.getTextValuesForPatternName("jar-file");
   }

   @Override
   public List<String> getClasses()
   {
      return persistenceUnit.getTextValuesForPatternName("class");
   }

   @Override
   public List<String> getMappingFiles()
   {
      return persistenceUnit.getTextValuesForPatternName("mapping-file");
   }

   @Override
   public SharedCacheModeType getSharedCacheMode()
   {
      Node mode = persistenceUnit.getSingle("shared-cache-mode");
      return mode == null ? null : SharedCacheModeType.valueOf(mode.getText());
   }

   @Override
   public ValidationModeType getValidationMode()
   {
      Node mode = persistenceUnit.getSingle("validation-mode");
      return mode == null ? null : ValidationModeType.valueOf(mode.getText());
   }

   @Override
   public boolean includesUnlistedClasses()
   {
      Node mode = persistenceUnit.getSingle("exclude-unlisted-classes");
      return mode == null ? false : Boolean.valueOf(mode.getText());
   }

   @Override
   public String getProvider()
   {
      Node provider = persistenceUnit.getSingle("provider");
      return provider == null ? null : provider.getText();
   }
}
