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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * Base support for read-only views of the "web-app/filter" element. Not intended for direct use by users; instead use
 * {@link FilterType}.
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @param <RETURNTYPE>
 *            The true type to be returned for <code>this</code> references (covarient return)
 * @param <PARENTTYPE>
 *            The type of this element's parent
 */
/*
 * TODO: Note changed interface signature to accommodate covarient return TODO: Note additional documentation above for
 * generic types
 */
public interface FilterTypeBase<RETURNTYPE extends FilterTypeBase<RETURNTYPE, PARENTTYPE>, PARENTTYPE> extends
    Child<PARENTTYPE> {

    /*
     * TODO:
     * 
     * This method is always to return a *copied* view, as noted in the changed description in the API JavaDoc below.
     */

    /**
     * Returns a copied view of all <code>description</code> elements, such that changes to the returned {@link List}
     * will have no impact on <code>this</code> object.
     * 
     * @return list of <code>description</code>
     */
    public List<String> getAllDescription();
}
