/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.spi.xml.dom;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorImportException;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorImporterBase;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

/**
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class XmlDomImporter<T extends Descriptor> extends DescriptorImporterBase<T>
{
   private final Logger log = Logger.getLogger(XmlDomImporter.class.getName());
   
   public XmlDomImporter(final Class<T> endUserViewImplType, String descriptorName)
   {
      super(endUserViewImplType, descriptorName);
   }

   /**
    *
    * @param stream The Stream of data.
    * @return the imported node
    * @throws DescriptorImportException if import fails from specified stream
    * @throws IllegalArgumentException if the close parameter was specified as true for a stream which was unclosable.
    */
   @Override
   public Node importRootNode(InputStream stream) throws DescriptorImportException
   {
      return importRootNode(stream, true);
   }

   /**
    *
    * @param stream The Stream of data.
    * @param close Whether to close the specified stream
    * @return the imported node
    * @throws DescriptorImportException if import fails from specified stream
    * @throws IllegalArgumentException if the close parameter was specified as true for a stream which was unclosable.
    */
   @Override
   public Node importRootNode(InputStream stream, boolean close) throws DescriptorImportException
   {
      try
      {
         // Empty contents?  If so, no root Node
         if (stream.available() == 0)
         {
            return null;
         }
         
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         factory.setNamespaceAware(true);
         DocumentBuilder builder = factory.newDocumentBuilder();
         Document doc = builder.parse(stream);
         
         Node root = new Node(doc.getDocumentElement().getNodeName());
         readRecursive(root, doc.getDocumentElement());
         return root;
         
      }
      catch (Exception e) 
      {
         throw new DescriptorImportException("Could not import XML from stream", e);
      }
      finally
      {
         if(close)
         {
            try
            {
               stream.close();
            }
            catch(IOException ioe)
            {
               try{
                  stream.close();
               }
               catch(IOException i)
               {
                  log.log(Level.WARNING, "Unclosable stream specified to be closed: {0}", stream);
               }
            }
         }
      }
   }


   private void readRecursive(Node target, org.w3c.dom.Node source) 
   {
      readAttributes(target, source);
      NodeList sourceChildren = source.getChildNodes();
      if(sourceChildren != null)
      {
         for(int i = 0; i < sourceChildren.getLength(); i++)
         {
            final org.w3c.dom.Node child = sourceChildren.item(i);
            if(child.getNodeType() != org.w3c.dom.Node.TEXT_NODE)
            {
               // Create our representation of the Node
               final Node newTarget = target.create(child.getNodeName());
               
               if(onlyTextChildren(child))
               {
                  // See if we're dealing with a comment and mark specifically
                  if (child.getNodeType() == org.w3c.dom.Node.COMMENT_NODE)
                  {
                     newTarget.setComment(true);
                  }
                  
                  // Set text
                  newTarget.text(child.getTextContent());
                  readAttributes(newTarget, child);
               }
               else
               {
                  readRecursive(newTarget, child);   
               }
            }
         }
      }
   }

   private void readAttributes(Node target, org.w3c.dom.Node source)
   {
      NamedNodeMap attributes = source.getAttributes();
      if(attributes != null)
      {
         for(int i = 0 ; i < attributes.getLength(); i++)
         {
            org.w3c.dom.Node attribute = attributes.item(i);
            target.attribute(attribute.getNodeName(), attribute.getNodeValue());
         }
      }
   }

   /**
    * @param source
    * @return
    */
   private boolean onlyTextChildren(org.w3c.dom.Node source)
   {
      NodeList children = source.getChildNodes();
      for(int i = 0 ; i < children.getLength(); i++)
      {
         org.w3c.dom.Node child = children.item(i);
         if(child.getNodeType() != org.w3c.dom.Node.TEXT_NODE)
         {
            return false;
         }
      }
      return true;
   }
}
