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
package org.jboss.shrinkwrap.descriptor.spi.query;


/**
 * Expressions
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class Queries
{
   private static final String PATH_SEPARATOR = "/";
   private static final String ATTR_PATH_SEPERATOR = "@";
   private static final String ATTR_SEPERATOR = "&";
   private static final String ATTR_VALUE_SEPERATOR = "=";
   

   public static Query from(String query)
   {
      return buildExpression(query);
   }
   
   /*
   public static Expression<Node> create(String exp) 
   {
      return new CreateQuery(buildExpression(exp));
   }

   public static Expression<Node> getOrCreate(String exp) 
   {
      return new GetOrCreateQuery(buildExpression(exp));
   }
   
   public static Expression<List<Node>> get(String exp) 
   {
      return new GetQuery(buildExpression(exp));
   }

   public static Expression<Node> getSingle(String exp) 
   {
      return new GetSingleQuery(buildExpression(exp));
   }

*/
   /*
    *  convert expressions into ExpressionDefinition
    *  
    *  /node@atr=1&atr2=4/child@atr1=5
    */
   private static Query buildExpression(String exp)
   {
      if(exp == null)
      {
         throw new IllegalArgumentException("Path must be specified");
      }
      
      boolean isAbsolute = exp.startsWith(PATH_SEPARATOR);
      Query def  = new Query(isAbsolute);
      
      String[] paths = (isAbsolute ? exp.substring(1):exp).split(PATH_SEPARATOR);
      for(String path : paths)
      {
         String nameSegment = path.indexOf(ATTR_PATH_SEPERATOR) != -1 ? path.substring(0, path.indexOf(ATTR_PATH_SEPERATOR)):path;
         
         
         String name = nameSegment.indexOf(ATTR_VALUE_SEPERATOR) != -1 ? nameSegment.substring(0,nameSegment.indexOf(ATTR_VALUE_SEPERATOR)) : nameSegment;
         String text = nameSegment.indexOf(ATTR_VALUE_SEPERATOR) != -1 ? nameSegment.substring(nameSegment.indexOf(ATTR_VALUE_SEPERATOR) + 1) : null;
         String attribute = path.indexOf(ATTR_PATH_SEPERATOR) != -1 ? path.substring(path.indexOf(ATTR_PATH_SEPERATOR)+ ATTR_PATH_SEPERATOR.length(), path.length()):null;
         String[] attributes = attribute == null ? new String[0]:attribute.split(ATTR_SEPERATOR);
         
         NodeQuery nodeDef = new NodeQuery(name);
         nodeDef.text(text);
         for(String attr : attributes)
         {
            String[] nameValue = attr.split(ATTR_VALUE_SEPERATOR);
            if(nameValue.length != 2)
            {
               throw new IllegalArgumentException("Attribute without name or value found: " + attr + " in expression: " + exp);
            }
            nodeDef.attribute(nameValue[0], nameValue[1]);
         }
         def.addDefinition(nodeDef);
      }
      return def;
   }
}
