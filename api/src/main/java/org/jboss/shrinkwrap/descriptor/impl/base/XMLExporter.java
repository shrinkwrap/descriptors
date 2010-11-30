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

import java.io.OutputStream;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.jboss.shrinkwrap.descriptor.api.core.Exporter;
import org.jboss.shrinkwrap.descriptor.api.core.ExporterException;
import org.jboss.shrinkwrap.descriptor.api.core.Node;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;

/**
 * XMLExporter
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class XMLExporter implements Exporter
{
   @Override
   public void to(Node node, OutputStream out) throws ExporterException
   {
      try
      {
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         factory.setNamespaceAware(true);
         DocumentBuilder builder = factory.newDocumentBuilder();
         Document root = builder.newDocument();

         writeRecursive(root, node);

         Transformer transformer = TransformerFactory.newInstance().newTransformer();
         transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
         transformer.setOutputProperty(OutputKeys.INDENT, "yes");
         
         StreamResult result = new StreamResult(out);
         transformer.transform(new DOMSource(root), result);
      }
      catch (Exception e)
      {
         throw new ExporterException(e);
      }
   }

   /**
    * @param root
    * @param node
    */
   private void writeRecursive(org.w3c.dom.Node target, Node source)
   {
      Document owned = target.getOwnerDocument();
      if(owned == null)
      {
         owned = (Document)target;
      }
      org.w3c.dom.Node targetChild = null;
      if(source.getText() != null) 
      {
         targetChild = owned.createElement(source.getName());
         targetChild.appendChild(owned.createTextNode(source.getText()));
      }
      else
      {
         targetChild = owned.createElement(source.getName());
      }
      
      target.appendChild(targetChild);
      
      for(Map.Entry<String, String> attribute: source.getAttributes().entrySet())
      {
         Attr attr = owned.createAttribute(attribute.getKey());
         attr.setValue(attribute.getValue());

         targetChild.getAttributes().setNamedItem(attr);
      }
      for(Node sourceChild : source.getChildren())
      {
         writeRecursive(targetChild, sourceChild);
      }
   }
}