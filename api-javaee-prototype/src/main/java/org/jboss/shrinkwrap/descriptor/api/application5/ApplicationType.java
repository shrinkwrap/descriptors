package org.jboss.shrinkwrap.descriptor.api.application5; 

import java.util.List;

/**
 * This interface defines the contract for the <code> applicationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-04-29T13:08:39.494+02:00
 */
public interface ApplicationType<P>
{   
   public MutableApplicationType<P> toMutable();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

 
   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleType<P>> getAllModule();
 
   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory();


   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();
}
