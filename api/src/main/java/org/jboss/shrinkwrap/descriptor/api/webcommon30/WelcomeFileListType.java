package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * WelcomeFileListType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface WelcomeFileListType<T> extends Child<T>
{
   public WelcomeFileListType<T> welcomeFile(String welcomeFile);
}
