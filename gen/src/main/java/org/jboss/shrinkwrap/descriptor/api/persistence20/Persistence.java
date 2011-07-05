package org.jboss.shrinkwrap.descriptor.api.persistence20; 

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
 */
public interface Persistence<T> extends Child<T>
{

   public Persistence<T> removeAllPersistenceUnit();

   public PersistenceUnit<Persistence<T>> persistenceUnit();
   public List<PersistenceUnit<Persistence<T>>> getPersistenceUnitList();




   public Persistence<T> setVersion(String version);
   public Persistence<T> removeVersion();

   public String getVersion();

}
