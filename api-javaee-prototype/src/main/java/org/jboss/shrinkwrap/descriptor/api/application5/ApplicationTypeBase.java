package org.jboss.shrinkwrap.descriptor.api.application5; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * Base support for read-only views of this descriptors root element. Not intended for direct use by users; 
 *  
 * @param <RETURNTYPE> 
 *            The true type to be returned for <code>this</code> references (covarient return) 
 *  
 * @param <PARENTTYPE> 
 *            The type of this elements parent 
 *  
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-06-28T12:19:49.689-04:00
 */
public interface ApplicationTypeBase<RETURNTYPE extends ApplicationTypeBase<RETURNTYPE, PARENTTYPE>, PARENTTYPE> extends Child<PARENTTYPE> {
}
