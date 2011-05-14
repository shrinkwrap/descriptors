package org.jboss.shrinkwrap.descriptor.api.jsp22;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

/**
 * JspPropertyGroupType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface JspPropertyGroupType<T> extends Child<T>, DescriptionGroup
{
   public JspPropertyGroupType<T> urlPattern(String urlPattern);

   public JspPropertyGroupType<T> elIgnored(boolean elIgnored);

   public JspPropertyGroupType<T> pageEncoding(String pageEncoding);

   public JspPropertyGroupType<T> scriptingInvalid(boolean scriptingInvalid);

   public JspPropertyGroupType<T> isXml(boolean isXml);

   public JspPropertyGroupType<T> includePrelude(String includePrelude);

   public JspPropertyGroupType<T> includeCoda(String includeCoda);

   public JspPropertyGroupType<T> deferredSyntaxAllowedAsLiteral(boolean deferredSyntaxAllowedAsLiteral);

   public JspPropertyGroupType<T> trimDirectiveWhitespaces(boolean trimDirectiveWhitespaces);

   public JspPropertyGroupType<T> defaultContentType(String defaultContentType);

   public JspPropertyGroupType<T> buffer(String buffer);

   public JspPropertyGroupType<T> errorOnUndeclaredNamespace(boolean errorOnUndeclaredNamespace);
}
