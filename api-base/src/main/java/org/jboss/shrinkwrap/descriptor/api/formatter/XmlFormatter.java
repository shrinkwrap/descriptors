/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.api.formatter;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;


/**
 * {@link Formatter} implementation to provide a pretty formatted XML string of an {@link Descriptor}.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
enum XmlFormatter implements Formatter {
    INSTANCE;

    @Override
    public String format(Descriptor descriptor) throws IllegalArgumentException {
        return formatAsXml(descriptor.exportAsString(), 2);
    }

    @Override
    public String format(String xmlString) throws IllegalArgumentException {
        return formatAsXml(xmlString, 2);
    }

    /**
     * Returns a pretty formatted XML string.
     * @param input the unformatted XML string.
     * @param indent the number of spaces used formatting nested tags.
     * @return a pretty formatted XML string.
     */
     private String formatAsXml(final String input, final int indent) {
        try {
            final Source xmlInput = new StreamSource(new StringReader(input));
            final StringWriter stringWriter = new StringWriter();
            final StreamResult xmlOutput = new StreamResult(stringWriter);
            final TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", indent);
            final Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        } catch (Exception e) {
            throw new RuntimeException(e); // simple exception handling, please review it
        }
    }

}
