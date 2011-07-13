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
 * The relationship-role-sourceType designates the source of a role that
 * participates in a relationship. A relationship-role-sourceType is used by
 * relationship-role-source elements to uniquely identify an entity bean.
 * 
 * 
 * 
 */
public interface RelationshipRoleSourceType<T> extends Child<T> {

	public RelationshipRoleSourceType<T> setDescription(String description);

	public RelationshipRoleSourceType<T> setDescriptionList(String... values);

	public RelationshipRoleSourceType<T> removeAllDescription();

	public List<String> getDescriptionList();

	public RelationshipRoleSourceType<T> setEjbName(String ejbName);

	public RelationshipRoleSourceType<T> removeEjbName();

	public String getEjbName();

}
