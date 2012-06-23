package org.jboss.shrinkwrap.descriptor.api.application5; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> moduleType </code> xsd type.
 */
public interface ModuleType<P> extends Child<P>
{
   public MutableModuleType<P> toMutable();
   
   /**
    * Returns the <code>connector</code> element
    * @return the node defined for the element <code>connector</code> 
    */
   public String getConnector();


   /**
    * Returns the <code>ejb</code> element
    * @return the node defined for the element <code>ejb</code> 
    */
   public String getEjb();

   /**
    * Returns the <code>java</code> element
    * @return the node defined for the element <code>java</code> 
    */
   public String getJava();

   /**
    * Returns the <code>web</code> element.
    * @return  the existing instance of <code>WebType<ModuleTypeBase<RETURNTYPE, P>></code>, or null if not found
    */
   public WebType<ModuleType<P>> getWeb();

   /**
    * Returns the <code>alt-dd</code> element
    * @return the node defined for the element <code>alt-dd</code> 
    */
   public String getAltDd();

}
