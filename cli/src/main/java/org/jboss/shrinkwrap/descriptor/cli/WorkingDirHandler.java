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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jboss.shrinkwrap.descriptor.cli.attributes.BaseAttributes;

/**
 * Manages the working directory.
 * <p>
 * The class initializes working folder and extracts various files from the containing jar.
 * <b>
 * These files are required for the transformation process.
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class WorkingDirHandler
{
   private final static Log log = LogFactory.getLog(WorkingDirHandler.class);
   private final static String TEMP_XSLT_DIR = "xslt";
   private final static String TEMP_LIB_DIR = "lib";
   private final static String METADATA_XML = "metadata.xsl";
   private final static String DD_JAVA_XML = "ddJava.xsl";
   private final static String CONTRIBUTORS_XML = "contributors.xml";
   private final static String COPYRIGHT_XML = "copyright.xml";

   private String tmpDir;
   private String pathToMetaDataXml;
   private String pathToDDJavaXml;
   private String pathToContributorsXml;
   private String pathToCopyrightsXml;
   private String pathToOriginalContextXml;
   private String pathToTemporaryContextXml;
   private boolean isExternalMetadataXml = false;
   private boolean isExternalDDJavaXml = false;

   /**
    * Creates a new instance.
    * @param attributes the required transformation attributes.
    * @throws IOException
    */
   public WorkingDirHandler(final BaseAttributes attributes) throws IOException
   {
      tmpDir = attributes.getTempDir();
      pathToOriginalContextXml = attributes.getContextFile();
      pathToMetaDataXml = tmpDir + "/" + TEMP_XSLT_DIR + "/" + METADATA_XML;
      pathToDDJavaXml = tmpDir + "/" + TEMP_XSLT_DIR + "/" + DD_JAVA_XML;
      pathToContributorsXml = tmpDir + "/" + TEMP_XSLT_DIR + "/" + CONTRIBUTORS_XML;
      pathToCopyrightsXml = tmpDir + "/" + TEMP_XSLT_DIR + "/" + COPYRIGHT_XML;
      isExternalMetadataXml = false;
      isExternalDDJavaXml = false;
      setupWorkingDir();
   }
   
   // TODO: Allow to define an own metadata.xsl and ddJava.xsl file
//   WorkingDirHandler(final PropertyHandler properties) throws IOException
//   {
//      tmpDir = properties.getWorkingDir(TEMP_DIR);
//      pathToMetaDataXml = tmpDir + "/" + TEMP_XSLT_DIR + "/" + METADATA_XML;
//      pathToDDJavaXml = tmpDir + "/" + TEMP_XSLT_DIR + "/" + DD_JAVA_XML;
//      isExternalMetadataXml = !properties.getPathToExternalMetadataXml("").isEmpty();
//      isExternalDDJavaXml = !properties.getPathToExternalDDJavaXml("").isEmpty();
//      
//      if(isExternalMetadataXml)
//      {
//         pathToMetaDataXml = properties.getPathToExternalMetadataXml("");
//      }
//      
//      if(isExternalDDJavaXml)
//      {
//         pathToDDJavaXml = properties.getPathToExternalDDJavaXml("");
//      }
//      
//      setupWorkingDir();
//   }

   /**
    * Setups up the working directory including writing of the XSLT files into this directory.
    * @throws IOException thrown, if an error by writing of the XSLT files occurs.
    */
   private void setupWorkingDir() throws IOException
   {
      createWorkingDir();
      extractStreamResources();
      
      log.info("Copying: " + pathToOriginalContextXml);
      final File contextFile = new File(pathToOriginalContextXml);
      final File tempContextFile = new File(tmpDir + "/" + TEMP_XSLT_DIR + "/" + contextFile.getName());
      pathToTemporaryContextXml = tempContextFile.getAbsolutePath();
      copy(contextFile, tempContextFile);
      log.info("Copied to: " + pathToTemporaryContextXml);
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
    * Returns the path of to the copied context file.
    * @return
    */
   public String getPathToTemporaryContextXml()
   {
      return pathToTemporaryContextXml;
   }

   public String getContextFileName()
   {
      final File contextFile = new File(pathToOriginalContextXml);
      log.info("getContextFileName: " + contextFile.getName());
      return contextFile.getName();
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
         writeFile("/xslt/contributors.xml", pathToContributorsXml);
         writeFile("/xslt/copyright.xml", pathToCopyrightsXml);
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
   private void writeFile(final String resource, final String fileName) throws IOException
   {
      final InputStream is = Main.class.getResourceAsStream(resource);
      try
      {
         final OutputStream os = new FileOutputStream(fileName);
         try
         {
            final byte[] buffer = new byte[4096];
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

   /**
    * Copies src file to dst file. If the dst file does not exist, it is created.
    * @param src the source file.
    * @param dst the target file.
    * @throws IOException
    */
   private void copy(final File src, final File dst) throws IOException
   {
      final InputStream in = new FileInputStream(src);
      final OutputStream out = new FileOutputStream(dst);

      // Transfer bytes from in to out
      byte[] buf = new byte[1024];
      int len;
      while ((len = in.read(buf)) > 0)
      {
         out.write(buf, 0, len);
      }
      in.close();
      out.close();
   }


}
