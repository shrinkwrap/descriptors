package org.jboss.shrinkwrap.descriptor.cli.plugin.mojo;

import java.io.File;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.junit.Test;

public class TransformationMojoTest extends AbstractMojoTestCase
{
   
   
   /**
    * @see junit.framework.TestCase#setUp()
    */
   protected void setUp() throws Exception
   {
      super.setUp();
   }

   /**
    * @throws Exception
    */
   @Test
   public void testSetGetMojoTest() throws Exception
   {
      File testPom = new File(getBasedir(), "src/test/resources/test-plugin-pom.xml");

      TransformationMojo mojo = (TransformationMojo) lookupMojo("yourGoal", testPom);

      assertNotNull(mojo);

//      TransformationMojo mojo = new TransformationMojo();
//
//      setVariableValueToObject(mojo, "contextFile", "/pathToContextFile");
//      setVariableValueToObject(mojo, "targetDir", "/pathToTargetDir");
//      setVariableValueToObject(mojo, "testDir", "/pathToTestDir");
//      setVariableValueToObject(mojo, "tempDir", "/pathToTempDir");
//      setVariableValueToObject(mojo, "trace", true);
//
//      assertEquals("/pathToContextFile", (String) getVariableValueFromObject(mojo, "contextFile"));
//      assertEquals("/pathToTargetDir", (String) getVariableValueFromObject(mojo, "targetDir"));
//      assertEquals("/pathToTestDir", (String) getVariableValueFromObject(mojo, "testDir"));
//      assertEquals("/pathToTempDir", (String) getVariableValueFromObject(mojo, "tempDir"));
//      assertTrue((Boolean) getVariableValueFromObject(mojo, "trace"));

      //       File testPom = new File( getBasedir(), "src/test/resources/unit/basic-test/basic-test-plugin-config.xml" );

      //       YourMojo mojo = (YourMojo) lookupMojo ( "yourGoal", testPom );
      //
      //       assertNotNull( mojo );
   }

}
