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
 * The cmp-fieldType describes a container-managed field. The
 * cmp-fieldType contains an optional description of the field,
 * and the name of the field.
 *
 *
 *
 */
public interface CmpFieldType<T> extends Child<T>
{

   public CmpFieldType<T> setDescription(String description);
   public CmpFieldType<T> setDescriptionList(String ... values);
   public CmpFieldType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public CmpFieldType<T> setFieldName(String fieldName);
   public CmpFieldType<T> removeFieldName();

   public String getFieldName();

}
