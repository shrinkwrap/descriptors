package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T07:43:58.376-04:00
 *
 * Original Documentation:
 *
 *
 * The welcome-file-list contains an ordered list of welcome
 * files elements.
 *
 * Used in: web-app
 *
 *
 *
 */
public interface WelcomeFileListType<T> extends Child<T>
{

   public WelcomeFileListType<T> setWelcomeFile(String welcomeFile);

   public WelcomeFileListType<T> setWelcomeFileList(String... values);

   public WelcomeFileListType<T> removeAllWelcomeFile();

   public List<String> getWelcomeFileList();

}
