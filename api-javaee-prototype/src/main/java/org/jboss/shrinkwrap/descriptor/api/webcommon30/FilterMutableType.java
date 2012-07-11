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
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptor;

/**
 * End-user view of a "web-app/filter" element which is mutable.
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
/*
 * TODO: Note how we close the generic context in the type declaration
 */
public interface FilterMutableType extends FilterTypeBase<FilterMutableType, WebAppMutableDescriptor> {

    /*
     * TODO: This method ADDED as part of prototyping
     */

    /**
     * Removes the <code>description</code> element with the specified value. If the specified value is not a current
     * <code>description</code>, this call will be a no-op.
     * 
     * @param value
     * @return This instance
     * @throws IllegalArgumentException
     *             If the value is not specified
     */
    FilterMutableType removeDescription(String value) throws IllegalArgumentException;

    /*
     * TODO: Methods below this line ported from existing impl, with changes as noted.
     */

    // TODO: Update documentation to explain we're removing *all* X elements.
    /**
     * Removes the <code>description</code> element
     * 
     * @return the current instance of <code>FilterType<T></code>
     */
    /*
     * TODO: Changed return type TODO: API Naming: would it work to make this: "removeAll[X]Elements" ie.
     * "removeAllDescriptionElements"?
     */
    public FilterMutableType removeAllDescription();

    /**
     * Creates for all String objects representing <code>description</code> elements, a new <code>description</code>
     * element
     * 
     * @param values
     *            list of <code>description</code> objects
     * @return the current instance of <code>FilterType<T></code>
     * @throws IllegalArgumentException
     *             If no values are specified or if any specified value is blank or null
     */
    /*
     * TODO: Changed return type to TRUETYPE TODO: Added throws clause and its JavaDoc TODO: Implementation will need to
     * perform precondition check to validate throws clause
     */
    public FilterMutableType description(String... values) throws IllegalArgumentException;
}
