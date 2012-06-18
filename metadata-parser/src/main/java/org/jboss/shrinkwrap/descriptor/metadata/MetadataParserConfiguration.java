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

package org.jboss.shrinkwrap.descriptor.metadata;

import java.util.Properties;


/**
 * Mojo configuration class for the Shrinkwrap Descriptors CLI Mojo task.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataParserConfiguration
{
	   
   /**
    * Path to the XSD file to be parsed
    * 
    */
   protected String pathToXsd;

   /**
    * The namespace for the given XSD.
    * 
    */
   protected String nameSpace;

   /**
    * The package name for the API classes.
    * 
    */
   protected String packageApi;

   /**
    * The package name for the Implementation classes.
    * 
    */
   protected String packageImpl;

   /**
    * The name of the descriptor.
    * 
    */
   protected String descriptorName;

   /**
    * The name of the root element.
    * 
    */
   protected String elementName;

   /**
    * The type of the root element.
    * 
    */
   protected String elementType;
   
   /**
    * The default descriptor file name.
    * 
    */
   protected String defaultFileName;

   /**
    * If true, then the classes for this descriptor are generated, otherwise this descriptor
    * is only used for the import section.
    * 
    */
   protected boolean generateClasses = true;
   
   /**
    * Trace flag
    * 
    */
   protected boolean verbose;

   /**
    * The map declaring the name spaces for the given descriptor.
    */
   protected Properties namespaces = new Properties();

   public String getNameSpace()
   {
      return nameSpace;
   }

   public void setNameSpace(final String nameSpace)
   {
      this.nameSpace = nameSpace;
   }

   public String getPackageApi()
   {
      return packageApi;
   }

   public void setPackageApi(final String packageApi)
   {
      this.packageApi = packageApi;
   }

   public String getPackageImpl()
   {
      return packageImpl;
   }

   public void setPackageImpl(final String packageImpl)
   {
      this.packageImpl = packageImpl;
   }

   public String getPathToXsd()
   {
      return pathToXsd;
   }

   public void setPathToXsd(final String pathToXsd)
   {
      this.pathToXsd = pathToXsd;
   }

   public String getElementName()
   {
      return elementName;
   }

   public void setElementName(final String elementName)
   {
      this.elementName = elementName;
   }

   public String getElementType()
   {
      return elementType;
   }

   public void setElementType(final String elementType)
   {
      this.elementType = elementType;
   }

   public boolean isVerbose()
   {
      return verbose;
   }

   public void setVerbose(final boolean verbose)
   {
      this.verbose = verbose;
   }

   public String getDescriptorName()
   {
      return descriptorName;
   }

   public void setDescriptorName(final String descriptorName)
   {
      this.descriptorName = descriptorName;
   }

   public Properties getNamespaces()
   {
      return namespaces;
   }

   public void setNamespaces(final Properties namespaces)
   {
      this.namespaces = namespaces;
   }

   public boolean isGenerateClasses()
   {
      return generateClasses;
   }

   public void setGenerateClasses(final boolean generateClasses)
   {
      this.generateClasses = generateClasses;
   }

   public String getDefaultFileName() {
	  return defaultFileName;
   }
	
   public void setDefaultFileName(final String defaultFileName) {
	  this.defaultFileName = defaultFileName;
   }
   
}
