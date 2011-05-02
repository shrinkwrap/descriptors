package org.jboss.shrinkwrap.descriptor.example;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.spec.cdi.beans.BeansDescriptor;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.PersistenceDescriptor;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.ProviderType;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.SchemaGenerationModeType;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.TransactionType;

public class DescriptorsExample
{
   public static void main(String[] args) throws Exception
   {
      final PersistenceDescriptor persistence = Descriptors.create(PersistenceDescriptor.class)
            .persistenceUnit("test").transactionType(TransactionType.JTA)
               .provider(ProviderType.HIBERNATE)
               .jtaDataSource("java:/DefaultDS")
               .classes(User.class)
               .schemaGenerationMode(SchemaGenerationModeType.CREATE_DROP)
               .showSql()
               .formatSql()
               .property("hibernate.transaction.flush_before_completion", true)
            .persistenceUnit("another").transactionType(TransactionType.RESOURCE_LOCAL)
               .provider(ProviderType.ECLIPSE_LINK)
               .nonJtaDataSource("jdbc/__default")
               .excludeUnlistedClasses()
               .schemaGenerationMode(SchemaGenerationModeType.CREATE);
      
      System.out.println(persistence.exportAsString());
      
      final BeansDescriptor beans = Descriptors.create(BeansDescriptor.class).interceptor(InterceptorSample.class)
            .interceptor(AnotherInterceptorExample.class).decorator(DecoratorSample.class)
            .alternativeStereotype(StereotypeExample.class);
      
      System.out.println(beans.exportAsString());
      
      // simple empty descriptor
      //beans = Descriptors.create(BeansDef.class);
      
      /*
      JavaArchive jar = ShrinkWrap.create(JavaArchive.class, "test.jar")
            .addManifestResource(persistence, "persistence.xml")
            .addManifestResource(beans, "beans.xml");
      jar.as(ZipExporter.class).exportZip(new File("/tmp/test.jar"), true);

       */
    
      
      
   }
}
