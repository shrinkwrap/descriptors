package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataType;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataUtil;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.traversal.TreeWalker;

public class ElementFilter implements Filter
{
   @Override
   public boolean filter(final Metadata metadata, final TreeWalker walker)
   {
      final Node parent = walker.getCurrentNode();
      final Element element = (Element) parent;

      if (XsdElementEnum.element.isTagNameEqual(element.getTagName()))
      {
         final String refStr = MetadataUtil.getAttributeValue(element, "ref");
         if (refStr != null)
         {
            final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
            if (parentNodeWithName != null)
            {
               final Element parentElementWithName = (Element)parentNodeWithName;
               final String groupOrClassName = MetadataUtil.getAttributeValue(parentElementWithName, "name");
               if (XsdElementEnum.group.isTagNameEqual(parentElementWithName.getTagName()))
               {
                  final MetadataElement refElement = new MetadataElement(element);  
                  refElement.setIsRef(true);
                  metadata.addGroupReference(groupOrClassName, refElement);
                  return true;
               }
               else if(XsdElementEnum.attributeGroup.isTagNameEqual(parentElementWithName.getTagName()))
               {
                  final MetadataElement refElement = new MetadataElement(element);  
                  refElement.setIsRef(true);
                  metadata.addGroupReference(groupOrClassName, refElement);
                  return true;
               }
            }
         }
         
         final String typeStr = MetadataUtil.getAttributeValue(element, "type");
         if (XsdDatatypeEnum.integer.isDataType(typeStr))
         {
            final String dataTypeName = MetadataUtil.getAttributeValue(element, "name");
            if (dataTypeName != null)
            {
               final MetadataType dataType = new MetadataType();
               dataType.setName(dataTypeName);
               dataType.setMappedTo(typeStr);
               dataType.setNamespace(metadata.getCurrentNamespace());
               dataType.setSchemaName(metadata.getCurrentSchmema());
               metadata.getDataTypeList().add(dataType);
            }
         }

         if (typeStr == null)
         {
            if (!element.hasChildNodes())
            {
               // may an unconstrained element of anyType, declare it as a string
               final String dataTypeName = MetadataUtil.getAttributeValue(element, "name");
               final MetadataType dataType = new MetadataType();
               dataType.setName(dataTypeName);
               dataType.setMappedTo("xs:string");
               dataType.setNamespace(metadata.getCurrentNamespace());
               dataType.setSchemaName(metadata.getCurrentSchmema());
               metadata.getDataTypeList().add(dataType);
               return true;
            }
         }

         final Node parentNodeWithName = MetadataUtil.getNextParentNodeWithAttr(parent.getParentNode(), "name");
         if (parentNodeWithName != null)
         {
            final Element parentElementWithName = (Element) parentNodeWithName;
            final String groupOrClassName = MetadataUtil.getAttributeValue(parentElementWithName, "name");

            boolean isUnbounded = false;
            final Element p = (Element) parent.getParentNode();
            if (p != null && XsdElementEnum.choice.isTagNameEqual(p.getTagName()))
            {
               final String maxOccurs = MetadataUtil.getAttributeValue(p, "maxOccurs");
               if (maxOccurs != null && !maxOccurs.equals("1"))
               {
                  isUnbounded = true;
               }
            }

            if (groupOrClassName != null)
            {
               if (XsdElementEnum.group.isTagNameEqual(parentElementWithName.getTagName()))
               {
                  final MetadataElement groupElement = new MetadataElement(element);
                  if (isUnbounded)
                  {
                     groupElement.setMaxOccurs("unbounded");
                  }
                  metadata.addGroupElement(groupOrClassName, groupElement);
                  return true;
               }
               else
               {
                  final MetadataElement classElement = new MetadataElement(element);
                  if (isUnbounded)
                  {
                     classElement.setMaxOccurs("unbounded");
                  }
                  metadata.addClassElement(groupOrClassName, classElement);
                  return true;
               }
            }

         }
      }
      return false;
   }

}
