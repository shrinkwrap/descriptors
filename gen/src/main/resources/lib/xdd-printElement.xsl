<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xdd="http://org.jboss/shrinkwrap" exclude-result-prefixes="xs" version="2.0">

    <xsl:include href="xdd-printBase.xsl"/>

    <!-- *********************************************************** -->
    <!-- *********************************************************** -->
    <!-- ****** Single    Elements ********************************* -->
    <!-- *********************************************************** -->
    <!-- *********************************************************** -->

    <!-- *********************************************************** -->
    <!-- ****** Function which prints complex types unbounded    *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printComplexTypeSingleXX">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select=" xdd:printGetOrCreateSingleXX($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
        <xsl:value-of select=" xdd:printRemoveSingleXX($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
    </xsl:function>

    <!-- *********************************************************** -->
    <!-- ****** Function which writes the printGetOrCreateXX    *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetOrCreateSingleXX">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vStandardGetComplexSingleSignature" select="concat('public ', xdd:createPascalizedName($pElementType,''), ' getOrCreate', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:variable name="vinterfaceClass" select="substring-before($pElementType, '&lt;')"/>
        <xsl:variable name="vConstructor" select="concat(substring-before($pElementType, '&lt;'), 'Impl&lt;', $pClassType, '&gt;')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * If not already created, a new &lt;code&gt;', $pElementName,'&lt;/code&gt; element with the given value will be created.&#10;')"/>
        <xsl:value-of select="concat('    * Otherwise, the existing &lt;code&gt;', $pElementName,'&lt;/code&gt; element will be returned.&#10;')"/>
        <xsl:value-of select="concat('    * @return ', ' a new or existing instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat('   ', $vStandardGetComplexSingleSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('   ', $vStandardGetComplexSingleSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      Node node = ', $pNodeNameLocal, '.getOrCreate(&quot;', $pElementName, '&quot;);',  '&#10;')"/>
                <xsl:value-of select="concat('      ', xdd:createPascalizedName($pElementType,''), ' ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ' = new ', $vConstructor, '(this, &quot;', $pElementName, '&quot;, ', $pNodeNameLocal, ', node);', '&#10;')"/>
                <xsl:value-of select="concat('      return ', xdd:createCamelizedName($pElementName), ';&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>

    <!-- *********************************************************** -->
    <!-- ****** Function which writes the printRemoveXX         *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printRemoveSingleXX">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vRemoveXXSignature" select="concat('   public ', $pClassType, ' remove', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Removes the &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vRemoveXXSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vRemoveXXSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.removeChildren(&quot;', $pElementName, '&quot;', ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>



    <!-- *********************************************************** -->
    <!-- *********************************************************** -->
    <!-- ****** Unbounded Elements ********************************* -->
    <!-- *********************************************************** -->
    <!-- *********************************************************** -->


    <!-- *********************************************************** -->
    <!-- ****** ENTRY FUNCTION - prints complex types unbounded  *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printComplexTypeUnboundedXX">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select=" xdd:printGetOrCreateXX($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
        <xsl:value-of select=" xdd:printCreateXX($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
        <xsl:value-of select=" xdd:printGetAllXX($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
        <xsl:value-of select=" xdd:printRemoveAllXX($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the printCreateXX          *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printCreateXX">
        <xsl:param name="vClassType"/>
        <xsl:param name="vElementType"/>
        <xsl:param name="vMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Creates a new &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the new created instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>

        <xsl:variable name="vStandardCreateSignature" select="concat('public ', xdd:createPascalizedName($vElementType,''), ' create', xdd:checkForClassType($vMethodName), '()')"/>
        <xsl:variable name="vConstructor" select="concat(substring-before($vElementType, '&lt;'), 'Impl&lt;', $vClassType, '&gt;')"/>

        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat('   ', $vStandardCreateSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('   ', $vStandardCreateSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      return new ', $vConstructor, '(this, &quot;', $pElementName, '&quot;, ', $pNodeNameLocal, ');', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the printGetOrCreateXX     *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetOrCreateXX">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vStandardCreateSignature" select="concat('public ', xdd:createPascalizedName($pElementType,''), ' getOrCreate', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:variable name="vConstructor" select="concat(substring-before($pElementType, '&lt;'), 'Impl&lt;', $pClassType, '&gt;')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * If not already created, a new &lt;code&gt;', $pElementName,'&lt;/code&gt; element will be created and returned.&#10;')"/>
        <xsl:value-of select="concat('    * Otherwise, the first existing &lt;code&gt;', $pElementName,'&lt;/code&gt; element will be returned.&#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the instance defined for the element &lt;code&gt;', $pElementName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat('   ', $vStandardCreateSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('   ', $vStandardCreateSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      List', '&lt;', 'Node', '&gt;', ' nodeList = ', $pNodeNameLocal , '.get(&quot;', $pElementName, '&quot;);', '&#10;')"/>
                <xsl:value-of select="concat('      if (nodeList != null', ' &amp;&amp; ', ' nodeList.size() &gt; 1)', '&#10;')"/>
                <xsl:value-of select="concat('      {', '&#10;')"/>
                <xsl:value-of select="concat('         return new ', $vConstructor, '(this, &quot;', $pElementName, '&quot;, ', $pNodeNameLocal, ', nodeList.get(0));', '&#10;')"/>
                <xsl:value-of select="concat('      }', '&#10;')"/>
                <xsl:value-of select="concat('      return create', xdd:checkForClassType($pMethodName), '();', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes getAllXX                   *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetAllXX">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vStandardGetAllXXSignature" select="concat('public List&lt;', xdd:createPascalizedName($pElementType,''), '&gt; getAll', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:variable name="vinterfaceClass" select="substring-before($pElementType, '&lt;')"/>
        <xsl:variable name="vConstructor" select="concat($vinterfaceClass, '&lt;', $pClassType, '&gt;')"/>
        <xsl:variable name="vConstructorImpl" select="concat($vinterfaceClass, 'Impl&lt;', $pClassType, '&gt;')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Returns all &lt;code&gt;', $pElementName, '&lt;/code&gt; elements&#10;')"/>
        <xsl:value-of select="concat('    * @return list of &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select=" concat('   ', $vStandardGetAllXXSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('   ', $vStandardGetAllXXSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      List', '&lt;', $vConstructor, '&gt;', ' list = new ArrayList', '&lt;', $vConstructor, '&gt;', '();', '&#10;')"/>
                <xsl:value-of select="concat('      List', '&lt;', 'Node', '&gt;', ' nodeList = ', $pNodeNameLocal , '.get(&quot;', $pElementName, '&quot;);', '&#10;')"/>
                <xsl:value-of select="concat('      for(Node node: nodeList)', '&#10;')"/>
                <xsl:value-of select="concat('      {', '&#10;')"/>
                <xsl:value-of select="concat('         ', $vConstructor, '  type = new ', $vConstructorImpl, '(this, &quot;', $pElementName, '&quot;, ', $pNodeNameLocal, ', node);', '&#10;')"/>
                <xsl:value-of select="concat('         list.add(type);', '&#10;')"/>
                <xsl:value-of select="concat('      }', '&#10;')"/>
                <xsl:value-of select="concat('      return list;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the printRemoveAllXX       *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printRemoveAllXX">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Removes all &lt;code&gt;', $pElementName,'&lt;/code&gt; elements &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:variable name="vStandardRemoveAllSignature" select="concat('public ', $pClassType, ' removeAll', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat('   ', $vStandardRemoveAllSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('   ', $vStandardRemoveAllSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.removeChildren(&quot;', $pElementName, '&quot;', ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>



    <!-- *********************************************************** -->
    <!-- *********************************************************** -->
    <!-- ****** Attributes         ********************************* -->
    <!-- *********************************************************** -->
    <!-- *********************************************************** -->


    <!-- *********************************************************** -->
    <!-- ****** ENTRY FUNCTION - prints attributes               *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printAttributes">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:param name="pIsEnum" as="xs:boolean"/>
        <xsl:choose>
            <xsl:when test="$pIsEnum=true()">
                <xsl:value-of select="xdd:printSetAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printSetEnumAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printGetAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printRemoveAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
            </xsl:when>
            <xsl:when test="$pElementType='Boolean'">
                <xsl:value-of select="xdd:printSetAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printGetBooleanAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printRemoveAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="xdd:printSetAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printGetAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printRemoveAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- ************************************************************* -->
    <!-- ****** Function which writes the AttributeBody            *** -->
    <!-- ************************************************************* -->
    <xsl:function name="xdd:printSetAttribute">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vSetAttributeSignature" select="concat('   public ', $pClassType, ' ', xdd:checkForClassType(xdd:LowerCaseFirstChar($pMethodName)), '(',  xdd:createPascalizedName($pElementType,''),' ',xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ')')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Sets the &lt;code&gt;', $pElementName,'&lt;/code&gt; attribute&#10;')"/>
        <xsl:value-of select="concat('    * @param ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ' the value for the attribute &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vSetAttributeSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vSetAttributeSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.attribute(&quot;', $pElementName, '&quot;, ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- ************************************************************* -->
    <!-- ****** Function which writes the AttributeBody            *** -->
    <!-- ************************************************************* -->
    <xsl:function name="xdd:printSetEnumAttribute">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vSetAttributeSignature" select="concat('   public ', $pClassType, ' ', xdd:checkForClassType(xdd:LowerCaseFirstChar($pMethodName)), '(String', ' ',xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ')')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Sets the &lt;code&gt;', $pElementName,'&lt;/code&gt; attribute&#10;')"/>
        <xsl:value-of select="concat('    * @param ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ' the value for the attribute &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vSetAttributeSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vSetAttributeSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.attribute(&quot;', $pElementName, '&quot;, ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Getbbb Attribute  Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetAttribute">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vGetSignature" select="concat('public ', xdd:createPascalizedName($pElementType,''), ' get', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Returns the &lt;code&gt;', $pElementName, '&lt;/code&gt; attribute&#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the value defined for the attribute &lt;code&gt;', $pElementName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vGetSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('   ', $vGetSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      return ', $pNodeNameLocal, '.getAttribute(&quot;', $pElementName, '&quot;);' , '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>
    
    
    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Getbooleab Attribute   *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetBooleanAttribute">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vGetBooleanSignature" select="concat('public ', xdd:createPascalizedName($pElementType,''), ' is', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Returns the &lt;code&gt;', $pElementName, '&lt;/code&gt; attribute&#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the value defined for the attribute &lt;code&gt;', $pElementName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vGetBooleanSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('   ', $vGetBooleanSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      return Strings.isTrue(', $pNodeNameLocal, '.getAttribute(&quot;', $pElementName, '&quot;));' , '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>
    

    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Remove Attribute  Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printRemoveAttribute">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vRemoveSignature" select="concat('   public ', $pClassType, ' remove', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Removes the &lt;code&gt;', $pElementName,'&lt;/code&gt; attribute &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vRemoveSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vRemoveSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.removeAttribute(&quot;', $pElementName, '&quot;', ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>



    <!-- *********************************************************** -->
    <!-- *********************************************************** -->
    <!-- ****** Enums              ********************************* -->
    <!-- *********************************************************** -->
    <!-- *********************************************************** -->


    <!-- *********************************************************** -->
    <!-- ****** ENTRY FUNCTION - prints enums                    *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printEnums">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:param name="pIsEnum" as="xs:boolean"/>
        <xsl:value-of select="xdd:printSetEnum($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
        <xsl:value-of select="xdd:printSetEnumAsString($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
        <xsl:value-of select="xdd:printGetEnum($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
        <xsl:value-of select="xdd:printGetEnumAsString($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
        <xsl:value-of select="xdd:printRemoveAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
    </xsl:function>



    <!-- *********************************************************** -->
    <!-- ****** Function which writes the GetOrCreate       Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printSetEnum">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vSetSignature" select="concat('   public ', $pClassType, ' ', xdd:checkForClassType(xdd:LowerCaseFirstChar($pMethodName)), '(',  xdd:createPascalizedName($pElementType,''),' ',xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ')')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Sets the &lt;code&gt;', $pElementName,'&lt;/code&gt; element&#10;')"/>
        <xsl:value-of select="concat('    * @param ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ' the value for the element &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vSetSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vSetSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.getOrCreate(&quot;', $pElementName, '&quot;).text(', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the GetOrCreate       Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printSetEnumAsString">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vSetStringSignature" select="concat('   public ', $pClassType, ' ', xdd:checkForClassType(xdd:LowerCaseFirstChar($pMethodName)), '(String', ' ',xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ')')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Sets the &lt;code&gt;', $pElementName,'&lt;/code&gt; element&#10;')"/>
        <xsl:value-of select="concat('    * @param ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ' the value for the element &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vSetStringSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vSetStringSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.getOrCreate(&quot;', $pElementName, '&quot;).text(', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>

    <!-- *********************************************************** -->
    <!-- ****** Function which writes the GetOrCreate       Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetEnum">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vGetSignature" select="concat('public ', xdd:createPascalizedName($pElementType,''), ' get', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Returns the &lt;code&gt;', $pElementName, '&lt;/code&gt; element&#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the value found for the element &lt;code&gt;', $pElementName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat('   ', $vGetSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('   ', $vGetSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      return ', xdd:createPascalizedName($pElementType,''), '.getFromStringValue(', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;));' , '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>



    <!-- *********************************************************** -->
    <!-- ****** Function which writes the GetOrCreate       Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetEnumAsString">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vGetStringSignature" select="concat('public String ', ' get', xdd:checkForClassType($pMethodName), 'AsString()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Returns the &lt;code&gt;', $pElementName, '&lt;/code&gt; element&#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the value found for the element &lt;code&gt;', $pElementName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat('   ', $vGetStringSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('   ', $vGetStringSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      return ', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;);' , '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>

            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- *********************************************************** -->
    <!-- ****** Simple Data types  ********************************* -->
    <!-- *********************************************************** -->
    <!-- *********************************************************** -->


    <!-- *********************************************************** -->
    <!-- ****** ENTRY FUNCTION - prints DataType                 *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printDataType">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:param name="pIsUnbounded" as="xs:boolean"/>
        <xsl:choose>
            <xsl:when test="$pIsUnbounded = true()">
                <xsl:value-of select=" xdd:printSetVarArgUnboundedDataType($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select=" xdd:printGetUnboundedDataType($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select=" xdd:printRemoveUnboundedDataType($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:choose>
                    <xsl:when test="$pElementType='java.util.Date'">
                        <xsl:value-of select="xdd:printSetSingleXmlDate($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:printSetSingleDataType($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                    </xsl:otherwise>
                </xsl:choose>
                <xsl:value-of select="xdd:printGetSingleDataType($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printRemoveSingleDataType($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the GetOrCreate       Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printSetSingleDataType">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vSetSignature" select="concat('   public ', $pClassType, ' ', xdd:checkForClassType(xdd:LowerCaseFirstChar($pMethodName)), '(',  xdd:createPascalizedName($pElementType,''),' ',xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ')')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Sets the &lt;code&gt;', $pElementName,'&lt;/code&gt; element&#10;')"/>
        <xsl:value-of select="concat('    * @param ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ' the value for the element &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vSetSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vSetSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.getOrCreate(&quot;', $pElementName, '&quot;).text(', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the GetOrCreateXMLDateBody *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printSetSingleXmlDate">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vSetSignature" select="concat('   public ', $pClassType, ' ', xdd:checkForClassType(xdd:LowerCaseFirstChar($pMethodName)), '(',  xdd:createPascalizedName($pElementType,''),' ',xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ')')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Sets the &lt;code&gt;', $pElementName,'&lt;/code&gt; element&#10;')"/>
        <xsl:value-of select="concat('    * @param ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ' the value for the element &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vSetSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vSetSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      if (', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , ' != null)', '&#10;')"/>
                <xsl:value-of select="concat('      {', '&#10;')"/>
                <xsl:value-of select="concat('         ', $pNodeNameLocal, '.getOrCreate(&quot;', $pElementName, '&quot;).text(XMLDate.toXMLFormat(', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , '));', '&#10;')"/>
                <xsl:value-of select="concat('         return this;', '&#10;')"/>
                <xsl:value-of select="concat('      }', '&#10;')"/>
                <xsl:value-of select="concat('      return null;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the printGetDataType       *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetSingleDataType">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vStandardGetSignature" select="concat('public ', xdd:createPascalizedName($pElementType,''), ' get', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:variable name="vStandardGetStringSignature" select="concat('public String ', ' get', xdd:checkForClassType($pMethodName), 'AsString()')"/>
        <xsl:variable name="vStandardGetBooleanSignature" select="concat('public ', xdd:createPascalizedName($pElementType,''), ' is', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:variable name="vStandardGetComplexSignature" select="concat('public ', xdd:createPascalizedName($pElementType,''), ' ', xdd:checkForClassType( xdd:LowerCaseFirstChar($pMethodName)), '()')"/>
        <xsl:variable name="vStandardGetListSignature" select="concat('public List&lt;', xdd:createPascalizedName($pElementType,''), '&gt; getAll', xdd:checkForClassType($pMethodName), '()')"/>

        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:choose>
                    <xsl:when test="$pElementType='Boolean'">
                        <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($pElementType, $pElementName)"/>
                        <xsl:value-of select=" concat('   ', $vStandardGetBooleanSignature, ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($pElementType, $pElementName)"/>
                        <xsl:value-of select=" concat('   ', $vStandardGetSignature, ';&#10;')"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>
            <xsl:otherwise>
                <xsl:choose>
                    <xsl:when test="$pElementType='Boolean'">
                        <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($pElementType, $pElementName)"/>
                        <xsl:value-of select="concat('   ', $vStandardGetBooleanSignature, '&#10;')"/>
                        <xsl:value-of select="concat('   {', '&#10;')"/>
                        <xsl:value-of select="concat('      return Strings.isTrue(', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;));' , '&#10;')"/>
                        <xsl:value-of select="concat('   }', '&#10;')"/>
                    </xsl:when>
                    <xsl:when test="$pElementType='Integer'">
                        <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($pElementType, $pElementName)"/>
                        <xsl:value-of select="concat('   ', $vStandardGetSignature, '&#10;')"/>
                        <xsl:value-of select="concat('   {', '&#10;')"/>
                        <xsl:value-of select="concat('      if (', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;) != null &amp;&amp; !', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;).equals(&quot;null&quot;)) {' , '&#10;')"/>
                        <xsl:value-of select="concat('         return Integer.valueOf(', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;));' , '&#10;')"/>
                        <xsl:value-of select="concat('      }' , '&#10;')"/>
                        <xsl:value-of select="concat('      return null;' , '&#10;')"/>
                        <xsl:value-of select="concat('   }', '&#10;')"/>
                    </xsl:when>
                    <xsl:when test="$pElementType='Long'">
                        <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($pElementType, $pElementName)"/>
                        <xsl:value-of select="concat('   ', $vStandardGetSignature, '&#10;')"/>
                        <xsl:value-of select="concat('   {', '&#10;')"/>
                        <xsl:value-of select="concat('      if (', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;) != null &amp;&amp; !', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;).equals(&quot;null&quot;)) {' , '&#10;')"/>
                        <xsl:value-of select="concat('         return Long.valueOf(', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;));' , '&#10;')"/>
                        <xsl:value-of select="concat('      }' , '&#10;')"/>
                        <xsl:value-of select="concat('      return null;' , '&#10;')"/>
                        <xsl:value-of select="concat('   }', '&#10;')"/>
                    </xsl:when>
                    <xsl:when test="$pElementType='java.util.Date'">
                        <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($pElementType, $pElementName)"/>
                        <xsl:value-of select="concat('   ', $vStandardGetSignature, '&#10;')"/>
                        <xsl:value-of select="concat('   {', '&#10;')"/>
                        <xsl:value-of select="concat('      if (', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;) != null) {' , '&#10;')"/>
                        <xsl:value-of select="concat('         return XMLDate.toDate(', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;));' , '&#10;')"/>
                        <xsl:value-of select="concat('      }' , '&#10;')"/>
                        <xsl:value-of select="concat('      return null;' , '&#10;')"/>
                        <xsl:value-of select="concat('   }', '&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($pElementType, $pElementName)"/>
                        <xsl:value-of select="concat('   ', $vStandardGetSignature, '&#10;')"/>
                        <xsl:value-of select="concat('   {', '&#10;')"/>
                        <xsl:value-of select="concat('      return ', $pNodeNameLocal, '.getTextValueForPatternName(&quot;', $pElementName, '&quot;);' , '&#10;')"/>
                        <xsl:value-of select="concat('   }', '&#10;')"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Remove            Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printRemoveSingleDataType">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vRemoveSignature" select="concat('   public ', $pClassType, ' remove', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Removes the &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vRemoveSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vRemoveSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.removeChildren(&quot;', $pElementName, '&quot;', ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>



    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Create Node  Body      *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printSetUnboundedDataType">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vStandardSetSignature" select="concat('   public ', $pClassType, ' ', xdd:checkForClassType(xdd:LowerCaseFirstChar($pMethodName)), '(',  xdd:createPascalizedName($pElementType,''),' ',xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ')')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Creates a new &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vStandardSetSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vStandardSetSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.createChild(&quot;', $pElementName, '&quot;).text(', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the SetVarArgBody          *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printSetVarArgUnboundedDataType">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vSetVarArgSignature" select="concat('   public ', $pClassType, ' ', xdd:checkForClassType(xdd:LowerCaseFirstChar($pMethodName)), '(',  xdd:createPascalizedName($pElementType,''),' ... values)')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Creates for all ', $pElementType, ' objects representing &lt;code&gt;', $pElementName,'&lt;/code&gt; elements, &#10;')"/>
        <xsl:value-of select="concat('    * a new &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @param ', 'values', ' list of &lt;code&gt;', $pElementName,'&lt;/code&gt; objects &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vSetVarArgSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vSetVarArgSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      if (values != null)', '&#10;')"/>
                <xsl:value-of select="concat('      {', '&#10;')"/>
                <xsl:value-of select="concat('         for(', xdd:createPascalizedName($pElementType,''), ' name: values)', '&#10;')"/>
                <xsl:value-of select="concat('         {', '&#10;')"/>
                <xsl:value-of select="concat('            ', $pNodeNameLocal, '.createChild(&quot;', $pElementName, '&quot;).text(name);', '&#10;')"/>
                <xsl:value-of select="concat('         }', '&#10;')"/>
                <xsl:value-of select="concat('      }', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>



    <!-- *********************************************************************** -->
    <!-- ****** Function which writes the GetBodyForSimpleDataTypeUnbounded  *** -->
    <!-- *********************************************************************** -->
    <xsl:function name="xdd:printGetUnboundedDataType">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vGetListSignature" select="concat('public List&lt;', xdd:createPascalizedName($pElementType,''), '&gt; getAll', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:variable name="vValueOf" select=" xdd:writeGetValueOf($pElementType, $pElementName)"/>
        <xsl:variable name="vValueOfDataType" select=" xdd:writeGetValueOfDataType($pElementType)"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Returns all &lt;code&gt;', $pElementName, '&lt;/code&gt; elements&#10;')"/>
        <xsl:value-of select="concat('    * @return list of &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat('   ', $vGetListSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vGetListSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      List&lt;', $vValueOfDataType, '&gt; result = new ArrayList&lt;', $vValueOfDataType, '&gt;();', '&#10;')"/>
                <xsl:value-of select="concat('      List&lt;Node&gt; nodes = ', $pNodeNameLocal, '.get(&quot;', $pElementName, '&quot;);', '&#10;')"/>
                <xsl:value-of select="concat('      for (Node node : nodes)', '&#10;')"/>
                <xsl:value-of select="concat('      {', '&#10;')"/>
                <xsl:value-of select="concat('         ', $vValueOf, '&#10;')"/>
                <xsl:value-of select="concat('      }', '&#10;')"/>
                <xsl:value-of select="concat('      return result;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Remove            Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printRemoveUnboundedDataType">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vRemoveAllSignature" select="concat('   public ', $pClassType, ' removeAll', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Removes the &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vRemoveAllSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vRemoveAllSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.removeChildren(&quot;', $pElementName, '&quot;', ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>

    <!-- *********************************************************** -->
    <!-- *********************************************************** -->
    <!-- ****** Empty boolean      ********************************* -->
    <!-- *********************************************************** -->
    <!-- *********************************************************** -->


    <!-- *********************************************************** -->
    <!-- ****** ENTRY FUNCTION - prints enums                    *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printEmptyBoolean">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <!--<xsl:value-of select="xdd:writeTypeCommentLines($pElementName, true(), true(), true(), false())"/>-->
        <xsl:value-of select=" xdd:printSetEmptyBoolean($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
        <xsl:value-of select=" xdd:printGetEmptyBoolean($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
    </xsl:function>

    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Remove            Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printSetEmptyBoolean">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vSetBooleanEmptySignature" select="concat('   public ', $pClassType, ' ', xdd:checkForClassType( xdd:LowerCaseFirstChar($pMethodName)), '()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Sets the &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vSetBooleanEmptySignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vSetBooleanEmptySignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.getOrCreate(&quot;', $pElementName, '&quot;);', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>

    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Remove            Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetEmptyBoolean">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vGetBooleanEmptySignature" select="concat('   public Boolean is', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Removes the &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vGetBooleanEmptySignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vGetBooleanEmptySignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      return ', $pNodeNameLocal, '.getSingle(&quot;', $pElementName, '&quot;) != null;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>
</xsl:stylesheet>
