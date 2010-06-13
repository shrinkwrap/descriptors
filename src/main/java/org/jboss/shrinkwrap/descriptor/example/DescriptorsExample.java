package org.jboss.shrinkwrap.descriptor.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.exporter.ZipExporter;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.spec.beans.Beans;
import org.jboss.shrinkwrap.descriptor.spec.beans.BeansDef;
import org.jboss.shrinkwrap.descriptor.spec.persistence.Persistence;
import org.jboss.shrinkwrap.descriptor.spec.persistence.PersistenceDef;
import org.jboss.shrinkwrap.descriptor.spec.persistence.ProviderType;
import org.jboss.shrinkwrap.descriptor.spec.persistence.SchemaGenerationModeType;
import org.jboss.shrinkwrap.descriptor.spec.persistence.TransactionType;

public class DescriptorsExample
{
   public static void main(String[] args) throws Exception
   {
      PersistenceDef persistence = Descriptors.create(PersistenceDef.class)
            .persistenceUnit("test").transactionType(TransactionType.JTA)
               .provider(ProviderType.HIBERNATE)
               .jtaDataSource("java:/DefaultDS")
               .classes(User.class)
               .schemaGenerationMode(SchemaGenerationModeType.CREATE_DROP)
               .showSql()
               .formatSql()
               .property("hibernate.transaction.flush_before_completion", true)
            .persistenceUnit().name("another").transactionType(TransactionType.RESOURCE_LOCAL)
               .provider(ProviderType.ECLIPSE_LINK)
               .nonJtaDataSource("jdbc/__default")
               .excludeUnlistedClasses()
               .schemaGenerationMode(SchemaGenerationModeType.CREATE);
      
      BeansDef beans = Descriptors.create(BeansDef.class)
            .interceptor(InterceptorSample.class)
            .interceptor(AnotherInterceptorExample.class)
            .decorator(DecoratorSample.class)
            .alternativeStereotype(StereotypeExample.class);
      
      // simple empty descriptor
      //beans = Descriptors.create(BeansDef.class);
      
      JavaArchive jar = ShrinkWrap.create("test.jar", JavaArchive.class)
            .addManifestResource(persistence, "persistence.xml")
            .addManifestResource(beans, "beans.xml");
      jar.as(ZipExporter.class).exportZip(new File("/tmp/test.jar"), true);
      
      JAXBContext context;
      Marshaller m;
      
      context = JAXBContext.newInstance(Persistence.class);
      m = context.createMarshaller();
      m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, persistence.descriptor().getSchemaLocation());
      m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
      m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      
      m.marshal(persistence.descriptor(), System.out);
      
      context = JAXBContext.newInstance(Beans.class);
      m = context.createMarshaller();
      m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, beans.descriptor().getSchemaLocation());
      m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
      m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      
      m.marshal(beans.descriptor(), System.out);
   }
}
