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

package org.jboss.shrinkwrap.descriptor.cli;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.TransformerException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jboss.shrinkwrap.descriptor.cli.attributes.BaseAttributes;
import org.jboss.shrinkwrap.descriptor.cli.parser.CommandLineOptions;

import uk.co.flamingpenguin.jewel.cli.ArgumentValidationException;
import uk.co.flamingpenguin.jewel.cli.Cli;
import uk.co.flamingpenguin.jewel.cli.CliFactory;

/**
 * Main class for executing a custom XSD to java descriptor code transformation.
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class Main extends BaseAttributes
{
   private final static Log log = LogFactory.getLog(Main.class);
   
   /**
    * Executes the transformation.
    * @throws TransformerException
    * @throws IOException 
    */
   public void transform() throws TransformerException, IOException 
   {
      System.setProperty("javax.xml.transform.TransformerFactory", "net.sf.saxon.TransformerFactoryImpl");
      
      final WorkingDirHandler workingDirHandler = new WorkingDirHandler(this); 
      
      /** initialize the map which will overwrite global parameters as defined in metadata.xsl/ddJava.xsl */
      final Map<String, String> xsltParameters = new HashMap<String, String>();
      xsltParameters.put("gOutputFolder", getTargetDir());
      xsltParameters.put("gOutputFolderApi", getTargetDir());
      xsltParameters.put("gOutputFolderTest", getTestDir());
      xsltParameters.put("gOutputFolderService", getServiceDir());
          
      /** transform context xml to metadata.xml */
      XsltTransformer.simpleTransform(getContextFile(), 
            workingDirHandler.getPathToMetaDataXml(), 
            workingDirHandler.getWorkingDir() + "/metadata.xml", xsltParameters);
      
      /** generate java classes based on metadata.xml */
      XsltTransformer.simpleTransform(workingDirHandler.getWorkingDir() + "/metadata.xml", 
            workingDirHandler.getPathToDDJavaXml(), 
            workingDirHandler.getWorkingDir() + "/ddJava.xml", 
            xsltParameters);      
   }
   
   /**
    * The static main class.
    * @param args the command line arguments specifying the transformation input and output.
    */
   public static void main(final String[] args)
   {
      try
      {
         final Main main = get(args);
         
         if (main != null)
         {
            main.transform();
         }
      }
      catch(Exception ex)
      {
         log.error(ex.getMessage(), ex);
      }
   }

   /**
    * Returns a <code>Main</code> instance.
    * @param args the command line arguments instructing the transformation process.
    * @return an instance of the <code>Main</code> class.
    */
   private static Main get(final String[] args)
   {
      Main reply = null;
      final boolean isTrace = false;
      
      try
      {
         final Main main = new Main();
         final CommandLineOptions options = CliFactory.parseArguments(CommandLineOptions.class, args);
         main.setContextFile(options.getContextFile());
         main.setTargetDir(options.getTargetDir());
         main.setTestDir(options.getTestDir());
         main.setTempDir(options.getTempDir());
         main.setServiceDir(options.getServiceDir());
         main.setTrace(options.isTrace()); 
         reply = main;
      }
      catch (ArgumentValidationException ex)
      {
         final Cli<CommandLineOptions> cli = CliFactory.createCli(CommandLineOptions.class);
         log.error(ex.getMessage());
         log.info(cli.getHelpMessage());
      }
      catch (Exception ex)
      {
         final Cli<CommandLineOptions> cli = CliFactory.createCli(CommandLineOptions.class);
         log.error(ex.getMessage());
         log.info(cli.getHelpMessage());
         if (isTrace) {
            log.error("Trace:\n" + ex.getMessage(), ex);
         }
      }
      
      return reply;
   }

}
