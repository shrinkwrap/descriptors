package org.jboss.shrinkwrap.descriptor.impl.base;

import static org.junit.Assert.*;

import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
import org.junit.Test;

public class NodeInfoExtractorTest 
{

	@Test
	public void testGetNodeInfo() 
	{
		assertEquals(NodeInfoExtractor.getNodeInfo(WebApp30Descriptor.class), "web-app");
	}

}
