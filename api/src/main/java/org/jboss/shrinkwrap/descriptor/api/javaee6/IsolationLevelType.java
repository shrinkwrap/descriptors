package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The following transaction isolation levels are allowed (see documentation for
 * the java.sql.Connection interface): TRANSACTION_READ_UNCOMMITTED
 * TRANSACTION_READ_COMMITTED TRANSACTION_REPEATABLE_READ
 * TRANSACTION_SERIALIZABLE
 * 
 * 
 * 
 */
public enum IsolationLevelType {
	_TRANSACTION_READ_UNCOMMITTED("TRANSACTION_READ_UNCOMMITTED"), _TRANSACTION_READ_COMMITTED(
			"TRANSACTION_READ_COMMITTED"), _TRANSACTION_REPEATABLE_READ(
			"TRANSACTION_REPEATABLE_READ"), _TRANSACTION_SERIALIZABLE(
			"TRANSACTION_SERIALIZABLE");

	private String value;

	IsolationLevelType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	public static IsolationLevelType getFromStringValue(String value) {
		for (IsolationLevelType type : IsolationLevelType.values()) {
			if (value != null && type.toString().equals(value)) {
				return type;
			}
		}
		return null;
	}

}
