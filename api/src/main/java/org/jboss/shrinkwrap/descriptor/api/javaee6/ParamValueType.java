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
   public ParamValueType<T> description(String description);

   public ParamValueType<T> paramName(String paramName);

   public ParamValueType<T> paramValue(String paramValue);
}
