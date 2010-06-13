package org.jboss.shrinkwrap.descriptor.spec.beans;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;

import javax.decorator.Decorator;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Stereotype;
import javax.interceptor.Interceptor;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.jboss.shrinkwrap.api.Asset;

public class BeansDef implements Asset
{
   private Beans beans;
   
   public BeansDef()
   {
      this(new Beans());
   }
   
   public BeansDef(Beans beans)
   {
      this.beans = beans;
   }
   
   public BeansDef interceptors(Class<?>... classes)
   {
      for (Class<?> c : classes)
      {
         // FIXME this validation needs to be thorough
         if (!c.isAnnotationPresent(Interceptor.class))
         {
            throw new IllegalArgumentException("Class is not an interceptor");
         }
         beans.getInterceptors().add(c.getName());
      }
      return this;
   }
   
   public BeansDef interceptor(Class<?> clazz)
   {
      return interceptors(clazz);
   }
   
   public BeansDef decorators(Class<?>... classes)
   {
      for (Class<?> c : classes)
      {
         // FIXME this validation needs to be more thorough
         if (!c.isAnnotationPresent(Decorator.class))
         {
            throw new IllegalArgumentException("Class is not a decorator");
         }
         beans.getDecorators().add(c.getName());
      }
      return this;
   }
   
   public BeansDef decorator(Class<?> clazz)
   {
      return decorators(clazz);
   }
   
   public BeansDef alternativeClasses(Class<?>... classes)
   {
      for (Class<?> c : classes)
      {
         // FIXME this validation needs to be thorough
         if (!c.isAnnotationPresent(Alternative.class))
         {
            throw new IllegalArgumentException("Class is not an alternative");
         }
         beans.getAlternatives().getClasses().add(c.getName());
      }
      return this;
   }
   
   public BeansDef alternativeClass(Class<?> clazz)
   {
      return alternativeClasses(clazz);
   }
   
   public BeansDef alternativeStereotypes(Class<? extends Annotation>... annotations)
   {
      for (Class<? extends Annotation> a : annotations)
      {
         // FIXME this validation needs to be thorough
         if (!a.isAnnotationPresent(Stereotype.class))
         {
            throw new IllegalArgumentException("Annotation is not a stereotype");
         }
         // FIXME this validation needs to be thorough
         if (!a.isAnnotationPresent(Alternative.class))
         {
            throw new IllegalArgumentException("Stereotype is not an alternative");
         }
         beans.getAlternatives().getStereotypes().add(a.getName());
      }
      return this;
   }
   
   @SuppressWarnings("unchecked")
   public BeansDef alternativeStereotype(Class<? extends Annotation> clazz)
   {
      return alternativeStereotypes(clazz);
   }
   
   public Beans descriptor()
   {
      return beans;
   }

   @Override
   public InputStream openStream()
   {
      try
      {
         JAXBContext context = JAXBContext.newInstance(Beans.class);
         Marshaller m = context.createMarshaller();
         m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, beans.getSchemaLocation());
         m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
         m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         ByteArrayOutputStream os = new ByteArrayOutputStream();
         m.marshal(beans, os);
         return new ByteArrayInputStream(os.toByteArray());
      }
      catch (Exception e)
      {
         throw new RuntimeException(e);
      }
   }
}
