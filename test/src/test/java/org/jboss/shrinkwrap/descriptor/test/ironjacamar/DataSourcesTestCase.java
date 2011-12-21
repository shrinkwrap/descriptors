package org.jboss.shrinkwrap.descriptor.test.ironjacamar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.datasources10.DatasourcesDescriptor;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Before;
import org.junit.Test;


public class DataSourcesTestCase
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
	   DatasourcesDescriptor dataSourcesGenerated = create()
        .addDefaultNamespaces()
        .createDatasource()
            	.jta(true).jndiName("jndi-name1").poolName("pool-name1")
            	.enabled(true).useJavaContext(true).spy(false).useCcm(true)
            .connectionUrl("connection-url0")
            .driverClass("driver-class0")
            .datasourceClass("datasource-class0")
            .driver("driver0")
            .createConnectionProperty().name("name1").up()
            .createConnectionProperty().name("name3").up()
            .newConnectionSql("new-connection-sql0")
            .transactionIsolation("TRANSACTION_READ_UNCOMMITTED")
            .urlDelimiter("url-delimiter0")
            .urlSelectorStrategyClassName("url-selector-strategy-class-name0")
            .getOrCreatePool()
        		.minPoolSize(50)
        		.maxPoolSize(50)
        		.prefill(false)
        		.useStrictMin(false)
        		.flushStrategy("flush-strategy0").up()
            .getOrCreateSecurity()
            	.userName("user-name0")
            	.password("password0")
            	.securityDomain("security-domain0")
            	.getOrCreateReauthPlugin().className("class-name1")
            		.createConfigProperty().name("name5").text("config-property0").up()
            		.createConfigProperty().name("name7").text("config-property1").up()
            	.up().up()
            .getOrCreateValidation()
            	.getOrCreateValidConnectionChecker().className("class-name3")
            		.createConfigProperty().name("name9").text("config-property2").up()
            		.createConfigProperty().name("name11").text("config-property3").up()
            		.up()
            	.checkValidConnectionSql("check-valid-connection-sql0")
            	.validateOnMatch(false)
            	.backgroundValidation(false)
            	.backgroundValidationMillis(50)
            	.useFastFail(false)
            	.getOrCreateStaleConnectionChecker().className("class-name5")
            		.createConfigProperty().name("name13").text("config-property4").up()
            		.createConfigProperty().name("name15").text("config-property5").up()
            		.up()
            	.getOrCreateExceptionSorter().className("class-name7")
            		.createConfigProperty().name("name17").text("config-property6").up()
            		.createConfigProperty().name("name19").text("config-property7").up()
            		.up()
            	.up()
        	.getOrCreateTimeout()
    			.blockingTimeoutMillis(50)
    			.idleTimeoutMinutes(50)
    			.setTxQueryTimeout()
    			.queryTimeout(50)
    			.useTryLock(50)
    			.allocationRetry(50)
    			.allocationRetryWaitMillis(50)
    			.xaResourceTimeout("xa-resource-timeout0")
    			.up()
    		.getOrCreateStatement()
    			.trackStatements("true")
    			.preparedStatementCacheSize(50)
    			.sharePreparedStatements()
    			.up()
    		.up()
    	.createDatasource()
            	.jta(true).jndiName("jndi-name3").poolName("pool-name3")
            	.enabled(true).useJavaContext(true).spy(false).useCcm(true)
            .connectionUrl("connection-url1")
            .driverClass("driver-class1")
            .datasourceClass("datasource-class1")
            .driver("driver1")
            .createConnectionProperty().name("name21").up()
            .createConnectionProperty().name("name23").up()
            .newConnectionSql("new-connection-sql1")
            .transactionIsolation("TRANSACTION_READ_UNCOMMITTED")
            .urlDelimiter("url-delimiter1")
            .urlSelectorStrategyClassName("url-selector-strategy-class-name1")
            .getOrCreatePool()
        		.minPoolSize(50)
        		.maxPoolSize(50)
        		.prefill(false)
        		.useStrictMin(false)
        		.flushStrategy("flush-strategy1").up()
            .getOrCreateSecurity()
            	.userName("user-name1")
            	.password("password1")
            	.securityDomain("security-domain1")
            	.getOrCreateReauthPlugin().className("class-name9")
            		.createConfigProperty().name("name25").text("config-property8").up()
            		.createConfigProperty().name("name27").text("config-property9").up()
            	.up().up()
            .getOrCreateValidation()
            	.getOrCreateValidConnectionChecker().className("class-name11")
            		.createConfigProperty().name("name29").text("config-property10").up()
            		.createConfigProperty().name("name31").text("config-property11").up()
            		.up()
            	.checkValidConnectionSql("check-valid-connection-sql1")
            	.validateOnMatch(false)
            	.backgroundValidation(false)
            	.backgroundValidationMillis(50)
            	.useFastFail(false)
            	.getOrCreateStaleConnectionChecker().className("class-name13")
            		.createConfigProperty().name("name33").text("config-property12").up()
            		.createConfigProperty().name("name35").text("config-property13").up()
            		.up()
            	.getOrCreateExceptionSorter().className("class-name15")
            		.createConfigProperty().name("name37").text("config-property14").up()
            		.createConfigProperty().name("name39").text("config-property15").up()
            		.up()
            	.up()
        	.getOrCreateTimeout()
    			.blockingTimeoutMillis(50)
    			.idleTimeoutMinutes(50)
    			.setTxQueryTimeout()
    			.queryTimeout(50)
    			.useTryLock(50)
    			.allocationRetry(50)
    			.allocationRetryWaitMillis(50)
    			.xaResourceTimeout("xa-resource-timeout1")
    			.up()
    		.getOrCreateStatement()
    			.trackStatements("true")
    			.preparedStatementCacheSize(50)
    			.sharePreparedStatements()
    			.up()
    		.up()
    		.getOrCreateDrivers()
    			.createDriver()
    				.name("name41").module("module1").majorVersion(0).minorVerion(0)
    				.driverClass("driver-class2")
    				.datasourceClass("datasource-class2")
    				.xaDatasourceClass("xa-datasource-class0")
    			.up()
    			.createDriver()
    				.name("name43").module("module3").majorVersion(0).minorVerion(0)
    				.driverClass("driver-class3")
    				.datasourceClass("datasource-class3")
    				.xaDatasourceClass("xa-datasource-class1")
    			.up()
    		.up();
    		
      
      String dataSourcesGeneratedXmlGenerated = dataSourcesGenerated.exportAsString();
      String dataSourcesGeneratedXmlOriginal = getResourceContents("src/test/resources/test-gen-datasources10.xml");
           
//      System.out.println(dataSourcesGeneratedXmlGenerated);
      XmlAssert.assertIdentical(dataSourcesGeneratedXmlOriginal, dataSourcesGeneratedXmlGenerated);   
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
   
   private DatasourcesDescriptor create()
   {
      return Descriptors.create(DatasourcesDescriptor.class);
   }
   
}
