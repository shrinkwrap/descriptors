package org.jboss.shrinkwrap.descriptor.impl.webapp30;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
import org.junit.Assert;
import org.junit.Test;

public class WebAppDescriptorImplTest {
	@Test
	public void shouldCreateDefaultName() throws Exception {
		Assert.assertEquals("web.xml", create().getDescriptorName());
	}

	private WebAppDescriptor create() {
		return Descriptors.create(WebApp30Descriptor.class);
	}

	// public void testEjbJarNavigation() throws Exception
	// {
	// final String ejbJar = Descriptors.create(EjbJar31Descriptor.class)
	// .setModuleName("")
	// .setDescription("")
	// .setDisplayName("").up() /* TODO wrong */
	// .enterpriseBeans()
	// .session()
	// .setEjbName("")
	// .setEjbClass("")
	// .envEntry()
	// .setEnvEntryName("")
	// .setEnvEntryType("java.lang.Long")
	// .setEnvEntryValue("8L")
	// .up()
	// .envEntry()
	// .setEnvEntryName("")
	// .setEnvEntryType("java.lang.Long")
	// .setEnvEntryValue("8L")
	// .up()
	// .up()
	// .messageDriven()
	// .setMessageDestinationLink("")
	// .messageDestinationRef()
	// .setLookupName("")
	// .setMappedName("")
	// .up()
	// .up()
	// .up()
	// .up()
	// .assemblyDescriptor()
	// .applicationException()
	// .setExceptionClass("")
	// .setInherited(true)
	// .setRollback(false)
	// .up()
	// .up()
	// .up()
	// .exportAsString();
	// }
	//
	//
	// public void testNavigation() throws Exception
	// {
	// final String webApp = Descriptors.create(WebApp30Descriptor.class)
	// .setVersion(WebAppVersionType._3_0)
	// .setVersion("3.0")
	// .setMetadataComplete(false)
	// .setModuleName("")
	// .setDescription("description1")
	// .setDisplayName("displayName1")
	// .icon().setSmallIcon("smallIcon1").setLargeIcon("largeIcon1").up()
	// .distributable()
	// .contextParam()
	// .setDescription("description")
	// .setParamName("paramName")
	// .setParamValue("paramValue").up()
	// .filter()
	// .setFilterName("filterName")
	// .setFilterClass("org.jboss.arquillian.class")
	// .setFilterClass(WebApp30Descriptor.class)
	// .setAsyncSupported(false)
	// .setDescription("")
	// .setDisplayName("")
	// .icon()
	// .setSmallIcon("")
	// .setLargeIcon("")
	// .up()
	// .initParam()
	// .setDescription("description")
	// .setParamName("")
	// .setParamValue("").up()
	// .up()
	// .filterMapping()
	// .setFilterName("")
	// .setServletName("")
	// .setUrlPattern("")
	// .setDispatcher(DispatcherType._FORWARD).up()
	// .listener()
	// .setListenerClass("").up()
	// .servlet()
	// .setAsyncSupported(false)
	// .setEnabled(true)
	// .setJspFile("")
	// .setLoadOnStartup(true)
	// .multipartConfig()
	// .setLocation("")
	// .setMaxFileSize(10000L)
	// .setMaxRequestSize(10000L)
	// .setFileSizeThreshold(100).up()
	// .up()
	// .servletMapping()
	// .setServletName("")
	// .setUrlPattern("")
	// .up()
	// .sessionConfig()
	// .cookieConfig()
	// .setComment("")
	// .setDomain("")
	// .setHttpOnly(true)
	// .setMaxAge(10)
	// .setName("")
	// .setSecure(true)
	// .setPath("")
	// .up()
	// .setSessionTimeout(100000)
	// .setTrackingMode(TrackingModeType._URL)
	// .up()
	// .mimeMapping()
	// .setExtension("")
	// .setMimeType("")
	// .up()
	// .welcomeFileList()
	// .setWelcomeFile("")
	// .setWelcomeFile("")
	// .up()
	// .errorPage()
	// .setLocation("")
	// .setErrorCode(222)
	// .setExceptionType("")
	// .up()
	// .absoluteOrdering().setName("").up()
	// .jspConfig()
	// .jspPropertyGroup()
	// .setBuffer("")
	// .setDefaultContentType("")
	// .setDeferredSyntaxAllowedAsLiteral(false)
	// .setElIgnored(false)
	// .up()
	// .up()
	// .securityConstraint()
	// .authConstraint()
	// .setRoleName("")
	// .setDescription("")
	// .up()
	// .setDisplayName("")
	// .userDataConstraint()
	// .setDescription("")
	// .setTransportGuarantee(TransportGuaranteeType._CONFIDENTIAL)
	// .up()
	// .up()
	// .loginConfig()
	// .setAuthMethod("BASIC")
	// .up()
	// .securityRole()
	// .setDescription("")
	// .setRoleName("")
	// .up()
	// .envEntry()
	// .setDescription("")
	// .setEnvEntryName("")
	// .setEnvEntryType("")
	// .setEnvEntryValue("")
	// .up()
	// .envEntry()
	// .setDescription("")
	// .setEnvEntryName("")
	// .setEnvEntryType("")
	// .setEnvEntryValue("")
	// .up()
	// .absoluteOrdering()
	// .setName("name1")
	// .setName("name2")
	// .setName("")
	// .others().up().up()
	// .exportAsString();
	//

	@Test
	public void testAbsoluteOrdering() throws Exception {
		// WebAppDescriptor<WebAppDescriptorImpl> webAppDescriptor = new
		// WebAppDescriptorImpl();
		// webAppDescriptor.absoluteOrdering().name("myName").up().moduleName("moduleName");

	}
}
