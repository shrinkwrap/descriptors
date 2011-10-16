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

package org.jboss.shrinkwrap.descriptor.cli.parser;

import uk.co.flamingpenguin.jewel.cli.CommandLineInterface;
import uk.co.flamingpenguin.jewel.cli.Option;

/**
 * Defines the contract for passing the command line arguments to the cli tool.
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
@CommandLineInterface(application="cli")
public interface CommandLineOptions
{
   @Option(longName= "contextFile", description="Path to the context file")
   public String getContextFile();
   
   @Option(longName= "output", description="Target path for the API and implementation classes")
   public String getTargetDir();
   
   @Option(longName="test", description="Target path for the test classes")
   public String getTestDir();
   
   @Option(longName="temp", defaultValue="", description="Target path for the temporary files")
   public String getTempDir();
   
   @Option(longName="service", defaultValue="", description="Target path for the service files")
   public String getServiceDir();
   
   @Option(shortName="trace", description="Logs the stack trace in case of an exception")
   public String getTrace();
   
   public boolean isTrace();
}
