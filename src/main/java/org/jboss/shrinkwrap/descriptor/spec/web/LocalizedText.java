package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.Locale;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
