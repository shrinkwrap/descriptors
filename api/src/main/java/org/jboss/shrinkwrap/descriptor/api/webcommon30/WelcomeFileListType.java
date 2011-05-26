package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface WelcomeFileListType<T> extends Child<T>
{
   public WelcomeFileListType<T> setWelcomeFile(String welcomeFile);

   public String getWelcomeFile();
}
