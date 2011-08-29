/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.impl.spec;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import junit.framework.Assert;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Simple helper for XML related Assertions.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:bartosz.majsak@gmail.com">Bartosz Majsak</a>
 * @version $Revision: $
 */
public final class XmlAssert
{
   private static final String XPATH_SCHEMA_LOCATION = "//@*[local-name()='schemaLocation' and namespace-uri()='%s']";
   private static final String SCHEMA_LOCATION_NOT_DEFINED = "Schema location not defined for %s";

   /**
    * Util class, should not be constructed. 
    */
   private XmlAssert() {}
   
   /**
    * Verifies if given namespace has proper URI defined using ns:schemaLocation attribute.
    * 
    * @param xml The XML to assert against
    * @param namespaceUri The namespace URI to assert against
    * @param expectedLocation The expected location for given namespace
    * @throws Exception Assertion error or XML related parse exceptions
    */
   public static void assertSchemaLocation(String xml, String namespaceUri, String expectedLocation) 
   {
      final Document doc = create(xml, true);
      NodeList nodes = extractMatchingNodes(doc, String.format(XPATH_SCHEMA_LOCATION, namespaceUri));
      Assert.assertFalse(String.format(SCHEMA_LOCATION_NOT_DEFINED, namespaceUri), nodes.getLength() == 0);
      Assert.assertEquals("Expected schema location is different", expectedLocation, nodes.item(0).getNodeValue());

   }
   
   /**
    * Assert that the specified XPath Expression resolves to the specified values.
    * <br/><br/>
    * Assertions:<br/>
    * "XPath expressions doesn't match with given XML" <br/>
    * "ExpectedValue count should match found Node count" <br/> 
    * "XPath content should match expected value" <br/>
    * 
    * @param xml The XML to assert against
    * @param expression XPath expression to extract
    * @param expectedValues The Expected values found by expression
    * @throws Exception Assertion error or XML/XPath related parse exceptions
    */
   public static void assertPresenceUsingXPath(String xml, String expression, String... expectedValues)
   {
      
      if (expectedValues.length == 0) 
      {
         throw new IllegalArgumentException("Expected values not specified!");
      }
      
      final Document doc = create(xml, false);
      
      final NodeList nodes = extractMatchingNodes(doc, expression);

      if (nodes.getLength() == 0)
      {
          Assert.fail("XPath expressions " + expression + " doesn't match with given XML");
      }
      
      // If not looking for an attribute, count found Node matches
      if (!expression.contains("@"))
      {
         Assert.assertEquals("ExpectedValue count should match found Node count", expectedValues.length,
               nodes.getLength());
      } 
      else 
      {
         for(int i = 0; i < nodes.getLength(); i++)
         {
            Node node = nodes.item(i);
            Assert.assertEquals(
                  "XPath content should match expected value",
                  expectedValues[i], 
                  node.getTextContent());
         }
      }
   }

   public static void assertPresenceUsingXPath(String xml, String expression, Object... expectedValue)
      throws Exception
   {
      String[] strExpectedValue = new String[expectedValue.length];
      for(int i = 0; i < expectedValue.length; i++)
      {
         strExpectedValue[i] = String.valueOf(expectedValue[i]);
      }
      assertPresenceUsingXPath(xml, expression, strExpectedValue);
   }

   /**
    * Verifies if XML file does not contain elements matching
    * given XPath expression.
    * 
    * @param xml The XML file to verify.
    * @param expression The XPath expression to evaluate.
    * @throws Exception Assertion error or XML/XPath related parse exceptions
    */
   public static void assertAbsenceUsingXPath(String xml, String expression)
   {
      final Document doc = create(xml, false);
      
      final NodeList nodes = extractMatchingNodes(doc, expression);

      int nodesAmount = nodes.getLength();
      if (nodesAmount != 0)
      {
          Assert.fail("XPath expressions " + expression + " matches with given XML." + nodesAmount + " node(s) found.");
      }
   }
   
   // 
   
   private static Document create(String xml, boolean namespaceAware) 
   {
       try
       {
          DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
          documentBuilderFactory.setNamespaceAware(namespaceAware);
          return documentBuilderFactory.newDocumentBuilder()
                                       .parse(new ByteArrayInputStream(xml.getBytes()));
       }
       catch (final IOException ioe)
       {
          throw new RuntimeException(ioe);
       }
       catch (final SAXException se)
       {
          throw new RuntimeException(se);
       }
       catch (final ParserConfigurationException pce)
       {
          throw new RuntimeException(pce);
       }
       
   }
   
   private static NodeList extractMatchingNodes(final Document doc, String xpathExpression) 
   {
        final XPathExpression xPathExpression;
        try 
        {
            xPathExpression = XPathFactory.newInstance().newXPath()
                                          .compile(xpathExpression);
        } catch (final XPathExpressionException xee) 
        {
            throw new RuntimeException(xee);
        }

        final NodeList nodes;
        try 
        {
            nodes = (NodeList) xPathExpression.evaluate(doc,
                    XPathConstants.NODESET);
        } catch (final XPathExpressionException xee) 
        {
            throw new RuntimeException(xee);
        }
        return nodes;
   }

}
