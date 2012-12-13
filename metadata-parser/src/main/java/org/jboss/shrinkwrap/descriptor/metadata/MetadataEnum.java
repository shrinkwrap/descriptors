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
 * This class holds the possible values for one specific enumeration class.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataEnum extends BaseMetadataItem {
    private final List<String> valueList = new ArrayList<String>();

    /**
     * Constructs a new instance.
     *
     * @param name
     *            the name of the enumeration class.
     */
    public MetadataEnum(final String name) {
        super(name);
    }

    public void addValue(String value) {
        valueList.add(value);
    }

    public List<String> getValueList() {
        return valueList;
    }
}
