package org.jboss.shrinkwrap.descriptor.cli;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import uk.co.flamingpenguin.jewel.cli.ArgumentValidationException;
import uk.co.flamingpenguin.jewel.cli.Cli;
import uk.co.flamingpenguin.jewel.cli.CliFactory;

public class Main
{
   private final static Log log = LogFactory.getLog(Main.class);
   
   public static void main(String[] args)
   {
      System.setProperty("javax.xml.transform.TransformerFactory", "net.sf.saxon.TransformerFactoryImpl");
      
      try
      {
         PropertyHandler properties = getConfiguration(args);
         
         if (properties != null)
         {
            WorkingDirHandler workingDirHandler = new WorkingDirHandler(properties); 
            
            // initialize the map which will overwrite global parameters defined in metadata.xsl
            Map<String, String> xsltParameters = new HashMap<String, String>();
            xsltParameters.put("gOutputFolder", properties.getResultDirImpl(workingDirHandler.getWorkingDir() + "/src/main/java"));
            xsltParameters.put("gOutputFolderApi", properties.getResultDirApi(workingDirHandler.getWorkingDir() + "/src/main/java"));
            xsltParameters.put("gOutputFolderTest", properties.getResultDirTest(workingDirHandler.getWorkingDir() + "/src/test/java"));
                
            // transform context xml to metadata.xml
            XsltTransformer.simpleTransform(properties.getPathToContextXml(),  
                  workingDirHandler.getPathToMetaDataXml(), 
                  workingDirHandler.getWorkingDir() + "/metadata.xml", 
                  xsltParameters);      
            
            // generate java classes based on metadata.xml
            XsltTransformer.simpleTransform(workingDirHandler.getWorkingDir() + "/metadata.xml", 
                  workingDirHandler.getPathToDDJavaXml(), 
                  workingDirHandler.getWorkingDir() + "/ddJava.xml", 
                  xsltParameters);
         }
      }
      catch(Exception ex)
      {
         log.error(ex.getMessage(), ex);
      }
   }

   /**
    * Returns a <code>PropertyHandler</code> based on the path specified on the command line.
    * @param args
    * @return
    */
   private static PropertyHandler getConfiguration(final String[] args)
   {
      PropertyHandler propertyHandler = null;
      boolean isTrace = false;
      
      try
      {
         CommandLineOptions options = CliFactory.parseArguments(CommandLineOptions.class, args);
         isTrace = options.isTrace();
         propertyHandler = new PropertyHandler(options.getConfiguration());
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
      
      return propertyHandler;
   }

}
