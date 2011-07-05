package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The relationship-role-sourceType designates the source of a
 * role that participates in a relationship. A
 * relationship-role-sourceType is used by
 * relationship-role-source elements to uniquely identify an
 * entity bean.
 *
 *
 *
 */
public interface RelationshipRoleSourceType<T> extends Child<T>
{

   public RelationshipRoleSourceType<T> setDescription(String description);
   public RelationshipRoleSourceType<T> setDescriptionList(String ... values);
   public RelationshipRoleSourceType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public RelationshipRoleSourceType<T> setEjbName(String ejbName);
   public RelationshipRoleSourceType<T> removeEjbName();

   public String getEjbName();

}
