package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * This group keeps the usage of the contained description related
 * elements consistent across Java EE deployment descriptors.
 * <br>
 * @see description extracted from http://java.sun.com/xml/ns/javaee/javaee_6.xsd
 * <br>     
 * All elements may occur multiple times with different languages,
 * to support localization of the content.
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public interface DescriptionGroup
{
   public DescriptionGroup description(String description);

   public DescriptionGroup displayName(String displayName);

   public DescriptionGroup icon();
}
