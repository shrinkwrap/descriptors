package org.jboss.shrinkwrap.descriptor.impl.application6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.application5.MutableApplicationType;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.application5.MutableApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This interface defines the contract for the <code> applicationType </code> xsd type 
 *  
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-06-28T12:19:49.689-04:00
 */
public final class ApplicationTypeMutableImpl extends ApplicationTypeBaseImpl<MutableApplicationType, MutableApplicationDescriptor>
    implements MutableApplicationType {

   public ApplicationTypeMutableImpl(final MutableApplicationDescriptorImpl parent, final Node model) throws IllegalArgumentException {
      super(parent, model);
   }
 
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
   public MutableApplicationType description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            getRootNode().createChild("description").text(name);
         }
      }
      return this;
   }

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

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public MutableApplicationType removeAllDescription()
   {
      getRootNode().removeChildren("description");
      return this;
   }
 
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
   public MutableApplicationType displayName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            getRootNode().createChild("display-name").text(name);
         }
      }
      return this;
   }

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

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public MutableApplicationType removeAllDisplayName()
   {
      getRootNode().removeChildren("display-name");
      return this;
   }
 
   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ApplicationTypeMutable></code> 
    */
   public MutableApplicationType removeAllIcon()
   {
      getRootNode().removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: xsd:token ElementType : application-name
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>application-name</code> element
    * @param applicationName the value for the element <code>application-name</code> 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public MutableApplicationType applicationName(String applicationName)
   {
      getRootNode().getOrCreate("application-name").text(applicationName);
      return this;
   }

   /**
    * Returns the <code>application-name</code> element
    * @return the node defined for the element <code>application-name</code> 
    */
   public String getApplicationName()
   {
      return getRootNode().getTextValueForPatternName("application-name");
   }

   /**
    * Removes the <code>application-name</code> element 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public MutableApplicationType removeApplicationName()
   {
      getRootNode().removeChildren("application-name");
      return this;
   }

   /**
    * Returns the <code>initialize-in-order</code> element
    * @return the value found for the element <code>initialize-in-order</code> 
    */
   public String  getInitializeInOrderAsString()
   {
      return getRootNode().getTextValueForPatternName("initialize-in-order");
   }

   /**
    * Removes the <code>initialize-in-order</code> attribute 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public MutableApplicationType removeInitializeInOrder()
   {
      getRootNode().removeAttribute("initialize-in-order");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: javaee:moduleType ElementType : module
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>module</code> element will be created and returned.
    * Otherwise, the first existing <code>module</code> element will be returned.
    * @return the instance defined for the element <code>module</code> 
    */
   public ModuleType<MutableApplicationType> getOrCreateModule()
   {
      List<Node> nodeList = getRootNode().get("module");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ModuleTypeImpl<MutableApplicationType>(this, "module", getRootNode(), nodeList.get(0));
      }
      return createModule();
   }

   /**
    * Creates a new <code>module</code> element 
    * @return the new created instance of <code>ModuleType<ApplicationTypeMutable></code> 
    */
   public ModuleType<MutableApplicationType> createModule()
   {
      return new ModuleTypeImpl<MutableApplicationType>(this, "module", getRootNode());
   }

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleType<MutableApplicationType>> getAllModule()
   {
      List<ModuleType<MutableApplicationType>> list = new ArrayList<ModuleType<MutableApplicationType>>();
      List<Node> nodeList = getRootNode().get("module");
      for(Node node: nodeList)
      {
         ModuleType<MutableApplicationType>  type = new ModuleTypeImpl<MutableApplicationType>(this, "module", getRootNode(), node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>module</code> elements 
    * @return the current instance of <code>ModuleType<ApplicationTypeMutable></code> 
    */
   public MutableApplicationType removeAllModule()
   {
      getRootNode().removeChildren("module");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: xsd:token ElementType : library-directory
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>library-directory</code> element
    * @param libraryDirectory the value for the element <code>library-directory</code> 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public MutableApplicationType libraryDirectory(String libraryDirectory)
   {
      getRootNode().getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory()
   {
      return getRootNode().getTextValueForPatternName("library-directory");
   }

   /**
    * Removes the <code>library-directory</code> element 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public MutableApplicationType removeLibraryDirectory()
   {
      getRootNode().removeChildren("library-directory");
      return this;
   }

 

 

 
 

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationTypeMutable ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public MutableApplicationType version(String version)
   {
      getRootNode().attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return getRootNode().getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ApplicationTypeMutable</code> 
    */
   public MutableApplicationType removeVersion()
   {
      getRootNode().removeAttribute("version");
      return this;
   }
}
