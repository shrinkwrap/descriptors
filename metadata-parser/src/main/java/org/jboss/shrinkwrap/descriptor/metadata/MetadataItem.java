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

import java.util.ArrayList;
import java.util.List;

/**
 * This class serves as a data class holding metadata information.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataItem extends BaseMetadataItem {
    private final List<MetadataElement> elements = new ArrayList<MetadataElement>();

    private final List<MetadataElement> references = new ArrayList<MetadataElement>();

    public MetadataItem(final String name) {
        super(name);
    }

    public List<MetadataElement> getElements() {
        return elements;
    }

    public List<MetadataElement> getReferences() {
        return references;
    }

}
