package org.jboss.shrinkwrap.descriptor.metadata.task;

import org.apache.tools.ant.BuildFileTest;
import org.junit.Before;
import org.junit.Test;

public class AntTaskParserTestCase extends BuildFileTest {

    public AntTaskParserTestCase(String s) {
        super(s);
    }

    /**
     * Initialize the ant test with the test build file.
     */
    @Before
    public void setUp() {
        configureProject("src/test/resources/task/ant_build.xml");
    }

    /**
     * Test the taskdef init.
     */
    @Test
    public void testInit() {
        executeTarget("test.init");
    }

    /**
     * The path element is missing. Check that a <code>BuildException</code> is thrown.
     */
    @Test
    public void testMissingPathElements() {
        expectBuildException("test.missingPathElement", "Path isn't defined");
    }    

    /**
     * The descriptors element is missing. Check that a <code>BuildException</code> is thrown.
     */
    @Test
    public void testMissingDescriptorsElements() {
        expectBuildException("test.missingDescriptorsElement", "Descriptors isn't defined");
    }

    /**
     * The descriptors element is missing. Check that a <code>BuildException</code> is thrown.
     */
    @Test
    public void testMissingDescriptorElements() {
        expectBuildException("test.missingDescriptorElements", "No descriptor defined");
    }
    
    @Test
    public void testNestedElements() {
        executeTarget("test.nestedElements");
        assertEquals("Message was logged but should not.", this.getLog(), "");
    }
   
}
