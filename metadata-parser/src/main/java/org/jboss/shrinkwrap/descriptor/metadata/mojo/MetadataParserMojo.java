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
package org.jboss.shrinkwrap.descriptor.metadata.mojo;

import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataParser;

/**
 * Implementation class for the Shrinkwrap Descriptors CLI Mojo task.
 * 
 * @goal parse
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataParserMojo extends AbstractMojo
{
   /**
    * Path settings used for generating the interfaces and implementation classes.
    * @parameter
    */
	protected Path path;
   
   /**
    * List of descriptors specifying the descriptor details.
    * @parameter
    */
   protected List<?> descriptors;
   
   /**
    * Trace flag
    * 
    * @parameter
    */
   protected boolean verbose;

   @Override
   public void execute() throws MojoExecutionException, MojoFailureException
   {
      try
      {
         final MetadataParser metadataParser = new MetadataParser();
         metadataParser.parse(path, descriptors, verbose);
      }
      catch (final Throwable t)
      {
         throw new MojoFailureException(t.getMessage(), t);
      }
   }
}
