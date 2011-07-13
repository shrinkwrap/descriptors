package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The queryType defines a finder or select query. It contains - an optional
 * description of the query - the specification of the finder or select method
 * it is used by - an optional specification of the result type mapping, if the
 * query is for a select method and entity objects are returned. - the EJB QL
 * query string that defines the query.
 * 
 * Queries that are expressible in EJB QL must use the ejb-ql element to specify
 * the query. If a query is not expressible in EJB QL, the description element
 * should be used to describe the semantics of the query and the ejb-ql element
 * should be empty.
 * 
 * The result-type-mapping is an optional element. It can only be present if the
 * query-method specifies a select method that returns entity objects. The
 * default value for the result-type-mapping element is "Local".
 * 
 * 
 * 
 */
public interface QueryType<T> extends Child<T> {

	public QueryType<T> setDescription(String description);

	public QueryType<T> removeDescription();

	public String getDescription();

	public QueryType<T> removeQueryMethod();

	public QueryMethodType<QueryType<T>> queryMethod();

	public QueryType<T> setResultTypeMapping(
			ResultTypeMappingType resultTypeMapping);

	public QueryType<T> setResultTypeMapping(String resultTypeMapping);

	public ResultTypeMappingType getResultTypeMapping();

	public String getResultTypeMappingAsString();

	public QueryType<T> setEjbQl(String ejbQl);

	public QueryType<T> removeEjbQl();

	public String getEjbQl();

}
