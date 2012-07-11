package org.jboss.shrinkwrap.descriptor.impl.application5; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationTypeMutable;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.application5.MutableApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     MutableApplicationDescriptorImpl descriptor = Descriptors.create(MutableApplicationDescriptorImpl.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-07-08T16:29:08.216+02:00
 */
public final class MutableApplicationDescriptorImpl extends ApplicationDescriptorBaseImpl<ApplicationTypeMutable,MutableApplicationDescriptor>
   implements MutableApplicationDescriptor {

   public MutableApplicationDescriptorImpl(final String descriptorName, final Node model)   {
      super(descriptorName, model);
   }

   public MutableApplicationDescriptorImpl(final String descriptorName)   {
      super(descriptorName);
   }

   public ApplicationDescriptor toImmutable() {
       return new ApplicationDescriptorImpl(this.getDescriptorName(), this.getRootNode());
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MutableApplicationDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>MutableApplicationDescriptor</code> 
    */
   public MutableApplicationDescriptor description(String ... values)
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
    * @return the current instance of <code>MutableApplicationDescriptor</code> 
    */
   public MutableApplicationDescriptor removeAllDescription()
   {
      getRootNode().removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MutableApplicationDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>MutableApplicationDescriptor</code> 
    */
   public MutableApplicationDescriptor displayName(String ... values)
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
    * @return the current instance of <code>MutableApplicationDescriptor</code> 
    */
   public MutableApplicationDescriptor removeAllDisplayName()
   {
      getRootNode().removeChildren("display-name");
      return this;
   }
 
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MutableApplicationDescriptor ElementName: javaee:moduleType ElementType : module
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>module</code> element will be created and returned.
    * Otherwise, the first existing <code>module</code> element will be returned.
    * @return the instance defined for the element <code>module</code> 
    */
   public ModuleType<MutableApplicationDescriptor> getOrCreateModule()
   {
      List<Node> nodeList = getRootNode().get("module");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ModuleTypeImpl<MutableApplicationDescriptor>(this, "module", getRootNode(), nodeList.get(0));
      }
      return createModule();
   }

   /**
    * Creates a new <code>module</code> element 
    * @return the new created instance of <code>ModuleType<MutableApplicationDescriptor></code> 
    */
   public ModuleType<MutableApplicationDescriptor> createModule()
   {
      return new ModuleTypeImpl<MutableApplicationDescriptor>(this, "module", getRootNode());
   }

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleType<MutableApplicationDescriptor>> getAllModule()
   {
      List<ModuleType<MutableApplicationDescriptor>> list = new ArrayList<ModuleType<MutableApplicationDescriptor>>();
      List<Node> nodeList = getRootNode().get("module");
      for(Node node: nodeList)
      {
         ModuleType<MutableApplicationDescriptor>  type = new ModuleTypeImpl<MutableApplicationDescriptor>(this, "module", getRootNode(), node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>module</code> elements 
    * @return the current instance of <code>ModuleType<MutableApplicationDescriptor></code> 
    */
   public MutableApplicationDescriptor removeAllModule()
   {
      getRootNode().removeChildren("module");
      return this;
   }

 
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MutableApplicationDescriptor ElementName: xsd:token ElementType : library-directory
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>library-directory</code> element
    * @param libraryDirectory the value for the element <code>library-directory</code> 
    * @return the current instance of <code>MutableApplicationDescriptor</code> 
    */
   public MutableApplicationDescriptor libraryDirectory(String libraryDirectory)
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
    * @return the current instance of <code>MutableApplicationDescriptor</code> 
    */
   public MutableApplicationDescriptor removeLibraryDirectory()
   {
      getRootNode().removeChildren("library-directory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MutableApplicationDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>MutableApplicationDescriptor</code> 
    */
   public MutableApplicationDescriptor version(String version)
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
    * @return the current instance of <code>MutableApplicationDescriptor</code> 
    */
   public MutableApplicationDescriptor removeVersion()
   {
      getRootNode().removeAttribute("version");
      return this;
   }
}
