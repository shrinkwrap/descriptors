package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The multiplicityType describes the multiplicity of the role that participates
 * in a relation.
 * 
 * The value must be one of the two following:
 * 
 * One Many
 * 
 * 
 * 
 */
public enum MultiplicityType {
	_ONE("One"), _MANY("Many");

	private String value;

	MultiplicityType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	public static MultiplicityType getFromStringValue(String value) {
		for (MultiplicityType type : MultiplicityType.values()) {
			if (value != null && type.toString().equals(value)) {
				return type;
			}
		}
		return null;
	}

}
