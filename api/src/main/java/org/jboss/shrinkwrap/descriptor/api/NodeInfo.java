package org.jboss.shrinkwrap.descriptor.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NodeInfo 
{
	String xmlName();
}
