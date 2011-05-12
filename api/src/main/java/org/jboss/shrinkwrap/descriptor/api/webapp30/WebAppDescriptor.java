package org.jboss.shrinkwrap.descriptor.api.webapp30;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebCommonType;

public interface WebAppDescriptor extends Descriptor, WebCommonType<WebAppDescriptor>
{
   WebAppDescriptor version(String version);

}
