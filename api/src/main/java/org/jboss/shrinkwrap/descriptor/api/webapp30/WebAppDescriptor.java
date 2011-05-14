package org.jboss.shrinkwrap.descriptor.api.webapp30;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebCommonType;

/**
 * WebAppDescriptor
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface WebAppDescriptor extends Descriptor, WebCommonType<WebAppDescriptor>
{
   WebAppDescriptor version(String version);

}
