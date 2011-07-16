package org.jboss.shrinkwrap.descriptor.api.javaee5;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The message-destination-usageType specifies the use of the message
 * destination indicated by the reference. The value indicates whether messages
 * are consumed from the message destination, produced for the destination, or
 * both. The Assembler makes use of this information in linking producers of a
 * destination with its consumers.
 * 
 * The value of the message-destination-usage element must be one of the
 * following: Consumes Produces ConsumesProduces
 * 
 * 
 * 
 */
public enum MessageDestinationUsageType {
	_CONSUMES("Consumes"), _PRODUCES("Produces"), _CONSUMESPRODUCES(
			"ConsumesProduces");

	private String value;

	MessageDestinationUsageType(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	public static MessageDestinationUsageType getFromStringValue(String value) {
		for (MessageDestinationUsageType type : MessageDestinationUsageType
				.values()) {
			if (value != null && type.toString().equals(value)) {
				return type;
			}
		}
		return null;
	}

}
