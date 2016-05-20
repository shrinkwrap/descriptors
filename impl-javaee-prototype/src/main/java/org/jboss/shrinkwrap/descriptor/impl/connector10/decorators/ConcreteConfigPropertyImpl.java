package org.jboss.shrinkwrap.descriptor.impl.connector10.decorators;

import org.jboss.shrinkwrap.descriptor.api.connector10.ConfigProperty;

/**
 * This class implements the <code> config-property </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConcreteConfigPropertyImpl extends ConfigfPropertyDecorator {
	
	public ConcreteConfigPropertyImpl(ConfigProperty configProperty) {
		super(configProperty);
	}
	
	public ConfigProperty configPropertyValue(String configPropertyValue) {
		return configProperty.configPropertyValue(configPropertyValue);
	}

	public String getConfigPropertyValue() {
		return configProperty.getConfigPropertyValue();
	}

	public ConfigProperty removeConfigPropertyValue() {
		return configProperty.removeConfigPropertyValue();
	}

	public ConfigProperty description(String description) {
		return configProperty.description(description);
	}

	public String getDescription() {
		return configProperty.getDescription();
	}

	public ConfigProperty removeDescription() {
		return configProperty.removeDescription();
	}

	public ConfigProperty configPropertyName(String configPropertyName) {
		return configProperty.configPropertyName(configPropertyName);
	}

	public String getConfigPropertyName() {
		return configProperty.getConfigPropertyName();
	}

	public ConfigProperty removeConfigPropertyName() {
		return configProperty.removeConfigPropertyName();
	}

	public ConfigProperty configPropertyType(String configPropertyType) {
		return configProperty.configPropertyType(configPropertyType);
	}

	public String getConfigPropertyType() {
		return configProperty.getConfigPropertyType();
	}

	public ConfigProperty removeConfigPropertyType() {
		return configProperty.removeConfigPropertyType();
	}
}
