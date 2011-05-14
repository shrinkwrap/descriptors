package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * OrderingOrderingType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface OrderingOrderingType<T> extends Child<T>
{
   public OrderingOrderingType<T> name(String name);

   public OrderingOrderingType<T> others();
}
