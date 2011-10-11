package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.BeanValidationGroupsType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> bean-validation-groupsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public class BeanValidationGroupsTypeImpl<T> implements Child<T>, BeanValidationGroupsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public BeanValidationGroupsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public BeanValidationGroupsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanValidationGroupsType ElementName: xsd:token ElementType : bean-validation-group
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>bean-validation-group</code> elements, 
    * a new <code>bean-validation-group</code> element 
    * @param values list of <code>bean-validation-group</code> objects 
    * @return the current instance of <code>BeanValidationGroupsType<T></code> 
    */
   public BeanValidationGroupsType<T> beanValidationGroup(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("bean-validation-group").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>bean-validation-group</code> elements
    * @return list of <code>bean-validation-group</code> 
    */
public List<String> getAllBeanValidationGroup()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("bean-validation-group");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>bean-validation-group</code> element 
    * @return the current instance of <code>BeanValidationGroupsType<T></code> 
    */
   public BeanValidationGroupsType<T> removeAllBeanValidationGroup()
   {
      childNode.removeChildren("bean-validation-group");
      return this;
   }
}
