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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterTypeBase;

/**
 * Base support for read-only views of the "web-app" element. Not intended for direct use by users; instead use
 * {@link WebAppDescriptor}.
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @param <FILTERTYPE>
 *            The return type representing <code>filter</code>elements
 */
/*
 * TODO: Each element type will need a generic param, which admittedly will make this declaration really verbose.
 */
public interface WebAppDescriptorBase<FILTERTYPE extends FilterTypeBase<FILTERTYPE, WEBAPPDESCRIPTORTYPE>, WEBAPPDESCRIPTORTYPE extends WebAppDescriptorBase<FILTERTYPE, WEBAPPDESCRIPTORTYPE>>
    extends Descriptor {

    /**
     * Returns a copied view of all <code>filter</code> elements, such that changes to the returned {@link List} will
     * have no impact on <code>this</code> object.
     * 
     * @return list of <code>filter</code>
     */
    /*
     * TODO: Must return a copied view, note changed documentation above to reflect this.
     */
    List<FILTERTYPE> getAllFilter();
    
    /*
     * TODO: We need to account for removing a single Filter. To do this, FILTERTYPE should support .equals and
     * .hashCode implementations such that one may be removed
     */

}
