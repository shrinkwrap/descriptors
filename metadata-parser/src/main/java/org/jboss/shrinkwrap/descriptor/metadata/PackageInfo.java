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

package org.jboss.shrinkwrap.descriptor.metadata;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;

/**
 * This class copies optionally the package info files into source directories.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public final class PackageInfo {
    public static final String PACKAGE_HTML_NAME = "package.html";
    public static final String PACKAGE_JAVA_NAME = "package-info.java";
    private static final Logger log = Logger.getLogger(PackageInfo.class.getName());

    /**
     * Copies the optional packageInfo files into the packages.
     * @param path
     * @param metadata
     * @throws IOException
     */
    public static void copyPackageInfo(final MetadataParserPath path, final Metadata metadata, final boolean verbose) throws IOException {
        for (final MetadataDescriptor descriptor : metadata.getMetadataDescriptorList()) {
            if (descriptor.getPathToPackageInfoApi() != null) {
                final File sourceFile = new File(descriptor.getPathToPackageInfoApi());
                final String destDirectory = path.pathToApi + File.separatorChar + descriptor.getPackageApi().replace('.', '/');
                deleteExistingPackageInfo(destDirectory, verbose);
                copy(sourceFile, destDirectory, verbose);
            }

            if (descriptor.getPathToPackageInfoImpl() != null) {
                final File sourceFile = new File(descriptor.getPathToPackageInfoImpl());
                final String destDirectory = path.pathToImpl + File.separatorChar + descriptor.getPackageImpl().replace('.', '/');
                deleteExistingPackageInfo(destDirectory, verbose);
                copy(sourceFile, destDirectory, verbose);
            }
        }
    }

    /**
     * Copies the given sourceFile into the specified directory. The source file post fix
     * defines which variant of the package info file is created.
     * <p>
     * If the source file ends with <code>.java</code>, then the destination file name is <code>package-info.java</code>
     * otherwise the file name is <code>package.html</code>.
     *
     * @param sourceFile
     * @param destDirectory
     * @param verbose
     * @throws IOException
     */
    public static void copy(final File sourceFile, final String destDirectory, final boolean verbose) throws IOException {
        String destFileName = PACKAGE_HTML_NAME;
        if (sourceFile.getName().endsWith("java")) {
            destFileName = PACKAGE_JAVA_NAME;
        }

        final File destFile = new File(destDirectory + File.separatorChar + destFileName);
        if (verbose) {
            log.info(String.format("Copying packageInfo from: %s to: %s", sourceFile.getAbsolutePath(), destFile.getAbsolutePath()));
        }

        FileUtils.copyFile(sourceFile, destFile, true);
    }

    /**
     * Deletes package.html or package-info.java from the given directory.
     * @param destDirectory
     * @param verbose
     */
    public static void deleteExistingPackageInfo(final String destDirectory, final boolean verbose) {
        final File htmlFile = new File(destDirectory + File.separatorChar + PACKAGE_HTML_NAME);
        final File javaFile = new File(destDirectory + File.separatorChar + PACKAGE_JAVA_NAME);
        final Boolean isHtmlDeleted = FileUtils.deleteQuietly(htmlFile);
        final Boolean isJavaDeleted = FileUtils.deleteQuietly(javaFile);

        if (verbose) {
            log.info(String.format("File %s deleted: %s", htmlFile.getAbsolutePath(), isHtmlDeleted.toString()));
            log.info(String.format("File %s deleted: %s", javaFile.getAbsolutePath(), isJavaDeleted.toString()));
        }
    }
}
