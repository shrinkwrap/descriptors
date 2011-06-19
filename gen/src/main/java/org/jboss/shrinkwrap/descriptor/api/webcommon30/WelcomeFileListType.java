package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public interface WelcomeFileListType<T> extends Child<T>
{

   public WelcomeFileListType<T> setWelcomeFile(String welcomeFile);
   public WelcomeFileListType<T> setWelcomeFileList(String ... values);
   public WelcomeFileListType<T> removeAllWelcomeFile();

   public List<String> getWelcomeFileList();

}
