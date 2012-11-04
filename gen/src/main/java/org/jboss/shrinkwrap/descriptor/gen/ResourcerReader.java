/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.shrinkwrap.descriptor.gen;

import java.io.InputStream;


/**
 * This class is able to returns input streams.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class ResourcerReader {	


	/**
	 * Returns a resource as input stream.
	 * @param resourceName
	 * @return if found, an input stream, otherwise null.
	 */
	public static InputStream getResourceAsStream(final String resourceName) {
		if (resourceName == null) {
			throw new IllegalArgumentException("Resource name cannot be null!");
		}
		
		return findResourceStream("xsd/" + resourceName);
	}
	
	//-----------------------------------------------------------------------||
	//-- Private Methods ----------------------------------------------------||
	//-----------------------------------------------------------------------||
	
	private static InputStream findResourceStream(final String ... resourceNames) {
		InputStream inputStream = null;
		for (String resource: resourceNames) {
			inputStream = Thread.currentThread()
					.getContextClassLoader()
					.getResourceAsStream(resource);
			
			if (inputStream != null) {
				break;
			}
		}
		
		return inputStream;
	}
}
