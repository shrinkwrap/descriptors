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

import org.w3c.dom.Element;

/**
 * This class holds the information used for generating a specific API interface and implementation class.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class MetadataElement {
    private String name;
    private String type;
    private String ref;
    private boolean isAttribute;
    private boolean isRef;
    private String minOccurs;
    private String maxOccurs;
    private String mappedTo;

    /**
     * Creates a new and empty instance.
     */
    public MetadataElement() {
    }

    /**
     * Constructs a new instance by reading the given w3c element.
     *
     * @param element
     *            w3c element used for extracting various attributes.
     */
    public MetadataElement(final Element element) {
        name = MetadataUtil.getAttributeValue(element, "name");
        type = MetadataUtil.getAttributeValue(element, "type");
        ref = MetadataUtil.getAttributeValue(element, "ref");
        minOccurs = MetadataUtil.getAttributeValue(element, "minOccurs");
        maxOccurs = MetadataUtil.getAttributeValue(element, "maxOccurs");

        if (type == null) {
            type = name; // will be later added with the name-space
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public boolean getIsAttribute() {
        return isAttribute;
    }

    public void setIsAttribute(final boolean isAttribute) {
        this.isAttribute = isAttribute;
    }

    public String getMinOccurs() {
        return minOccurs;
    }

    public void setMinOccurs(final String minOccurs) {
        this.minOccurs = minOccurs;
    }

    public String getMaxOccurs() {
        return maxOccurs;
    }

    public void setMaxOccurs(final String maxOccurs) {
        this.maxOccurs = maxOccurs;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(final String ref) {
        this.ref = ref;
        this.isRef = true;
    }

    public boolean isRef() {
        return isRef;
    }

    public void setIsRef(final boolean isRef) {
        this.isRef = isRef;
    }

    public String getMappedTo() {
        return mappedTo;
    }

    public void setMappedTo(final String mappedTo) {
        this.mappedTo = mappedTo;
    }

}
