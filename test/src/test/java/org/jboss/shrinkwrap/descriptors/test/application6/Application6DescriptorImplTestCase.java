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
         .version("6")
         .applicationName("application-name0")
         .description("description0")
         .displayName("display-name0")
         .createIcon()
            .smallIcon("small-icon0")
            .largeIcon("large-icon0").up()
         .initializeInOrder("true")
         .createModule()
            .ejb("ejb0")
            .altDd("alt-dd0").up()
         .createSecurityRole()
            .description("description1")
            .roleName("role-name0").up()
         .libraryDirectory("library-directory0")
         .createEnvEntry()
            .description("description2")
            .envEntryName("env-entry-name0")
            .envEntryType("env-entry-type0")
            .envEntryValue("env-entry-value0")
            .mappedName("mapped-name0")
            .createInjectionTarget()
               .injectionTargetClass("injection-target-class0")
               .injectionTargetName("$").up()
            .lookupName("lookup-name0").up()
         .createEjbRef()
            .description("description3")
            .ejbRefName("ejb-ref-name0")
            .ejbRefType("Entity")
            .home("home0")
            .remote("remote0")
            .ejbLink("ejb-link0")
            .mappedName("mapped-name1")
            .createInjectionTarget()
               .injectionTargetClass("injection-target-class1")
               .injectionTargetName("$").up()
            .lookupName("lookup-name1").up()
         .createEjbLocalRef()
            .description("description4")
            .ejbRefName("ejb-ref-name1")
            .ejbRefType("Entity")
            .localHome("local-home0")
            .local("local0")
            .ejbLink("ejb-link1")
            .mappedName("mapped-name2")
            .createInjectionTarget()
               .injectionTargetClass("injection-target-class2")
               .injectionTargetName("$").up()
            .lookupName("lookup-name2").up()
         .createServiceRef()
               .description("description5")
               .displayName("display-name1")
               .createIcon()
                  .smallIcon("small-icon1")
                  .largeIcon("large-icon1").up()
               .serviceRefName("service-ref-name0")
               .serviceInterface("service-interface0")
               .serviceRefType("service-ref-type0")
               .wsdlFile("http://www.oxygenxml.com/")
               .jaxrpcMappingFile("jaxrpc-mapping-file0")
               .serviceQname("qName")
               .createPortComponentRef()
                  .serviceEndpointInterface("service-endpoint-interface0")
                  .enableMtom(false)
                  .mtomThreshold(50)
                  .getOrCreateAddressing()
                     .enabled(false)
                     .required(false)
                     .responses("ANONYMOUS").up()
                  .getOrCreateRespectBinding()
                     .enabled(false).up()
                  .portComponentLink("port-component-link0").up()
               .createHandler()
                  .description("description6")
                  .displayName("display-name2")
                  .createIcon()
                     .smallIcon("small-icon2")
                     .largeIcon("large-icon2").up()
                  .handlerName("handler-name0")
                  .handlerClass("handler-class0")
                  .createInitParam()
                     .description("description7")
                     .paramName("param-name0")
                     .paramValue("param-value0").up()
                  .soapHeader("qName")
                  .soapRole("soap-role0")
                  .portName("port-name0").up()
               .mappedName("mapped-name3")
               .createInjectionTarget()
                  .injectionTargetClass("injection-target-class3")
                  .injectionTargetName("$").up()
               .lookupName("lookup-name3").up()
         .createResourceRef()
            .description("description8")
            .resRefName("res-ref-name0")
            .resType("res-type0")
            .resAuth("Application")
            .resSharingScope("Shareable")
            .mappedName("mapped-name4")
            .createInjectionTarget()
               .injectionTargetClass("injection-target-class4")
               .injectionTargetName("$").up()
            .lookupName("lookup-name4").up()
         .createResourceEnvRef()
            .description("description9")
            .resourceEnvRefName("resource-env-ref-name0")
            .resourceEnvRefType("resource-env-ref-type0")
            .mappedName("mapped-name5")
            .createInjectionTarget()
               .injectionTargetClass("injection-target-class5")
               .injectionTargetName("$").up()
            .lookupName("lookup-name5").up()
         .createMessageDestinationRef()
            .description("description10")
            .messageDestinationRefName("message-destination-ref-name0")
            .messageDestinationType("message-destination-type0")
            .messageDestinationUsage("Consumes")
            .messageDestinationLink("message-destination-link0")
            .mappedName("mapped-name6")
            .createInjectionTarget()
               .injectionTargetClass("injection-target-class6")
               .injectionTargetName("$").up()
            .lookupName("lookup-name6").up()
         .createPersistenceContextRef()
            .description("description11")
            .persistenceContextRefName("persistence-context-ref-name0")            
            .persistenceUnitName("persistence-unit-name0")
            .persistenceContextType("Transaction")
            .createPersistenceProperty()
               .name("name0")
               .value("value0").up()
            .mappedName("mapped-name7")
            .createInjectionTarget()
               .injectionTargetClass("injection-target-class7")
               .injectionTargetName("$").up().up()
          .createPersistenceUnitRef()
             .description("description12")
             .persistenceUnitRefName("persistence-unit-ref-name0")
             .persistenceUnitName("persistence-unit-name1")
             .mappedName("mapped-name8")
             .createInjectionTarget()
               .injectionTargetClass("injection-target-class8")
               .injectionTargetName("$").up().up()
          .createMessageDestination()
             .description("description13")
             .displayName("display-name3")
             .createIcon()
                .smallIcon("small-icon3")
                .largeIcon("large-icon3").up()
             .messageDestinationName("message-destination-name0")
             .mappedName("mapped-name9")
             .lookupName("lookup-name7").up()
          .createDataSource()
             .description("description14")
             .name("name1")
             .className("class-name0")
             .serverName("server-name0")
             .portNumber(0)
             .databaseName("database-name0")
             .url("jdbc::")
             .user("user0")
             .password("password0")
             .createProperty()
                .name("name2")
                .value("value1").up()
             .loginTimeout(0)
             .transactional(false)
             .isolationLevel("TRANSACTION_READ_UNCOMMITTED")
             .initialPoolSize(0)
             .maxPoolSize(0)
             .minPoolSize(0)
             .maxIdleTime(0)
             .maxStatements(0).up();
      
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
