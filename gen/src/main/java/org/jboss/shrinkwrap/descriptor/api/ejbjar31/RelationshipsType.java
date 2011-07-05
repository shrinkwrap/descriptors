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
   public RelationshipsType<T> setDescriptionList(String ... values);
   public RelationshipsType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public RelationshipsType<T> removeAllEjbRelation();

   public EjbRelationType<RelationshipsType<T>> ejbRelation();
   public List<EjbRelationType<RelationshipsType<T>>> getEjbRelationList();


}