/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> welcome-file-listType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The welcome-file-list contains an ordered list of welcome <br> 
 * files elements. <br> 
 *<br>
 * Used in: web-app <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface WelcomeFileListType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : welcome-file
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>welcome-file</code> element 
    * @return the current instance of {@link WelcomeFileListType<T>} 
    */
   public WelcomeFileListType<T> setWelcomeFile(String welcomeFile);

   /**
    * Creates for all String objects representing <code>welcome-file</code> elements, 
    * a new <code>welcome-file</code> element 
    * @param list of <code>welcome-file</code> objects 
    * @return the current instance of {@link WelcomeFileListType<T>} 
    */
   public WelcomeFileListType<T> setWelcomeFileList(String... values);

   /**
    * Removes the <code>welcome-file</code> element 
    * @return the current instance of {@link WelcomeFileListType<T>} 
    */
   public WelcomeFileListType<T> removeAllWelcomeFile();

   /**
    * Returns all <code>welcome-file</code> elements
    * @return list of <code>welcome-file</code> 
    */
   public List<String> getWelcomeFileList();

}
