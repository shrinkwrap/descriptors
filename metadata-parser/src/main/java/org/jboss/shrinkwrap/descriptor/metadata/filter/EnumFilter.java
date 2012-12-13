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

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;

/**
 * This class analyzes <code>Enumeration</code> w3c elements.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class EnumFilter implements Filter {
    public boolean filter(final Metadata metadata, final TreeWalker walker) {
        final Node parent = walker.getCurrentNode();
        final Element element = (Element) parent;

        if (XsdElementEnum.enumeration.isTagNameEqual(element.getTagName())) {
            final Node valueNode = element.getAttributes().getNamedItem("value");
            if (valueNode != null) {
                final String enumValue = valueNode.getNodeValue();
                final Node simpleTypeNode = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
                if (simpleTypeNode != null) {
                    final Element parentElementWithName = (Element) simpleTypeNode;
                    final String enumName = MetadataUtil.getAttributeValue(parentElementWithName, "name");
                    metadata.addEnumValue(enumName, enumValue);
                    return true;
                }
            }
        }

        return false;
    }

}
