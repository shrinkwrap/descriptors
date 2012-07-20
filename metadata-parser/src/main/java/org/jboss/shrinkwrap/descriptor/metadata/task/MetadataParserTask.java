/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.metadata.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import org.jboss.shrinkwrap.descriptor.metadata.MetadataParser;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataParserConfiguration;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataParserPath;

/**
 * Implementation class for the Shrinkwrap Descriptors Ant task.
 * 
 * @author <a href="mailto:jesper.pedersen@jboss.org">Jesper Pedersen</a>
 */
public class MetadataParserTask extends Task
{
   /** Trace flag */
   protected boolean verbose;

   /** Classpath ref */
   protected String classpathRef;

   /** Path */
   protected Path path;

   /** Descriptors */
   protected Descriptors descriptors;

   /** Classpath */
   protected Classpath classpath;

   /**
    * Constructor
    */
   public MetadataParserTask()
   {
      this.verbose = false;
      this.classpathRef = null;
      this.path = null;
      this.descriptors = null;
      this.classpath = null;
   }

   /**
    * Set the verbose flag
    * @param v The value
    */
   public void setVerbose(boolean v)
   {
      verbose = v;
   }

   /**
    * Set the classpath reference
    * @param v The value
    */
   public void setClasspathref(String v)
   {
      classpathRef = v;
   }

   /**
    * Create the path
    * @return The value
    */
   public Path createPath()
   {
      path = new Path();
      return path;
   }

   /**
    * Create the descriptors
    * @return The value
    */
   public Descriptors createDescriptors()
   {
      descriptors = new Descriptors();
      return descriptors;
   }

   /**
    * Create the classpath
    * @return The value
    */
   public Classpath createClasspath()
   {
      classpath = new Classpath(getProject());
      return classpath;
   }

   /**
    * Execute Ant task
    *
    * @throws BuildException If an error occurs
    */
   @Override
   public void execute() throws BuildException
   {
      if (path == null)
         throw new BuildException("Path isn't defined");

      if (descriptors == null)
         throw new BuildException("Descriptors isn't defined");

      if (descriptors.getData() == null)
         throw new BuildException("No descriptor defined");

      ClassLoader oldCl = Thread.currentThread().getContextClassLoader();
      try
      {
         if (classpathRef != null || classpath != null)
         {
            org.apache.tools.ant.types.Path p =
               new org.apache.tools.ant.types.Path(getProject());

            if (classpathRef != null)
            {
               org.apache.tools.ant.types.Reference reference =
                  new org.apache.tools.ant.types.Reference(getProject(), classpathRef);
               p.setRefid(reference);
            }

            if (classpath != null)
            {
               p.append(classpath);
            }

            ClassLoader cl = getProject().createClassLoader(oldCl, p);
            Thread.currentThread().setContextClassLoader(cl);
         }

         List<Descriptor> data = descriptors.getData();
         for (Descriptor d : data)
         {
            d.applyNamespaces();
         }

         MetadataParser metadataParser = new MetadataParser();
         metadataParser.parse(path, data, verbose);
      }
      catch (Throwable t)
      {
         throw new BuildException(t.getMessage(), t);
      }
      finally
      {
         Thread.currentThread().setContextClassLoader(oldCl);
      }
   }

   /**
    * Path
    */
   public class Path extends MetadataParserPath
   {
      /**
       * Constructor
       */
      public Path()
      {
         super();
      }

      @Override
      public void setPathToApi(final String pathToApi)
      {
         super.setPathToApi(getProject().replaceProperties(pathToApi));
      }

      @Override
      public void setPathToImpl(final String pathToImpl)
      {
         super.setPathToImpl(getProject().replaceProperties(pathToImpl));
      }
      
      @Override
      public void setPathToTest(final String pathToTest)
      {
         super.setPathToTest(getProject().replaceProperties(pathToTest));
      }
      
      @Override
      public void setPathToServices(final String pathToServices)
      {
         super.setPathToServices(getProject().replaceProperties(pathToServices));
      }
   }

   /**
    * Descriptors
    */
   public class Descriptors
   {
      private List<Descriptor> data;

