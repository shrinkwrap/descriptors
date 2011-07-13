package org.jboss.shrinkwrap.descriptor.api.javaee5;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * 
 * This type contains the fully-qualified Java type of the environment entry
 * value that is expected by the application's code.
 * 
 * The following are the legal values of env-entry-type-valuesType:
 * 
 * java.lang.Boolean java.lang.Byte java.lang.Character java.lang.String
 * java.lang.Short java.lang.Integer java.lang.Long java.lang.Float
 * java.lang.Double
 * 
 * Example:
 * 
 * <env-entry-type>java.lang.Boolean</env-entry-type>
 * 
 * 
 * 
 * 
 */
public enum EnvEntryTypeValuesType {
	_JAVA_LANG_BOOLEAN("java.lang.Boolean"), _JAVA_LANG_BYTE("java.lang.Byte"), _JAVA_LANG_CHARACTER(
			"java.lang.Character"), _JAVA_LANG_STRING("java.lang.String"), _JAVA_LANG_SHORT(
			"java.lang.Short"), _JAVA_LANG_INTEGER("java.lang.Integer"), _JAVA_LANG_LONG(
			"java.lang.Long"), _JAVA_LANG_FLOAT("java.lang.Float"), _JAVA_LANG_DOUBLE(
			"java.lang.Double");

	private String value;

	EnvEntryTypeValuesType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	public static EnvEntryTypeValuesType getFromStringValue(String value) {
		for (EnvEntryTypeValuesType type : EnvEntryTypeValuesType.values()) {
			if (value != null && type.toString().equals(value)) {
				return type;
			}
		}
		return null;
	}

}
