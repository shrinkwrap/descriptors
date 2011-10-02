package org.jboss.shrinkwrap.descriptor.cli;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class WorkingDirHandler
{
   private final static Log log = LogFactory.getLog(WorkingDirHandler.class);
   private final static String TEMP_DIR = "temp";
   private final static String TEMP_XSLT_DIR = "xslt";
   private final static String TEMP_LIB_DIR = "lib";
   private final static String METADATA_XML = "metadata.xsl";
   private final static String DD_JAVA_XML = "ddJava.xsl";

   private String tmpDir;
   private String pathToMetaDataXml;
   private String pathToDDJavaXml;
   private boolean isExternalMetadataXml = false;
   private boolean isExternalDDJavaXml = false;

   WorkingDirHandler(final PropertyHandler properties) throws IOException
   {
      tmpDir = properties.getWorkingDir(TEMP_DIR);
      pathToMetaDataXml = tmpDir + "/" + TEMP_XSLT_DIR + "/" + METADATA_XML;
      pathToDDJavaXml = tmpDir + "/" + TEMP_XSLT_DIR + "/" + DD_JAVA_XML;
      isExternalMetadataXml = !properties.getPathToExternalMetadataXml("").isEmpty();
      isExternalDDJavaXml = !properties.getPathToExternalDDJavaXml("").isEmpty();
      
      if(isExternalMetadataXml)
      {
         pathToMetaDataXml = properties.getPathToExternalMetadataXml("");
      }
      
      if(isExternalDDJavaXml)
      {
         pathToDDJavaXml = properties.getPathToExternalDDJavaXml("");
      }
      
      setupWorkingDir();
   }

   /**
    * Setups up the working directory including writing of the XSLT files into this directory.
    * @throws IOException thrown, if en error by writing of the XSLT files occurs.
    */
   private void setupWorkingDir() throws IOException
   {
      createWorkingDir();
      extractStreamResources();
   }

   /**
    * Returns the current working directory.
    * @return
    */
   public String getWorkingDir()
   {
      return tmpDir;
   }
   
   /**
    * Returns the current working directory containing the XSLT files.
    * @return
    */
   public String getWorkingXsltDir()
   {
      return tmpDir + "/" + TEMP_XSLT_DIR;
   }
   
   /**
    * Returns the current working directory containing the XSLT files.
    * @return
    */
   public String getWorkingLibDir()
   {
      return tmpDir + "/" + TEMP_LIB_DIR;
   }
   
   /**
    * Returns the path of to the metadata.xslt file.
    * @return
    */
   public String getPathToMetaDataXml()
   {
      return pathToMetaDataXml;
   }
   
   /**
    * Returns the path of to the ddJava.xslt file.
    * @return
    */
   public String getPathToDDJavaXml()
   {
      return pathToDDJavaXml;
   }

   /**
    * Creates the temporary directory, if not already created.
    * If null, then a default temporary directory with the specified value of the attribute <code>TEMP_DIR</code> will be
    * in the current directory created.
    */
   private void createWorkingDir()
   {
      checkAndCreateDir(tmpDir);
      checkAndCreateDir(tmpDir + "/" + TEMP_XSLT_DIR);   
      checkAndCreateDir(tmpDir + "/" + TEMP_LIB_DIR);      
   }
   
   /**
    * Checks the existence of the given directory. If not existing, the directory will be created.
    * @param directory the name of the directory.
    */
   private void checkAndCreateDir(final String directory)
   {
      final File dir = (new File(directory));
      if (!dir.exists())
      {
         log.info("Temporary directory doesn't exist. Creating: " + dir.getAbsolutePath());
         final boolean success = (dir.mkdir());
         if (!success)
         {
            throw new RuntimeException("Can't initialize temporary directory: " + dir.getAbsolutePath());
         }
      }
      else
      {
         log.info("Temporary directory already exist. Reusing: " + dir.getAbsolutePath());
      }
   }

   /**
    * Extracts the required XSLT files from the jar and writes these files into the working directory.
    * @throws IOException thrown, if an error by writing the files occurs.
    */
   private void extractStreamResources() throws IOException
   {
      if (!isExternalMetadataXml)
      {
         writeFile("/xslt/metadata.xsl", pathToMetaDataXml);
      }
      
      if (!isExternalDDJavaXml)
      {
         writeFile("/xslt/ddJava.xsl", pathToDDJavaXml);
         writeFile("/lib/xdd-printBase.xsl", getWorkingDir() + "/" + TEMP_LIB_DIR + "/xdd-printBase.xsl");
         writeFile("/lib/xdd-printElement.xsl", getWorkingDir() + "/" + TEMP_LIB_DIR + "/xdd-printElement.xsl");
         writeFile("/lib/xdd-util.xsl", getWorkingDir() + "/" + TEMP_LIB_DIR + "/xdd-util.xsl");
      }
   }

   /**
    * Writes the specified resource to a file with the specified name. 
    * @param resource the resource name of the file packed in the jar.
    * @param fileName the name of the written file.
    * @throws IOException thrown, if an error by writing the file occurs.
    */
   private void writeFile(String resource, String fileName) throws IOException
   {
      final InputStream is = Main.class.getResourceAsStream(resource);
      try
      {
         OutputStream os = new FileOutputStream(fileName);
         try
         {
            byte[] buffer = new byte[4096];
            for (int n; (n = is.read(buffer)) != -1;)
               os.write(buffer, 0, n);
         }
         finally
         {
            os.close();
         }
      }
      finally
      {
         is.close();
      }
   }

}
