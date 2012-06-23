package org.jboss.shrinkwrap.descriptor.api.application5; 

import java.util.List;

/**
 * This interface defines the contract for the <code> applicationType </code> xsd type. 
 * This is the root element. Because of this, this interface doesn't need to extends Child<P>
 */
public interface MutableApplicationType<P>
{
   public ApplicationType<P> toImmutable();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ApplicationTypeMutable<RETURNTYPE, PARENTTYPE></code> 
    */
   public P description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ApplicationTypeMutable<RETURNTYPE, PARENTTYPE></code> 
    */
   public P removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>ApplicationTypeMutable<RETURNTYPE, PARENTTYPE></code> 
    */
   public P displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>ApplicationTypeMutable<RETURNTYPE, PARENTTYPE></code> 
    */
   public P removeAllDisplayName();
 
  
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: javaee:moduleType ElementType : module
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>module</code> element will be created and returned.
    * Otherwise, the first existing <code>module</code> element will be returned.
    * @return the instance defined for the element <code>module</code> 
    */
   public MutableModuleType<P> getOrCreateModule();
   
   /**
    * Creates a new <code>module</code> element 
    * @return the new created instance of <code>ModuleType<ApplicationTypeMutable<RETURNTYPE, PARENTTYPE>></code> 
    */
   public MutableModuleType<P> createModule();

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<MutableModuleType<P>> getAllModule();

   /**
    * Removes all <code>module</code> elements 
    * @return the current instance of <code>ModuleType<ApplicationTypeMutable<RETURNTYPE, PARENTTYPE>></code> 
    */
   public P removeAllModule();


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: xsd:token ElementType : library-directory
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>library-directory</code> element
    * @param libraryDirectory the value for the element <code>library-directory</code> 
    * @return the current instance of <code>ApplicationTypeMutable<RETURNTYPE, PARENTTYPE></code> 
    */
   public P libraryDirectory(String libraryDirectory);

   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory();

   /**
    * Removes the <code>library-directory</code> element 
    * @return the current instance of <code>ApplicationTypeMutable<RETURNTYPE, PARENTTYPE></code> 
    */
   public P removeLibraryDirectory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ApplicationTypeMutable<RETURNTYPE, PARENTTYPE></code> 
    */
   public P version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ApplicationTypeMutable<RETURNTYPE, PARENTTYPE></code> 
    */
   public P removeVersion();
}
