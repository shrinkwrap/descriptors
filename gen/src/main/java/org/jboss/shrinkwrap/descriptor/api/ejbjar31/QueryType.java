package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public interface QueryType<T> extends Child<T>
{

   public QueryType<T> setDescription(String description);
   public String getDescription();


   public QueryType<T> setQueryMethod(QueryMethodType<QueryType<T>> queryMethod);
   public QueryMethodType<QueryType<T>> getQueryMethod();



   public QueryType<T> setResultTypeMapping(String resultTypeMapping);
   public String getResultTypeMapping();


   public QueryType<T> setEjbQl(String ejbQl);
   public String getEjbQl();
}
