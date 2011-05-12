package org.jboss.shrinkwrap.descriptor.api.javaee6.webapp;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.javaee6.webcommon.WebCommonType;

public interface WebAppDescriptor extends Descriptor, WebCommonType<WebAppDescriptor>
{
   WebAppDescriptor version(String version);

}
