package org.jboss.shrinkwrap.descriptor.cli;

import uk.co.flamingpenguin.jewel.cli.CommandLineInterface;
import uk.co.flamingpenguin.jewel.cli.Option;

@CommandLineInterface(application="sdcli")
public interface CommandLineOptions
{
   @Option(shortName="c", description="Path to the configuration file")
   public String getConfiguration();
   
   @Option(shortName="t", description="Logs the stack trace in case of an exception")
   public String getTrace();
   
   public boolean isTrace();
}
