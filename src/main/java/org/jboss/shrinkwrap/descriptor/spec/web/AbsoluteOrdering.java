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
package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "absolute-orderingType", propOrder = {
      "names",
      "others"
})
public class AbsoluteOrdering
{
   @XmlElement(name = "name")
   protected List<String> names;
   
   protected EmptyType others;
   
   public AbsoluteOrdering() {}
   
   public AbsoluteOrdering(String... names)
   {
      for (String n : names)
      {
         getNames().add(n);
      }
   }
   
   public AbsoluteOrdering(boolean others, String... names)
   {
      this(names);
      setOthers(others);
   }
   
   public List<String> getNames()
   {
      if (names == null)
      {
         names = new ArrayList<String>();
      }
      return names;
   }
   
   public boolean isOthers()
   {
      return others != null;
   }
   
   public void setOthers(boolean others)
   {
      if (others)
      {
         this.others = new EmptyType();
      }
      else
      {
         this.others = null;
      }
   }
}
