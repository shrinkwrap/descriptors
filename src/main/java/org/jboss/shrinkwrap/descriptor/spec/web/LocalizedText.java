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

import java.util.Locale;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "string", propOrder = "value")
public class LocalizedText
{
   @XmlValue
   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
   protected String value;
   
   @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
   protected String lang;

   public LocalizedText() {}
   
   public LocalizedText(String value)
   {
      this.value = value;
   }
   
   public LocalizedText(String value, String lang)
   {
      this.value = value;
      this.lang = lang;
   }
   
   public LocalizedText(String value, Locale locale)
   {
      this(value, locale.getLanguage());
   }
   
   public String getValue()
   {
      return value;
   }

   public void setValue(String value)
   {
      this.value = value;
   }

   public String getLang()
   {
      return lang;
   }

   public void setLang(String lang)
   {
      this.lang = lang;
   }
}
