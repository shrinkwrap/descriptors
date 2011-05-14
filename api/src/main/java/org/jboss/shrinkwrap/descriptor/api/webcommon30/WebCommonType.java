package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * WebCommonType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface WebCommonType<T>
{
   public AbsoluteOrderingType<T> absoluteOrdering();

   public AuthConstraintType<T> authConstraint();

   public FilterType<T> filter();

   public SecurityConstraintType<T> securityConstraint();
}
