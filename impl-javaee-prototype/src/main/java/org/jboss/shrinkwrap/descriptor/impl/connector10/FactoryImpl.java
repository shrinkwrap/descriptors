package org.jboss.shrinkwrap.descriptor.impl.connector10;

import org.jboss.shrinkwrap.descriptor.api.connector10.Factory;

public class FactoryImpl implements Factory {


	@Override
	public org.jboss.shrinkwrap.descriptor.api.connector10.ConfigProperty ConfigProperty() {
		return new ConfigPropertyImpl();
	}

	@Override
	public org.jboss.shrinkwrap.descriptor.api.connector10.Resourceadapter Resourceadapter() {
		return new ResourceadapterImpl();
	}

}
