package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The loader-repository specifies the name of the UnifiedLoaderRepository MBean
 * to use for the ear to provide ear level scoping of classes deployed in the
 * ear. It is a unique JMX ObjectName string. It may also specify an arbitrary
 * configuration by including a loader-repository-config element.
 * 
 * Examples:
 * <loader-repository>jboss.test:loader=cts-cmp2v1-sar.ear</loader-repository>
 * 
 * <loader-repository loaderRepositoryClass='dot.com.LoaderRepository'>
 * dot.com:loader=unique-archive-name <loader-repository-config
 * configParserClass='dot.com.LoaderParser'> java2ParentDelegaton=true
 * </loader-repository-config> </loader-repository> </loader-repository>
 * 
 * 
 * 
 */
public interface LoaderRepositoryType<T> extends Child<T> {

	public LoaderRepositoryType<T> removeAllLoaderRepositoryConfig();

	public LoaderRepositoryConfigType<LoaderRepositoryType<T>> loaderRepositoryConfig();

	public List<LoaderRepositoryConfigType<LoaderRepositoryType<T>>> getLoaderRepositoryConfigList();

	public LoaderRepositoryType<T> setLoaderRepositoryClass(
			String loaderRepositoryClass);

	public LoaderRepositoryType<T> removeLoaderRepositoryClass();

	public String getLoaderRepositoryClass();

}
