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

import java.util.List;


/**
 * Mojo configuration class for the Shrinkwrap Descriptors CLI Mojo task.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataParserCommon {

    protected String id;

    protected Boolean generate;

    protected String pathToCommonApi;

    protected String commonDescriptorName;

    protected String commonNamespace;

    protected String commonApi;

    protected String[] commonImports;

    protected String[] types;

    protected String[] excludes;

    public String getPathToCommonApi() {
        return pathToCommonApi;
    }

    public void setPathToCommonApi(final String pathToCommonApi) {
       this.pathToCommonApi = pathToCommonApi;
    }

    public String getCommonApi() {
        return commonApi;
    }

    public void setCommonApi(String commonApi) {
        this.commonApi = commonApi;
    }

    public String getCommonDescriptorName() {
       return commonDescriptorName;
    }

    public void setCommonDescriptorName(String commonDescriptorName) {
       this.commonDescriptorName = commonDescriptorName;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public String[] getExcludes() {
        return excludes;
    }

    public void setExcludes(String[] excludes) {
        this.excludes = excludes;
    }

    public String[] getCommonImports() {
        return commonImports;
    }

    public void setCommonImports(String[] imports) {
        this.commonImports = imports;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getGenerate() {
        return generate;
    }

    public void setGenerate(Boolean generate) {
        this.generate = generate;
    }

    public String getCommonNamespace() {
        return commonNamespace;
    }

    public void setCommonNamespace(String commonNamespace) {
        this.commonNamespace = commonNamespace;
    }

}