      /**
       * Constructor
       */
      public Descriptors()
      {
         this.data = null;
      }

      /**
       * Create a descriptor
       * @return The value
       */
      public Descriptor createDescriptor()
      {
         if (data == null)
            data = new ArrayList<Descriptor>(1);

         Descriptor descriptor = new Descriptor();
         data.add(descriptor);
         return descriptor;
      }

      /**
       * Get data
       * @return The value
       */
      List<Descriptor> getData()
      {
         return data;
      }
   }

   /**
    * Descriptor
    */
   public class Descriptor extends MetadataParserConfiguration
   {
      /** Namespaces */
      protected Namespaces namespaces;

      /**
       * Constructor
       */
      public Descriptor()
      {
         this.namespaces = null;
      }

      /**
       * Create the namespaces
       * @return The value
       */
      public Namespaces createNamespaces()
      {
         namespaces = new Namespaces(getProject());
         return namespaces;
      }

      /**
       * Apply namespaces
       */
      public void applyNamespaces()
      {
         if (namespaces != null && namespaces.getData() != null)
         {
            Properties properties = new Properties();

            for (Property p : namespaces.getData())
            {
               if (p.getName() != null && p.getValue() != null)
               {
                  properties.put(p.getName(), p.getValue());
               }
            }

            setNamespaces(properties);
         }
      }

      @Override
      public void setNameSpace(final String nameSpace)
      {
         super.setNameSpace(getProject().replaceProperties(nameSpace));
      }

      @Override
      public void setPackageApi(final String packageApi)
      {
         super.setPackageApi(getProject().replaceProperties(packageApi));
      }

      @Override
      public void setPackageImpl(final String packageImpl)
      {
         super.setPackageImpl(getProject().replaceProperties(packageImpl));
      }
      
      @Override
      public void setPathToXsd(final String pathToXsd)
      {
         super.setPathToXsd(getProject().replaceProperties(pathToXsd));
      }

      @Override
      public void setElementName(final String elementName)
      {
         super.setElementName(getProject().replaceProperties(elementName));
      }
      
      @Override
      public void setElementType(final String elementType)
      {
         super.setElementType(getProject().replaceProperties(elementType));
      }

      @Override
      public void setDescriptorName(final String descriptorName)
      {
         super.setDescriptorName(getProject().replaceProperties(descriptorName));
      }
   }

   /**
    * Classpath
    */
   public class Classpath extends org.apache.tools.ant.types.Path
   {
      /**
       * Constructor
       * @param p The project
       */
      public Classpath(org.apache.tools.ant.Project p)
      {
         super(p);
      }
   }

   /**
    * Namespaces
    */
   public class Namespaces
   {
      private org.apache.tools.ant.Project project;
      private List<Property> properties;

      /**
       * Constructor
       * @param p The project
       */
      public Namespaces(org.apache.tools.ant.Project p)
      {
         this.project = p;
         this.properties = null;
      }

      /**
       * Create a property
       * @return The value
       */
      public Property createProperty()
      {
         Property p = new Property(project);
         
         if (properties == null)
            properties = new ArrayList<Property>(1);

         properties.add(p);
         return p;
      }

      /**
       * Get data
       * @return The value
       */
      List<Property> getData()
      {
         return properties;
      }
   }

   /**
    * Property
    */
   public class Property
   {
      private org.apache.tools.ant.Project project;
      private String name;
      private String value;

      /**
       * Constructor
       * @param p The project
       */
      public Property(org.apache.tools.ant.Project p)
      {
         this.project = p;
         this.name = null;
         this.value = null;
      }

      /**
       * Set the name
       * @param v The value
       */
      public void setName(String v)
      {
         this.name = project.replaceProperties(v);
      }

      /**
       * Get the name
       * @return The value
       */
      public String getName()
      {
         return name;
      }

      /**
       * Set the value
       * @param v The value
       */
      public void setValue(String v)
      {
         this.value = project.replaceProperties(v);
      }

      /**
       * Get the value
       * @return The value
       */
      public String getValue()
      {
         return value;
      }
   }
}
