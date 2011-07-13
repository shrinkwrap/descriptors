package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The security-identity element specifies whether a
 * specific run-as identity is to be used. If there is a run-as role defined for
 * an enterprise bean, there can also be a run-as-principal define here. If you
 * don't define a run-as principal the callee will see ctx.getCallerPrincipal()
 * == 'anonymous' Used in: entity, message-driven, session
 * 
 * 
 */
public interface SecurityIdentityType<T> extends Child<T> {

	public SecurityIdentityType<T> setDescription(String description);

	public SecurityIdentityType<T> setDescriptionList(String... values);

	public SecurityIdentityType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public SecurityIdentityType<T> setRunAsPrincipal(String runAsPrincipal);

	public SecurityIdentityType<T> removeRunAsPrincipal();

	public String getRunAsPrincipal();

	public SecurityIdentityType<T> useCallerIdentity();

	public Boolean isUseCallerIdentity();

	public SecurityIdentityType<T> removeRunAs();

	public RunAsType<SecurityIdentityType<T>> runAs();

}
