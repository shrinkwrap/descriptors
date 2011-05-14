package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * ParamValueType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface ParamValueType<T> extends Child<T>
{
   public ParamValueType<T> Description(String Description);

   public ParamValueType<T> ParamName(String ParamName);

   public ParamValueType<T> ParamValue(String ParamValue);
}
