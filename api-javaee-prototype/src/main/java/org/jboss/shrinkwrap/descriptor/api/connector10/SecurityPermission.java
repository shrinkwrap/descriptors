package org.jboss.shrinkwrap.descriptor.api.connector10; 

/**
 * This interface defines the contract for the <code> security-permission </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SecurityPermission {
 
   public SecurityPermission securityPermissionSpec(String securityPermissionSpec);
   public String getSecurityPermissionSpec();
   public SecurityPermission removeSecurityPermissionSpec();
 
   public SecurityPermission description(String description);
   public String getDescription();
   public SecurityPermission removeDescription();
}
