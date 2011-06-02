package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface QueryType<T> extends Child<T>
{
   public QueryType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   @NodeInfo(xmlName = "query-method")
   public QueryMethodType<QueryType<T>> queryMethod();

   public QueryType<T> setResultTypeMapping(ResultTypeMappingType resultTypeMapping);

   public QueryType<T> setResultTypeMapping(String resultTypeMapping);

   @NodeInfo(xmlName = "result-type-mapping")
   public String getResultTypeMapping();

   public QueryType<T> setEjbQl(String ejbQl);

   @NodeInfo(xmlName = "ejb-ql")
   public String getEjbQl();
}
