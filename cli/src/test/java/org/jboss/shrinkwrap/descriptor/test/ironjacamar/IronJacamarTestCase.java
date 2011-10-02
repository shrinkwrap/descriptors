package org.jboss.shrinkwrap.descriptor.test.ironjacamar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
//
//import org.jboss.shrinkwrap.descriptor.api.Descriptors;
//import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.IronjacamarDescriptor;
//import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Before;
import org.junit.Test;


public class IronJacamarTestCase
{
   final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
   
   @Before
   public void init()
   {
      sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
   }
   
   @Test
   public void testGeneratedIronJacamarXml() throws Exception
   {  
//	   IronjacamarDescriptor ironJacamarGenerated = create()
//            .addDefaultNamespaces()
//            .getOrCreateBeanValidationGroups()
//            	.beanValidationGroup("bean-validation-group0")
//            	.beanValidationGroup("bean-validation-group1").up()
//            .bootstrapContext("bootstrap-context0")
//            .createConfigProperty().name("").configPropertyType("config-property0").up()
//            .createConfigProperty().name("").configPropertyType("config-property1").up()
//            .transactionSupport("NoTransaction")
//            .getOrCreateConnectionDefinitions()
//            	.createConnectionDefinition()
//            		.useCcm(true).className("class-name1").jndiName("jndi-name1")
//            		.enabled(true).useJavaContext(true).poolName("pool-name1")
//            	.createConfigProperty().name("name5").configPropertyType("config-property2").up()
//            	.createConfigProperty().name("name7").configPropertyType("config-property3").up()
//            	.getOrCreatePool()
//            		.minPoolSize(50)
//            		.maxPoolSize(50)
//            		.prefill(false)
//            		.useStrictMin(false)
//            		.flushStrategy("flush-strategy0").up()
//            		.getOrCreateSecurity()
//            			.securityDomainAndApplication("security-domain-and-application0").up()
//            		.getOrCreateTimeout()
//            			.blockingTimeoutMillis(50)
//            			.idleTimeoutMinutes(50)
//            			.allocationRetry(50)
//            			.allocationRetryWaitMillis(50)
//            			.xaResourceTimeout(50).up()
//            		.getOrCreateValidation()
//            			.backgroundValidation(false)
//            			.backgroundValidationMillis(50)
//            			.useFastFail(false).up()
//            		.getOrCreateRecovery()
//            			.noRecovery(false)
//            			.getOrCreateRecoverCredential()
//            				.userName("user-name0")
//            				.password("password0")
//            				.securityDomain("security-domain0").up()
//            	    .getOrCreateRecoverPlugin().className("class-name3")
//            	    	.getOrCreateConfigProperty().name("name9")
//            	    	.configPropertyType("config-property4").up().up().up().up()   
//            	.createConnectionDefinition()
//            		.useCcm(true).className("class-name5").jndiName("jndi-name5")
//            		.enabled(true).useJavaContext(true).poolName("pool-name3")
//	            	.createConfigProperty().name("name11").configPropertyType("config-property5").up()
//	            	.createConfigProperty().name("name13").configPropertyType("config-property6").up()
//	            	.getOrCreateXaPool().
//	            		.minPoolSize(50)
//	            		.maxPoolSize(50)
//	            		.prefill(false)
//	            		.useStrictMin(false)
//	            		.flushStrategy("flush-strategy1")
//	            		.up()
//            		.getOrCreateSecurity()
//            			.securityDomainAndApplication("security-domain-and-application0").up()
//            		.getOrCreateTimeout()
//            			.blockingTimeoutMillis(50)
//            			.idleTimeoutMinutes(50)
//            			.allocationRetry(50)
//            			.allocationRetryWaitMillis(50)
//            			.xaResourceTimeout(50).up()
//            		.getOrCreateValidation()
//            			.backgroundValidation(false)
//            			.backgroundValidationMillis(50)
//            			.useFastFail(false).up()
//            		.getOrCreateRecovery()
//            			.noRecovery(false)
//            			.getOrCreateRecoverCredential()
//            				.userName("user-name1")
//            				.password("password1")
//            				.securityDomain("security-domain1").up()
//            	    .getOrCreateRecoverPlugin().className("class-name7")
//            	    	.getOrCreateConfigProperty().name("name15").up().up().up().up().up()
//            	.getOrCreateAdminObjects()
//            		.createAdminObject()
//            			.className("class-name9").jndiName("jndi-name5").enabled(true)
//            			.useJavaContext(true).poolName("pool-name5")
//            			.createConfigProperty().name("name17").configPropertyType("config-property8").up()
//	            	    .createConfigProperty().name("name19").configPropertyType("config-property9").up().up()
//	            	.createAdminObject()
//            			.className("class-name11").jndiName("jndi-name7").enabled(true)
//            			.useJavaContext(true).poolName("pool-name7")
//            			.createConfigProperty().name("name21").configPropertyType("config-property10").up()
//	            	    .createConfigProperty().name("name23").configPropertyType("config-property11").up().up()
//	            	.up()
//           ;                     
//      
//      String ironJacamarXmlGenerated = ironJacamarGenerated.exportAsString();
//      String ironJacamarXmlOriginal = getResourceContents("src/test/resources/test-gen-ironjacamar.xml");
//           
//      XmlAssert.assertIdentical(ironJacamarXmlOriginal, ironJacamarXmlGenerated);   
   }
   
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private String getResourceContents(String resource) throws Exception
   {
      assert resource != null && resource.length() > 0 : "Resource must be specified";
      final BufferedReader reader = new BufferedReader(new FileReader(resource));
      final StringBuilder builder = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null)
      {
         builder.append(line);
         builder.append("\n");
      }
      return builder.toString();
   }
   
//   private IronjacamarDescriptor create()
//   {
//      return Descriptors.create(IronjacamarDescriptor.class);
//   }
   
}
