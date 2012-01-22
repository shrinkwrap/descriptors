/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
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

package org.jboss.shrinkwrap.descriptor.metadata;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.metadata.filter.JavaKeywordsEnum;

/**
 * This class serves as a sink for all extracted meta-data information.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class Metadata
{
   private final List<MetadataItem> dataTypeList = new ArrayList<MetadataItem>();
   private final List<MetadataEnum> enumList     = new ArrayList<MetadataEnum>();
   private final List<MetadataItem> groupList   = new ArrayList<MetadataItem>();
   private final List<MetadataItem> classList   = new ArrayList<MetadataItem>();
   private MetadataDescriptor metadataDescriptor;
   private String currentNamespace;
   private String currentSchmema;
   private String currentPackageApi;
   private String currentPackageImpl;
   
   
   public MetadataDescriptor getMetadataDescriptor() 
   {
	  return metadataDescriptor;
   }

   public void setMetadataDescriptor(MetadataDescriptor metadataDescriptor)
   {
	  this.metadataDescriptor = metadataDescriptor;
   }

   public String getCurrentNamespace()
   {
      return currentNamespace;
   }

   public void setCurrentNamespace(String currentNamespace)
   {
      this.currentNamespace = currentNamespace;
   }

   public String getCurrentSchmema()
   {
      return currentSchmema;
   }

   public void setCurrentSchmema(String currentSchmema)
   {
      this.currentSchmema = currentSchmema;
   }

   public String getCurrentPackageApi()
   {
      return currentPackageApi;
   }

   public void setCurrentPackageApi(String currentPackageApi)
   {
      this.currentPackageApi = currentPackageApi;
   }

   public String getCurrentPackageImpl()
   {
      return currentPackageImpl;
   }

   public void setCurrentPackageImpl(String currentPackageImpl)
   {
      this.currentPackageImpl = currentPackageImpl;
   }

   public List<MetadataItem> getDataTypeList()
   {
      return dataTypeList;
   }
   
   public List<MetadataEnum> getEnumList()
   {
      return enumList;
   }
   
   public List<MetadataItem> getGroupList()
   {
      return groupList;
   }
   
   public List<MetadataItem> getClassList()
   {
      return classList;
   }
   
   /**
    * Adds a enumeration value to the specified enumeration name. If no enumeration class is
    * found, then a new enumeration class will be created.
    * @param enumName the enumeration class name.
    * @param enumValue the new enumeration value.
    */
   public void addEnumValue(final String enumName, final String enumValue)
   {
      for (MetadataEnum instance: enumList)
      {
         if (instance.getName().equals(enumName))
         {
        	 instance.addValue(enumValue);
            return;
         }
      }
      
      final MetadataEnum newEnum = new MetadataEnum(enumName);
      newEnum.addValue(enumValue);
      newEnum.setNamespace(getCurrentNamespace());
      newEnum.setSchemaName(getCurrentSchmema());
      newEnum.setPackageApi(getCurrentPackageApi());
      enumList.add(newEnum);
   }
   
   /**
    * Adds a new element to the specific group element class. If no group element class is
    * found, then a new group element class. will be created.
    * @param groupName the group class name of
    * @param groupElement the new element to be added.
    */
   public void addGroupElement(final String groupName, final MetadataElement groupElement)
   {
      for (MetadataItem item: groupList)
      {
         if (item.getName().equals(groupName))
         {
            item.getElements().add(groupElement);
            return;
         }
      }
      
      final MetadataItem newItem = new MetadataItem(groupName);
      newItem.getElements().add(groupElement);
      newItem.setNamespace(getCurrentNamespace());
      newItem.setSchemaName(getCurrentSchmema());
      newItem.setPackageApi(getCurrentPackageApi());
      newItem.setPackageImpl(getCurrentPackageImpl());
      groupList.add(newItem);
   }
   
   /**
    * Adds a new reference to the specific group element class. If no group element class is
    * found, then a new group element class. will be created.
    * @param groupName the group class name of
    * @param groupReference the new reference to be added.
    */
   public void addGroupReference(final String groupName, final MetadataElement groupReference)
   {
	  groupReference.setRef(getNamespaceValue(groupReference.getRef()));
      for (MetadataItem item: groupList)
      {
         if (item.getName().equals(groupName))
         {
            item.getReferences().add(groupReference);
            return;
         }
      }
      
      final MetadataItem newItem = new MetadataItem(groupName);
      newItem.getReferences().add(groupReference);
      newItem.setNamespace(getCurrentNamespace());
      newItem.setSchemaName(getCurrentSchmema());
      newItem.setPackageApi(getCurrentPackageApi());
      newItem.setPackageImpl(getCurrentPackageImpl());
      groupList.add(newItem);
   }
   
   /**
    * Adds a new element to the specific element class. If no element class is
    * found, then a new element class. will be created.
    * @param className the class name
    * @param classElement the new element to be added.
    */
   public void addClassElement(final String className, final MetadataElement classElement)
   {
	  classElement.setType(getNamespaceValue(classElement.getType()));
      for (MetadataItem item: classList)
      {
         if (item.getName().equals(className))
         {
            // check for a element with the same name, if found then set 'maxOccurs = unbounded'
            for (MetadataElement element: item.getElements())
            {
               if (element.getName().equals(classElement.getName()))
               {
                  element.setMaxOccurs("unbounded");
                  return;
               }
            }
            
            item.getElements().add(classElement);
            return;
         }
      }
      
      final MetadataItem newItem = new MetadataItem(className);
      newItem.getElements().add(classElement);
      newItem.setNamespace(getCurrentNamespace());
      newItem.setSchemaName(getCurrentSchmema());
      newItem.setPackageApi(getCurrentPackageApi());
      newItem.setPackageImpl(getCurrentPackageImpl());
      classList.add(newItem);
   }
   
   /**
    * Adds a new reference to the specific element class. If no element class is
    * found, then a new element class. will be created.
    * @param className the class name
    * @param classReference the new reference to be added.
    */
   public void addClassReference(final String className, final MetadataElement classReference)
   {
	  classReference.setRef(getNamespaceValue(classReference.getRef()));
      for (MetadataItem item: classList)
      {
         if (item.getName().equals(className))
         {
            item.getReferences().add(classReference);
            return;
         }
      }
      
      final MetadataItem newItem = new MetadataItem(className);
      newItem.getReferences().add(classReference);
      newItem.setNamespace(getCurrentNamespace());
      newItem.setSchemaName(getCurrentSchmema());
      newItem.setPackageApi(getCurrentPackageApi());
      newItem.setPackageImpl(getCurrentPackageImpl());
      classList.add(newItem);
   }
   
   /**
    * Replaces all data type occurrences found in the element types for all classes with
    * the simple data type. This simplifies later the XSLT ddJavaAll step.
    */
   public void preResolveDataTypes()
   {
      for (MetadataItem metadataClass: classList)
      {
         preResolveDataTypeImpl(metadataClass);
      }
      
      for (MetadataItem metadataClass: groupList)
      {
         preResolveDataTypeImpl(metadataClass);
      }
   }
   
   //----------------------------------------------------------------------------------------------------------||
   //-- Private Methods ---------------------------------------------------------------------------------------||
   //----------------------------------------------------------------------------------------------------------||
   
   private String getNamespaceValue(final String value)
   {
	   	if (value == null || value.contains(":") || value.equals("text"))
	  	 {
	  		 return value;
	  	 }
	  	 else
	  	 {
	  		 return getCurrentNamespace() + ":" + value;
	  	 }
   }
   
   private void preResolveDataTypeImpl(final MetadataItem metadataClass)
   {
      for (MetadataElement element: metadataClass.getElements())
      {  
         for (MetadataItem dataType: getDataTypeList())
         {
            final String str = dataType.getNamespace() + ":" + dataType.getName();
            if (str.equals(element.getType()))
            {
               element.setType(dataType.getMappedTo());
            }
         }
         
         /** 
          * replace the xs namespace with xsd, ddJavaAll xslt likes this more 
          */
         element.setType(element.getType().replace("xs:", "xsd:"));
         
         /**
          * Check java keywords
          */
//         if (JavaKeywordsEnum.abstract_keyword.isJavaKeyword(element.getName()))
//         {
//            element.setName("_" + element.getName());
//         }
      }
   }
   
}
