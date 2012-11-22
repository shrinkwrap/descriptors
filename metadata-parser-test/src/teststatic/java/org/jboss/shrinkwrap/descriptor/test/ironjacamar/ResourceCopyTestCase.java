package org.jboss.shrinkwrap.descriptor.test.ironjacamar;

import java.io.File;

import junit.framework.Assert;

import org.junit.Test;


public class ResourceCopyTestCase
{   
   @Test
   public void testResourceCopy() throws Exception {  
	   final File connectorDtdFile = new File("src/main/resources/META-INF/xsd/connector_1_0.dtd");
	   final File dataSourcesXsdFile = new File("src/main/resources/META-INF/xsd/datasources_1_0.xsd");
	   final File ironJacamarXsdFile = new File("src/main/resources/META-INF/xsd/ironjacamar_1_0.xsd");
	   final File resourceAdapaterXsdFile = new File("src/main/resources/META-INF/xsd/resource-adapters_1_0.xsd");
	   
	   Assert.assertTrue(connectorDtdFile.exists());
	   Assert.assertTrue(dataSourcesXsdFile.exists());
	   Assert.assertTrue(ironJacamarXsdFile.exists());
	   Assert.assertTrue(resourceAdapaterXsdFile.exists());
   }
   
}
