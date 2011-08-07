package org.jboss.shrinkwrap.descriptors.test.application6;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLUnit;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.application6.Application6Descriptor;
import org.junit.Before;
import org.junit.Test;

public class Application6DescriptorImplTestCase
{

   @Before
   public void init()
   {
      XMLUnit.setIgnoreWhitespace(true);
      XMLUnit.setIgnoreComments(true);
      XMLUnit.setNormalizeWhitespace(true);
   }
   
   @Test
   public void testImportGeneratedApplicationXml() throws Exception
   {
      Application6Descriptor app6Descr = create()
         .addDefaultNamespaces()
         .setVersion("6")
         .setApplicationName("application-name0")
         .setDescription("description0")
         .setDisplayName("display-name0")
         .icon()
            .setSmallIcon("small-icon0")
            .setLargeIcon("large-icon0").up()
         .setInitializeInOrder("true")
         .module()
            .setEjb("ejb0")
            .setAltDd("alt-dd0").up()
         .securityRole()
            .setDescription("description1")
            .setRoleName("role-name0").up()
         .setLibraryDirectory("library-directory0")
         .envEntry()
            .setDescription("description2")
            .setEnvEntryName("env-entry-name0")
            .setEnvEntryType("env-entry-type0")
            .setEnvEntryValue("env-entry-value0")
            .setMappedName("mapped-name0")
            .injectionTarget()
               .setInjectionTargetClass("injection-target-class0")
               .setInjectionTargetName("$").up()
            .setLookupName("lookup-name0").up()
         .ejbRef()
            .setDescription("description3")
            .setEjbRefName("ejb-ref-name0")
            .setEjbRefType("Entity")
            .setHome("home0")
            .setRemote("remote0")
            .setEjbLink("ejb-link0")
            .setMappedName("mapped-name1")
            .injectionTarget()
               .setInjectionTargetClass("injection-target-class1")
               .setInjectionTargetName("$").up()
            .setLookupName("lookup-name1").up()
         .ejbLocalRef()
            .setDescription("description4")
            .setEjbRefName("ejb-ref-name1")
            .setEjbRefType("Entity")
            .setLocalHome("local-home0")
            .setLocal("local0")
            .setEjbLink("ejb-link1")
            .setMappedName("mapped-name2")
            .injectionTarget()
               .setInjectionTargetClass("injection-target-class2")
               .setInjectionTargetName("$").up()
            .setLookupName("lookup-name2").up()
         .serviceRef()
               .setDescription("description5")
               .setDisplayName("display-name1")
               .icon()
                  .setSmallIcon("small-icon1")
                  .setLargeIcon("large-icon1").up()
               .setServiceRefName("service-ref-name0")
               .setServiceInterface("service-interface0")
               .setServiceRefType("service-ref-type0")
               .setWsdlFile("http://www.oxygenxml.com/")
               .setJaxrpcMappingFile("jaxrpc-mapping-file0")
               .setServiceQname("qName")
               .portComponentRef()
                  .setServiceEndpointInterface("service-endpoint-interface0")
                  .setEnableMtom(false)
                  .setMtomThreshold(50)
                  .addressing()
                     .setEnabled(false)
                     .setRequired(false)
                     .setResponses("ANONYMOUS").up()
                  .respectBinding()
                     .setEnabled(false).up()
                  .setPortComponentLink("port-component-link0").up()
               .handler()
                  .setDescription("description6")
                  .setDisplayName("display-name2")
                  .icon()
                     .setSmallIcon("small-icon2")
                     .setLargeIcon("large-icon2").up()
                  .setHandlerName("handler-name0")
                  .setHandlerClass("handler-class0")
                  .initParam()
                     .setDescription("description7")
                     .setParamName("param-name0")
                     .setParamValue("param-value0").up()
                  .setSoapHeader("qName")
                  .setSoapRole("soap-role0")
                  .setPortName("port-name0").up()
               .setMappedName("mapped-name3")
               .injectionTarget()
                  .setInjectionTargetClass("injection-target-class3")
                  .setInjectionTargetName("$").up()
               .setLookupName("lookup-name3").up()
         .resourceRef()
            .setDescription("description8")
            .setResRefName("res-ref-name0")
            .setResType("res-type0")
            .setResAuth("Application")
            .setResSharingScope("Shareable")
            .setMappedName("mapped-name4")
            .injectionTarget()
               .setInjectionTargetClass("injection-target-class4")
               .setInjectionTargetName("$").up()
            .setLookupName("lookup-name4").up()
         .resourceEnvRef()
            .setDescription("description9")
            .setResourceEnvRefName("resource-env-ref-name0")
            .setResourceEnvRefType("resource-env-ref-type0")
            .setMappedName("mapped-name5")
            .injectionTarget()
               .setInjectionTargetClass("injection-target-class5")
               .setInjectionTargetName("$").up()
            .setLookupName("lookup-name5").up()
         .messageDestinationRef()
            .setDescription("description10")
            .setMessageDestinationRefName("message-destination-ref-name0")
            .setMessageDestinationType("message-destination-type0")
            .setMessageDestinationUsage("Consumes")
            .setMessageDestinationLink("message-destination-link0")
            .setMappedName("mapped-name6")
            .injectionTarget()
               .setInjectionTargetClass("injection-target-class6")
               .setInjectionTargetName("$").up()
            .setLookupName("lookup-name6").up()
         .persistenceContextRef()
            .setDescription("description11")
            .setPersistenceContextRefName("persistence-context-ref-name0")            
            .setPersistenceUnitName("persistence-unit-name0")
            .setPersistenceContextType("Transaction")
            .persistenceProperty()
               .setName("name0")
               .setValue("value0").up()
            .setMappedName("mapped-name7")
            .injectionTarget()
               .setInjectionTargetClass("injection-target-class7")
               .setInjectionTargetName("$").up().up()
          .persistenceUnitRef()
             .setDescription("description12")
             .setPersistenceUnitRefName("persistence-unit-ref-name0")
             .setPersistenceUnitName("persistence-unit-name1")
             .setMappedName("mapped-name8")
             .injectionTarget()
               .setInjectionTargetClass("injection-target-class8")
               .setInjectionTargetName("$").up().up()
          .messageDestination()
             .setDescription("description13")
             .setDisplayName("display-name3")
             .icon()
                .setSmallIcon("small-icon3")
                .setLargeIcon("large-icon3").up()
             .setMessageDestinationName("message-destination-name0")
             .setMappedName("mapped-name9")
             .setLookupName("lookup-name7").up()
          .dataSource()
             .setDescription("description14")
             .setName("name1")
             .setClassName("class-name0")
             .setServerName("server-name0")
             .setPortNumber(0)
             .setDatabaseName("database-name0")
             .setUrl("jdbc::")
             .setUser("user0")
             .setPassword("password0")
             .property()
                .setName("name2")
                .setValue("value1").up()
             .setLoginTimeout(0)
             .setTransactional(false)
             .setIsolationLevel("TRANSACTION_READ_UNCOMMITTED")
             .setInitialPoolSize(0)
             .setMaxPoolSize(0)
             .setMinPoolSize(0)
             .setMaxIdleTime(0)
             .setMaxStatements(0).up();
      
      String appXmlOriginal = getResourceContents("src/test/resources/test-gen-application6.xml");
      String appXmlGenerated = app6Descr.exportAsString();
       
      Diff myDiff = new Diff(appXmlOriginal, appXmlGenerated);
      assertTrue("pieces of XML are similar " + myDiff, myDiff.similar());
      assertTrue("but are they identical? " + myDiff, myDiff.identical());       
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
   
   private Application6Descriptor create()
   {
      return Descriptors.create(Application6Descriptor.class);
   }

}
