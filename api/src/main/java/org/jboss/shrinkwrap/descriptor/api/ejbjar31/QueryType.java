package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface QueryType<T> extends Child<T>
{
   public QueryType<T> setDescription(String description);
   public String getDescription();

   public QueryType<T> setQueryMethod(QueryMethodType<T> queryMethod);
   public QueryMethodType<T> getQueryMethod();

   public QueryType<T> setResultTypeMapping(ResultTypeMappingType resultTypeMapping);
   public ResultTypeMappingType getResultTypeMapping();

   public QueryType<T> setEjbQl(String ejbQl);
   public String getEjbQl();
}
