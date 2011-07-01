package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 *
 * Original Documentation:
 *
 * [
 * The query-method specifies the method for a finder or select
 * query.
 *
 * The method-name element specifies the name of a finder or select
 * method in the entity bean's implementation class.
 *
 * Each method-param must be defined for a query-method using the
 * method-params element.
 *
 * It is used by the query-method element.
 *
 * Example:
 *
 * <query>
 * <description>Method finds large orders</description>
 * <query-method>
 * <method-name>findLargeOrders</method-name>
 * <method-params></method-params>
 * </query-method>
 * <ejb-ql>
 * SELECT OBJECT(o) FROM Order o
 * WHERE o.amount &gt; 1000
 * </ejb-ql>
 * </query>
 *
 *
 *
 *
 */
public interface QueryMethodType<T> extends Child<T>
{

   public QueryMethodType<T> setMethodName(String methodName);

   public QueryMethodType<T> removeMethodName();

   public String getMethodName();

   public QueryMethodType<T> removeMethodParams();

   public MethodParamsType<QueryMethodType<T>> methodParams();

}
