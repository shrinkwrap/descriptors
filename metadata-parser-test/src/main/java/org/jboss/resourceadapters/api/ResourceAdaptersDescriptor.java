package org.jboss.resourceadapters.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.resourceadapters.api.ResourceAdapterType;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ResourceAdaptersDescriptor descriptor = Descriptors.create(ResourceAdaptersDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:31.029-07:00
 */
public interface ResourceAdaptersDescriptor extends Descriptor, DescriptorNamespace<ResourceAdaptersDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceAdaptersDescriptor ElementName: resourceadapters:resource-adapterType ElementType : resource-adapter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-adapter</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-adapter</code> element will be returned.
    * @return the instance defined for the element <code>resource-adapter</code> 
    */
   public ResourceAdapterType<ResourceAdaptersDescriptor> getOrCreateResourceAdapter();

   /**
    * Creates a new <code>resource-adapter</code> element 
    * @return the new created instance of <code>ResourceAdapterType<ResourceAdaptersDescriptor></code> 
    */
   public ResourceAdapterType<ResourceAdaptersDescriptor> createResourceAdapter();

   /**
    * Returns all <code>resource-adapter</code> elements
    * @return list of <code>resource-adapter</code> 
    */
   public List<ResourceAdapterType<ResourceAdaptersDescriptor>> getAllResourceAdapter();

   /**
    * Removes all <code>resource-adapter</code> elements 
    * @return the current instance of <code>ResourceAdapterType<ResourceAdaptersDescriptor></code> 
    */
   public ResourceAdaptersDescriptor removeAllResourceAdapter();
}
