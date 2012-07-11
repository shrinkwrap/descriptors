package org.jboss.shrinkwrap.descriptor.impl.application5; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationType;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleTypeReader;
import org.jboss.shrinkwrap.descriptor.api.application5.MutableApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ApplicationDescriptorImpl descriptor = Descriptors.create(ApplicationDescriptorImpl.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-07-08T16:29:08.216+02:00
 */
public final class ApplicationDescriptorImpl extends ApplicationDescriptorBaseImpl<ApplicationType,ApplicationDescriptor>
    implements ApplicationDescriptor {

   public ApplicationDescriptorImpl(final String descriptorName, final Node model)   {
      super(descriptorName, model);
   }

   public ApplicationDescriptorImpl(final String descriptorName)   {
      super(descriptorName);
   }

   public MutableApplicationDescriptor toMutable() {
       return new MutableApplicationDescriptorImpl(this.getDescriptorName(), this.getRootNode());
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = getRootNode().get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = getRootNode().get("display-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }
 
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:moduleType ElementType : module
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleTypeReader<ApplicationDescriptor>> getAllModule()
   {
      List<ModuleTypeReader<ApplicationDescriptor>> list = new ArrayList<ModuleTypeReader<ApplicationDescriptor>>();
      List<Node> nodeList = getRootNode().get("module");
      for(Node node: nodeList)
      {
         ModuleTypeReader<ApplicationDescriptor>  type = new ModuleTypeReaderImpl<ApplicationDescriptor>(this, "module", getRootNode(), node);
         list.add(type);
      }
      return list;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: xsd:token ElementType : library-directory
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory()
   {
      return getRootNode().getTextValueForPatternName("library-directory");
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return getRootNode().getAttribute("version");
   }
}
