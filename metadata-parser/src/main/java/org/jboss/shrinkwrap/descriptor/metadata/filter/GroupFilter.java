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
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;

/**
 * Class which is responsible for <code>Group</code> w3c elements.
 *
 * <p>
 * <code>
    <group
      id = ID
      maxOccurs = (nonNegativeInteger | unbounded)  : 1
      minOccurs = nonNegativeInteger : 1
      name = NCName
      ref = QName
      {any attributes with non-schema namespace . . .}>
      Content: (annotation?, (all | choice | sequence)?)
    </group>
 * </code>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class GroupFilter implements Filter {
    public boolean filter(final Metadata metadata, final TreeWalker walker) {
        final Node parent = walker.getCurrentNode();
        final Element element = (Element) parent;

        if (XsdElementEnum.group.isTagNameEqual(element.getTagName())) {
            final Node refNode = element.getAttributes().getNamedItem("ref");

            if (refNode != null) {
                final MetadataElement refElement = new MetadataElement(element);
                refElement.setIsRef(true);

                final Node parentNodeWithMaxOccurs = MetadataUtil.getNextParentNodeWithAttr(parent, "maxOccurs");
                final Element p = (Element) parentNodeWithMaxOccurs;
                final String maxOccurs = MetadataUtil.getAttributeValue(p, "maxOccurs");
                if (maxOccurs != null && !maxOccurs.equals("1")) {
                    refElement.setMaxOccurs("unbounded");
                }

                final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
                if (parentNodeWithName != null) {
                    final Element parentElementWithName = (Element) parentNodeWithName;
                    final String groupOrClassName = MetadataUtil.getAttributeValue(parentElementWithName, "name");
                    if (XsdElementEnum.group.isTagNameEqual(parentElementWithName.getTagName())) {
                        metadata.addGroupReference(groupOrClassName, refElement);
                        return true;
                    } else {
                        metadata.addClassReference(groupOrClassName, refElement);
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
