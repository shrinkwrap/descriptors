package org.jboss.shrinkwrap.descriptor.api.connector10; 

/**
 * This interface defines the contract for the <code> license </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface License {
	
   public License description(String description);
   public String getDescription();
   public License removeDescription();
 
   public License licenseRequired(String licenseRequired);
   public String getLicenseRequired();
   public License removeLicenseRequired();
}
