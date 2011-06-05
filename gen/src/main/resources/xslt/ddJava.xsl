<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:functx="http://www.functx.com" xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xs" version="2.0" xmlns:xdd="http://org.jboss/shrinkwrap">
    <!--    <xsl:output method="text"/>-->
    <xsl:output method="text" indent="yes" media-type="text/plain"/>
    <xsl:param name="gOutputFolder" select="'..'"/>
    <xsl:variable name="vLower" select="'abcdefghijklmnopqrstuvwxyz'"/>
    <xsl:variable name="vUpper" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'"/>
    <xsl:variable name="gDataTypes" select="//datatypes"/>
    <xsl:variable name="gEnums" select="//enums"/>
    <xsl:variable name="gGroups" select="//groups"/>
    <xsl:variable name="gPackageApis" select="//packages/api"/>
    <xsl:variable name="gPackageImpls" select="//packages/impl"/>

    <xsl:template match="/">
        <xsl:call-template name="GenerateEnums"/>
        <xsl:call-template name="GenerateInterfaces"/>
        <xsl:call-template name="GenerateDescriptors"/>
        <xsl:call-template name="GenerateDescriptorsImpl"/>
        <xsl:call-template name="GenerateImplClasses"/>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the interfaces   ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateInterfaces">
        <xsl:for-each select="//classes/class">

            <xsl:call-template name="WriteInterface2">
                <xsl:with-param name="pClassNode" select="."/>
            </xsl:call-template>
        </xsl:for-each>
    </xsl:template>


    <!-- ******************************************************* -->
    <!-- ****** Template which generates the enumerations ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="GenerateEnums">
        <xsl:param name="pTypeName" select="."/>
        <xsl:for-each select="//enums/enum">
            <xsl:variable name="vClassname" select="xdd:createPascalizedName(@name, '')"/>
            <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolder, @package, $vClassname, 'java')"/>
            <xsl:message select="concat('Generating Enum: ', $vClassname)"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writePackageLine(@package)"/>
                <xsl:value-of select="xdd:classHeaderComment('')"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('enum', $vClassname)"/>
                <xsl:text>&#10;{&#10;</xsl:text>

                <xsl:for-each select="value">
                    <xsl:variable name="pEnum" select=" upper-case(replace(text(), '\.', '_'))"/>
                    <xsl:text>   _</xsl:text>
                    <xsl:value-of select="$pEnum"/>
                    <xsl:text>("</xsl:text>
                    <xsl:value-of select="text()"/>
                    <xsl:text>")</xsl:text>
                    <xsl:if test="position() != last()">
                        <xsl:text>,</xsl:text>
                        <xsl:text>&#10;</xsl:text>
                    </xsl:if>
                </xsl:for-each>
                <xsl:text>;</xsl:text>

                <xsl:text>&#10;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>   private String value;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>   </xsl:text>

                <xsl:value-of select="$vClassname"/>
                <xsl:text> (String value)</xsl:text>
                <xsl:text> { this.value = value; }</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>   public String toString() {return value;}</xsl:text>
                <xsl:text>&#10;}&#10;</xsl:text>
                <xsl:text>&#10;</xsl:text>
            </xsl:result-document>
        </xsl:for-each>
    </xsl:template>

    <!-- ******************************************************* -->
    <!-- ****** Template which generates the interfaces ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="GenerateGroups">
        <xsl:param name="pTypeName"/>

        <!-- **** loop through all elements **** -->
        <xsl:for-each select="//groups/class">

            <xsl:call-template name="WriteInterface2">
                <xsl:with-param name="pClassNode" select="."/>
            </xsl:call-template>

        </xsl:for-each>
    </xsl:template>


    <!-- ******************************************************* -->
    <!-- ****** Template which generates the interfaces2  ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteInterface2">
        <xsl:param name="pClassNode" select="."/>

        <xsl:variable name="vClassname" select="xdd:createPascalizedName($pClassNode/@name, '')"/>
        <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolder, @packageApi, $vClassname, 'java')"/>

        <xsl:if test="$vClassname=''">
            <xsl:value-of select="'cannot process'"/>: <xsl:value-of select=" name()"/>: <xsl:value-of select="position()"/>
            <xsl:text>&#10;</xsl:text>
        </xsl:if>

        <xsl:if test="$vClassname">
            <xsl:message select="concat('Generating Interface: ', $vClassname)"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writePackageLine(@packageApi)"/>
                <xsl:value-of select="xdd:classHeaderComment('')"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('interface', $vClassname)"/>
                <xsl:text>&lt;T&gt;</xsl:text>
                <xsl:text> extends Child&lt;T&gt;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>{</xsl:text>
                <xsl:text>&#10;</xsl:text>

                <xsl:for-each select="include">
                    <xsl:value-of select="xdd:includeGroupRefs($vClassname, text(), false(), true(), true(), '')"/>
                </xsl:for-each>

                <xsl:for-each select="element">
                    <xsl:variable name="vMaxOccurs" select="concat('-',  @maxOccurs)"/>
                    <xsl:choose>
                        <xsl:when test="@type='javaee:ejb-relationship-roleType' and position()=4"/>
                        <xsl:otherwise>
                            <xsl:value-of select="xdd:writeMethodOrAttribute($vClassname, @name, @type, $vMaxOccurs, false(), true(), true(), '')"/>
                        </xsl:otherwise>
                    </xsl:choose>
                    <xsl:if test="position()!= last()">
                        <xsl:text>&#10;</xsl:text>
                    </xsl:if>
                </xsl:for-each>
                <xsl:text>}</xsl:text>
                <xsl:text>&#10;</xsl:text>
            </xsl:result-document>
        </xsl:if>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the descriptors  ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateDescriptors">
        <xsl:for-each select="//descriptors/descriptor">
            <xsl:call-template name="WriteDescriptor">
                <xsl:with-param name="pDescriptor" select="."/>
            </xsl:call-template>
        </xsl:for-each>
    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ****** Template which generates the descriptorsimpl * -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateDescriptorsImpl">
        <xsl:for-each select="//descriptors/descriptor">
            <xsl:call-template name="WriteDescriptorImpl">
                <xsl:with-param name="pDescriptor" select="."/>
            </xsl:call-template>
        </xsl:for-each>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates theimpl classes  * -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateImplClasses">
        <xsl:for-each select="//classes/class">
            <xsl:call-template name="WriteImplClasses">
                <xsl:with-param name="pClass" select="."/>
            </xsl:call-template>
        </xsl:for-each>
    </xsl:template>

    <!-- ******************************************************* -->
    <!-- ****** Template which generates the descriptors  ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteDescriptor">
        <xsl:param name="pDescriptor" select="."/>

        <xsl:variable name="vPackage" select="./@packageApi"/>
        <xsl:variable name="vClassname" select="xdd:createPascalizedName($pDescriptor/@schemaName, 'Descriptor')"/>
        <xsl:message select="concat('Generating Descriptor Api: ', $vClassname)"/>
        <xsl:if test="$vClassname">
            <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolder, $vPackage, $vClassname, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.api.Descriptor;&#10;&#10;</xsl:text>
                <xsl:value-of select="xdd:classHeaderComment('')"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('interface', $vClassname)"/>

                <xsl:text>&lt;T&gt; extends Descriptor</xsl:text>
                <xsl:text>&#10;{&#10;</xsl:text>

                <xsl:variable name="vType" select=" substring-after($pDescriptor/element/@type, ':')"/>
                <xsl:for-each select="//classes/class[@name=$vType]">
                    <xsl:for-each select="include">
                        <xsl:value-of select="xdd:includeGroupRefs('T', text(), false(), true(), false(), '')"/>
                    </xsl:for-each>
                    <xsl:for-each select="element">
                        <xsl:value-of select="xdd:writeMethodOrAttribute('T', @name, @type, '-', false(), true(), false(), '')"/>
                    </xsl:for-each>
                </xsl:for-each>

                <xsl:text>}&#10;</xsl:text>
            </xsl:result-document>
        </xsl:if>
    </xsl:template>


    <!-- ******************************************************* -->
    <!-- ****** Template which generates the impl classes  ***** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteImplClasses">
        <xsl:param name="pClass" select="."/>

        <xsl:variable name="vPackage" select="@packageImpl"/>
        <xsl:variable name="vInterfaceName" select="xdd:createPascalizedName($pClass/@name, '')"/>
        <xsl:variable name="vClassnameImpl" select="xdd:createPascalizedName($pClass/@name, 'Impl')"/>
        <xsl:message select="concat('Generating Implementation Class: ', $vClassnameImpl)"/>
        <xsl:if test="$vClassnameImpl">
            <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolder, $vPackage, $vClassnameImpl, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.spi.Node;&#10;</xsl:text>
                <xsl:value-of select="xdd:writeImports(true())"/>
                <xsl:value-of select="xdd:writeImports(false())"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select="xdd:classHeaderComment('')"/>
                <!--                <xsl:variable name="vNodeName" select="$pClass/element/@name"/>-->
                <!--                <xsl:value-of select="xdd:classNodeInfo($pClass/element/@name)"/>-->
                <xsl:value-of select="xdd:classHeaderDeclaration('class', $vClassnameImpl)"/>
                <xsl:text>&lt;T&gt;</xsl:text>
                <xsl:text> implements Child&lt;T&gt;, </xsl:text>
                <xsl:value-of select="xdd:createPascalizedName($vInterfaceName, '&lt;T&gt;')"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>{</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <!-- write constructor attributes -->
                <xsl:value-of select=" xdd:writeAttribute('T', 't', true())"/>
                <xsl:value-of select=" xdd:writeAttribute('Node', 'node', false())"/>
                <xsl:value-of select=" xdd:writeAttribute('Node', 'childNode', false())"/>
                <!-- write all local attributes -->
                <xsl:for-each select="element">
                    <xsl:choose>
                        <xsl:when test="@type='javaee:ejb-relationship-roleType' and position()=4"/>
                        <xsl:otherwise>
                            <xsl:value-of select="xdd:writeMethodOrAttribute($vInterfaceName, @name, @type, '-', true(), false(), true(), 'childNode')"/>
                        </xsl:otherwise>
                    </xsl:choose>
                </xsl:for-each>
                <xsl:text>&#10;</xsl:text>
                <!-- write all included attributes -->
                <xsl:for-each select="include">
                    <xsl:value-of select="xdd:includeGroupRefs($vInterfaceName, text(), true(), false(), true(),'childNode')"/>
                </xsl:for-each>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                
                <xsl:variable name="vName" select="@name"/>
                <xsl:variable name="vNodeName" select="//class/element[contains(@type, $vName)][1]/@name"/> 
                <xsl:message select="concat('name: ', $vName,'  nodeName: ', $vNodeName[1])"/>
<!--                //class/element[1][contains(@type, 'security-roleType')]/@name -->
                <xsl:value-of select=" xdd:writeImplClassConstructor($vClassnameImpl, $vNodeName[1], 'childNode')"/>
                
                <xsl:value-of select="xdd:writeChildUp()"/>
                <xsl:for-each select="include">
                    <xsl:value-of select="xdd:includeGroupRefs($vInterfaceName, text(), false(), false(), true(), 'childNode')"/>
                </xsl:for-each>
                <xsl:for-each select="element">
                    <xsl:variable name="vMaxOccurs" select="concat('-',  @maxOccurs)"/>
                    <xsl:choose>
                        <xsl:when test="@type='javaee:ejb-relationship-roleType' and position()=4"/>
                        <xsl:otherwise>
                            <xsl:value-of select="xdd:writeMethodOrAttribute($vInterfaceName, @name, @type, $vMaxOccurs, false(), false(), true(), 'childNode')"/>
                        </xsl:otherwise>
                    </xsl:choose>
                    <xsl:if test="position()!= last()">
                        <xsl:text>&#10;</xsl:text>
                    </xsl:if>
                </xsl:for-each>
                <xsl:text>}</xsl:text>
                <xsl:text>&#10;</xsl:text>
            </xsl:result-document>
        </xsl:if>
    </xsl:template>



    <!-- ******************************************************* -->
    <!-- ****** Template which generates the descriptors  ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteDescriptorImpl">
        <xsl:param name="pDescriptor" select="."/>

        <xsl:variable name="vPackage" select="@packageImpl"/>
        <xsl:variable name="vNodeName" select="'model'"/>
        <xsl:variable name="vInterfaceName" select="xdd:createPascalizedName($pDescriptor/@schemaName, 'Descriptor')"/>
        <xsl:variable name="vClassnameImpl" select="xdd:createPascalizedName($pDescriptor/@schemaName, 'DescriptorImpl')"/>
        <xsl:message select="concat('Generating DescriptorImpl: ', $vClassnameImpl)"/>
        <xsl:if test="$vClassnameImpl">
            <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolder, $vPackage, $vClassnameImpl, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:value-of select="xdd:writeImports(true())"/>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;&#10;</xsl:text>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.spi.Node;&#10;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select="xdd:classHeaderComment('')"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('class', $vClassnameImpl)"/>
                <xsl:text> extends NodeProviderImplBase implements </xsl:text>
                <xsl:value-of select="xdd:createPascalizedName($vInterfaceName, concat('&lt;', $vClassnameImpl ,'&gt;'))"/>
                <xsl:text>&#10;{</xsl:text>
                <xsl:text>&#10;</xsl:text>

                <!-- write all attributes -->
                <xsl:value-of select="xdd:writeAttribute('Node', $vNodeName, true())"/>
                <xsl:for-each select="element">
                    <xsl:variable name="vType" select=" substring-after(@type, ':')"/>
                    <xsl:for-each select="//classes/class[@name=$vType]">
                        <xsl:for-each select="element">
                            <xsl:value-of select="xdd:writeMethodOrAttribute($vClassnameImpl, @name, @type, '-', true(), false(), false(), $vNodeName)"/>
                        </xsl:for-each>
                        <xsl:for-each select="include">
                            <xsl:value-of select="xdd:includeGroupRefs($vClassnameImpl, text(), true(), false(), false(), 'node')"/>
                        </xsl:for-each>
                    </xsl:for-each>

                </xsl:for-each>
                <xsl:text>&#10;</xsl:text>

                <!-- write the constructor -->
                <xsl:value-of select="xdd:writeDescriptorImplConstructor($vClassnameImpl, $pDescriptor/element/@name, $vNodeName)"/>
                <xsl:value-of select="xdd:writeMethodComment()"/>
                <!-- write all methods -->
                <xsl:value-of select="xdd:writeNodeProviderMethods($vNodeName)"/>
                <xsl:for-each select="element">
                    <xsl:variable name="vType" select=" substring-after(@type, ':')"/>
                    <xsl:for-each select="//classes/class[@name=$vType]">
                        <xsl:for-each select="element">
                            <xsl:value-of select="xdd:writeMethodOrAttribute($vClassnameImpl, @name, @type, '-', false(), false(), false(), $vNodeName)"/>
                        </xsl:for-each>
                        <xsl:for-each select="include">
                            <xsl:value-of select="xdd:includeGroupRefs($vClassnameImpl, text(), false(), false(), false(), $vNodeName)"/>
                        </xsl:for-each>
                    </xsl:for-each>
                </xsl:for-each>

                <xsl:text>&#10;}</xsl:text>
                <xsl:text>&#10;</xsl:text>
            </xsl:result-document>
        </xsl:if>
    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ******  Function which generates a camel case string * -->
    <!-- ****************************************************** -->
    <xsl:function name="functx:words-to-camel-case" as="xs:string" xmlns:functx="http://www.functx.com">
        <xsl:param name="arg" as="xs:string?"/>

        <xsl:sequence select=" 
            string-join((tokenize($arg,'\s+')[1],
            for $word in tokenize($arg,'\s+')[position() > 1]
            return functx:capitalize-first($word))
            ,'')
            "/>

    </xsl:function>

    <!-- ****************************************************** -->
    <!-- ******  Function which capitalize tje first char     * -->
    <!-- ****************************************************** -->
    <xsl:function name="functx:capitalize-first" as="xs:string?" xmlns:functx="http://www.functx.com">
        <xsl:param name="arg" as="xs:string?"/>

        <xsl:sequence select=" 
            concat(upper-case(substring($arg,1,1)),
            substring($arg,2))
            "/>

    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which creates a full path       ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:createPath" as="xs:string">
        <xsl:param name="path" as="xs:string"/>
        <xsl:param name="package" as="xs:string"/>
        <xsl:param name="filename" as="xs:string"/>
        <xsl:param name="extension" as="xs:string"/>
        <xsl:sequence select="concat($path, '/' , replace($package,'\.','/'), '/' , $filename, '.', $extension)"/>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which creates a class name      ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:createPascalizedName">
        <xsl:param name="name"/>
        <xsl:param name="extension" as="xs:string"/>

        <xsl:variable name="retValue" select="xdd:normalizeString($name)"/>
        <xsl:variable name="retValue" select="functx:words-to-camel-case($retValue)"/>
        <xsl:variable name="retValue" select="concat(upper-case(substring($retValue,1,1)), substring($retValue,2))"/>

        <xsl:choose>
            <xsl:when test=" starts-with($name, 'java.')">
                <xsl:sequence select="$name"/>
            </xsl:when>
            <xsl:when test="$extension!=''">
                <xsl:sequence select="concat($retValue, $extension)"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:sequence select="$retValue"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which creates a type   name     ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:createCamelizedName">
        <xsl:param name="name"/>
        <xsl:sequence select="functx:words-to-camel-case(xdd:normalizeString($name))"/>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which normalizes a string       ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:normalizeString">
        <xsl:param name="name"/>

        <xsl:sequence
            select="
             if (contains($name, '/')) then
                   xdd:normalizeString(substring-after($name,'/'))
             else if (contains($name, ':')) then
                   xdd:normalizeString(substring-after($name,':'))                   
             else if (contains($name, '_')) then
                   xdd:normalizeString(replace($name,'_',' ')) 
             else if (contains($name, '-')) then
                   xdd:normalizeString(replace($name,'-',' '))    
             else if (contains($name,'.xsd')) then
                   xdd:normalizeString(substring-before($name, '.xsd'))
             else
                 string($name)
        "
        />
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the package line   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writePackageLine">
        <xsl:param name="pPackage"/>
        <xsl:text>package </xsl:text><xsl:value-of select="$pPackage"/>; <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>



    <!-- ****************************************************** -->
    <!-- ****** Function which writes the package line   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeDescriptorImplConstructor">
        <xsl:param name="pClassName"/>
        <xsl:param name="pAppDescription"/>
        <xsl:param name="pNodeNameLocal"/>
        
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>   // Constructor -------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   public ', $pClassName, '(String descriptorName)')"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   {</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:variable name="nodeExtractor" select="concat('NodeInfoExtractor.getNodeInfo(', $pClassName, '.class)')"/>
        <xsl:value-of select="concat('       this(descriptorName, new Node(&quot;', $pAppDescription , '&quot;));')"/>
        <xsl:text>&#10;</xsl:text>

        <!--        <xsl:value-of select="'       this(descriptorName, new Node(nodeName);'"/><xsl:text>&#10;</xsl:text>-->
        <!--
        <xsl:text>         .attribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")</xsl:text><xsl:text>&#10;</xsl:text>
        <xsl:text>         .attribute("xsi:schemaLocation",</xsl:text><xsl:text>&#10;</xsl:text>
        <xsl:text>         "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"));</xsl:text><xsl:text>&#10;</xsl:text>-->
        <!-- <xsl:text>       version("3.0");</xsl:text><xsl:text>&#10;</xsl:text>-->
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
        <xsl:text>   // Constructor -------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   public ', $pClassName, '(T t, String descriptorName, Node node)')"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:text>      this.t = t;&#10;</xsl:text>
        <xsl:text>      this.node = node;&#10;</xsl:text>
        <xsl:value-of select="concat('      this.', $pNodeNameLocal ,' = node.create(&quot;', $pNodeName,'&quot;);')"/>
        <xsl:text>   }&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the method line    ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeMethodComment">
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>   // Methods -----------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
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
            <xsl:text>   // Instance Members --------------------------------------------------------------------||&#10;</xsl:text>
            <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
            <xsl:text>&#10;</xsl:text>
        </xsl:if>
        <xsl:value-of select="concat('   private ', $pType, ' ', $pName, ';')"/>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the package line   ****** -->
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
        <xsl:text>      return new XMLExporter();&#10;</xsl:text>
        <xsl:text>   }&#10;</xsl:text>
    </xsl:function>

    <!-- ****************************************************** -->
    <!-- ****** Function which writes the class header   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:classHeaderComment">
        <xsl:param name="text"/>
        <xsl:text>/**</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:text> * This class is a generated class.</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:text> * Generation date :</xsl:text>
        <xsl:value-of select="current-dateTime()"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:text> */</xsl:text>
        <xsl:text>&#10;</xsl:text>
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


    <!---****************************************************** -->
    <!-- ****** Function which writes a get method          *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:includeGroupRefs">
        <xsl:param name="pClassname"/>
        <xsl:param name="pGroupName"/>
        <xsl:param name="pWriteAttribute" as="xs:boolean"/>
        <xsl:param name="pWriteInterface" as="xs:boolean"/>
        <xsl:param name="pIsGeneric" as="xs:boolean"/>
        <xsl:param name="pNodeNameLocal" as="xs:string"/>

        <xsl:variable name="vGroupName" select=" substring-after($pGroupName, ':')"/>
        <xsl:for-each select="$gGroups/class[@name=$vGroupName]/element">
            <xsl:variable name="vMaxOccurs" select="concat('-', @maxOccurs)"/>
            <xsl:value-of select=" xdd:writeMethodOrAttribute($pClassname, @name, @type, $vMaxOccurs, $pWriteAttribute, $pWriteInterface, $pIsGeneric, $pNodeNameLocal)"/>
        </xsl:for-each>

        <xsl:for-each select="$gGroups/class[@name=$vGroupName]/include">
            <xsl:value-of select="xdd:includeGroupRefs($pClassname, text(), $pWriteAttribute, $pWriteInterface, $pIsGeneric, $pNodeNameLocal)"/>
        </xsl:for-each>

    </xsl:function>


    <!---****************************************************** -->
    <!-- ****** Function which returns a classname          *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:getReturnType">
        <xsl:param name="pClassName" as="xs:string"/>
        <xsl:param name="pIsGeneric" as="xs:boolean"/>
        <xsl:choose>
            <xsl:when test="$pIsGeneric=true()">
                <xsl:sequence select="xdd:createPascalizedName($pClassName, '&lt;T&gt;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:sequence select="xdd:createPascalizedName($pClassName, '')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes a method              *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeMethodOrAttribute">
        <xsl:param name="pClassName" as="xs:string"/>
        <xsl:param name="pElementName" as="xs:string"/>
        <xsl:param name="pElementType" as="xs:string"/>
        <xsl:param name="pMaxOccurs" as="xs:string"/>
        <xsl:param name="pWriteAttribute" as="xs:boolean"/>
        <xsl:param name="pWriteInterface" as="xs:boolean"/>
        <xsl:param name="pIsGeneric" as="xs:boolean"/>
        <xsl:param name="pNodeNameLocal" as="xs:string"/>

        <xsl:variable name="vMethodName" select="xdd:createPascalizedName($pElementName,'')"/>
        <xsl:variable name="vReturn" select=" xdd:getReturnType($pClassName, $pIsGeneric)"/>

        <xsl:choose>
            <xsl:when test="$pElementType='javaee:emptyType' or $pElementType='javaee:ordering-othersType' or 
                            $pElementType='faces-config-ordering-othersType' or $pElementType='extensibleType'">
                <xsl:choose>
                    <xsl:when test="$pWriteAttribute=true()">
                        <xsl:value-of select="concat('   private ', 'Boolean', ' ', xdd:createCamelizedName($pElementName), ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, 'Boolean', $pElementName, '-', $pWriteInterface, $pNodeNameLocal)"/>
                        <xsl:value-of select="xdd:writeGetMethodSignature($vReturn, 'Boolean', concat($vMethodName, ''), $pElementName, '-', $pWriteInterface, false(), $pNodeNameLocal)"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="xdd:isEnumType($pElementType)">
                <xsl:choose>
                    <xsl:when test="$pWriteAttribute=true()">
                        <xsl:value-of select="concat('   private ', 'String', ' ', xdd:createCamelizedName($pElementName), ';')"/>
                        <xsl:text>&#10;</xsl:text>
                    </xsl:when>
                    <xsl:otherwise>
                        <!--                        <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, $pElementType, $pElementName, $pMaxOccurs, true())"/>-->
                        <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, 'String', $pElementName, '-', $pWriteInterface, $pNodeNameLocal)"/>
                        <xsl:value-of select="xdd:writeGetMethodSignature($vReturn, 'String', concat($vMethodName, ''), $pElementName, '-', $pWriteInterface, false(), $pNodeNameLocal)"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="xdd:isDataType($pElementType)">
                <xsl:variable name="vDataType" select="xdd:CheckDataType($pElementType)"/>
                <xsl:choose>
                    <xsl:when test="$pWriteAttribute=true()">
                        <xsl:value-of select="concat('   private ', $vDataType, ' ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ';')"/>
                        <xsl:text>&#10;</xsl:text>
                    </xsl:when>
                    <xsl:otherwise>
                        <!--   <xsl:if test="$pElementType='javaee:fully-qualified-classType'">
                            <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, 'Class&lt;?&gt;', $pElementName, $pMaxOccurs, $pWriteInterface)"/>
                            <!-\-                    <xsl:value-of select="xdd:writeGetMethodSignature('Class&lt;?&gt;', $vMethodName, $pMaxOccurs, true())"/>-\->
                            <xsl:text>&#10;</xsl:text>
                        </xsl:if>-->
                        <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, $vDataType, $pElementName, $pMaxOccurs, $pWriteInterface, $pNodeNameLocal)"/>
                        <xsl:value-of select="xdd:writeGetMethodSignature($vReturn, $vDataType, $vMethodName, $pElementName, $pMaxOccurs, $pWriteInterface, false(), $pNodeNameLocal)"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="$pIsGeneric=false()">
                <xsl:variable name="vReturnGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&gt;'))"/>
                <xsl:variable name="vElementTypeGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&gt;'))"/>
                <xsl:choose>
                    <xsl:when test="$pWriteAttribute=true()">
                        <xsl:value-of select="concat('   private ', $vReturnGeneric, ' ', xdd:createCamelizedName($pElementName), ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:writeSetMethodSignature($pClassName, $vMethodName, $vElementTypeGeneric, $pElementName, $pMaxOccurs, $pWriteInterface, $pNodeNameLocal)"/>
                        <xsl:value-of select="xdd:writeGetMethodSignature($pClassName, $vReturnGeneric, $vMethodName, $pElementName, $pMaxOccurs, $pWriteInterface, true(), $pNodeNameLocal)"/>
                        <xsl:text>&#10;</xsl:text>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:otherwise>
                <!-- it is a complex type -->
                <xsl:variable name="vReturnGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&lt;T&gt;&gt;'))"/>
                <xsl:variable name="vElementTypeGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&lt;T&gt;&gt;'))"/>
                <xsl:choose>
                    <xsl:when test="$pWriteAttribute=true()">
                        <xsl:value-of select="concat('   private ', $vReturnGeneric, ' ', xdd:createCamelizedName($pElementName), ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, $vElementTypeGeneric, $pElementName, $pMaxOccurs, $pWriteInterface, $pNodeNameLocal)"/>
                        <xsl:value-of select="xdd:writeGetMethodSignature($vReturn, $vReturnGeneric, $vMethodName, $pElementName, $pMaxOccurs, $pWriteInterface, true(), $pNodeNameLocal)"/>
                        <xsl:text>&#10;</xsl:text>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:otherwise>
        </xsl:choose>

    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes a set method          *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeSetMethodSignature">
        <xsl:param name="vReturnType"/>
        <xsl:param name="vMethodName"/>
        <xsl:param name="vElementType"/>
        <xsl:param name="vElementName"/>
        <xsl:param name="vMaxOccurs"/>
        <xsl:param name="vIsInterface" as="xs:boolean"/>
        <xsl:param name="vNodeNameLocal"/>

        <xsl:variable name="vClassType" select="xdd:createPascalizedName($vElementType,'')"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   public ', $vReturnType, ' set', xdd:checkForClassType($vMethodName), '(',  xdd:createPascalizedName($vElementType,''),' ',xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ')')"/>

        <xsl:choose>
            <xsl:when test="$vIsInterface=true()">
                <xsl:value-of select="';'"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>   {&#10;</xsl:text>
                <xsl:value-of select="concat('      this.', xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ' = ', xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ';' , '&#10;')"/>
                <xsl:value-of select="concat('      ', $vNodeNameLocal, '.getOrCreate(', '&quot;', $vElementName, '&quot;)', '.text(', xdd:checkForClassType(xdd:createCamelizedName($vElementName)) , ');', '&#10;')"/>
                <xsl:value-of select="'      return this;&#10;'"/>
                <xsl:text>   }&#10;</xsl:text>
            </xsl:otherwise>
        </xsl:choose>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes a get method          *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeGetMethodSignature">
        <xsl:param name="vClassType"/>
        <xsl:param name="vElementType"/>
        <xsl:param name="vMethodName"/>
        <xsl:param name="vElementName"/>
        <xsl:param name="vMaxOccurs"/>
        <xsl:param name="vIsInterface" as="xs:boolean"/>
        <xsl:param name="vIsComplexType"/>
        <xsl:param name="vNodeNameLocal"/>

        <xsl:value-of select="concat('   public ', xdd:createPascalizedName($vElementType,''), ' get', xdd:checkForClassType($vMethodName), '()')"/>
        <xsl:choose>
            <xsl:when test="$vIsInterface=true()">
                <xsl:value-of select="';'"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>   {&#10;</xsl:text>
                <xsl:choose>
                    <xsl:when test="$vIsComplexType=true()">
                        <xsl:variable name="vConstructor" select="concat(substring-before($vElementType, '&lt;'), 'Impl&lt;', $vClassType, '&gt;')"/>
                        <xsl:value-of select=" concat('      if( ', xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ' == null)' , '&#10;')"/>
                        <xsl:value-of select=" concat('      {', '&#10;')"/>
                        <xsl:value-of select=" concat('          ', xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ' = new ', $vConstructor, '(this, &quot;&quot;, ', $vNodeNameLocal, ');', '&#10;')"/>
                        <xsl:value-of select=" concat('      }', '&#10;')"/>
                        <xsl:value-of select=" concat('      return ', xdd:createCamelizedName($vElementName), ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select=" concat('      return ', xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ';' , '&#10;')"/>
                    </xsl:otherwise>
                </xsl:choose>
                <xsl:text>   }&#10;</xsl:text>
            </xsl:otherwise>
        </xsl:choose>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the imports           *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeImports">
        <xsl:param name="vIsApi" as="xs:boolean"/>

        <xsl:choose>
            <xsl:when test="$vIsApi=true()">
                <xsl:for-each select="$gPackageApis">
                    <xsl:value-of select="concat('import ', @name, '.*;&#10;')"/>
                </xsl:for-each>
            </xsl:when>
            <xsl:otherwise>
                <xsl:for-each select="$gPackageImpls">
                    <xsl:value-of select="concat('import ', @name, '.*;&#10;')"/>
                </xsl:for-each>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which checks for 'class' type      *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:checkForClassType">
        <xsl:param name="vMethodName"/>
        <xsl:choose>
            <xsl:when test="$vMethodName='class'">
                <xsl:sequence select="'clazz'"/>
            </xsl:when>
            <xsl:when test="$vMethodName='Class'">
                <xsl:sequence select="'Clazz'"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:sequence select="$vMethodName"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which checks an enum type          *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:isEnumType" as="xs:boolean">
        <xsl:param name="pType" as="xs:string"/>

        <xsl:choose>
            <xsl:when test=" contains($pType, ':')">
                <xsl:value-of select="xdd:isEnumType(substring-after($pType, ':'))"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:sequence select="boolean($gEnums/descendant-or-self::node()/@name = $pType)"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which checks a data type           *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:isDataType" as="xs:boolean">
        <xsl:param name="pType" as="xs:string"/>

        <xsl:choose>
            <xsl:when test="starts-with($pType, 'xsd:')">
                <xsl:sequence select="boolean(true())"/>
            </xsl:when>
            <xsl:when test="contains($pType, ':')">
                <xsl:sequence select="$gDataTypes/descendant-or-self::node()/@name = substring-after($pType, ':')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:sequence select="boolean($gDataTypes/descendant-or-self::node()/@name = $pType)"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which checks the type and return   *** -->
    <!-- ****** a java data type, if possible               *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:CheckDataType" as="xs:string">
        <xsl:param name="pTypeName"/>

        <xsl:choose>
            <xsl:when test=" starts-with($pTypeName, 'xsd:')">
                <xsl:sequence select="xdd:getJavaDataType($pTypeName)"/>
            </xsl:when>

            <xsl:when test="starts-with($pTypeName, 'javaee:')">
                <xsl:sequence select="xdd:CheckDataType( substring-after($pTypeName, 'javaee:'))"/>
            </xsl:when>

            <xsl:otherwise>
                <xsl:for-each select="$gDataTypes/datatype">
                    <xsl:if test="@name=$pTypeName">
                        <xsl:if test="starts-with(@mappedTo, 'xsd:')">
                            <xsl:sequence select="xdd:getJavaDataType(@mappedTo)"/>
                        </xsl:if>

                        <xsl:if test="starts-with(@mappedTo, 'javaee:')">
                            <xsl:sequence select="xdd:CheckDataType(substring-after(@mappedTo, 'javaee:'))"/>
                        </xsl:if>
                    </xsl:if>
                </xsl:for-each>

            </xsl:otherwise>

        </xsl:choose>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which returns a java data type     *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:getJavaDataType" as="xs:string">
        <xsl:param name="pText" as="xs:string"/>

        <xsl:choose>
            <xsl:when test="$pText='xsd:long'">
                <xsl:sequence select="'Long'"/>
            </xsl:when>
            <xsl:when test="$pText='xsd:integer'">
                <xsl:sequence select="'Integer'"/>
            </xsl:when>
            <xsl:when test="$pText='xsd:string'">
                <xsl:sequence select="'String'"/>
            </xsl:when>
            <xsl:when test="$pText='xsdIntegerType'">
                <xsl:sequence select="'Integer'"/>
            </xsl:when>
            <xsl:when test="$pText='xsd:positiveInteger'">
                <xsl:sequence select="'Integer'"/>
            </xsl:when>
            <xsl:when test="$pText='positiveInteger'">
                <xsl:sequence select="'Integer'"/>
            </xsl:when>
            <xsl:when test="$pText='nonNegativeInteger'">
                <xsl:sequence select="'Integer'"/>
            </xsl:when>
            <xsl:when test="$pText='xsd:nonNegativeInteger'">
                <xsl:sequence select="'Integer'"/>
            </xsl:when>
            <xsl:when test="$pText='integer'">
                <xsl:sequence select="'Integer'"/>
            </xsl:when>
            <xsl:when test="$pText='xsdStringType'">
                <xsl:sequence select="'String'"/>
            </xsl:when>
            <xsl:when test="$pText='string'">
                <xsl:sequence select="'String'"/>
            </xsl:when>
            <xsl:when test="$pText='xsd:QName'">
                <xsl:sequence select="'String'"/>
            </xsl:when>
            <xsl:when test="$pText='xsd:anyURI'">
                <xsl:sequence select="'String'"/>
            </xsl:when>
            <xsl:when test="$pText='xsd:NMTOKEN'">
                <xsl:sequence select="'String'"/>
            </xsl:when>
            <xsl:when test="$pText='xsd:NCName'">
                <xsl:sequence select="'String'"/>
            </xsl:when>
            <xsl:when test="$pText='xsd:token'">
                <xsl:sequence select="'String'"/>
            </xsl:when>
            <xsl:when test="$pText='nonEmptyStringType'">
                <xsl:sequence select="'String'"/>
            </xsl:when>
            <xsl:when test="$pText='xsdBooleanType'">
                <xsl:sequence select="'Boolean'"/>
            </xsl:when>
            <xsl:when test="$pText='xsd:boolean'">
                <xsl:sequence select="'Boolean'"/>
            </xsl:when>
            <xsl:when test="$pText='token'">
                <xsl:sequence select="'String'"/>
            </xsl:when>
            <xsl:when test="$pText='long'">
                <xsl:sequence select="'Long'"/>
            </xsl:when>
            <xsl:when test="$pText='xsd:dateTime'">
                <xsl:sequence select="'java.util.Date'"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:sequence select="''"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>

</xsl:stylesheet>
