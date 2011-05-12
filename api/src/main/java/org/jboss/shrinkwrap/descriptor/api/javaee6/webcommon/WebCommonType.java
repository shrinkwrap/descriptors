package org.jboss.shrinkwrap.descriptor.api.javaee6.webcommon;

public interface WebCommonType<T>
{
   public AbsoluteOrderingType<T> absoluteOrdering();

   public AuthConstraintType<T> authConstraint();

   public FilterType<T> filter();

   public SecurityConstraintType<T> securityConstraint();
}
