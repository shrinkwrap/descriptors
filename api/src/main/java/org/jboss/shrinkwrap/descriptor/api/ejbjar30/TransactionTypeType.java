package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The transaction-typeType specifies an enterprise bean's transaction
 * management type.
 * 
 * The transaction-type must be one of the two following:
 * 
 * Bean Container
 * 
 * 
 * 
 */
public enum TransactionTypeType {
	_BEAN("Bean"), _CONTAINER("Container");

	private String value;

	TransactionTypeType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	public static TransactionTypeType getFromStringValue(String value) {
		for (TransactionTypeType type : TransactionTypeType.values()) {
			if (value != null && type.toString().equals(value)) {
				return type;
			}
		}
		return null;
	}

}
