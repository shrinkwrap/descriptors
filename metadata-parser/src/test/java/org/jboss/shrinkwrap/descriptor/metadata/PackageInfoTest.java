package org.jboss.shrinkwrap.descriptor.metadata;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class PackageInfoTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();
	
    @Test
    public void testCopyAndDeleteHtmlFile() throws IOException {
        final File packageFile = new File("src/test/resources/package-info-impl.html");
        PackageInfo.copy(packageFile, folder.getRoot().getAbsolutePath(), true);
        final File destFile = new File(folder.getRoot().getAbsolutePath()  + File.separatorChar + PackageInfo.PACKAGE_HTML_NAME);
        assertTrue(destFile.exists());

        PackageInfo.deleteExistingPackageInfo(folder.getRoot().getAbsolutePath(), true);
        assertFalse(destFile.exists());
    }

    @Test
    public void testCopyJavaFile() throws IOException {
        final File packageFile = new File("src/test/resources/package-info-api.java");
        PackageInfo.copy(packageFile, folder.getRoot().getAbsolutePath(), true);
        final File destFile = new File(folder.getRoot().getAbsolutePath()  + File.separatorChar + PackageInfo.PACKAGE_JAVA_NAME);
        assertTrue(destFile.exists());
        
        PackageInfo.deleteExistingPackageInfo(folder.getRoot().getAbsolutePath(), true);
        assertFalse(destFile.exists());
    }

}
