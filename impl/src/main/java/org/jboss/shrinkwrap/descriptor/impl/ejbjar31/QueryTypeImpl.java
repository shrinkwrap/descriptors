package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.QueryMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.QueryType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ResultTypeMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
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
public class QueryTypeImpl<T> implements Child<T>, QueryType<T> {
	// -------------------------------------------------------------------------------------||
	// Instance Members
	// --------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	private T t;
	private Node node;
	private Node childNode;

	// -------------------------------------------------------------------------------------||
	// Constructor
	// -------------------------------------------------------------------------||
	// -------------------------------------------------------------------------------------||

	public QueryTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public QueryTypeImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public QueryType<T> setDescription(String description) {
		childNode.getOrCreate("description").text(description);
		return this;
	}

	public QueryType<T> removeDescription() {
		childNode.remove("description");
		return this;
	}

	public String getDescription() {
		return childNode.textValue("description");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : query-method
	// isComplexType: true maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public QueryType<T> removeQueryMethod() {
		childNode.remove("query-method");
		return this;
	}

	public QueryMethodType<QueryType<T>> queryMethod() {
		Node node = childNode.getOrCreate("query-method");
		QueryMethodType<QueryType<T>> queryMethod = new QueryMethodTypeImpl<QueryType<T>>(
				this, "query-method", childNode, node);
		return queryMethod;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : result-type-mapping
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public QueryType<T> setResultTypeMapping(
			ResultTypeMappingType resultTypeMapping) {
		childNode.getOrCreate("result-type-mapping").text(resultTypeMapping);
		return this;
	}

	public QueryType<T> setResultTypeMapping(String resultTypeMapping) {
		childNode.getOrCreate("result-type-mapping").text(resultTypeMapping);
		return this;
	}

	public ResultTypeMappingType getResultTypeMapping() {
		return ResultTypeMappingType.getFromStringValue(childNode
				.textValue("result-type-mapping"));
	}

	public String getResultTypeMappingAsString() {
		return childNode.textValue("result-type-mapping");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : ejb-ql
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public QueryType<T> setEjbQl(String ejbQl) {
		childNode.getOrCreate("ejb-ql").text(ejbQl);
		return this;
	}

	public QueryType<T> removeEjbQl() {
		childNode.remove("ejb-ql");
		return this;
	}

	public String getEjbQl() {
		return childNode.textValue("ejb-ql");
	}

}
