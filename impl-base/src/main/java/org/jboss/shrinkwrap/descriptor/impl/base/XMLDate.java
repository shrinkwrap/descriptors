package org.jboss.shrinkwrap.descriptor.impl.base;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLDate
{
   public static synchronized String toXMLFormat(java.util.Date start)   
   {      
      try
      {
         GregorianCalendar gCal = (GregorianCalendar)GregorianCalendar.getInstance();
         gCal.setTime(start);
         XMLGregorianCalendar cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
         return cal.toXMLFormat();
      }
      catch (DatatypeConfigurationException ex)
      {
         throw new RuntimeException(ex);
      }
   }
   
   public static synchronized java.util.Date toDate(String xmlDate)
   {
      XMLGregorianCalendar cal;
      try
      {
         cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(xmlDate);
         return cal.toGregorianCalendar().getTime();
      }
      catch (DatatypeConfigurationException ex)
      {
         throw new RuntimeException(ex);
      }
   }

}
