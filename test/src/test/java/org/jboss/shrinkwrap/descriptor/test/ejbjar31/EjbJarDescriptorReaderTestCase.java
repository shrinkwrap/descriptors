package org.jboss.shrinkwrap.descriptor.test.ejbjar31;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbJarDescriptor;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansTypeReader;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MessageDrivenBeanTypeReader;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsTypeReader;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodTypeReader;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerScheduleTypeReader;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerTypeReader;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconTypeReader;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Before;
import org.junit.Test;


public class EjbJarDescriptorReaderTestCase
{
   final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
   
   /**
    * Logger
    */
   private static final Logger log = Logger.getLogger(EjbJarDescriptorReaderTestCase.class.getName());
   
   @Before
   public void init()
   {
      sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
   }
   
   @Test
   public void testGeneratedEjbJarReaderXml() throws Exception
   {  
      final EjbJarDescriptor ejbJarReader = importFromString(getResourceContents("src/test/resources/test-gen-ejbjar31.xml"));      
      assertEquals(ejbJarReader.getRoot().getVersion(), "3.1");
      assertEquals(ejbJarReader.getRoot().getModuleName(), "module-name0");
      assertEquals(ejbJarReader.getRoot().getAllDescription().get(0), "description0");
      assertEquals(ejbJarReader.getRoot().getAllDisplayName().get(0), "display-name0");
      
      final IconTypeReader iconTypeReader = ejbJarReader.getRoot().getAllIcon().get(0);
      assertEquals(iconTypeReader.getSmallIcon(), "small-icon0");
      assertEquals(iconTypeReader.getLargeIcon(), "large-icon0");
    
      final EnterpriseBeansTypeReader enterpriseBeansTypeReader = ejbJarReader.getRoot().getEnterpriseBeans();
      final MessageDrivenBeanTypeReader messageDrivenBeanTypeReader = (MessageDrivenBeanTypeReader) enterpriseBeansTypeReader.getAllMessageDriven().get(0);
     
      assertEquals(messageDrivenBeanTypeReader.getAllDescription().get(0), "description1");
      assertEquals(messageDrivenBeanTypeReader.getAllDisplayName().get(0), "display-name1");
      
      final IconTypeReader iconTypeReader2 = (IconTypeReader) messageDrivenBeanTypeReader.getAllIcon().get(0);
      assertEquals(iconTypeReader2.getSmallIcon(), "small-icon1");
      assertEquals(iconTypeReader2.getLargeIcon(), "large-icon1");

      assertEquals(messageDrivenBeanTypeReader.getEjbName(), "ejb-name0");
      assertEquals(messageDrivenBeanTypeReader.getMappedName(), "mapped-name0");
      assertEquals(messageDrivenBeanTypeReader.getEjbClass(), "ejb-class0");
      assertEquals(messageDrivenBeanTypeReader.getMessagingType(), "messaging-type0");
      
      final NamedMethodTypeReader namedMethodTypeReader = messageDrivenBeanTypeReader.getTimeoutMethod();
      assertEquals(namedMethodTypeReader.getMethodName(), "method-name0");

      final MethodParamsTypeReader methodParamsTypeReader = namedMethodTypeReader.getMethodParams();
      assertEquals(methodParamsTypeReader.getAllMethodParam().get(0), "method-param0");
      
      final TimerTypeReader timerTypeReader = (TimerTypeReader) messageDrivenBeanTypeReader.getAllTimer().get(0);      
      assertEquals(timerTypeReader.getAllDescription().get(0), "description2");
      
      final TimerScheduleTypeReader timerScheduleTypeReader = timerTypeReader.getSchedule();
      assertEquals(timerScheduleTypeReader.getSecond(), "second0");
      assertEquals(timerScheduleTypeReader.getMinute(), "minute0");
      assertEquals(timerScheduleTypeReader.getHour(), "hour0");
      assertEquals(timerScheduleTypeReader.getDayOfMonth(), "day-of-month0");
      assertEquals(timerScheduleTypeReader.getMonth(), "month0");
      assertEquals(timerScheduleTypeReader.getDayOfWeek(), "day-of-week0");
      assertEquals(timerScheduleTypeReader.getYear(), "year0");
      
      final NamedMethodTypeReader namedMethodTypeReader2 = messageDrivenBeanTypeReader.getTimeoutMethod();
      assertEquals(namedMethodTypeReader2.getMethodName(), "method-name0");

      final MethodParamsTypeReader methodParamsTypeReader2 = namedMethodTypeReader2.getMethodParams();
      assertEquals(methodParamsTypeReader2.getAllMethodParam().get(0), "method-param0");
     
      assertFalse(timerTypeReader.isPersistent());
      assertEquals(timerTypeReader.getTimezone(), "timezone0");
      assertEquals(timerTypeReader.getInfo(), "info0");
      
      assertEquals(messageDrivenBeanTypeReader.getTransactionTypeAsString(), "Bean");
      assertEquals(messageDrivenBeanTypeReader.getMessageDestinationType(), "message-destination-type0");
      assertEquals(messageDrivenBeanTypeReader.getMessageDestinationLink(), "message-destination-link0");
      
// rest comes later ...
      
//                  .getOrCreateActivationConfig()
//                     .description("description3")
//                     .createActivationConfigProperty()
//                        .activationConfigPropertyName("activation-config-property-name0")
//                        .activationConfigPropertyValue("activation-config-property-value0").up().up()
//                  .createAroundInvoke()
//                     .clazz("class0")
//                     .methodName("$").up()
//                  .createAroundTimeout()
//                     .clazz("class1")
//                     .methodName("$").up()
//                  .createEnvEntry()
//                     .description("description4")
//                     .envEntryName("env-entry-name0")
//                     .envEntryType("env-entry-type0")
//                     .envEntryValue("env-entry-value0")
//                     .mappedName("mapped-name1")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class0")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name0").up()
//                  .createEjbRef()
//                     .description("description5")
//                     .ejbRefName("ejb-ref-name0")
//                     .ejbRefType("Entity")
//                     .home("home0")
//                     .remote("remote0")
//                     .ejbLink("ejb-link0")
//                     .mappedName("mapped-name2")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class1")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name1").up()
//                  .createEjbLocalRef()
//                     .description("description6")
//                     .ejbRefName("ejb-ref-name1")
//                     .ejbRefType("Entity")
//                     .localHome("local-home0")
//                     .local("local0")
//                     .ejbLink("ejb-link1")
//                     .mappedName("mapped-name3")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class2")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name2").up()
//                  .createServiceRef()
//                        .description("description7")
//                        .displayName("display-name2")
//                        .createIcon()
//                           .smallIcon("small-icon2")
//                           .largeIcon("large-icon2").up()
//                        .serviceRefName("service-ref-name0")
//                        .serviceInterface("service-interface0")
//                        .serviceRefType("service-ref-type0")
//                        .wsdlFile("http://www.oxygenxml.com/")
//                        .jaxrpcMappingFile("jaxrpc-mapping-file0")
//                        .serviceQname("qName")
//                        .createPortComponentRef()
//                           .serviceEndpointInterface("service-endpoint-interface0")
//                           .enableMtom(false)
//                           .mtomThreshold(50)
//                           .getOrCreateAddressing()
//                              .enabled(false)
//                              .required(false)
//                              .responses("ANONYMOUS").up()
//                           .getOrCreateRespectBinding()
//                              .enabled(false).up()
//                           .portComponentLink("port-component-link0").up()
//                        .getOrCreateHandlerChains()
//                           .createHandlerChain()
//                              .protocolBindings("##a ##a http://www.oxygenxml.com/")
//                              .createHandler()
//                                 .handlerName("handler-name0")
//                                 .handlerClass("handler-class0").up().up().up()
//                        .mappedName("mapped-name4")
//                        .createInjectionTarget()
//                           .injectionTargetClass("injection-target-class3")
//                           .injectionTargetName("$").up()
//                        .lookupName("lookup-name3").up()                      
//                  .createResourceRef()
//                     .description("description8")
//                     .resRefName("res-ref-name0")
//                     .resType("res-type0")
//                     .resAuth("Application")
//                     .resSharingScope("Shareable")
//                     .mappedName("mapped-name5")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class4")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name4").up()
//                  .createResourceEnvRef()
//                     .description("description9")
//                     .resourceEnvRefName("resource-env-ref-name0")
//                     .resourceEnvRefType("resource-env-ref-type0")
//                     .mappedName("mapped-name6")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class5")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name5").up()
//                  .createMessageDestinationRef()
//                     .description("description10")
//                     .messageDestinationRefName("message-destination-ref-name0")
//                     .messageDestinationType("message-destination-type1")
//                     .messageDestinationUsage("Consumes")
//                     .messageDestinationLink("message-destination-link1")
//                     .mappedName("mapped-name7")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class6")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name6").up()
//                  .createPersistenceContextRef()
//                     .description("description11")
//                     .persistenceContextRefName("persistence-context-ref-name0")            
//                     .persistenceUnitName("persistence-unit-name0")
//                     .persistenceContextType("Transaction")
//                     .createPersistenceProperty()
//                        .name("name0")
//                        .value("value0").up()
//                     .mappedName("mapped-name8")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class7")
//                        .injectionTargetName("$").up().up()
//                   .createPersistenceUnitRef()
//                      .description("description12")
//                      .persistenceUnitRefName("persistence-unit-ref-name0")
//                      .persistenceUnitName("persistence-unit-name1")
//                      .mappedName("mapped-name9")
//                      .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class8")
//                        .injectionTargetName("$").up().up()
//                   .createPostConstruct()
//                      .lifecycleCallbackClass("lifecycle-callback-class0")
//                      .lifecycleCallbackMethod("$").up()
//                   .createPreDestroy()
//                      .lifecycleCallbackClass("lifecycle-callback-class1")
//                      .lifecycleCallbackMethod("$").up()                   
//                   .createDataSource()
//                      .description("description13")
//                      .name("name1")
//                      .className("class-name0")
//                      .serverName("server-name0")
//                      .portNumber(0)
//                      .databaseName("database-name0")
//                      .url("jdbc::")
//                      .user("user0")
//                      .password("password0")
//                      .createProperty()
//                         .name("name2")
//                         .value("value1").up()
//                      .loginTimeout(0)
//                      .transactional(false)
//                      .isolationLevel("TRANSACTION_READ_UNCOMMITTED")
//                      .initialPoolSize(0)
//                      .maxPoolSize(0)
//                      .minPoolSize(0)
//                      .maxIdleTime(0)
//                      .maxStatements(0).up()
//                   .createSecurityRoleRef()
//                      .description("description14")
//                      .roleName("role-name0")
//                      .roleLink("role-link0").up()
//                   .getOrCreateSecurityIdentity()
//                      .description("description15")
//                      .getOrCreateRunAs()
//                         .description("description16")
//                         .roleName("role-name1").up().up().up().up()
//           .getOrCreateInterceptors()
//              .description("description17")
//              .createInterceptor()
//                 .description("description18")
//                 .interceptorClass("interceptor-class0")
//                 .createAroundInvoke()
//                    .clazz("class2")
//                    .methodName("$").up()
//                 .createAroundTimeout()
//                    .clazz("class3")
//                    .methodName("$").up()
//                 .createEnvEntry()
//                     .description("description19")
//                     .envEntryName("env-entry-name1")
//                     .envEntryType("env-entry-type1")
//                     .envEntryValue("env-entry-value1")
//                     .mappedName("mapped-name10")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class9")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name7").up()
//                  .createEjbRef()
//                     .description("description20")
//                     .ejbRefName("ejb-ref-name2")
//                     .ejbRefType("Entity")
//                     .home("home1")
//                     .remote("remote1")
//                     .ejbLink("ejb-link2")
//                     .mappedName("mapped-name11")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class10")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name8").up()
//                  .createEjbLocalRef()
//                     .description("description21")
//                     .ejbRefName("ejb-ref-name3")
//                     .ejbRefType("Entity")
//                     .localHome("local-home1")
//                     .local("local1")
//                     .ejbLink("ejb-link3")
//                     .mappedName("mapped-name12")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class11")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name9").up()
//                  .createServiceRef()
//                        .description("description22")
//                        .displayName("display-name3")
//                        .createIcon()
//                           .smallIcon("small-icon3")
//                           .largeIcon("large-icon3").up()
//                        .serviceRefName("service-ref-name1")
//                        .serviceInterface("service-interface1")
//                        .serviceRefType("service-ref-type1")
//                        .wsdlFile("http://www.oxygenxml.com/")
//                        .jaxrpcMappingFile("jaxrpc-mapping-file1")
//                        .serviceQname("qName")
//                        .createPortComponentRef()
//                           .serviceEndpointInterface("service-endpoint-interface1")
//                           .enableMtom(false)
//                           .mtomThreshold(50)
//                           .getOrCreateAddressing()
//                              .enabled(false)
//                              .required(false)
//                              .responses("ANONYMOUS").up()
//                           .getOrCreateRespectBinding()
//                              .enabled(false).up()
//                           .portComponentLink("port-component-link1").up()
//                        .createHandler()
//                           .description("description23")
//                           .displayName("display-name4")
//                           .createIcon()
//                              .smallIcon("small-icon1")
//                              .largeIcon("large-icon1").up()
//                           .handlerName("handler-name1")
//                           .handlerClass("handler-class1")
//                           .createInitParam()
//                              .paramName("param-name0")
//                              .paramValue("param-value0").up()
//                           .soapHeader("qName")
//                           .soapRole("soap-role0")
//                           .portName("port-name0").up()
//                        .mappedName("mapped-name13")
//                        .createInjectionTarget()
//                           .injectionTargetClass("injection-target-class12")
//                           .injectionTargetName("$").up()
//                        .lookupName("lookup-name10").up()
//                  .createResourceRef()
//                     .description("description24")
//                     .resRefName("res-ref-name1")
//                     .resType("res-type1")
//                     .resAuth("Application")
//                     .resSharingScope("Shareable")
//                     .mappedName("mapped-name14")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class13")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name11").up()
//                  .createResourceEnvRef()
//                     .description("description25")
//                     .resourceEnvRefName("resource-env-ref-name1")
//                     .resourceEnvRefType("resource-env-ref-type1")
//                     .mappedName("mapped-name15")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class14")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name12").up()
//                  .createMessageDestinationRef()
//                     .description("description26")
//                     .messageDestinationRefName("message-destination-ref-name1")
//                     .messageDestinationType("message-destination-type2")
//                     .messageDestinationUsage("Consumes")
//                     .messageDestinationLink("message-destination-link2")
//                     .mappedName("mapped-name16")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class15")
//                        .injectionTargetName("$").up()
//                     .lookupName("lookup-name13").up()
//                  .createPersistenceContextRef()
//                     .description("description27")
//                     .persistenceContextRefName("persistence-context-ref-name1")            
//                     .persistenceUnitName("persistence-unit-name2")
//                     .persistenceContextType("Transaction")
//                     .createPersistenceProperty()
//                        .name("name3")
//                        .value("value2").up()
//                     .mappedName("mapped-name17")
//                     .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class16")
//                        .injectionTargetName("$").up().up()
//                   .createPersistenceUnitRef()
//                      .description("description28")
//                      .persistenceUnitRefName("persistence-unit-ref-name1")
//                      .persistenceUnitName("persistence-unit-name3")
//                      .mappedName("mapped-name18")
//                      .createInjectionTarget()
//                        .injectionTargetClass("injection-target-class17")
//                        .injectionTargetName("$").up().up()
//                   .createPostConstruct()
//                      .lifecycleCallbackClass("lifecycle-callback-class2")
//                      .lifecycleCallbackMethod("$").up()
//                   .createPreDestroy()
//                      .lifecycleCallbackClass("lifecycle-callback-class3")
//                      .lifecycleCallbackMethod("$").up()       
//                   .createDataSource()
//                      .description("description29")
//                      .name("name4")
//                      .className("class-name1")
//                      .serverName("server-name1")
//                      .portNumber(0)
//                      .databaseName("database-name1")
//                      .url("jdbc::")
//                      .user("user1")
//                      .password("password1")
//                      .createProperty()
//                         .name("name5")
//                         .value("value3").up()
//                      .loginTimeout(0)
//                      .transactional(false)
//                      .isolationLevel("TRANSACTION_READ_UNCOMMITTED")
//                      .initialPoolSize(0)
//                      .maxPoolSize(0)
//                      .minPoolSize(0)
//                      .maxIdleTime(0)
//                      .maxStatements(0).up()
//                   .createPostActivate()
//                      .lifecycleCallbackClass("lifecycle-callback-class4")
//                      .lifecycleCallbackMethod("$").up() 
//                   .createPrePassivate()
//                       .lifecycleCallbackClass("lifecycle-callback-class5")
//                      .lifecycleCallbackMethod("$").up() .up().up()
//             .getOrCreateRelationships()
//                .description("description30")
//                .createEjbRelation()
//                   .description("description31")
//                   .ejbRelationName("ejb-relation-name0")
//                   .createEjbRelationshipRole()
//                      .description("description32")
//                      .ejbRelationshipRoleName("ejb-relationship-role-name0")
//                      .multiplicity("One")
//                      .getOrCreateRelationshipRoleSource()
//                         .description("description33")
//                         .ejbName("ejb-name1").up()
//                      .getOrCreateCmrField()
//                         .description("description34")
//                         .cmrFieldName("cmr-field-name0")
//                         .cmrFieldType("java.util.Collection").up().up()
//                   .createEjbRelationshipRole()
//                      .description("description35")
//                      .ejbRelationshipRoleName("ejb-relationship-role-name1")
//                      .multiplicity("One")
//                      .cascadeDelete()
//                      .getOrCreateRelationshipRoleSource()
//                         .description("description36")
//                         .ejbName("ejb-name2").up()
//                      .getOrCreateCmrField()
//                         .description("description37")
//                         .cmrFieldName("cmr-field-name1")
//                         .cmrFieldType("java.util.Collection").up().up().up().up()
//                .getOrCreateAssemblyDescriptor()
//                   .createSecurityRole()
//                      .description("description38")
//                      .roleName("role-name2").up()
//                   .createMethodPermission()
//                      .description("description39")
//                      .unchecked()
//                      .createMethod()
//                         .description("description40")
//                         .ejbName("ejb-name3")
//                         .methodIntf("Home")
//                         .methodName("method-name6")
//                         .getOrCreateMethodParams()
//                            .methodParam("method-param1").up().up().up()
//                   .createContainerTransaction()
//                      .description("description41")
//                      .createMethod()
//                         .description("description42")
//                         .ejbName("ejb-name4")
//                         .methodIntf("Home")
//                         .methodName("method-name7")
//                         .getOrCreateMethodParams()
//                            .methodParam("method-param2").up().up()
//                      .transAttribute("NotSupported").up()
//                   .createInterceptorBinding()
//                      .description("description43")
//                      .ejbName("ejb-name5")
//                      .interceptorClass("interceptor-class1")
//                      .excludeDefaultInterceptors(false)
//                      .excludeClassInterceptors(false)
//                      .getOrCreateMethod()
//                         .methodName("method-name8")
//                         .getOrCreateMethodParams()
//                            .methodParam("method-param3").up().up().up()
//                  .createMessageDestination()
//                     .description("description44")
//                     .displayName("display-name5")
//                     .createIcon()
//                        .smallIcon("small-icon4")
//                        .largeIcon("large-icon4").up()
//                     .messageDestinationName("message-destination-name0")
//                     .mappedName("mapped-name19")
//                     .lookupName("lookup-name14").up()
//                  .getOrCreateExcludeList()
//                     .description("description45")
//                     .createMethod()
//                         .description("description46")
//                         .ejbName("ejb-name6")
//                         .methodIntf("Home")
//                         .methodName("method-name9")
//                         .getOrCreateMethodParams()
//                            .methodParam("method-param4").up().up().up()
//                  .createApplicationException()
//                     .exceptionClass("exception-class0")
//                     .rollback(false)
//                     .inherited(false).up().up()
//              .ejbClientJar("ejb-client-jar0");                     
      
      String webXmlGenerated = ejbJarReader.exportAsString();
      String webXmlOriginal = getResourceContents("src/test/resources/test-gen-ejbjar31.xml");
                     
      XmlAssert.assertIdentical(webXmlOriginal, webXmlGenerated);   
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
      
   private EjbJarDescriptor importFromString(final String str)
   {
      return Descriptors.importAs(EjbJarDescriptor.class).from(str);
   }
   
}
