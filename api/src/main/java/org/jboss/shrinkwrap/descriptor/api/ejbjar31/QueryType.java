package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface QueryType<T> extends Child<T>
{
   public QueryType<T> setDescription(String description);

   public String getDescription();

   public QueryType<T> setQueryMethod(QueryMethodType<T> queryMethod);

   public QueryMethodType<QueryType<T>> getQueryMethod();

   public QueryType<T> setResultTypeMapping(String resultTypeMapping);

   public String getResultTypeMapping();

   public QueryType<T> setEjbQl(String ejbQl);

   public String getEjbQl();
}
