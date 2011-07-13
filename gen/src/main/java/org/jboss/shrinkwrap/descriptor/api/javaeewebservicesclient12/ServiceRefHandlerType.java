package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * Declares the handler for a port-component. Handlers can access the init-param
 * name/value pairs using the HandlerInfo interface. If port-name is not
 * specified, the handler is assumed to be associated with all ports of the
 * service.
 * 
 * Used in: service-ref
 * 
 * 
 * 
 */
public interface ServiceRefHandlerType<T> extends Child<T> {

	public ServiceRefHandlerType<T> setDescription(String description);

	public ServiceRefHandlerType<T> setDescriptionList(String... values);

	public ServiceRefHandlerType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public ServiceRefHandlerType<T> setDisplayName(String displayName);

	public ServiceRefHandlerType<T> setDisplayNameList(String... values);

	public ServiceRefHandlerType<T> removeAllDisplayName();

	public List<String> getDisplayNameList();

	public ServiceRefHandlerType<T> removeAllIcon();

	public IconType<ServiceRefHandlerType<T>> icon();

	public List<IconType<ServiceRefHandlerType<T>>> getIconList();

	public ServiceRefHandlerType<T> setHandlerName(String handlerName);

	public ServiceRefHandlerType<T> removeHandlerName();

	public String getHandlerName();

	public ServiceRefHandlerType<T> setHandlerClass(String handlerClass);

	public ServiceRefHandlerType<T> removeHandlerClass();

	public String getHandlerClass();

	public ServiceRefHandlerType<T> removeAllInitParam();

	public ParamValueType<ServiceRefHandlerType<T>> initParam();

	public List<ParamValueType<ServiceRefHandlerType<T>>> getInitParamList();

	public ServiceRefHandlerType<T> setSoapHeader(String soapHeader);

	public ServiceRefHandlerType<T> setSoapHeaderList(String... values);

	public ServiceRefHandlerType<T> removeAllSoapHeader();

	public List<String> getSoapHeaderList();

	public ServiceRefHandlerType<T> setSoapRole(String soapRole);

	public ServiceRefHandlerType<T> setSoapRoleList(String... values);

	public ServiceRefHandlerType<T> removeAllSoapRole();

	public List<String> getSoapRoleList();

	public ServiceRefHandlerType<T> setPortName(String portName);

	public ServiceRefHandlerType<T> setPortNameList(String... values);

	public ServiceRefHandlerType<T> removeAllPortName();

	public List<String> getPortNameList();

}
