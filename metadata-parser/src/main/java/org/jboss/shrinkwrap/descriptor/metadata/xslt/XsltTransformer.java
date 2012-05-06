/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
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

package org.jboss.shrinkwrap.descriptor.metadata.xslt;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * Executes a xslt transformation process.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class XsltTransformer
{
   /** 
    * Simple transformation method. 
    * @param sourcePath - Absolute path to source xml file. 
    * @param xsltPath - Absolute path to xslt file. 
    * @param resultDir - Directory where you want to put resulting files. 
    * @param parameters - Map defining global XSLT parameters based via tranformer to the XSLT file. 
    * @throws TransformerException 
    */
   public static void simpleTransform(final String sourcePath, final String xsltPath, final String resultDir,
         final Map<String, String> parameters) throws TransformerException
   {
      final TransformerFactory tFactory = TransformerFactory.newInstance("net.sf.saxon.TransformerFactoryImpl", null);
      final Transformer transformer = tFactory.newTransformer(new StreamSource(new File(xsltPath)));
      applyParameters(transformer, parameters);
      transformer.transform(new StreamSource(new File(sourcePath)), new StreamResult(new File(resultDir)));
   }

   /** 
    * Simple transformation method. 
    * @param sourcePath - Absolute path to source xml file. 
    * @param StreamSource - the xslt file. 
    * @param resultDir - Directory where you want to put resulting files. 
    * @param parameters - Map defining global XSLT parameters based via tranformer to the XSLT file. 
    * @throws TransformerException 
    */
   public static void simpleTransform(final String sourcePath, final StreamSource xsltSource, 
         final String resultDir, final Map<String, String> parameters) throws TransformerException
   {
      final TransformerFactory tFactory = TransformerFactory.newInstance("net.sf.saxon.TransformerFactoryImpl", null);
      final Transformer transformer = tFactory.newTransformer(xsltSource);
      applyParameters(transformer, parameters);
      transformer.transform(new StreamSource(new File(sourcePath)), new StreamResult(new File(resultDir  + "/metadata.xml")));
   }
   
   /** 
    * Simple transformation method. 
    * @param contextFile - Absolute path to source xml file. 
    * @param StreamSource - the xslt file. 
    * @param resultDir - Directory where you want to put resulting files. 
    * @param parameters - Map defining global XSLT parameters based via transformer to the XSLT file. 
    * @throws TransformerException 
    */
   public static void simpleTransform(final String contextFile, final InputStream xsltSource, 
         final File result, final Map<String, String> parameters) throws TransformerException
   {
      final TransformerFactory tFactory = TransformerFactory.newInstance("net.sf.saxon.TransformerFactoryImpl", null);
      final Transformer transformer = tFactory.newTransformer(new StreamSource(xsltSource));
      applyParameters(transformer, parameters);
      transformer.transform(new StreamSource(new File(contextFile)), new StreamResult(result));
   }

   /**
    * Applies all key/value pairs as defined by the given <code>Map</code> to the given <code>Transformer</code> instance.
    * @param transformer
    * @param parameters
    */
   private static void applyParameters(final Transformer transformer, final Map<String, String> parameters)
   {
      final Set<String> keys = parameters.keySet();
      for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();)
      {
         final String key = iterator.next();
         transformer.setParameter(key, parameters.get(key));
      }
   }
}
