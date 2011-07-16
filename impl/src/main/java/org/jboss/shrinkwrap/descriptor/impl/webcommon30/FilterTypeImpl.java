package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The filterType is used to declare a filter in the web application. The filter
 * is mapped to either a servlet or a URL pattern in the filter-mapping element,
 * using the filter-name value to reference. Filters can access the
 * initialization parameters declared in the deployment descriptor at runtime
 * via the FilterConfig interface.
 * 
 * Used in: web-app
 * 
 * 
 * 
 */
public class FilterTypeImpl<T> implements Child<T>, FilterType<T> {
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

	public FilterTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public FilterTypeImpl(T t, String nodeName, Node node, Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : description
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public FilterType<T> setDescription(String description) {
		childNode.create("description").text(description);
		return this;
	}

	public FilterType<T> setDescriptionList(String... values) {
		for (String name : values) {
			setDescription(name);
		}
		return this;
	}

	public FilterType<T> removeAllDescription() {
		childNode.remove("description");
		return this;
	}

	public List<String> getDescriptionList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = childNode.get("description");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : display-name
	// isComplexType: false maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public FilterType<T> setDisplayName(String displayName) {
		childNode.create("display-name").text(displayName);
		return this;
	}

	public FilterType<T> setDisplayNameList(String... values) {
		for (String name : values) {
			setDisplayName(name);
		}
		return this;
	}

	public FilterType<T> removeAllDisplayName() {
		childNode.remove("display-name");
		return this;
	}

	public List<String> getDisplayNameList() {
		List<String> result = new ArrayList<String>();
		List<Node> nodes = childNode.get("display-name");
		for (Node node : nodes) {
			result.add(node.text());
		}
		return result;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : icon
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public FilterType<T> removeAllIcon() {
		childNode.remove("icon");
		return this;
	}

	public IconType<FilterType<T>> icon() {
		return new IconTypeImpl<FilterType<T>>(this, "icon", childNode);
	}

	public List<IconType<FilterType<T>>> getIconList() {
		List<IconType<FilterType<T>>> list = new ArrayList<IconType<FilterType<T>>>();
		List<Node> nodeList = childNode.get("icon");
		for (Node node : nodeList) {
			IconType<FilterType<T>> type = new IconTypeImpl<FilterType<T>>(
					this, "icon", childNode, node);
			list.add(type);
		}
		return list;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : filter-name
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public FilterType<T> setFilterName(String filterName) {
		childNode.getOrCreate("filter-name").text(filterName);
		return this;
	}

	public FilterType<T> removeFilterName() {
		childNode.remove("filter-name");
		return this;
	}

	public String getFilterName() {
		return childNode.textValue("filter-name");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : filter-class
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public FilterType<T> setFilterClass(String filterClass) {
		childNode.getOrCreate("filter-class").text(filterClass);
		return this;
	}

	public FilterType<T> removeFilterClass() {
		childNode.remove("filter-class");
		return this;
	}

	public String getFilterClass() {
		return childNode.textValue("filter-class");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : async-supported
	// isComplexType: false maxOccurs: - isAttribute: false
	// -------------------------------------------------------------------------------------||
	public FilterType<T> setAsyncSupported(Boolean asyncSupported) {
		childNode.getOrCreate("async-supported").text(asyncSupported);
		return this;
	}

	public FilterType<T> removeAsyncSupported() {
		childNode.remove("async-supported");
		return this;
	}

	public Boolean isAsyncSupported() {
		return Strings.isTrue(childNode.textValue("async-supported"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : init-param
	// isComplexType: true maxOccurs: -unbounded isAttribute: false
	// -------------------------------------------------------------------------------------||
	public FilterType<T> removeAllInitParam() {
		childNode.remove("init-param");
		return this;
	}

	public ParamValueType<FilterType<T>> initParam() {
		return new ParamValueTypeImpl<FilterType<T>>(this, "init-param",
				childNode);
	}

	public List<ParamValueType<FilterType<T>>> getInitParamList() {
		List<ParamValueType<FilterType<T>>> list = new ArrayList<ParamValueType<FilterType<T>>>();
		List<Node> nodeList = childNode.get("init-param");
		for (Node node : nodeList) {
			ParamValueType<FilterType<T>> type = new ParamValueTypeImpl<FilterType<T>>(
					this, "init-param", childNode, node);
			list.add(type);
		}
		return list;
	}

}
