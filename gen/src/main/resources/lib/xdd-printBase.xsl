<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xdd="http://org.jboss/shrinkwrap"
    exclude-result-prefixes="xs"
    version="2.0">
    
    <xsl:include href="xdd-util.xsl"/>
    
    <!-- ****************************************************** -->
    <!-- ****** Function which writes the package line   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writePackageLine">
        <xsl:param name="pPackage"/>
        <xsl:text>package </xsl:text><xsl:value-of select="$pPackage"/>; <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>
    
    
    <!-- ****************************************************** -->
    <!-- ****** Function which writes the imports           *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeImports">
        <xsl:param name="vIsApi" as="xs:boolean"/>
        <xsl:choose>
            <xsl:when test="$vIsApi=true()">
                <xsl:value-of select="'import java.util.ArrayList;&#10;'"/>
                <xsl:value-of select="'import java.util.List;&#10;'"/>
                <xsl:value-of select="'import java.util.Map;&#10;'"/>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.api.Child;&#10;'"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;&#10;'"/>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;&#10;'"/>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.impl.base.Strings;&#10;'"/>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;&#10;'"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>
    
        <!-- *********************************************************************** -->
    <!-- ****** Function which writes the GetBodyForSimpleDataTypeUnbounded  *** -->
    <!-- *********************************************************************** -->
    <xsl:function name="xdd:writeStandardGetElementJavaDoc">
        <xsl:param name="pElementType"/>
        <xsl:param name="pElementName"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Returns the &lt;code&gt;', $pElementName, '&lt;/code&gt; element&#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the node defined for the element &lt;code&gt;', $pElementName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
    </xsl:function>


    <!-- *********************************************************************** -->
    <!-- ****** Function which writes the writeStandardGetComplexTypeJavaDoc *** -->
    <!-- *********************************************************************** -->
    <xsl:function name="xdd:writeStandardGetComplexTypeJavaDoc">
        <xsl:param name="pElementType"/>
        <xsl:param name="pElementName"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * If not already created, a new &lt;code&gt;', $pElementName,'&lt;/code&gt; element will be created and returned.&#10;')"/>
        <xsl:value-of select="concat('    * Otherwise, the existing &lt;code&gt;', $pElementName,'&lt;/code&gt; element will be returned.&#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the node defined for the element &lt;code&gt;', $pElementName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
    </xsl:function>


    <!-- *********************************************************************** -->
    <!-- ****** Function which writes the GetBodyForSimpleDataTypeUnbounded  *** -->
    <!-- *********************************************************************** -->
    <xsl:function name="xdd:writeStandardGetAllElementJavaDoc">
        <xsl:param name="pElementType"/>
        <xsl:param name="pElementName"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Returns all &lt;code&gt;', $pElementName, '&lt;/code&gt; elements&#10;')"/>
        <xsl:value-of select="concat('    * @return list of &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
    </xsl:function> 


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the package line   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeDescriptorImplConstructor">
        <xsl:param name="pClassName"/>
        <xsl:param name="pAppDescription"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>   // Constructor &#10;</xsl:text>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   public ', $pClassName, '(String descriptorName)')"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   {</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:variable name="nodeExtractor" select="concat('NodeInfoExtractor.getNodeInfo(', $pClassName, '.class)')"/>
        <xsl:value-of select="concat('       this(descriptorName, new Node(&quot;', $pAppDescription , '&quot;));')"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   }&#10;&#10;</xsl:text>
        <xsl:value-of select="concat('   public ', $pClassName, '(String descriptorName, Node node)')"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:text>      super(descriptorName);&#10;</xsl:text>
        <xsl:value-of select="concat('      this.', $pNodeNameLocal, ' = node;&#10;')"/>
        <xsl:text>   }&#10;&#10;</xsl:text>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the package line   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeImplClassConstructor">
        <xsl:param name="pClassName"/>
        <xsl:param name="pNodeName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>   // Constructor &#10;</xsl:text>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   public ', $pClassName, '(T t, String nodeName, Node node)'&#10;)"/>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:text>      this.t = t;&#10;</xsl:text>
        <!--        <xsl:text>      this.node = node;&#10;</xsl:text>-->
        <xsl:value-of select="concat('      this.', $pNodeNameLocal ,' = node.createChild(', $pNodeName,');&#10;')"/>
        <xsl:text>   }&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>

        <xsl:value-of select="concat('   public ', $pClassName, '(T t, String nodeName, Node node, Node childNode)'&#10;)"/>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:text>      this.t = t;&#10;</xsl:text>
        <!--        <xsl:text>      this.node = node;&#10;</xsl:text>-->
        <xsl:value-of select="concat('      this.', $pNodeNameLocal ,' = childNode;&#10;')"/>
        <xsl:text>   }&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>

    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the method line    ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeMethodComment">
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>   // Methods &#10;</xsl:text>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes a set method          *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeTypeCommentLines">
        <xsl:param name="pClassName" as="xs:string"/>
        <xsl:param name="pElementName" as="xs:string"/>
        <xsl:param name="pElementType" as="xs:string"/>
        <xsl:param name="pMaxOccurs" as="xs:string"/>
        <xsl:param name="pWriteAttribute" as="xs:boolean"/>
        <xsl:param name="pWriteInterface" as="xs:boolean"/>
        <xsl:param name="pIsGeneric" as="xs:boolean"/>
        <xsl:param name="pNodeNameLocal" as="xs:string"/>
        <xsl:param name="pIsAttribute" as="xs:boolean"/>
        <xsl:param name="pIsEnum" as="xs:boolean"/>
        <xsl:param name="pIsDataType" as="xs:boolean"/>
        <xsl:value-of select="concat(' ', '&#10;')"/>
        <xsl:value-of select="concat('   // --------------------------------------------------------------------------------------------------------||', '&#10;')"/>
        <xsl:value-of select="concat('   // ClassName: ', $pClassName, ' ElementName: ', $pElementName ,' ElementType : ', $pElementType, '&#10;')"/>
        <xsl:value-of select="concat('   // MaxOccurs: ', $pMaxOccurs, '  isGeneric: ', $pIsGeneric, '   isAttribute: ', $pIsAttribute, ' isEnum: ', $pIsEnum, ' isDataType: ', $pIsDataType, '&#10;')"/>
        <xsl:value-of select="concat('   // --------------------------------------------------------------------------------------------------------||', '&#10;')"/>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the Child interface ***** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeChildUp">
        <xsl:value-of select="'   public T up()&#10;'"/>
        <xsl:value-of select="'   {&#10;'"/>
        <xsl:value-of select="'      return t;&#10;'"/>
        <xsl:value-of select="'   }&#10;'"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the node provider methods -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeNodeProviderMethods">
        <xsl:param name="pNodeNameLocal"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   public Node getRootNode()&#10;</xsl:text>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:value-of select="concat('      return ', $pNodeNameLocal, ';&#10;')"/>
        <xsl:text>   }&#10;&#10;</xsl:text>
        <xsl:text>   protected DescriptorExporter getExporter()&#10;</xsl:text>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:text>      return new XmlDomExporter();&#10;</xsl:text>
        <xsl:text>   }&#10;</xsl:text>
    </xsl:function>

    <!-- ************************************************************ -->
    <!-- ****** Function which writes the DescriptorNamespace methods -->
    <!-- ************************************************************ -->
    <xsl:function name="xdd:writeDescriptorNamespaceMethods">
        <xsl:param name="pDefaultNamespaces"/>
        <xsl:param name="pReturnType"/>
        <xsl:text>&#10;&#10;</xsl:text>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>   // Namespace &#10;</xsl:text>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Adds the default namespaces as defined in the specification',' &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnType, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:value-of select="concat('   public ', $pReturnType,' addDefaultNamespaces()', '&#10;')"/>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:for-each select="$pDefaultNamespaces/namespace">
            <xsl:value-of select="concat('      addNamespace(&quot;', @name, '&quot;, &quot;', @value, '&quot;)', ';&#10;')"/>
        </xsl:for-each>
        <xsl:value-of select="concat('      return this;', '&#10;')"/>
        <xsl:text>   }&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Adds a new namespace',' &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnType, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:value-of select="concat('   public ', $pReturnType,' addNamespace(String name, String value)', '&#10;')"/>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:value-of select="concat('      ', 'model', '.attribute(name, value);', '&#10;')"/>
        <xsl:value-of select="concat('      return this;', '&#10;')"/>
        <xsl:text>   }&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Returns all defined namespaces.',' &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'all defined namespaces', ' &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:text>   public List&lt;String&gt; getNamespaces()&#10;</xsl:text>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:value-of select="concat('      List&lt;String&gt; namespaceList = new ArrayList&lt;String&gt;();', '&#10;')"/>
        <xsl:value-of select="concat('      Map&lt;String, String&gt; attributes = model.getAttributes();', '&#10;')"/>
        <xsl:value-of select="concat('      for (String name: attributes.keySet())', '&#10;')"/>
        <xsl:value-of select="concat('      {', '&#10;')"/>
        <xsl:value-of select="concat('         String value = attributes.get(name);', '&#10;')"/>
        <xsl:value-of select="concat('         if (value != null &amp;&amp; value.startsWith(&quot;http://&quot;)) ', '&#10;')"/>
        <xsl:value-of select="concat('         {', '&#10;')"/>
        <xsl:value-of select="concat('            namespaceList.add(name + &quot;=&quot; + value);', '&#10;')"/>
        <xsl:value-of select="concat('         }', '&#10;')"/>
        <xsl:value-of select="concat('      }', '&#10;')"/>
        <xsl:value-of select="concat('      return namespaceList;', '&#10;')"/>
        <xsl:text>   }&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Removes all existing namespaces.',' &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnType, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:value-of select="concat('   public ', $pReturnType,' removeAllNamespaces()', '&#10;')"/>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:value-of select="concat('      List&lt;String&gt; nameSpaceKeys = new ArrayList&lt;String&gt;();', '&#10;')"/>
        <xsl:value-of select="concat('      Map&lt;String, String&gt; attributes = model.getAttributes();', '&#10;')"/>
        <xsl:value-of select="concat('      for (String name: attributes.keySet())', '&#10;')"/>
        <xsl:value-of select="concat('      {', '&#10;')"/>
        <xsl:value-of select="concat('         String value = attributes.get(name);', '&#10;')"/>
        <xsl:value-of select="concat('         if (value != null &amp;&amp; value.startsWith(&quot;http://&quot;)) ', '&#10;')"/>
        <xsl:value-of select="concat('         {', '&#10;')"/>
        <xsl:value-of select="concat('            nameSpaceKeys.add(name);', '&#10;')"/>
        <xsl:value-of select="concat('         }', '&#10;')"/>
        <xsl:value-of select="concat('      }', '&#10;')"/>
        <xsl:value-of select="concat('      for (String name: nameSpaceKeys)', '&#10;')"/>
        <xsl:value-of select="concat('      {', '&#10;')"/>
        <xsl:value-of select="concat('         model.removeAttribute(name);', '&#10;')"/>
        <xsl:value-of select="concat('      }', '&#10;')"/>
        <xsl:value-of select="concat('      return this;', '&#10;')"/>
        <xsl:text>   }&#10;</xsl:text>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the class header   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeClassJavaDoc">
        <xsl:param name="pText"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:param name="pIsClassHeader" as="xs:boolean"/>
        <xsl:param name="pContributors"/>

        <xsl:value-of select="'/**&#10;'"/>
        <xsl:if test="$pIsClassHeader=true()">
            <xsl:choose>
                <xsl:when test="$pIsInterface=true()">
                    <xsl:value-of select="' * This interface defines the contract for the &lt;code&gt;', $pElementName ,'&lt;/code&gt; xsd type &#10;'"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="' * This class implements the &lt;code&gt;', $pElementName ,'&lt;/code&gt; xsd type &#10;'"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:if>

        <xsl:if test="$pText!=''">
            <xsl:value-of select="' * &lt;p&gt; &#10;'"/>
            <xsl:value-of select="' * Original Documentation:&#10;'"/>
            <xsl:value-of select="' * &lt;p&gt; &#10;'"/>
            <xsl:for-each select=" tokenize($pText, '&#xA;')">
                <xsl:choose>
                    <xsl:when test="normalize-space(.) != ''">
                        <xsl:value-of select="concat(' * ', normalize-space(.), ' &lt;br&gt; &#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="' *&lt;br&gt;&#10;'"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:for-each>
            <xsl:value-of select="' *&#10;'"/>
        </xsl:if>
        <xsl:value-of select="xdd:writeContributors($pContributors)"/>
        <xsl:value-of select="concat(' * @since Generation date :', current-dateTime(), '&#10;')"/>
        <xsl:value-of select="' */&#10;'"/>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the class header   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeDescriptorJavaDoc">
        <xsl:param name="pDescriptorName"/>
        <xsl:param name="pDescriptorSchema"/>
        <xsl:param name="pContributors"/>
        <xsl:value-of select="concat('/**',' &#10;')"/>
        <xsl:value-of select="concat(' * &lt;p&gt; ', '&#10;')"/>
        <xsl:value-of select="concat(' * This deployment descriptor provides the functionalities as described in the ', $pDescriptorSchema,' specification&#10;')"/>
        <xsl:value-of select="concat(' * &lt;p&gt;',' &#10;')"/>
        <xsl:value-of select="concat(' * Example:', '&#10;')"/>
        <xsl:value-of select="concat(' * &lt;p&gt;',' &#10;')"/>
        <xsl:value-of select="concat(' * &lt;code&gt;', ' &#10;')"/>
        <xsl:value-of select="concat(' *     ', $pDescriptorName, ' descriptor = Descriptors.create(', $pDescriptorName, '.class);', '&#10;')"/>
        <xsl:value-of select="concat(' * &lt;/code&gt;', ' &#10;')"/>
        <xsl:value-of select="concat(' *', '&#10;')"/>
        <xsl:value-of select="concat(' *', '&#10;')"/>
        <xsl:value-of select="xdd:writeContributors($pContributors)"/>
        <xsl:value-of select="concat(' * @since Generation date :', current-dateTime(), '&#10;')"/>
        <xsl:value-of select="concat(' */', '&#10;')"/>
    </xsl:function>
    
      <!-- ****************************************************** -->
    <!-- ****** Function which writes the class declaration *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:classHeaderDeclaration">
        <xsl:param name="classType"/>
        <xsl:param name="className"/>
        <xsl:text>public </xsl:text>
        <xsl:value-of select="$classType"/>
        <xsl:text> </xsl:text>
        <xsl:value-of select="xdd:createPascalizedName($className, '')"/>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the class declaration *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:classNodeInfo">
        <xsl:param name="pNodeName"/>
        <xsl:value-of select="concat('   @NodeInfo(xmlName=&quot;', $pNodeName, '&quot;)')"/>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>
    
    
    <!-- ****************************************************** -->
    <!-- ****** Function which writes the package line   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeAttribute">
        <xsl:param name="pType"/>
        <xsl:param name="pName"/>
        <xsl:param name="pWithCommentHeader" as="xs:boolean"/>
        <xsl:if test="$pWithCommentHeader=true()">
            <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
            <xsl:text>   // Instance Members &#10;</xsl:text>
            <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
            <xsl:text>&#10;</xsl:text>
        </xsl:if>
        <xsl:value-of select="concat('   private ', $pType, ' ', $pName, ';')"/>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>
    
    
    <!-- ****************************************************** -->
    <!-- ****** Function which writes the contributors   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeContributors">
        <xsl:param name="pContributors"/>
        <xsl:for-each select="$pContributors/contributor">
            <xsl:choose>
                <xsl:when test="@mailto=''">
                    <xsl:value-of select="concat(' * &amp;author ', @name, '&#10;')"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="concat(' * @author &lt;a href=&quot;mailto:', @mailto, '&quot;&gt;', @name, '&lt;/a&gt;', '&#10;')"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>
    </xsl:function>

</xsl:stylesheet>