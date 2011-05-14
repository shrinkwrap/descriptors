package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.NodeInfo;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;

/**
 * WebCommonType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface WebCommonType<T> extends DescriptionGroup
{
//	@NodeInfo(xmlName="")
//   public ParamValueType<T> paramParam();

	@NodeInfo(xmlName="filter")
   public FilterType<T> filter();

	@NodeInfo(xmlName="filter-mapping")
   public FilterMappingType<T> filterMapping();

	@NodeInfo(xmlName="listener")
   public ListenerType<T> listener();

	@NodeInfo(xmlName="servlet")
   public ServletType<T> servlet();

	@NodeInfo(xmlName="servlet-mapping")
   public ServletMappingType<T> servletMapping();

	@NodeInfo(xmlName="session-config")
   public SessionConfigType<T> sessionConfig();

	@NodeInfo(xmlName="absolute-ordering")
   public AbsoluteOrderingType<T> absoluteOrdering();

//	@NodeInfo(xmlName="absolute-ordering")
//   public AuthConstraintType<T> authConstraint();
   
	@NodeInfo(xmlName="mime-mapping")
   public MimeMappingType<T> mimeMapping();
   
	@NodeInfo(xmlName="welcome-file-list")
   public WelcomeFileListType<T> welcomeFileList();
   
	@NodeInfo(xmlName="error-page")
   public ErrorPageType<T> errorPage();
   
	@NodeInfo(xmlName="jsp-config")
   public JspConfigType<T> jspConfig();
   
	@NodeInfo(xmlName="security-constraint")
   public SecurityConstraintType<T> securityConstraint();
   
	@NodeInfo(xmlName="login-config")
   public LoginConfigType<T> loginConfig();
   
   
   
}


//  <xsd:element name="security-role"
//               type="javaee:security-roleType"/>
//  <xsd:group ref="javaee:jndiEnvironmentRefsGroup"/>
//  <xsd:element name="message-destination"
//               type="javaee:message-destinationType"/>
//  <xsd:element name="locale-encoding-mapping-list"
//               type="javaee:locale-encoding-mapping-listType"/>
//</xsd:choice>
//</xsd:group>