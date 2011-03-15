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
package org.jboss.shrinkwrap.descriptor.impl.base;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorImportException;
import org.jboss.shrinkwrap.descriptor.api.Node;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

/**
 * XMLImporter
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class XMLImporter<T extends Descriptor> extends DescriptorImporterBase<T>
{
   public XMLImporter(final Class<T> endUserViewImplType, String descriptorName)
   {
      super(endUserViewImplType, descriptorName);
   }
   
   @Override
   public Node importRootNode(InputStream stream) throws DescriptorImportException
   {
      try
      {
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
   }


   private void readRecursive(Node target, org.w3c.dom.Node source) 
   {
      readAttributes(target, source);
      NodeList sourceChildren = source.getChildNodes();
      if(sourceChildren != null)
      {
         for(int i = 0; i < sourceChildren.getLength(); i++)
         {
            org.w3c.dom.Node child = sourceChildren.item(i);
            if(child.getNodeType() != org.w3c.dom.Node.TEXT_NODE)
            {
               Node newTarget = target.create(child.getNodeName());
               if(onlyTextChildren(child))
               {
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
