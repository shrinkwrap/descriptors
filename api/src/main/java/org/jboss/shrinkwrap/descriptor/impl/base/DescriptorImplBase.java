/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
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
package org.jboss.shrinkwrap.descriptor.impl.base;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;

/**
 * Base implementation for a Descriptor. 
 * 
 * Enforces descriptor name constructor argument contract from extension loading.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public abstract class DescriptorImplBase implements Descriptor
{
   private final String name;

   /**
    * Create a named Descriptor. 
    */
   public DescriptorImplBase(String name)
   {
      this.name = name;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.Descriptor#getName()
    */
   @Override
   public String getDescriptorName()
   {
      return name;
   }
}
