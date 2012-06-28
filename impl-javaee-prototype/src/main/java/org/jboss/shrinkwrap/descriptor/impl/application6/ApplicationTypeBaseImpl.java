package org.jboss.shrinkwrap.descriptor.impl.application6; 

import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationDescriptorBase;
import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationTypeBase;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeModel;

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
public abstract class ApplicationTypeBaseImpl<ROOTTYPE extends ApplicationTypeBase<ROOTTYPE, DESCRIPTORTYPE>,
    DESCRIPTORTYPE extends ApplicationDescriptorBase<ROOTTYPE, DESCRIPTORTYPE>>
    implements ApplicationTypeBase<ROOTTYPE, DESCRIPTORTYPE>, NodeModel {

    private DESCRIPTORTYPE parent;
    private Node model;

   public ApplicationTypeBaseImpl(final DESCRIPTORTYPE parent, final Node model) throws IllegalArgumentException {
      if (parent == null) {
          throw new IllegalArgumentException("parent must be specified");
       }
       if (model == null) {
          throw new IllegalArgumentException("model must be specified");
       }
       this.parent = parent;
       this.model = model;
   }

   public Node getRootNode()
   {
      return model;
   }

   public  DESCRIPTORTYPE  up()
   {
      return  parent ;
   }

}
