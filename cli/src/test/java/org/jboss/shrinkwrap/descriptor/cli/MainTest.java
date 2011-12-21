package org.jboss.shrinkwrap.descriptor.cli;

import org.junit.Test;


public class MainTest
{
   @Test
   public void testExternalMetaDataXml() throws Exception
   {
      Main.main(new String[]{"-c", "src/test/resources/ironjacamar.properties"});
   }
}
