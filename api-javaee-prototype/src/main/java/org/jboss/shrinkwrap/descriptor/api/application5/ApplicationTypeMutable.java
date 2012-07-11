package org.jboss.shrinkwrap.descriptor.api.application5; 

import java.util.List;

/**
 * This interface defines the contract for the <code> applicationType </code> xsd type 
 *  
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-07-08T16:29:08.216+02:00
 */
public interface ApplicationTypeMutable extends ApplicationTypeBase<ApplicationTypeMutable, MutableApplicationDescriptor> {
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public ApplicationTypeMutable description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public ApplicationTypeMutable removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public ApplicationTypeMutable displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public ApplicationTypeMutable removeAllDisplayName();
 
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: javaee:moduleType ElementType : module
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>module</code> element will be created and returned.
    * Otherwise, the first existing <code>module</code> element will be returned.
    * @return the instance defined for the element <code>module</code> 
    */
   public ModuleType<ApplicationTypeMutable> getOrCreateModule();

   /**
    * Creates a new <code>module</code> element 
    * @return the new created instance of <code>ModuleType<ApplicationTypeMutable></code> 
    */
   public ModuleType<ApplicationTypeMutable> createModule();

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleType<ApplicationTypeMutable>> getAllModule();

   /**
    * Removes all <code>module</code> elements 
    * @return the current instance of <code>ModuleType<ApplicationTypeMutable></code> 
    */
   public ApplicationTypeMutable removeAllModule();

 
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: xsd:token ElementType : library-directory
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>library-directory</code> element
    * @param libraryDirectory the value for the element <code>library-directory</code> 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public ApplicationTypeMutable libraryDirectory(String libraryDirectory);

   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory();

   /**
    * Removes the <code>library-directory</code> element 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public ApplicationTypeMutable removeLibraryDirectory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public ApplicationTypeMutable version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public ApplicationTypeMutable removeVersion();
}
