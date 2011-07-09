package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * Element for specifying the remote jndi binding for a bean as well
 * as the client interceptor stack
 *
 *
 */
public interface RemoteBindingType<T> extends Child<T>
{

   public RemoteBindingType<T> setDescription(String description);

   public RemoteBindingType<T> setDescriptionList(String... values);

   public RemoteBindingType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public RemoteBindingType<T> setJndiName(String jndiName);

   public RemoteBindingType<T> removeJndiName();

   public String getJndiName();

   public RemoteBindingType<T> setClientBindUrl(String clientBindUrl);

   public RemoteBindingType<T> removeClientBindUrl();

   public String getClientBindUrl();

   public RemoteBindingType<T> setInterceptorStack(String interceptorStack);

   public RemoteBindingType<T> removeInterceptorStack();

   public String getInterceptorStack();

   public RemoteBindingType<T> setInvokerName(String invokerName);

   public RemoteBindingType<T> removeInvokerName();

   public String getInvokerName();

}
