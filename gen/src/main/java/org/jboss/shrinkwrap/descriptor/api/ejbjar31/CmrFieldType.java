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
 * The cmr-fieldType describes the bean provider's view of
 * a relationship. It consists of an optional description, and
 * the name and the class type of a field in the source of a
 * role of a relationship. The cmr-field-name element
 * corresponds to the name used for the get and set accessor
 * methods for the relationship. The cmr-field-type element is
 * used only for collection-valued cmr-fields. It specifies the
 * type of the collection that is used.
 *
 *
 *
 */
public interface CmrFieldType<T> extends Child<T>
{

   public CmrFieldType<T> setDescription(String description);
   public CmrFieldType<T> setDescriptionList(String ... values);
   public CmrFieldType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public CmrFieldType<T> setCmrFieldName(String cmrFieldName);
   public CmrFieldType<T> removeCmrFieldName();

   public String getCmrFieldName();



   public CmrFieldType<T> setCmrFieldType(CmrFieldTypeType cmrFieldType);
   public CmrFieldType<T> setCmrFieldType(String cmrFieldType);

   public CmrFieldTypeType getCmrFieldType();
   public String  getCmrFieldTypeAsString();

}
