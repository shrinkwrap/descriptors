package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * DescriptionGroup
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface DescriptionGroup
{
   public DescriptionGroup description(String description);

   public DescriptionGroup displayName(String displayName);

   public DescriptionGroup icon();
}
