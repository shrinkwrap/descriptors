package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

/**
 * WebCommonType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface WebCommonType<T> extends DescriptionGroup
{
   public ParamValueType<T> paramParam();

   public FilterType<T> filter();

   public FilterMappingType<T> filterMapping();

   public ListenerType<T> listener();

   public ServletType<T> servlet();

   public ServletMappingType<T> servletMapping();

   public SessionConfigType<T> sessionConfig();

   public AbsoluteOrderingType<T> absoluteOrdering();

   public AuthConstraintType<T> authConstraint();

   public SecurityConstraintType<T> securityConstraint();
}

//
//  <xsd:element name="mime-mapping"
//               type="javaee:mime-mappingType"/>
//  <xsd:element name="welcome-file-list"
//               type="javaee:welcome-file-listType"/>
//  <xsd:element name="error-page"
//               type="javaee:error-pageType"/>
//  <xsd:element name="jsp-config"
//               type="javaee:jsp-configType"/>
//  <xsd:element name="security-constraint"
//               type="javaee:security-constraintType"/>
//  <xsd:element name="login-config"
//               type="javaee:login-configType"/>
//  <xsd:element name="security-role"
//               type="javaee:security-roleType"/>
//  <xsd:group ref="javaee:jndiEnvironmentRefsGroup"/>
//  <xsd:element name="message-destination"
//               type="javaee:message-destinationType"/>
//  <xsd:element name="locale-encoding-mapping-list"
//               type="javaee:locale-encoding-mapping-listType"/>
//</xsd:choice>
//</xsd:group>