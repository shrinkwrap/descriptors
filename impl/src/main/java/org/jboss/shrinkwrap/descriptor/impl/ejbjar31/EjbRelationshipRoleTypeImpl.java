package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmrFieldType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationshipRoleType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MultiplicityType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipRoleSourceType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 * [
 * The ejb-relationship-roleType describes a role within a
 * relationship. There are two roles in each relationship.
 *
 * The ejb-relationship-roleType contains an optional
 * description; an optional name for the relationship role; a
 * specification of the multiplicity of the role; an optional
 * specification of cascade-delete functionality for the role;
 * the role source; and a declaration of the cmr-field, if any,
 * by means of which the other side of the relationship is
 * accessed from the perspective of the role source.
 *
 * The multiplicity and role-source element are mandatory.
 *
 * The relationship-role-source element designates an entity
 * bean by means of an ejb-name element. For bidirectional
 * relationships, both roles of a relationship must declare a
 * relationship-role-source element that specifies a cmr-field
 * in terms of which the relationship is accessed. The lack of
 * a cmr-field element in an ejb-relationship-role specifies
 * that the relationship is unidirectional in navigability and
 * the entity bean that participates in the relationship is
 * "not aware" of the relationship.
 *
 * Example:
 *
 * <ejb-relation>
 * <ejb-relation-name>Product-LineItem</ejb-relation-name>
 * <ejb-relationship-role>
 * <ejb-relationship-role-name>product-has-lineitems
 * </ejb-relationship-role-name>
 * <multiplicity>One</multiplicity>
 * <relationship-role-source>
 * <ejb-name>ProductEJB</ejb-name>
 * </relationship-role-source>
 * </ejb-relationship-role>
 * </ejb-relation>
 *
 *
 *
 *
 */
public class EjbRelationshipRoleTypeImpl<T> implements Child<T>, EjbRelationshipRoleType<T>
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

   public EjbRelationshipRoleTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public EjbRelationshipRoleTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   public EjbRelationshipRoleType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public EjbRelationshipRoleType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public EjbRelationshipRoleType<T> removeAllDescription()
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
   // Element type : ejb-relationship-role-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbRelationshipRoleType<T> setEjbRelationshipRoleName(String ejbRelationshipRoleName)
   {
      childNode.getOrCreate("ejb-relationship-role-name").text(ejbRelationshipRoleName);
      return this;
   }

   public EjbRelationshipRoleType<T> removeEjbRelationshipRoleName()
   {
      childNode.remove("ejb-relationship-role-name");
      return this;
   }

   public String getEjbRelationshipRoleName()
   {
      return childNode.textValue("ejb-relationship-role-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : multiplicity
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbRelationshipRoleType<T> setMultiplicity(MultiplicityType multiplicity)
   {
      childNode.getOrCreate("multiplicity").text(multiplicity);
      return this;
   }

   public EjbRelationshipRoleType<T> setMultiplicity(String multiplicity)
   {
      childNode.getOrCreate("multiplicity").text(multiplicity);
      return this;
   }

   public MultiplicityType getMultiplicity()
   {
      return MultiplicityType.getFromStringValue(childNode.textValue("multiplicity"));
   }

   public String getMultiplicityAsString()
   {
      return childNode.textValue("multiplicity");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cascade-delete
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbRelationshipRoleType<T> cascadeDelete()
   {
      childNode.getOrCreate("cascade-delete");
      return this;
   }

   public Boolean isCascadeDelete()
   {
      return childNode.getSingle("cascade-delete") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : relationship-role-source
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbRelationshipRoleType<T> removeRelationshipRoleSource()
   {
      childNode.remove("relationship-role-source");
      return this;
   }

   public RelationshipRoleSourceType<EjbRelationshipRoleType<T>> relationshipRoleSource()
   {
      Node node = childNode.getOrCreate("relationship-role-source");
      RelationshipRoleSourceType<EjbRelationshipRoleType<T>> relationshipRoleSource = new RelationshipRoleSourceTypeImpl<EjbRelationshipRoleType<T>>(
            this, "relationship-role-source", childNode, node);
      return relationshipRoleSource;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cmr-field
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbRelationshipRoleType<T> removeCmrField()
   {
      childNode.remove("cmr-field");
      return this;
   }

   public CmrFieldType<EjbRelationshipRoleType<T>> cmrField()
   {
      Node node = childNode.getOrCreate("cmr-field");
      CmrFieldType<EjbRelationshipRoleType<T>> cmrField = new CmrFieldTypeImpl<EjbRelationshipRoleType<T>>(this,
            "cmr-field", childNode, node);
      return cmrField;
   }

}
