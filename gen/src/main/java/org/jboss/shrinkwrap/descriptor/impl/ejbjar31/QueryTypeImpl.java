package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.QueryMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.QueryType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class QueryTypeImpl<T> implements Child<T>, QueryType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private QueryMethodType<QueryType<T>> queryMethod;
   private String resultTypeMapping;
   private String ejbQl;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public QueryTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("query");   }


   public T up()
   {
      return t;
   }



   public QueryType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public QueryType<T> setQueryMethod(QueryMethodType<QueryType<T>> queryMethod)
   {
      this.queryMethod = queryMethod;
      childNode.getOrCreate("query-method").text(queryMethod);
      return this;
   }

   public QueryMethodType<QueryType<T>> getQueryMethod()
   {
      if( queryMethod == null)
      {
          queryMethod = new QueryMethodTypeImpl<QueryType<T>>(this, "", childNode);
      }
      return queryMethod;
   }




   public QueryType<T> setResultTypeMapping(String resultTypeMapping)
   {
      this.resultTypeMapping = resultTypeMapping;
      childNode.getOrCreate("result-type-mapping").text(resultTypeMapping);
      return this;
   }

   public String getResultTypeMapping()
   {
      return resultTypeMapping;
   }



   public QueryType<T> setEjbQl(String ejbQl)
   {
      this.ejbQl = ejbQl;
      childNode.getOrCreate("ejb-ql").text(ejbQl);
      return this;
   }

   public String getEjbQl()
   {
      return ejbQl;
   }

}
