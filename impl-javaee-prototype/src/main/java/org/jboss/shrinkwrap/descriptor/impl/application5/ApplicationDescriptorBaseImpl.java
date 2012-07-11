package org.jboss.shrinkwrap.descriptor.impl.application5; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationDescriptorBase;
import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationTypeBase;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.Mutable;
import org.jboss.shrinkwrap.descriptor.api.Immutable;
/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ApplicationDescriptorBaseImpl descriptor = Descriptors.create(ApplicationDescriptorBaseImpl.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-07-08T16:29:08.216+02:00
 */
public abstract class ApplicationDescriptorBaseImpl<ROOTTYPE extends ApplicationTypeBase<ROOTTYPE, DESCRIPTORTYPE>, DESCRIPTORTYPE
    extends ApplicationDescriptorBase<ROOTTYPE, DESCRIPTORTYPE>>
    extends NodeDescriptorImplBase
    implements ApplicationDescriptorBase<ROOTTYPE, DESCRIPTORTYPE> {
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ApplicationDescriptorBaseImpl(String descriptorName)
   {
       this(descriptorName, new Node("application"));
   }

   public ApplicationDescriptorBaseImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
      addDefaultNamespaces();
   }


   public Node getRootNode()
   {
      return model;
   }


   /**
    * Adds the default namespaces as defined in the specification 
    */
   private void addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/application_5.xsd");
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
   }

   /**
    * Adds a new namespace 
    */
   private void addNamespace(String name, String value)
   {
      model.attribute(name, value);
   }

}
