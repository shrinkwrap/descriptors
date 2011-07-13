package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:05.059+02:00
 * 
 * Original Documentation:
 * 
 * 
 * The ejb-relationType describes a relationship between two entity beans with
 * container-managed persistence. It is used by ejb-relation elements. It
 * contains a description; an optional ejb-relation-name element; and exactly
 * two relationship role declarations, defined by the ejb-relationship-role
 * elements. The name of the relationship, if specified, is unique within the
 * ejb-jar file.
 * 
 * 
 * 
 */
public interface EjbRelationType<T> extends Child<T> {

	public EjbRelationType<T> setDescription(String description);

	public EjbRelationType<T> setDescriptionList(String... values);

	public EjbRelationType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public EjbRelationType<T> setEjbRelationName(String ejbRelationName);

	public EjbRelationType<T> removeEjbRelationName();

	public String getEjbRelationName();

	public EjbRelationType<T> removeEjbRelationshipRole();

	public EjbRelationshipRoleType<EjbRelationType<T>> ejbRelationshipRole();

}
