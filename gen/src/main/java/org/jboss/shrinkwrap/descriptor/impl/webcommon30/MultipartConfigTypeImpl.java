package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * This element specifies configuration information related to the handling of
 * multipart/form-data requests.
 * 
 * 
 * 
 */
public class MultipartConfigTypeImpl<T> implements Child<T>,
		MultipartConfigType<T> {
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

	public MultipartConfigTypeImpl(T t, String nodeName, Node node) {
		this.t = t;
		this.node = node;
		this.childNode = node.create(nodeName);
	}

	public MultipartConfigTypeImpl(T t, String nodeName, Node node,
			Node childNode) {
		this.t = t;
		this.node = node;
		this.childNode = childNode;
	}

	public T up() {
		return t;
	}

	// -------------------------------------------------------------------------------------||
	// Element type : location
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MultipartConfigType<T> setLocation(String location) {
		childNode.getOrCreate("location").text(location);
		return this;
	}

	public MultipartConfigType<T> removeLocation() {
		childNode.remove("location");
		return this;
	}

	public String getLocation() {
		return childNode.textValue("location");
	}

	// -------------------------------------------------------------------------------------||
	// Element type : max-file-size
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MultipartConfigType<T> setMaxFileSize(Long maxFileSize) {
		childNode.getOrCreate("max-file-size").text(maxFileSize);
		return this;
	}

	public MultipartConfigType<T> removeMaxFileSize() {
		childNode.remove("max-file-size");
		return this;
	}

	public Long getMaxFileSize() {
		return Long.valueOf(childNode.textValue("max-file-size"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : max-request-size
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MultipartConfigType<T> setMaxRequestSize(Long maxRequestSize) {
		childNode.getOrCreate("max-request-size").text(maxRequestSize);
		return this;
	}

	public MultipartConfigType<T> removeMaxRequestSize() {
		childNode.remove("max-request-size");
		return this;
	}

	public Long getMaxRequestSize() {
		return Long.valueOf(childNode.textValue("max-request-size"));
	}

	// -------------------------------------------------------------------------------------||
	// Element type : file-size-threshold
	// isComplexType: false maxOccurs: -1 isAttribute: false
	// -------------------------------------------------------------------------------------||
	public MultipartConfigType<T> setFileSizeThreshold(Integer fileSizeThreshold) {
		childNode.getOrCreate("file-size-threshold").text(fileSizeThreshold);
		return this;
	}

	public MultipartConfigType<T> removeFileSizeThreshold() {
		childNode.remove("file-size-threshold");
		return this;
	}

	public Integer getFileSizeThreshold() {
		return Integer.valueOf(childNode.textValue("file-size-threshold"));
	}

}
