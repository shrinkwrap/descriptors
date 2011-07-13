package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation: The cluster-config element allows to specify cluster
 * specific settings.
 * 
 * 
 */
public interface ClusterConfigType<T> extends Child<T> {

	public ClusterConfigType<T> setDescription(String description);

	public ClusterConfigType<T> setDescriptionList(String... values);

	public ClusterConfigType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ClusterConfigType<T> setPartitionName(String partitionName);

	public ClusterConfigType<T> removePartitionName();

	public String getPartitionName();

	public ClusterConfigType<T> setHomeLoadBalancePolicy(
			String homeLoadBalancePolicy);

	public ClusterConfigType<T> removeHomeLoadBalancePolicy();

	public String getHomeLoadBalancePolicy();

	public ClusterConfigType<T> setSessionStateManagerJndiName(
			String sessionStateManagerJndiName);

	public ClusterConfigType<T> removeSessionStateManagerJndiName();

	public String getSessionStateManagerJndiName();

	public ClusterConfigType<T> setBeanLoadBalancePolicy(
			String beanLoadBalancePolicy);

	public ClusterConfigType<T> removeBeanLoadBalancePolicy();

	public String getBeanLoadBalancePolicy();

	public ClusterConfigType<T> setLoadBalancePolicy(String loadBalancePolicy);

	public ClusterConfigType<T> removeLoadBalancePolicy();

	public String getLoadBalancePolicy();

}
