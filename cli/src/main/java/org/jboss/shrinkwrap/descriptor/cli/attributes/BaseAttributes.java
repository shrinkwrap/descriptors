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

package org.jboss.shrinkwrap.descriptor.cli.attributes;


/**
 * Manages the required attributes shared by other classes.
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class BaseAttributes implements AttributesContract
{
   /** Path to the context file */
   private String contextFile;

   /** Target directory for the API and implementation classes */
   private String targetDir;

   /** Target directory for the test classes */
   private String testDir;
   
   /** Target directory for the temporary created files */
   private String tempDir;
   
   /** Target directory for the service files */
   private String serviceDir;

   /** Trace flag */
   private boolean trace;

   /** Constructor */
   public BaseAttributes()
   {
      this.contextFile = null;
      this.targetDir = null;
      this.testDir = null;
      this.trace = false;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.cli.AttributesContract#getContextFile()
    */
   public String getContextFile()
   {
      return contextFile;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.cli.AttributesContract#setContextFile(java.lang.String)
    */
   public void setContextFile(String contextFile)
   {
      this.contextFile = contextFile;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.cli.AttributesContract#getTargetDir()
    */
   public String getTargetDir()
   {
      return targetDir;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.cli.AttributesContract#setTargetDir(java.lang.String)
    */
   public void setTargetDir(String targetDir)
   {
      this.targetDir = targetDir;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.cli.AttributesContract#getTestDir()
    */
   public String getTestDir()
   {
      return testDir;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.cli.AttributesContract#setTestDir(java.lang.String)
    */
   public void setTestDir(String testDir)
   {
      this.testDir = testDir;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.cli.AttributesContract#isTrace()
    */
   public boolean isTrace()
   {
      return trace;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.cli.AttributesContract#setTrace(boolean)
    */
   public void setTrace(boolean trace)
   {
      this.trace = trace;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.cli.AttributesContract#getTempDir()
    */
   public String getTempDir()
   {
      return tempDir;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.cli.AttributesContract#setTempDir(java.lang.String)
    */
   public void setTempDir(String tempDir)
   {
      this.tempDir = tempDir;
   }

   public String getServiceDir()
   {
      return serviceDir;
   }

   public void setServiceDir(String serviceDir)
   {
      this.serviceDir = serviceDir;      
   }
   
}
