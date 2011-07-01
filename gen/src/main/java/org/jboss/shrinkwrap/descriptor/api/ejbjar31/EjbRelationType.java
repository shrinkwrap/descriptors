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
 * Generation date :2011-07-01T17:26:07.336-04:00
 *
 * Original Documentation:
 *
 *
 * The ejb-relationType describes a relationship between two
 * entity beans with container-managed persistence. It is used
 * by ejb-relation elements. It contains a description; an
 * optional ejb-relation-name element; and exactly two
 * relationship role declarations, defined by the
 * ejb-relationship-role elements. The name of the
 * relationship, if specified, is unique within the ejb-jar
 * file.
 *
 *
 *
 */
public interface EjbRelationType<T> extends Child<T>
{

   public EjbRelationType<T> setDescription(String description);
   public EjbRelationType<T> setDescriptionList(String ... values);
   public EjbRelationType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public EjbRelationType<T> setEjbRelationName(String ejbRelationName);
   public EjbRelationType<T> removeEjbRelationName();

   public String getEjbRelationName();



   public EjbRelationType<T> removeEjbRelationshipRole();

   public EjbRelationshipRoleType<EjbRelationType<T>> ejbRelationshipRole();



}
