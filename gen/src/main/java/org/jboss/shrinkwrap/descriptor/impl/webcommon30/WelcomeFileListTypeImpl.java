package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class WelcomeFileListTypeImpl<T> implements Child<T>, WelcomeFileListType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String welcomeFile;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WelcomeFileListTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("welcome-file-list");   }


   public T up()
   {
      return t;
   }



   public WelcomeFileListType<T> setWelcomeFile(String welcomeFile)
   {
      this.welcomeFile = welcomeFile;
      childNode.getOrCreate("welcome-file").text(welcomeFile);
      return this;
   }

   public String getWelcomeFile()
   {
      return welcomeFile;
   }

}
