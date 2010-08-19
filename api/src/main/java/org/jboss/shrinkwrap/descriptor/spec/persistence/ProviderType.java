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
package org.jboss.shrinkwrap.descriptor.spec.persistence;

/**
 * Enum of convenient values for the persistence-unit provider element
 *
 * @author Dan Allen
 */
public enum ProviderType
{
   HIBERNATE("org.hibernate.ejb.HibernatePersistence"),
   ECLIPSE_LINK("org.eclipse.persistence.jpa.PersistenceProvider");

   private String providerClass;
   
   private ProviderType(String providerClass)
   {
      this.providerClass = providerClass;
   }
   
   public String getProviderClass()
   {
      return providerClass;
   }
   
   public String value()
   {
      return name();
   }

   public static ProviderType fromValue(String v)
   {
      return valueOf(v);
   }
   
   public static ProviderType fromProviderClass(String providerClass)
   {
      if (providerClass == null)
      {
         return null;
      }
      for (ProviderType candidate : values())
      {
         if (candidate.getProviderClass().equals(providerClass))
         {
            return candidate;
         }
      }
      return null;
   }
}
