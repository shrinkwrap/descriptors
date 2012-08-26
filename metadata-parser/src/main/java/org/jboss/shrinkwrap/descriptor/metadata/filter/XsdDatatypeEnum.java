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

package org.jboss.shrinkwrap.descriptor.metadata.filter;


/**
 * Enum class which defines all specified XSD simple data types.
 * 
 *  @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public enum XsdDatatypeEnum
{
    normalizedString("normalizedString"),
    token("token"),
    language("language"),
    NMTOKEN("NMTOKEN"),
    NMTOKENS("NMTOKENS"),
    Name("Name"),
    NCName("NCName"),
    ID("ID"),
    IDREF("IDREF"),
    IDREFS("IDREFS"),
    ENTITY("ENTITY"),
    ENTITIES("ENTITIES"),
    integer("integer"),
    nonPositiveInteger("nonPositiveInteger"),
    negativeInteger("negativeInteger"),
    _long("long"),
    _int("int"),
    _short("short"),
    _byte("byte"),
    nonNegativeInteger("nonNegativeInteger"),
    unsignedLong("unsignedLong"),
    unsignedInt("unsignedInt"),
    unsignedShort("unsignedShort"),
    unsignedByte("unsignedByte"),
    positiveInteger("positiveInteger");
    
    
    private String description;

    XsdDatatypeEnum(final String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public boolean isTagNameEqual(final String tagName)
    {
        if (tagName != null) {
            final String[] items = tagName.split(":", -1);
            if (items.length == 2 && items[1].equals(getDescription())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isDataType(final String tagName)
    {
        if (tagName != null) {
            final String[] items = tagName.split(":", -1);
            if (items.length == 2) {
                for (XsdDatatypeEnum value: XsdDatatypeEnum.values())
                {
                    if (items[1].equals(value.getDescription()))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
