package org.jboss.shrinkwrap.descriptor.cli;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Class which allows the load and retrieve application specific properties.
 * @author bfr
 *
 */
public class PropertyHandler
{
   public static final String CLI_PROP_WORKING_DIR          = "descriptor.cli.working.dir";
   public static final String CLI_PROP_RESULT_DIR_API       = "descriptor.cli.result.dir.api";
   public static final String CLI_PROP_RESULT_DIR_IMPL      = "descriptor.cli.result.dir.impl";
   public static final String CLI_PROP_RESULT_DIR_TEST      = "descriptor.cli.result.dir.test";   
   public static final String CLI_PROP_PATH_CONTEXT_XML     = "descriptor.cli.path.context.xml";
   public static final String CLI_PROP_PATH_EX_METADATA_XML = "descriptor.cli.path.ext.metadata.xml";
   public static final String CLI_PROP_PATH_EX_DDJAVA_XML   = "descriptor.cli.path.ext.ddjava.xml";
   
   private final Properties prop = new Properties();
   
   /**
    * Creates a new instance of the class.
    * @param pathToPropertiesFile -  path to a readable properties file.
    * @throws FileNotFoundException - thrown, if the file doesn't exist.
    * @throws IOException - thrown, if an IO error occurs.
    */
   public PropertyHandler(final String pathToPropertiesFile) throws FileNotFoundException, IOException
   {
      prop.load(new FileInputStream(pathToPropertiesFile));
      checkMandatoryProperties();
   }

   public String getWorkingDir(final String defaultDir)
   {
      return prop.getProperty(CLI_PROP_WORKING_DIR, defaultDir);
   }

   public String getResultDirApi(final String defaultDir)
   {
      return prop.getProperty(CLI_PROP_RESULT_DIR_API, defaultDir);
   }
   
   public String getResultDirImpl(final String defaultDir)
   {
      return prop.getProperty(CLI_PROP_RESULT_DIR_IMPL, defaultDir);
   }

   public String getResultDirTest(final String defaultDir)
   {
      return prop.getProperty(CLI_PROP_RESULT_DIR_TEST, defaultDir);
   }

   public String getPathToExternalMetadataXml(final String defaultFile)
   {
      return prop.getProperty(CLI_PROP_PATH_EX_METADATA_XML, defaultFile);
   }

   public String getPathToExternalDDJavaXml(final String defaultFile)
   {
      return prop.getProperty(CLI_PROP_PATH_EX_DDJAVA_XML, defaultFile);
   }

   public String getPathToContextXml()
   {
      return prop.getProperty(CLI_PROP_PATH_CONTEXT_XML);
   }
   
   //------------------------------------------------------------------------------------------------------------------||
   //--- Private Methods ----------------------------------------------------------------------------------------------||
   //------------------------------------------------------------------------------------------------------------------||
   
   private void checkMandatoryProperties()
   {
      if (getPathToContextXml() == null)
      {
         throw new RuntimeException("Context XML file not specified in configuration file!");
      }
   }
   
}
