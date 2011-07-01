package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 *
 * Original Documentation:
 *
 *
 * The locale-encoding-mapping-list contains one or more
 * locale-encoding-mapping(s).
 *
 *
 *
 */
public class LocaleEncodingMappingListTypeImpl<T> implements Child<T>, LocaleEncodingMappingListType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public LocaleEncodingMappingListTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public LocaleEncodingMappingListTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : locale-encoding-mapping
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public LocaleEncodingMappingListType<T> removeAllLocaleEncodingMapping()
   {
      childNode.remove("locale-encoding-mapping");
      return this;
   }

   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> localeEncodingMapping()
   {
      return new LocaleEncodingMappingTypeImpl<LocaleEncodingMappingListType<T>>(this, "locale-encoding-mapping",
            childNode);
   }

   public List<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>> getLocaleEncodingMappingList()
   {
      List<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>> list = new ArrayList<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>>();
      List<Node> nodeList = childNode.get("locale-encoding-mapping");
      for (Node node : nodeList)
      {
         LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> type = new LocaleEncodingMappingTypeImpl<LocaleEncodingMappingListType<T>>(
               this, "locale-encoding-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

}
