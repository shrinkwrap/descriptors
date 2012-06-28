package org.jboss.shrinkwrap.descriptor.api.application5; 

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ApplicationDescriptorBase descriptor = Descriptors.create(ApplicationDescriptorBase.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-06-28T12:19:49.689-04:00
 */
public interface ApplicationDescriptorBase<ROOTTYPE 
    extends ApplicationTypeBase<ROOTTYPE, DESCRIPTORTYPE>, DESCRIPTORTYPE
    extends ApplicationDescriptorBase<ROOTTYPE, DESCRIPTORTYPE>>
    extends Descriptor {

    public ROOTTYPE getRoot();
}
