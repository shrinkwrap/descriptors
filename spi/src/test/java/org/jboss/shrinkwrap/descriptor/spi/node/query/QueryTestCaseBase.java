/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.spi.node.query;

import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.spi.node.Node;


/**
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @version $Revision: $
 */
public class QueryTestCaseBase
{
   static final Logger log = Logger.getLogger(QueryTestCaseBase.class.getName());
   
   static final String ATTR_NAME = "attr_name";
   static final String OTHER_NAME = "other_name";
   static final String ATTR_VALUE_1 = "attr_value_1";
   static final String ATTR_VALUE_2 = "attr_value_2";
   static final String ROOT_NODE = "root";
   static final String CHILD_1_NODE = "child-1";
   static final String CHILD_1_1_NODE = "child-1.1";
   static final String CHILD_1_2_NODE = "child-1.2";
   static final String CHILD_2_NODE = "child-2";
   static final String CHILD_2_1_NODE = "child-2.1";
   static final String CHILD_2_2_NODE = "child-2.2";
   static final String CHILD_2_1_1_NODE = "child-2.1.1";
   static final String CHILD_3_TEXT = "child-3-text";
   static final String CHILD_3_NODE = "child-3";

   static Node createTree()
   {
      Node root = new Node(ROOT_NODE);
      Node child1 = root.createChild(CHILD_1_NODE);

      child1.createChild(CHILD_1_1_NODE).attribute(ATTR_NAME, ATTR_VALUE_1);
      child1.createChild(CHILD_1_2_NODE).attribute(ATTR_NAME, ATTR_VALUE_1);
      
      Node child2 = root.createChild(CHILD_2_NODE);
      child2.createChild(CHILD_2_1_NODE).attribute(ATTR_NAME, ATTR_VALUE_1)
               .createChild(CHILD_2_1_1_NODE).attribute(OTHER_NAME, ATTR_VALUE_1)
                                             .attribute(ATTR_NAME, ATTR_VALUE_2);
      
      // same node name, but different attribute value
      child2.createChild(CHILD_2_1_NODE).attribute(ATTR_NAME, ATTR_VALUE_2)
               .createChild(CHILD_2_1_1_NODE).attribute(OTHER_NAME, ATTR_VALUE_1)
                                             .attribute(ATTR_NAME, ATTR_VALUE_1);
      
      root.createChild(CHILD_3_NODE).text(CHILD_3_TEXT);
      return root;
   }
}
