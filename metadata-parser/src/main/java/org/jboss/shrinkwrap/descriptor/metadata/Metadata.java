package org.jboss.shrinkwrap.descriptor.metadata;

import java.util.ArrayList;
import java.util.List;

public class Metadata
{
   private final List<MetadataType> dataTypeList = new ArrayList<MetadataType>();
   private final List<MetadataEnum> enumList     = new ArrayList<MetadataEnum>();
   private final List<MetadataClass> groupList   = new ArrayList<MetadataClass>();
   private final List<MetadataClass> classList   = new ArrayList<MetadataClass>();
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

   public List<MetadataType> getDataTypeList()
   {
      return dataTypeList;
   }
   
   public List<MetadataEnum> getEnumList()
   {
      return enumList;
   }
   
   public List<MetadataClass> getGroupList()
   {
      return groupList;
   }
   
   public List<MetadataClass> getClassList()
   {
      return classList;
   }
   
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
   
   public void addGroupElement(final String groupName, final MetadataElement groupElement)
   {
      for (MetadataClass item: groupList)
      {
         if (item.getName().equals(groupName))
         {
            item.getElements().add(groupElement);
            return;
         }
      }
      
      final MetadataClass newItem = new MetadataClass(groupName);
      newItem.getElements().add(groupElement);
      newItem.setNamespace(getCurrentNamespace());
      newItem.setSchemaName(getCurrentSchmema());
      newItem.setPackageApi(getCurrentPackageApi());
      newItem.setPackageImpl(getCurrentPackageImpl());
      groupList.add(newItem);
   }
   
   public void addGroupReference(final String groupName, final MetadataElement groupReference)
   {
	  groupReference.setRef(getNamespaceValue(groupReference.getRef()));
      for (MetadataClass item: groupList)
      {
         if (item.getName().equals(groupName))
         {
            item.getIncludes().add(groupReference);
            return;
         }
      }
      
      final MetadataClass newItem = new MetadataClass(groupName);
      newItem.getIncludes().add(groupReference);
      newItem.setNamespace(getCurrentNamespace());
      newItem.setSchemaName(getCurrentSchmema());
      newItem.setPackageApi(getCurrentPackageApi());
      newItem.setPackageImpl(getCurrentPackageImpl());
      groupList.add(newItem);
   }
   
   public void addClassElement(final String className, final MetadataElement classElement)
   {
	  classElement.setType(getNamespaceValue(classElement.getType()));
      for (MetadataClass item: classList)
      {
         if (item.getName().equals(className))
         {
            item.getElements().add(classElement);
            return;
         }
      }
      
      final MetadataClass newItem = new MetadataClass(className);
      newItem.getElements().add(classElement);
      newItem.setNamespace(getCurrentNamespace());
      newItem.setSchemaName(getCurrentSchmema());
      newItem.setPackageApi(getCurrentPackageApi());
      newItem.setPackageImpl(getCurrentPackageImpl());
      classList.add(newItem);
   }
   
   public void addClassReference(final String className, final MetadataElement classReference)
   {
	  classReference.setRef(getNamespaceValue(classReference.getRef()));
      for (MetadataClass item: classList)
      {
         if (item.getName().equals(className))
         {
            item.getIncludes().add(classReference);
            return;
         }
      }
      
      final MetadataClass newItem = new MetadataClass(className);
      newItem.getIncludes().add(classReference);
      newItem.setNamespace(getCurrentNamespace());
      newItem.setSchemaName(getCurrentSchmema());
      newItem.setPackageApi(getCurrentPackageApi());
      newItem.setPackageImpl(getCurrentPackageImpl());
      classList.add(newItem);
   }
   

   public void preResolveDataTypes()
   {
      for (MetadataClass metadataClass: classList)
      {
         for (MetadataElement element: metadataClass.getElements())
         {  
            for (MetadataType dataType: getDataTypeList())
            {
               final String str = dataType.getNamespace() + ":" + dataType.getName();
               if (str.equals(element.getType()))
               {
                  element.setType(dataType.getMappedTo());
               }
            }
         }
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
   
}
