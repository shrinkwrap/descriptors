package org.jboss.shrinkwrap.descriptor.impl.application6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationType;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleTypeReader;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> applicationType </code> xsd type 
 *  
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-06-28T12:19:49.689-04:00
 */
public final class ApplicationTypeImpl extends ApplicationTypeBaseImpl<ApplicationType, ApplicationDescriptor>
    implements ApplicationType {

   public ApplicationTypeImpl(final ApplicationDescriptorImpl parent, final Node model) throws IllegalArgumentException {
      super(parent, model);
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:string ElementType : description
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
   // ClassName: ApplicationType ElementName: xsd:token ElementType : display-name
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
   // ClassName: ApplicationType ElementName: xsd:token ElementType : application-name
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>application-name</code> element
    * @return the node defined for the element <code>application-name</code> 
    */
   public String getApplicationName()
   {
      return getRootNode().getTextValueForPatternName("application-name");
   }

 
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:moduleType ElementType : module
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleTypeReader<ApplicationType>> getAllModule()
   {
      List<ModuleTypeReader<ApplicationType>> list = new ArrayList<ModuleTypeReader<ApplicationType>>();
      List<Node> nodeList = getRootNode().get("module");
      for(Node node: nodeList)
      {
         ModuleTypeReader<ApplicationType>  type = new ModuleTypeReaderImpl<ApplicationType>(this, "module", getRootNode(), node);
         list.add(type);
      }
      return list;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:token ElementType : library-directory
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
   // ClassName: ApplicationType ElementName: xsd:token ElementType : version
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
