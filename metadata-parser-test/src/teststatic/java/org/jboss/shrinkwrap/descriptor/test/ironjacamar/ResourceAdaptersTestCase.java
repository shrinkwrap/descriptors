package org.jboss.shrinkwrap.descriptor.test.ironjacamar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.jboss.resourceadapters.api.MutableResourceadapterDescriptor;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Before;
import org.junit.Test;


public class ResourceAdaptersTestCase
{
   final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
   
   @Before
   public void init()
   {
      sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
   }
   
   @Test
   public void testGeneratedDataSourcesXml() throws Exception
   {  
	   MutableResourceadapterDescriptor resourceAdaptersGenerated = create()
//        .addDefaultNamespaces()
        .createResourceAdapter()
        	.archive("archive0")
	        .getOrCreateBeanValidationGroups()
	            	.beanValidationGroup("bean-validation-group0")
	            	.beanValidationGroup("bean-validation-group1").up()
	            .bootstrapContext("bootstrap-context0")
	            .createConfigProperty().name("name1").text("config-property0").up()
	            .createConfigProperty().name("name3").text("config-property1").up()
	            .transactionSupport("NoTransaction")
	            .getOrCreateConnectionDefinitions()
	            	.createConnectionDefinition()
	            		.useCcm(true).className("class-name1").jndiName("jndi-name1")
	            		.enabled(true).useJavaContext(true).poolName("pool-name1")
	            	.createConfigProperty().name("name5").text("config-property2").up()
	            	.createConfigProperty().name("name7").text("config-property3").up()
	            	.getOrCreatePool()
	            		.minPoolSize(50)
	            		.maxPoolSize(50)
	            		.prefill(false)
	            		.useStrictMin(false)
	            		.flushStrategy("flush-strategy0").up()
	            		.getOrCreateSecurity()
	            			.securityDomain("security-domain0").up()
	            		.getOrCreateTimeout()
	            			.blockingTimeoutMillis(50)
	            			.idleTimeoutMinutes(50)
	            			.allocationRetry(50)
	            			.allocationRetryWaitMillis(50)
	            			.xaResourceTimeout(50).up()
	            		.getOrCreateValidation()
	            			.backgroundValidation(false)
	            			.backgroundValidationMillis(50)
	            			.useFastFail(false).up()
	            		.getOrCreateRecovery()
	            			.noRecovery(false)
	            			.getOrCreateRecoverCredential().up()
	            	    .getOrCreateRecoverPlugin().className("class-name3")
	            	    	.getOrCreateConfigProperty().name("name9")
	            	    	.text("config-property4").up().up().up().up()   
	            	.createConnectionDefinition()
	            		.useCcm(true).className("class-name5").jndiName("jndi-name3")
	            		.enabled(true).useJavaContext(true).poolName("pool-name3")
		            	.createConfigProperty().name("name11").text("config-property5").up()
		            	.createConfigProperty().name("name13").text("config-property6").up()
		            	.getOrCreatePool()
		            		.minPoolSize(50) 
		            		.maxPoolSize(50)
		            		.prefill(false)
		            		.useStrictMin(false)
		            		.flushStrategy("flush-strategy1")
		            		.up()
	            		.getOrCreateSecurity()
	            			.securityDomain("security-domain1").up()
	            		.getOrCreateTimeout()
	            			.blockingTimeoutMillis(50)
	            			.idleTimeoutMinutes(50)
	            			.allocationRetry(50)
	            			.allocationRetryWaitMillis(50)
	            			.xaResourceTimeout(50).up()
	            		.getOrCreateValidation()
	            			.backgroundValidation(false)
	            			.backgroundValidationMillis(50)
	            			.useFastFail(false).up()
	            		.getOrCreateRecovery()
	            			.noRecovery(false)
	            			.getOrCreateRecoverCredential().up()
	            	    .getOrCreateRecoverPlugin().className("class-name7")
	            	    	.getOrCreateConfigProperty().name("name15").text("config-property7").up().up().up().up().up()
	            	.getOrCreateAdminObjects()
	            		.createAdminObject()
	            			.className("class-name9").jndiName("jndi-name5").enabled(true)
	            			.useJavaContext(true).poolName("pool-name5")
	            			.createConfigProperty().name("name17").text("config-property8").up()
		            	    .createConfigProperty().name("name19").text("config-property9").up().up()
		            	.createAdminObject()
	            			.className("class-name11").jndiName("jndi-name7").enabled(true)
	            			.useJavaContext(true).poolName("pool-name7")
	            			.createConfigProperty().name("name21").text("config-property10").up()
		            	    .createConfigProperty().name("name23").text("config-property11").up().up()
		            	.up().up()
		   .createResourceAdapter()
	        	.archive("archive1")
		        .getOrCreateBeanValidationGroups()
	            	.beanValidationGroup("bean-validation-group2")
	            	.beanValidationGroup("bean-validation-group3").up()
	            .bootstrapContext("bootstrap-context1")
	            .createConfigProperty().name("name25").text("config-property12").up()
	            .createConfigProperty().name("name27").text("config-property13").up()
	            .transactionSupport("NoTransaction")
	            .getOrCreateConnectionDefinitions()
	            	.createConnectionDefinition()
	            		.useCcm(true).className("class-name13").jndiName("jndi-name9")
	            		.enabled(true).useJavaContext(true).poolName("pool-name9")
	            	.createConfigProperty().name("name29").text("config-property14").up()
	            	.createConfigProperty().name("name31").text("config-property15").up()
	            	.getOrCreateXaPool()
	            		.minPoolSize(50) 
	            		.maxPoolSize(50)
	            		.prefill(false)
	            		.useStrictMin(false)
	            		.flushStrategy("flush-strategy2")
	            		.isSameRmOverride(false)
	            		.interleaving()
	            		.noTxSeparatePools()
	            		.padXid(false)
	            		.wrapXaResource(false)
	            		.up()
            		.getOrCreateSecurity()
            			.securityDomain("security-domain2").up()
            		.getOrCreateTimeout()
            			.blockingTimeoutMillis(50)
            			.idleTimeoutMinutes(50)
            			.allocationRetry(50)
            			.allocationRetryWaitMillis(50)
            			.xaResourceTimeout(50).up()
            		.getOrCreateValidation()
            			.backgroundValidation(false)
            			.backgroundValidationMillis(50)
            			.useFastFail(false).up()
            		.getOrCreateRecovery()
            			.noRecovery(false)
            			.getOrCreateRecoverCredential().up()
            	    .getOrCreateRecoverPlugin().className("class-name15")
            	    	.getOrCreateConfigProperty().name("name33")
            	    	.text("config-property16").up().up().up().up()   
	            	.createConnectionDefinition()
	            		.useCcm(true).className("class-name17").jndiName("jndi-name11")
	            		.enabled(true).useJavaContext(true).poolName("pool-name11")
		            	.createConfigProperty().name("name35").text("config-property17").up()
		            	.createConfigProperty().name("name37").text("config-property18").up()
		            	.getOrCreatePool()
		            		.minPoolSize(50) 
		            		.maxPoolSize(50)
		            		.prefill(false)
		            		.useStrictMin(false)
		            		.flushStrategy("flush-strategy3")
		            		.up()
	            		.getOrCreateSecurity()
	            			.securityDomain("security-domain3").up()
	            		.getOrCreateTimeout()
	            			.blockingTimeoutMillis(50)
	            			.idleTimeoutMinutes(50)
	            			.allocationRetry(50)
	            			.allocationRetryWaitMillis(50)
	            			.xaResourceTimeout(50).up()
	            		.getOrCreateValidation()
	            			.backgroundValidation(false)
	            			.backgroundValidationMillis(50)
	            			.useFastFail(false).up()
	            		.getOrCreateRecovery()
	            			.noRecovery(false)
	            			.getOrCreateRecoverCredential().up()
	            	    .getOrCreateRecoverPlugin().className("class-name19")
	            	    	.getOrCreateConfigProperty().name("name39").text("config-property19").up().up().up().up().up()
	            	.getOrCreateAdminObjects()
	            		.createAdminObject()
	            			.className("class-name21").jndiName("jndi-name13").enabled(true)
	            			.useJavaContext(true).poolName("pool-name13")
	            			.createConfigProperty().name("name41").text("config-property20").up()
		            	    .createConfigProperty().name("name43").text("config-property21").up().up()
		            	.createAdminObject()
	            			.className("class-name23").jndiName("jndi-name15").enabled(true)
	            			.useJavaContext(true).poolName("pool-name15")
	            			.createConfigProperty().name("name45").text("config-property22").up()
		            	    .createConfigProperty().name("name47").text("config-property23").up().up()
		            	.up().up()
           ;                     
    		
      
      String resourceAdaptersXmlGenerated = resourceAdaptersGenerated.exportAsString();
      String resourceAdaptersXmlOriginal = getResourceContents("src/test/resources/test-gen-resourceadapter10.xml");
           
//      System.out.println(resourceAdaptersXmlGenerated);
      XmlAssert.assertIdentical(resourceAdaptersXmlOriginal, resourceAdaptersXmlGenerated);   
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
   
   private MutableResourceadapterDescriptor create()
   {
      return Descriptors.create(MutableResourceadapterDescriptor.class);
   }
   
}
