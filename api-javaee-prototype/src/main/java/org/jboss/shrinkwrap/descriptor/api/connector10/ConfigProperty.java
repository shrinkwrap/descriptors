package org.jboss.shrinkwrap.descriptor.api.connector10; 

/**
 * This interface defines the contract for the <code> config-property </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ConfigProperty {
 
   public ConfigProperty configPropertyValue(String configPropertyValue);
   public String getConfigPropertyValue();
   public ConfigProperty removeConfigPropertyValue();
 
   public ConfigProperty description(String description);
   public String getDescription();
   public ConfigProperty removeDescription();

 
   public ConfigProperty configPropertyName(String configPropertyName);
   public String getConfigPropertyName();
   public ConfigProperty removeConfigPropertyName();

 
   public ConfigProperty configPropertyType(String configPropertyType);
   public String getConfigPropertyType();
   public ConfigProperty removeConfigPropertyType();
}
