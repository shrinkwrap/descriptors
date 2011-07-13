package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The container-transactionType specifies how the container must manage
 * transaction scopes for the enterprise bean's method invocations. It defines
 * an optional description, a list of method elements, and a transaction
 * attribute. The transaction attribute is to be applied to all the specified
 * methods.
 * 
 * 
 * 
 */
public interface ContainerTransactionType<T> extends Child<T> {

	public ContainerTransactionType<T> setDescription(String description);

	public ContainerTransactionType<T> setDescriptionList(String... values);

	public ContainerTransactionType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ContainerTransactionType<T> removeAllMethod();

	public MethodType<ContainerTransactionType<T>> method();

	public List<MethodType<ContainerTransactionType<T>>> getMethodList();

	public ContainerTransactionType<T> setTransAttribute(
			TransAttributeType transAttribute);

	public ContainerTransactionType<T> setTransAttribute(String transAttribute);

	public TransAttributeType getTransAttribute();

	public String getTransAttributeAsString();

}
