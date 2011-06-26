package org.jboss.shrinkwrap.descriptor.impl.base;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;


public class XMLDateTest
{
   @Test
   public void testCalendar() throws Exception
   {
      Date date1 = new Date();
      String xmlDate = XMLDate.toXMLFormat(date1);
      Date date2 = XMLDate.toDate(xmlDate);
      
      assertEquals(date1, date2);
   }
}
