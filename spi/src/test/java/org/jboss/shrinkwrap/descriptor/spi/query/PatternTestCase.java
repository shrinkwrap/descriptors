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
package org.jboss.shrinkwrap.descriptor.spi.query;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test cases to ensure that {@link Pattern} is working as contracted
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PatternTestCase
{

   //-------------------------------------------------------------------------------------||
   // Class Members ----------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private static final Logger log = Logger.getLogger(PatternTestCase.class.getName());

   private static final String ONE = "one";

   private static final String TWO = "two";

   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Pattern to use in testing
    */
   private Pattern pattern;

   //-------------------------------------------------------------------------------------||
   // Lifecycle --------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Before
   public void createPattern()
   {
      this.pattern = new Pattern(ONE);
   }

   @After
   public void logPattern()
   {
      log.info(this.pattern.toString());
   }

   //-------------------------------------------------------------------------------------||
   // Tests ------------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Test(expected = IllegalArgumentException.class)
   public void disallowedNullName()
   {
      new Pattern(null);
   }

   @Test
   public void getName()
   {
      final String oneName = pattern.getName();
      Assert.assertEquals("Name not obtained as expected", ONE, oneName);
   }

   @Test
   public void getText()
   {
      pattern.text(TWO);
      final String oneText = pattern.getText();
      Assert.assertEquals("Text not obtained as expected", TWO, oneText);
   }

   @Test(expected = UnsupportedOperationException.class)
   public void getAttributesIsImmutable()
   {
      pattern.getAttributes().put(ONE, TWO);
   }

   @Test
   public void attributeRoundtrip()
   {
      pattern.attribute(ONE, TWO);
      final String oneAttributeValue = pattern.getAttribute(ONE);
      Assert.assertEquals("Attribute value not as expected", TWO, oneAttributeValue);
   }
   
   @Test
   public void attributeFromObjectRoundtrip()
   {
      pattern.attribute(ONE, new Integer(2));
      final String oneAttributeValue = pattern.getAttribute(ONE);
      Assert.assertEquals("Attribute value not as expected", "2", oneAttributeValue);
   }

   @Test(expected = IllegalArgumentException.class)
   public void matchesNullInputFails()
   {
      pattern.matches(null);
   }

   @Test
   public void matchesName()
   {
      final Node node = new Node(ONE);
      Assert.assertTrue("Should match by name", pattern.matches(node));
   }

   @Test
   public void matchesNameFails()
   {
      final Node node = new Node(TWO);
      Assert.assertFalse("Should not match unequal names", pattern.matches(node));
   }

   @Test
   public void matchesNameAndTextValue()
   {
      pattern.text(TWO);
      final Node node = new Node(ONE).text(TWO);
      Assert.assertTrue("Should match by name and text value", pattern.matches(node));
   }

   @Test
   public void matchesNameAndUnequalTextValuesFails()
   {
      pattern.text(ONE);
      final Node node = new Node(ONE).text(TWO);
      Assert.assertFalse("Should not match by name but with unequal text value", pattern.matches(node));
   }

   @Test
   public void matchesNameTextValueAndAttribute()
   {
      pattern.text(TWO).attribute(ONE, TWO);
      final Node node = new Node(ONE).text(TWO).attribute(ONE, TWO);
      Assert.assertTrue("Should match by name, text value, and attribute", pattern.matches(node));
   }

   @Test
   public void matchesNameTextValueAndExtraAttributeFails()
   {
      pattern.text(TWO).attribute(ONE, TWO).attribute(TWO, ONE);
      final Node node = new Node(ONE).text(TWO).attribute(ONE, TWO);
      Assert.assertFalse("Pattern with more attributes than the Node should fail", pattern.matches(node));
   }

   @Test
   public void matchesNameTextValueAndAttributesWhenNodeHasNoneFails()
   {
      pattern.text(TWO).attribute(ONE, TWO);
      final Node node = new Node(ONE).text(TWO);
      Assert.assertFalse("Pattern with attributes when the Node has none should fail", pattern.matches(node));
   }

   @Test
   public void matchesNameTextValueAndUnequalAttributesFails()
   {
      pattern.text(TWO).attribute(ONE, TWO);
      final Node node = new Node(ONE).text(TWO).attribute(ONE, ONE);
      Assert.assertFalse("Pattern with attributes not matching the Node attribute values should fail",
            pattern.matches(node));
   }

}
