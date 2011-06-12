package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface AbsoluteOrderingType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public AbsoluteOrderingType<T> setName(String name);
   public AbsoluteOrderingType<T> setName(String ... values);

   public List<String> getNameList();


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

// otherwise;
   public AbsoluteOrderingType<T> setOthers(Boolean others);

   public Boolean getOthers();

}
