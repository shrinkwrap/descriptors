package org.jboss.shrinkwrap.descriptor.api.persistence20;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
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
