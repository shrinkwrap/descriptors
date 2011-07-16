package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * This type contains the recognized versions of web-application supported. It
 * is used to designate the version of the web application.
 * 
 * 
 * 
 */
public enum WebAppVersionType {
	_3_0("3.0");

	private String value;

	WebAppVersionType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	public static WebAppVersionType getFromStringValue(String value) {
		for (WebAppVersionType type : WebAppVersionType.values()) {
			if (value != null && type.toString().equals(value)) {
				return type;
			}
		}
		return null;
	}

}
