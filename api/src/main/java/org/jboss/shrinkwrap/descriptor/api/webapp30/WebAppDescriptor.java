package org.jboss.shrinkwrap.descriptor.api.webapp30;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AbsoluteOrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebCommonType;

/**
 * WebAppDescriptor
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface WebAppDescriptor extends Descriptor, WebCommonType<WebAppDescriptor>
{
   //   public WebAppDescriptor version(String version);
   //   
   //   public WebAppDescriptor ejbRefName(String ejbRefName);
   //
   //   public EjbLocalRefType<WebAppDescriptor> ejbLocalRef();

   public WebAppDescriptor moduleName(String moduleName);

   public AbsoluteOrderingType<WebAppDescriptor> absoluteOrdering();
}
