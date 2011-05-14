package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * AbsoluteOrderingType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface AbsoluteOrderingType<T> extends Child<T> 
{
	public AbsoluteOrderingType<T> name(String name);

	public AbsoluteOrderingType<T> name(String... names);

	public AbsoluteOrderingType<T> others();
}
