package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

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
public interface EjbRelationshipRoleType<T> extends Child<T>
{

   public EjbRelationshipRoleType<T> setDescription(String description);

   public EjbRelationshipRoleType<T> setDescriptionList(String... values);

   public EjbRelationshipRoleType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public EjbRelationshipRoleType<T> setEjbRelationshipRoleName(String ejbRelationshipRoleName);

   public EjbRelationshipRoleType<T> removeEjbRelationshipRoleName();

   public String getEjbRelationshipRoleName();

   public EjbRelationshipRoleType<T> setMultiplicity(MultiplicityType multiplicity);

   public EjbRelationshipRoleType<T> setMultiplicity(String multiplicity);

   public MultiplicityType getMultiplicity();

   public String getMultiplicityAsString();

   public EjbRelationshipRoleType<T> cascadeDelete();

   public Boolean isCascadeDelete();

   public EjbRelationshipRoleType<T> removeRelationshipRoleSource();

   public RelationshipRoleSourceType<EjbRelationshipRoleType<T>> relationshipRoleSource();

   public EjbRelationshipRoleType<T> removeCmrField();

   public CmrFieldType<EjbRelationshipRoleType<T>> cmrField();

}
