package org.jboss.shrinkwrap.descriptor.api.application5; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> webType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @since Generation date :2012-07-08T16:29:08.216+02:00
 */
public interface WebType<T> extends Child<T>
{
   public void set(String webUri, String contextRoot);
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebType ElementName: xsd:token ElementType : web-uri
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>web-uri</code> element
    * @param webUri the value for the element <code>web-uri</code> 
    * @return the current instance of <code>WebType<T></code> 
    */
   public WebType<T> webUri(String webUri);

   /**
    * Returns the <code>web-uri</code> element
    * @return the node defined for the element <code>web-uri</code> 
    */
   public String getWebUri();

   /**
    * Removes the <code>web-uri</code> element 
    * @return the current instance of <code>WebType<T></code> 
    */
   public WebType<T> removeWebUri();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebType ElementName: xsd:token ElementType : context-root
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>context-root</code> element
    * @param contextRoot the value for the element <code>context-root</code> 
    * @return the current instance of <code>WebType<T></code> 
    */
   public WebType<T> contextRoot(String contextRoot);

   /**
    * Returns the <code>context-root</code> element
    * @return the node defined for the element <code>context-root</code> 
    */
   public String getContextRoot();

   /**
    * Removes the <code>context-root</code> element 
    * @return the current instance of <code>WebType<T></code> 
    */
   public WebType<T> removeContextRoot();
}
