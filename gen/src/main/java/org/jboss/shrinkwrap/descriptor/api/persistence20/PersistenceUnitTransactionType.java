package org.jboss.shrinkwrap.descriptor.api.persistence20;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * public enum PersistenceUnitTransactionType {JTA, RESOURCE_LOCAL};
 * 
 * 
 * 
 */
public enum PersistenceUnitTransactionType {
	_JTA("JTA"), _RESOURCE_LOCAL("RESOURCE_LOCAL");

	private String value;

	PersistenceUnitTransactionType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	public static PersistenceUnitTransactionType getFromStringValue(String value) {
		for (PersistenceUnitTransactionType type : PersistenceUnitTransactionType
				.values()) {
			if (value != null && type.toString().equals(value)) {
				return type;
			}
		}
		return null;
	}

}
