package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
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
public interface RelationshipsType<T> extends Child<T>
{

   public RelationshipsType<T> setDescription(String description);

   public RelationshipsType<T> setDescriptionList(String... values);

   public RelationshipsType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public RelationshipsType<T> removeAllEjbRelation();

   public EjbRelationType<RelationshipsType<T>> ejbRelation();

   public List<EjbRelationType<RelationshipsType<T>>> getEjbRelationList();

}
