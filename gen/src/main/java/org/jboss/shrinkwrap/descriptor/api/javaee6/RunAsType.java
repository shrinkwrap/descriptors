package org.jboss.shrinkwrap.descriptor.api.javaee6; 

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
 * The run-asType specifies the run-as identity to be
 * used for the execution of a component. It contains an
 * optional description, and the name of a security role.
 *
 *
 *
 */
public interface RunAsType<T> extends Child<T>
{

   public RunAsType<T> setDescription(String description);
   public RunAsType<T> setDescriptionList(String ... values);
   public RunAsType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public RunAsType<T> setRoleName(String roleName);
   public RunAsType<T> removeRoleName();

   public String getRoleName();

}
