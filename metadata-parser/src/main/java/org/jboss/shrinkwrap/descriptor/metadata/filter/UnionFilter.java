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
import org.jboss.shrinkwrap.descriptor.metadata.MetadataItem;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;

public class UnionFilter implements Filter
{
   @Override
   public boolean filter(final Metadata metadata, final TreeWalker walker)
   {
      final Node parent = walker.getCurrentNode();
      final Element element = (Element) parent;

      if (XsdElementEnum.union.isTagNameEqual(element.getTagName()))
      {
         final String memberTypesStr = MetadataUtil.getAttributeValue(element, "memberTypes");
         if (memberTypesStr != null)
         {
            final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
            if (parentNodeWithName != null)
            {
               final Element parentElementWithName = (Element)parentNodeWithName;
               final String parentName = MetadataUtil.getAttributeValue(parentElementWithName, "name");
               final String[] items = memberTypesStr.split(" ", -1);
               if (items != null && items.length > 1)
               {
                  final MetadataItem dataType = new MetadataItem(parentName);
                  dataType.setMappedTo(items[0]);
                  dataType.setNamespace(metadata.getCurrentNamespace());
                  dataType.setSchemaName(metadata.getCurrentSchmema());
                  metadata.getDataTypeList().add(dataType);
               
               }
            }
         }
      }
      return false;
   }

}
