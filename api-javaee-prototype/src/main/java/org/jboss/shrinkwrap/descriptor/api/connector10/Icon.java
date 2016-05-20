package org.jboss.shrinkwrap.descriptor.api.connector10;

/**
 * This interface defines the contract for the <code> icon </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Icon {

	public Icon smallIcon(String smallIcon);
	public String getSmallIcon();
	public Icon removeSmallIcon();

	public Icon largeIcon(String largeIcon);
	public String getLargeIcon();
	public Icon removeLargeIcon();
}
