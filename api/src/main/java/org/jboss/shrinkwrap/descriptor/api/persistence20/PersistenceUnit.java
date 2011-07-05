package org.jboss.shrinkwrap.descriptor.api.persistence20;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 */
public interface PersistenceUnit<T> extends Child<T>
{

   public PersistenceUnit<T> setDescription(String description);

   public PersistenceUnit<T> removeDescription();

   public String getDescription();

   public PersistenceUnit<T> setProvider(String provider);

   public PersistenceUnit<T> removeProvider();

   public String getProvider();

   public PersistenceUnit<T> setJtaDataSource(String jtaDataSource);

   public PersistenceUnit<T> removeJtaDataSource();

   public String getJtaDataSource();

   public PersistenceUnit<T> setNonJtaDataSource(String nonJtaDataSource);

   public PersistenceUnit<T> removeNonJtaDataSource();

   public String getNonJtaDataSource();

   public PersistenceUnit<T> setMappingFile(String mappingFile);

   public PersistenceUnit<T> setMappingFileList(String... values);

   public PersistenceUnit<T> removeAllMappingFile();

   public List<String> getMappingFileList();

   public PersistenceUnit<T> setJarFile(String jarFile);

   public PersistenceUnit<T> setJarFileList(String... values);

   public PersistenceUnit<T> removeAllJarFile();

   public List<String> getJarFileList();

   public PersistenceUnit<T> setClazz(String clazz);

   public PersistenceUnit<T> setClazzList(String... values);

   public PersistenceUnit<T> removeAllClazz();

   public List<String> getClazzList();

   public PersistenceUnit<T> setExcludeUnlistedClasses(Boolean excludeUnlistedClasses);

   public PersistenceUnit<T> removeExcludeUnlistedClasses();

   public Boolean isExcludeUnlistedClasses();

   public PersistenceUnit<T> setSharedCacheMode(PersistenceUnitCachingType sharedCacheMode);

   public PersistenceUnit<T> setSharedCacheMode(String sharedCacheMode);

   public PersistenceUnitCachingType getSharedCacheMode();

   public String getSharedCacheModeAsString();

   public PersistenceUnit<T> setValidationMode(PersistenceUnitValidationModeType validationMode);

   public PersistenceUnit<T> setValidationMode(String validationMode);

   public PersistenceUnitValidationModeType getValidationMode();

   public String getValidationModeAsString();

   public PersistenceUnit<T> removeProperties();

   public Properties<PersistenceUnit<T>> properties();

   public PersistenceUnit<T> setName(String name);

   public PersistenceUnit<T> removeName();

   public String getName();

   public PersistenceUnit<T> setTransactionType(PersistenceUnitTransactionType transactionType);

   public PersistenceUnit<T> setTransactionType(String transactionType);

   public PersistenceUnit<T> removeTransactionType();

   public PersistenceUnitTransactionType getTransactionType();

   public String getTransactionTypeAsString();

}
