package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filter-mappingType", propOrder = {
      "filterName",
      "dispatchers"
})
public class FilterMapping extends ServletMapping
{
   @XmlElement(name = "filter-name")
   protected String filterName;
   
   // FIXME should be an enum
   @XmlElement(name = "dispatcher")
   protected List<String> dispatchers;
   
   public FilterMapping() {}
   
   public FilterMapping(String filterName, String... urlPatterns)
   {
      this.filterName = filterName;
      for (String urlPattern : urlPatterns)
      {
         getUrlPatterns().add(urlPattern);
      }
   }
   
   public String getFilterName()
   {
      return filterName;
   }

   public void setFilterName(String filterName)
   {
      this.filterName = filterName;
   }

   public List<String> getDispatchers()
   {
      if (dispatchers == null)
      {
         dispatchers = new ArrayList<String>();
         
      }

      return dispatchers;
   }
}
