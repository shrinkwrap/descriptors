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
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
 */
public interface Persistence20Descriptor extends Descriptor, DescriptorNamespace<Persistence20Descriptor>
{

   public Persistence20Descriptor removeAllPersistenceUnit();

   public PersistenceUnit<Persistence20Descriptor> persistenceUnit();
   public List<PersistenceUnit<Persistence20Descriptor>> getPersistenceUnitList();



   public Persistence20Descriptor setVersion(String version);
   public Persistence20Descriptor removeVersion();

   public String getVersion();

}
