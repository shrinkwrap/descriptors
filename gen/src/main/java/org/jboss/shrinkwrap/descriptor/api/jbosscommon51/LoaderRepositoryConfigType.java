package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The loader-repository-config element specifies any arbitrary configuration
 * fragment for use in configuring the loader-repository instance. The actual content of this
 * element is specific to the loaderRepositoryClass and the code parsing the element.
 *
 *
 */
public interface LoaderRepositoryConfigType<T> extends Child<T>
{

   public LoaderRepositoryConfigType<T> setConfigParserClass(String configParserClass);

   public LoaderRepositoryConfigType<T> removeConfigParserClass();

   public String getConfigParserClass();

}
