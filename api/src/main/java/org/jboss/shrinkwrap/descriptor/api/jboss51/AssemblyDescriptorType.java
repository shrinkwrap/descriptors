package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.SecurityRoleType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The assembly-descriptor element contains
 * application-assembly information. The definition of security roles allows you
 * to map assembly roles to one or more principals. For example, you may define
 * a run-as principal in the security-identity element and include that
 * principal in one or more security-role(s) in the assembly descriptor. When
 * called with a run-as role, the callee will see all those roles in
 * ctx.isCallerInRole(...) Used in: jboss
 * 
 * 
 */
public interface AssemblyDescriptorType<T> extends Child<T> {

	public AssemblyDescriptorType<T> removeAllSecurityRole();

	public SecurityRoleType<AssemblyDescriptorType<T>> securityRole();

	public List<SecurityRoleType<AssemblyDescriptorType<T>>> getSecurityRoleList();

	public AssemblyDescriptorType<T> removeAllMessageDestination();

	public MessageDestinationType<AssemblyDescriptorType<T>> messageDestination();

	public List<MessageDestinationType<AssemblyDescriptorType<T>>> getMessageDestinationList();

}
