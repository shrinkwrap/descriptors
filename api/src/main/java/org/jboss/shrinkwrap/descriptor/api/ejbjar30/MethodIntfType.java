package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The method-intf element allows a method element to differentiate between the
 * methods with the same name and signature that are multiply defined across the
 * home and component interfaces (e.g, in both an enterprise bean's remote and
 * local interfaces or in both an enterprise bean's home and remote interfaces,
 * etc.); the component and web service endpoint interfaces, and so on. The
 * Local applies to both local component interface and local business interface.
 * Similarly, Remote applies to both remote component interface and the remote
 * business interface.
 * 
 * The method-intf element must be one of the following:
 * 
 * Home Remote LocalHome Local ServiceEndpoint
 * 
 * 
 * 
 */
public enum MethodIntfType {
	_HOME("Home"), _REMOTE("Remote"), _LOCALHOME("LocalHome"), _LOCAL("Local"), _SERVICEENDPOINT(
			"ServiceEndpoint");

	private String value;

	MethodIntfType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	public static MethodIntfType getFromStringValue(String value) {
		for (MethodIntfType type : MethodIntfType.values()) {
			if (value != null && type.toString().equals(value)) {
				return type;
			}
		}
		return null;
	}

}
