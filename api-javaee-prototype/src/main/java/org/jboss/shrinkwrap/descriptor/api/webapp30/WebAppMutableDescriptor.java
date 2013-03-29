/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.api.webapp30;

import org.jboss.shrinkwrap.descriptor.api.Mutable;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMutableType;

/**
 * Mutable view of a web application deployment descriptor (ie. web.xml).
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
/*
 * TODO: This is for use by end-users, and correctly closes the generic context
 */
public interface WebAppMutableDescriptor extends WebAppDescriptorBase<FilterMutableType, WebAppMutableDescriptor>,
    Mutable<WebAppDescriptor, WebAppMutableDescriptor> {

    /*
     * TODO: Methods below this line copied / modified from existing WebAppDescriptor
     */

    /**
     * If not already created, a new <code>filter</code> element will be created and returned. Otherwise, the first
     * existing <code>filter</code> element will be returned.
     * 
     * @return the instance defined for the element <code>filter</code>
     */
    public FilterMutableType getOrCreateFilter();

    /**
     * Creates a new <code>filter</code> element
     * 
     * @return the new created instance of <code>FilterType<WebAppDescriptor></code>
     */
    /*
     * TODO: Note error in @return documentation above, to be fixed TODO: Return FILTERTYPE
     */
    public FilterMutableType createFilter();

    /**
     * Removes all <code>filter</code> elements
     * 
     * @return the current instance of <code>FilterType<WebAppDescriptor></code>
     */
    /*
     * TODO: Note error in @return documentation above, to be fixed TODO: Return FILTERTYPE TODO: API Naming, should be
     * "removeAllFilterElements?" To be discussed.
     */
    public WebAppMutableDescriptor removeAllFilter();
}
