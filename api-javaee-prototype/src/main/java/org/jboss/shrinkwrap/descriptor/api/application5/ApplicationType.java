package org.jboss.shrinkwrap.descriptor.api.application5; 

import java.util.List;

/**
 * This class implements the <code> applicationType </code> xsd type 
 *  
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-07-08T16:29:08.216+02:00
 */
public interface ApplicationType extends ApplicationTypeBase<ApplicationType, ApplicationDescriptor> {
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:moduleType ElementType : module
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleTypeReader<ApplicationType>> getAllModule();


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:token ElementType : library-directory
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();
}
