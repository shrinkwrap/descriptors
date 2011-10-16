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

package org.jboss.shrinkwrap.descriptor.cli.plugin.ant;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.jboss.shrinkwrap.descriptor.cli.attributes.AttributesContract;
import org.jboss.shrinkwrap.descriptor.cli.attributes.BaseAttributes;


/**
* Base abstract class for the Shrinkwrap Descriptors CLI Ant task.
*
* @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
*/
public abstract class AbstractTransformationTask extends Task implements AttributesContract
{
   /** Delegates the attribute handling to this class */
   private BaseAttributes baseAttributes = new BaseAttributes();

   /**
    * Returns the context file.
    * @return the value.
    */
   public String getContextFile()
   {
      return baseAttributes.getContextFile();
   }

   /**
    * Sets the context file.
    * @param contextFile the value.
    */
   public void setContextFile(final String contextFile)
   {
      baseAttributes.setContextFile(contextFile);
   }

   /**
    * Returns the target path for the API and implementation classes.
    * @return the path.
    */
   public String getTargetDir()
   {
      return baseAttributes.getTargetDir();
   }

   /**
    * Sets the target path for the API and implementation classes.
    * @param targetDir the value.
    */
   public void setTargetDir(final String targetDir)
   {
      baseAttributes.setTargetDir(targetDir);
   }

   /**
    * Returns the target path for the test classes.
    * @return the value.
    */
   public String getTestDir()
   {
      return baseAttributes.getTestDir();
   }

   /**
    * Sets the target path for the test classes.
    * @param testDir the value.
    */
   public void setTestDir(final String testDir)
   {
      baseAttributes.setTestDir(testDir);
   }

   /**
    * Returns the trace flag.
    * @return true, if tracing is enabled, otherwise false.
    */
   public boolean isTrace()
   {
      return baseAttributes.isTrace();
   }

   /**
    * Sets the trace flag.
    * @param trace the value.
    */
   public void setTrace(final boolean trace)
   {
      baseAttributes.setTrace(trace);
   }

   /**
    * Returns the directory in which temporary files are created.
    * @return the value.
    */
   public String getTempDir()
   {
      return baseAttributes.getTempDir();
   }

   /**
    * Sets the directory in which temporary files are created.
    * @param tempDir the directory.
    */
   public void setTempDir(final String tempDir)
   {
      baseAttributes.setTempDir(tempDir);
   }
   
   public String getServiceDir()
   {
      return baseAttributes.getServiceDir();
   }

   public void setServiceDir(final String serviceDir)
   {
      baseAttributes.setServiceDir(serviceDir);
   }
   /**
    * Executes the transformation task, called by Ant.
    */
   public abstract void execute() throws BuildException;

}
