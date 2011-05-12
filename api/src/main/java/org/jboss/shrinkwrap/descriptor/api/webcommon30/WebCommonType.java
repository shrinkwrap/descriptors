package org.jboss.shrinkwrap.descriptor.api.webcommon30;

public interface WebCommonType<T>
{
   public AbsoluteOrderingType<T> absoluteOrdering();

   public AuthConstraintType<T> authConstraint();

   public FilterType<T> filter();

   public SecurityConstraintType<T> securityConstraint();
}
