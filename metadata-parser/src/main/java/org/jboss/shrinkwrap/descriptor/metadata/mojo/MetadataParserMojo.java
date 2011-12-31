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
package org.jboss.shrinkwrap.descriptor.metadata.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataParser;

/**
 * Implementation class for the Shrinkwrap Descriptors CLI Mojo task.
 *
 * @goal parse
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataParserMojo extends AbstractMojo
{
    /** 
     * Path to the XSD file to be parsed 
     * 
     * @parameter
     */
    private String pathToXsd;
    
    /** 
     * The namespace for the given XSD.
     * 
     * @parameter
     */
    private String nameSpace;
    
    /** 
     * The package name for the API classes. 
     * 
     * @parameter
     */
    private String packageApi;
    
    /** 
     * The package name for the Implementation classes.
     * 
     * @parameter
     */
    private String packageImpl;
    
    /** 
     * The name of the root element.
     * 
     * @parameter
     */
    private String elementName;
    
    
    /** 
     * The type of the root element.
     * 
     * @parameter
     */
    private String elementType;
    
    
    /** 
     * Trace flag 
     * 
     * @parameter
     */
    private boolean verbose;
    
    /** 
     * Full path to the API folder in which the interfaces are generated. 
     * 
     * @parameter
     */
    private String pathToApi;
    
    /** 
     * Full path to the implementation folder in which the classes are generated. 
     * 
     * @parameter
     */
    private String pathToImpl;
    
    /** 
     * Full path to the test folder in which the unit tests are generated. 
     * 
     * @parameter
     */
    private String pathToTest;
    
    /** 
     * Full path to the service folder in which the service files are generated. 
     * 
     * @parameter
     */
    private String pathToServices;
    
    

    public String getNameSpace()
    {
        return nameSpace;
    }

    public void setNameSpace(final String nameSpace)
    {
        this.nameSpace = nameSpace;
    }

    public String getPackageApi()
    {
        return packageApi;
    }

    public void setPackageApi(final String packageApi)
    {
        this.packageApi = packageApi;
    }

    public String getPackageImpl()
    {
        return packageImpl;
    }

    public void setPackageImpl(final String packageImpl)
    {
        this.packageImpl = packageImpl;
    }

    public String getPathToXsd()
    {
        return pathToXsd;
    }

    public void setPathToXsd(final String pathToXsd)
    {
        this.pathToXsd = pathToXsd;
    }

	public String getElementName() 
	{
		return elementName;
	}

	public void setElementName(final String elementName) 
	{
		this.elementName = elementName;
	}

	public String getElementType() 
	{
		return elementType;
	}

	public void setElementType(final String elementType)
	{
		this.elementType = elementType;
	}

	public boolean isVerbose()
    {
        return verbose;
    }

    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    public String getPathToApi() {
		return pathToApi;
	}

	public void setPathToApi(String pathToApi) {
		this.pathToApi = pathToApi;
	}

	public String getPathToImpl() {
		return pathToImpl;
	}

	public void setPathToImpl(String pathToImpl) {
		this.pathToImpl = pathToImpl;
	}

	public String getPathToTest() {
		return pathToTest;
	}

	public void setPathToTest(String pathToTest) {
		this.pathToTest = pathToTest;
	}

	public String getPathToServices() {
		return pathToServices;
	}

	public void setPathToServices(String pathToServices) {
		this.pathToServices = pathToServices;
	}

	@Override
    public void execute() throws MojoExecutionException, MojoFailureException
    {
        try 
        {
            final MetadataParser metadataParser = new MetadataParser(
                getPathToXsd(),
                getNameSpace(),
                getPackageApi(),
                getPackageImpl(), 
                getElementName(),
                getElementType(),
                getPathToApi(),
                getPathToImpl(),
                getPathToTest(),
                getPathToServices(),
                isVerbose());

            metadataParser.parse();
        }
        catch (final Throwable t) {
            throw new MojoFailureException(t.getMessage(), t);
        }
    }
}
