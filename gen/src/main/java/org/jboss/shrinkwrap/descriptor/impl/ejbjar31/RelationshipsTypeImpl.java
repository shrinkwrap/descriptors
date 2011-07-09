package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * The relationshipsType describes the relationships in
 * which entity beans with container-managed persistence
 * participate. The relationshipsType contains an optional
 * description; and a list of ejb-relation elements, which
 * specify the container managed relationships.
 *
 *
 *
 */
public class RelationshipsTypeImpl<T> implements Child<T>, RelationshipsType<T>
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

   public RelationshipsTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public RelationshipsTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public RelationshipsType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public RelationshipsType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public RelationshipsType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-relation
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public RelationshipsType<T> removeAllEjbRelation()
   {
      childNode.remove("ejb-relation");
      return this;
   }

   public EjbRelationType<RelationshipsType<T>> ejbRelation()
   {
      return new EjbRelationTypeImpl<RelationshipsType<T>>(this, "ejb-relation", childNode);
   }

   public List<EjbRelationType<RelationshipsType<T>>> getEjbRelationList()
   {
      List<EjbRelationType<RelationshipsType<T>>> list = new ArrayList<EjbRelationType<RelationshipsType<T>>>();
      List<Node> nodeList = childNode.get("ejb-relation");
      for (Node node : nodeList)
      {
         EjbRelationType<RelationshipsType<T>> type = new EjbRelationTypeImpl<RelationshipsType<T>>(this,
               "ejb-relation", childNode, node);
         list.add(type);
      }
      return list;
   }

}
