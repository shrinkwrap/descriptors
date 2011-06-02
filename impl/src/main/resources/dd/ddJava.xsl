<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:functx="http://www.functx.com" xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xs" version="2.0" xmlns:xdd="http://org.jboss/shrinkwrap">
    <!--    <xsl:output method="text"/>-->
    <xsl:output method="text" indent="yes" media-type="text/plain"/>

    <xsl:variable name="vLower" select="'abcdefghijklmnopqrstuvwxyz'"/>
    <xsl:variable name="vUpper" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'"/>
    <xsl:variable name="gDataTypes" select="//datatypes"/>
    <xsl:variable name="gEnums" select="//enums"/>
    <xsl:variable name="gGroups" select="//groups"/>

    <xsl:template match="/">
        <xsl:call-template name="GenerateEnums"/>
        <!--  <xsl:call-template name="<!-\-GenerateGroups-\->"/>-->
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
            <xsl:variable name="vFilename" select="xdd:createPath('..', @package, $vClassname, 'java')"/>

            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writePackageLine(@package)"/>
                <xsl:value-of select="xdd:classHeaderComment('')"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('enum', $vClassname)"/>

                <xsl:text>&#10;</xsl:text>
                <xsl:text>{</xsl:text>
                <xsl:text>&#10;</xsl:text>

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
                <xsl:text>&#10;</xsl:text>
                <xsl:text>}</xsl:text>
                <xsl:text>&#10;</xsl:text>
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
        <xsl:variable name="vFilename" select="xdd:createPath('..', @packageApi, $vClassname, 'java')"/>

        <xsl:if test="$vClassname=''">
            <xsl:value-of select="'cannot process'"/>: <xsl:value-of select=" name()"/>: <xsl:value-of select="position()"/>
            <xsl:text>&#10;</xsl:text>
        </xsl:if>

        <xsl:if test="$vClassname">
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
                    <xsl:value-of select="xdd:includeGroupRefs($vClassname, text())"/>
                </xsl:for-each>

                <xsl:for-each select="element">
                    <xsl:variable name="vMaxOccurs" select="concat('-',  @maxOccurs)"/>
                    <xsl:choose>
                        <xsl:when test="@type='javaee:ejb-relationship-roleType' and position()=4"/>
                        <xsl:otherwise>
                            <xsl:value-of select="xdd:writeMethodOrAttribute($vClassname, @name, @type, $vMaxOccurs, false())"/>
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
        <xsl:message select="concat('Generating DescriptorApi: ', $vClassname)"/>
        <xsl:if test="$vClassname">
            <xsl:variable name="vFilename" select="xdd:createPath('..', $vPackage, $vClassname, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.api.Descriptor;</xsl:text>
                <xsl:value-of select="xdd:classHeaderComment('')"/>
                <xsl:value-of select="xdd:classNodeInfo($pDescriptor/element/@name)"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('interface', $vClassname)"/>

                <xsl:text> extends Descriptor, </xsl:text>
                <xsl:variable name="vExtendsInterface" select="xdd:createPascalizedName($pDescriptor/element/@type, ' ')"/>
                <xsl:value-of select="$vExtendsInterface"/>
                <xsl:text>&lt;</xsl:text>
                <xsl:value-of select="$vClassname"/>
                <xsl:text>&gt;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>{</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>}</xsl:text>
                <xsl:text>&#10;</xsl:text>
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
            <xsl:variable name="vFilename" select="xdd:createPath('..', $vPackage, $vClassnameImpl, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.spi.Node;&#10;</xsl:text>
                <xsl:value-of select="xdd:classHeaderComment('')"/>
                <!--                <xsl:value-of select="xdd:classNodeInfo($pClass/element/@name)"/>-->
                <xsl:value-of select="xdd:classHeaderDeclaration('class', $vClassnameImpl)"/>
                <xsl:text>&lt;T&gt;</xsl:text>
                <xsl:text> implements Child&lt;T&gt;, </xsl:text>
                <xsl:value-of select="xdd:createPascalizedName($vInterfaceName, '&lt;T&gt;')"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>{</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select=" xdd:writeAttribute('T', 't', boolean(true))"/>
                <xsl:value-of select=" xdd:writeAttribute('Node', 'node', boolean(true))"/>
                <xsl:text>&#10;</xsl:text>

                <!-- write all remaining attributes -->
                <xsl:for-each select="element">
                     <xsl:value-of select="xdd:writeMethodOrAttribute($vInterfaceName, @name, @type, '-', true())"/>
                </xsl:for-each>

                <xsl:value-of select=" xdd:writeImplClassConstructor($vClassnameImpl)"/>
                <xsl:value-of select="xdd:writeChildUp()"/>

                <xsl:for-each select="include">
                    <xsl:value-of select="xdd:includeGroupRefs($vInterfaceName, text())"/>
                </xsl:for-each>

                <xsl:for-each select="element">
                    <xsl:variable name="vMaxOccurs" select="concat('-',  @maxOccurs)"/>
                    <xsl:choose>
                        <xsl:when test="@type='javaee:ejb-relationship-roleType' and position()=4"/>
                        <xsl:otherwise>
                            <xsl:value-of select="xdd:writeMethodOrAttribute($vInterfaceName, @name, @type, $vMaxOccurs, false())"/>
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
        <xsl:variable name="vInterfaceName" select="xdd:createPascalizedName($pDescriptor/@schemaName, 'Descriptor')"/>
        <xsl:variable name="vClassnameImpl" select="xdd:createPascalizedName($pDescriptor/@schemaName, 'DescriptorImpl')"/>
        <xsl:message select="concat('Generating DescriptorImpl: ', $vClassnameImpl)"/>
        <xsl:if test="$vClassnameImpl">
            <xsl:variable name="vFilename" select="xdd:createPath('..', $vPackage, $vClassnameImpl, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select="xdd:classHeaderComment('')"/>
                <xsl:value-of select="xdd:classNodeInfo($pDescriptor/element/@name)"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('class', $vClassnameImpl)"/>
                <xsl:text> extends NodeProviderImplBase implements </xsl:text>
                <xsl:value-of select="xdd:createPascalizedName($vInterfaceName, ' ')"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>{</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select=" xdd:writeAttribute('Node', 'model', boolean(true))"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select="xdd:writeDescriptorImplConstructor($vClassnameImpl)"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>}</xsl:text>
                <xsl:text>&#10;</xsl:text>
            </xsl:result-document>
        </xsl:if>
    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ******             UTILITIES SECTION             ***** -->
    <!-- ****************************************************** -->

    <xsl:template name="PrintDataType">
        <xsl:param name="pDataType"/>
        <xsl:param name="pClassName"/>

        <xsl:variable name="pJavaObject" select="$pDataType"/>
        <xsl:choose>
            <xsl:when test="starts-with($pJavaObject, 'xsd:')">
                <xsl:call-template name="JavaTypeMapping">
                    <xsl:with-param name="pText" select="$pJavaObject"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:when test="contains($pDataType, ':')">
                <xsl:variable name="pJavaObject" select="substring-after($pJavaObject, ':')"/>
                <xsl:call-template name="PrintDataType">
                    <xsl:with-param name="pDataType" select="$pJavaObject"/>
                    <xsl:with-param name="pClassName" select="$pClassName"/>
                </xsl:call-template>
            </xsl:when>

            <xsl:when test="$pJavaObject='protocol-bindingType'">
                <xsl:text>String</xsl:text>
            </xsl:when>
            <xsl:when test="count(//enum[@complexTypeName=$pJavaObject]) = 1">
                <xsl:call-template name="Pascalize">
                    <xsl:with-param name="pText" select="$pJavaObject"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:otherwise>
                <xsl:variable name="vMappedTo" select="//datatype[@name=$pJavaObject]/@mappedTo"/>
                <xsl:choose>
                    <xsl:when test="$vMappedTo">
                        <xsl:choose>
                            <xsl:when test="starts-with($vMappedTo, 'xsd:')">
                                <xsl:call-template name="JavaTypeMapping">
                                    <xsl:with-param name="pText" select="$vMappedTo"/>
                                </xsl:call-template>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:call-template name="PrintDataType">
                                    <xsl:with-param name="pDataType" select="$vMappedTo"/>
                                    <xsl:with-param name="pClassName" select="$pClassName"/>
                                </xsl:call-template>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:call-template name="Pascalize">
                            <xsl:with-param name="pText" select="$pJavaObject"/>
                        </xsl:call-template>
                        <xsl:text>&lt;</xsl:text>
                        <xsl:value-of select="$pClassName"/>
                        <xsl:text>&gt;</xsl:text>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:otherwise>
        </xsl:choose>

    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ****** Template which generates pascalize names ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="Pascalize">
        <xsl:param name="pText"/>

        <xsl:choose>
            <xsl:when test="$pText='class'">
                <xsl:value-of select="'Clazz'"/>
            </xsl:when>
            <xsl:when test="$pText!=''">
                <xsl:value-of select="translate(substring($pText,1,1), $vLower, $vUpper)"/>
                <xsl:choose>
                    <xsl:when test="contains($pText, '-')">
                        <xsl:value-of select="substring-before(substring($pText,2), '-')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="substring($pText,2)"/>
                    </xsl:otherwise>
                </xsl:choose>
                <xsl:call-template name="Pascalize">
                    <xsl:with-param name="pText" select="substring-after(substring($pText,2), '-')"/>
                </xsl:call-template>
            </xsl:when>
        </xsl:choose>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates pascalize names ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="Camalize">
        <xsl:param name="pText"/>

        <xsl:choose>
            <xsl:when test="$pText='class'">
                <xsl:value-of select="'Clazz'"/>
            </xsl:when>
            <xsl:when test="$pText!=''">
                <xsl:value-of select="translate(substring($pText,1,1), $vUpper, $vLower)"/>
                <xsl:choose>
                    <xsl:when test="contains($pText, '-')">
                        <xsl:value-of select="substring-before(substring($pText,2), '-')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="substring($pText,2)"/>
                    </xsl:otherwise>
                </xsl:choose>
                <xsl:call-template name="Pascalize">
                    <xsl:with-param name="pText" select="substring-after(substring($pText,2), '-')"/>
                </xsl:call-template>
            </xsl:when>
        </xsl:choose>
    </xsl:template>


    <xsl:template name="JavaTypeMapping">
        <xsl:param name="pText"/>

        <xsl:choose>
            <xsl:when test="$pText='xsd:long'">
                <xsl:text>Long</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsd:integer'">
                <xsl:text>Integer</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsd:string'">
                <xsl:text>String</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsdIntegerType'">
                <xsl:text>Integer</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='positiveInteger'">
                <xsl:text>Integer</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='nonNegativeInteger'">
                <xsl:text>Integer</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsd:nonNegativeInteger'">
                <xsl:text>Integer</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='integer'">
                <xsl:text>Integer</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsdStringType'">
                <xsl:text>String</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='string'">
                <xsl:text>String</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsd:QName'">
                <xsl:text>String</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsd:anyURI'">
                <xsl:text>String</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsd:NMTOKEN'">
                <xsl:text>String</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsd:NCName'">
                <xsl:text>String</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsd:token'">
                <xsl:text>String</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='nonEmptyStringType'">
                <xsl:text>String</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsdBooleanType'">
                <xsl:text>Boolean</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsd:boolean'">
                <xsl:text>Boolean</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='token'">
                <xsl:text>String</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='long'">
                <xsl:text>Long</xsl:text>
            </xsl:when>
            <xsl:when test="$pText='xsd:dateTime'">
                <xsl:text>java.util.Date</xsl:text>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="$pText"/>
            </xsl:otherwise>
        </xsl:choose>

    </xsl:template>


    <xsl:function name="functx:words-to-camel-case" as="xs:string" xmlns:functx="http://www.functx.com">
        <xsl:param name="arg" as="xs:string?"/>

        <xsl:sequence select=" 
            string-join((tokenize($arg,'\s+')[1],
            for $word in tokenize($arg,'\s+')[position() > 1]
            return functx:capitalize-first($word))
            ,'')
            "/>

    </xsl:function>


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
        <xsl:text>   // -------------------------------------------------------------------------------------||</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   // Constructor -------------------------------------------------------------------------||</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   // -------------------------------------------------------------------------------------||</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   public ', $pClassName, '(String descriptorName)')"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   {</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:variable name="nodeExtractor" select="concat('NodeInfoExtractor.getNodeInfo(', $pClassName, '.class)')"/>
        <xsl:value-of select="concat('       this(descriptorName, new Node(', $nodeExtractor , ');')"/>
        <xsl:text>&#10;</xsl:text>

        <!--        <xsl:value-of select="'       this(descriptorName, new Node(nodeName);'"/><xsl:text>&#10;</xsl:text>-->
        <!--
        <xsl:text>         .attribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")</xsl:text><xsl:text>&#10;</xsl:text>
        <xsl:text>         .attribute("xsi:schemaLocation",</xsl:text><xsl:text>&#10;</xsl:text>
        <xsl:text>         "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"));</xsl:text><xsl:text>&#10;</xsl:text>-->
        <!-- <xsl:text>       version("3.0");</xsl:text><xsl:text>&#10;</xsl:text>-->
        <xsl:text>   }</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   public ', $pClassName, '(String descriptorName, Node model)')"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   {</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>      super(descriptorName);</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>      this.model = model;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   }</xsl:text>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>



    <!-- ****************************************************** -->
    <!-- ****** Function which writes the package line   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeImplClassConstructor">
        <xsl:param name="pClassName"/>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>   // Constructor -------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>   // -------------------------------------------------------------------------------------||&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   public ', $pClassName, '(T t, String descriptorName, Node descrNode, Node child)')"/>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:text>      this.t = t;&#10;</xsl:text>
        <xsl:text>      this.node = child;&#10;</xsl:text>
        <xsl:text>   }&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
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
            <xsl:text>// -------------------------------------------------------------------------------------||</xsl:text>
            <xsl:text>// Instance Members --------------------------------------------------------------------||</xsl:text>
            <xsl:text>// -------------------------------------------------------------------------------------||</xsl:text>
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

        <xsl:variable name="vGroupName" select=" substring-after($pGroupName, ':')"/>
        <xsl:message select="concat('include:', $vGroupName)"/>
        <xsl:for-each select="$gGroups/class[@name=$vGroupName]/element">
            <xsl:message select="concat('element found:', @name)"/>
            <xsl:variable name="vMaxOccurs" select="concat('-', @maxOccurs)"/>
            <xsl:value-of select=" xdd:writeMethodOrAttribute($pClassname, @name, @type, $vMaxOccurs, false())"/>
            <xsl:text>&#10;</xsl:text>
        </xsl:for-each>

        <xsl:for-each select="$gGroups/class[@name=$vGroupName]/include">
            <xsl:value-of select="xdd:includeGroupRefs($pClassname, text())"/>
        </xsl:for-each>

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

        <!--        <xsl:value-of select="concat('processing: ', $pElementName)"/>-->
        <xsl:variable name="vMethodName" select="xdd:createPascalizedName($pElementName,'')"/>
        <xsl:variable name="vReturn" select=" xdd:createPascalizedName($pClassName, '&lt;T&gt;')"/>

<xsl:message select="concat('writeAttribute:', $pWriteAttribute)"></xsl:message>
        <xsl:choose>
            <xsl:when test="$pElementType='javaee:emptyType' or $pElementType='javaee:ordering-othersType' or 
                            $pElementType='faces-config-ordering-othersType' or $pElementType='extensibleType'">
                <xsl:choose>
                    <xsl:when test="$pWriteAttribute=true()">
                        <xsl:value-of select="concat('   private ', $vReturn, ' ', xdd:createCamelizedName($pElementName), ';')"/>
                        <xsl:text>&#10;</xsl:text>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:classNodeInfo($pElementName)"/>
                        <xsl:value-of select="concat('   public ', $vReturn, ' ', xdd:createCamelizedName($pElementName), '();')"/>
                        <xsl:text>&#10;</xsl:text>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="xdd:isEnumType($pElementType)">
                <xsl:choose>
                    <xsl:when test="$pWriteAttribute=true()">
                        <xsl:value-of select="concat('   public ', $vReturn, ' ', xdd:createCamelizedName($pElementName), '();')"/>
                        <xsl:text>&#10;</xsl:text>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, $pElementType, $pElementName, $pMaxOccurs, true())"/>
                        <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, 'String', $pElementName, '-', true())"/>
                        <xsl:value-of select="xdd:writeGetMethodSignature('String', concat($vMethodName, ''), $pElementName, '-', true())"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="xdd:isDataType($pElementType)">
                <xsl:variable name="vDataType" select="xdd:CheckDataType($pElementType)"/>
                <xsl:if test="$pElementType='javaee:fully-qualified-classType'">
                    <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, 'Class&lt;?&gt;', $pElementName, $pMaxOccurs, true())"/>
                    <!--                    <xsl:value-of select="xdd:writeGetMethodSignature('Class&lt;?&gt;', $vMethodName, $pMaxOccurs, true())"/>-->
                    <xsl:text>&#10;</xsl:text>
                </xsl:if>
                <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, $vDataType, $pElementName, $pMaxOccurs, true())"/>
                <xsl:value-of select="xdd:writeGetMethodSignature($vDataType, $vMethodName, $pElementName, $pMaxOccurs, true())"/>
            </xsl:when>

            <xsl:otherwise>
                <!-- it is a complex type -->

                <xsl:variable name="vReturnGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&lt;T&gt;&gt;'))"/>
                <xsl:variable name="vElementTypeGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&lt;T&gt;&gt;'))"/>
                <!--   <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, $vElementTypeGeneric, $pElementName, $pMaxOccurs, true())"/>
                <xsl:value-of select="xdd:writeGetMethodSignature($vReturnGeneric, $vMethodName, $pMaxOccurs, true())"/>-->

                <xsl:value-of select="xdd:classNodeInfo($pElementName)"/>
                <xsl:value-of select="concat('   public ', $vReturnGeneric, ' ', xdd:createCamelizedName($pElementName), '();')"/>
                <xsl:text>&#10;</xsl:text>
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

        <xsl:variable name="vClassType" select="xdd:createPascalizedName($vElementType,'')"/>
        <xsl:value-of select="concat('   public ', $vReturnType, ' set', xdd:checkForClassType($vMethodName), '(',  xdd:createPascalizedName($vElementType,''),' ',xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ')')"/>
        <xsl:if test="$vIsInterface">
            <xsl:value-of select="';'"/>
        </xsl:if>
        <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes a get method          *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeGetMethodSignature">
        <xsl:param name="vElementType"/>
        <xsl:param name="vMethodName"/>
        <xsl:param name="vElementName"/>
        <xsl:param name="vMaxOccurs"/>
        <xsl:param name="vIsInterface" as="xs:boolean"/>
        <xsl:value-of select="xdd:classNodeInfo($vElementName)"/>
        <xsl:value-of select="concat('   public ', xdd:createPascalizedName($vElementType,''), ' get', xdd:checkForClassType($vMethodName), '()')"/>
        <xsl:if test="$vIsInterface">
            <xsl:value-of select="';'"/>
        </xsl:if>
        <xsl:text>&#10;</xsl:text>
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
        <xsl:message select="concat('processing isEnumType:', $pType)"/>
        <xsl:message select="concat(':result:', boolean($gEnums/descendant-or-self::node()/@name = $pType))"/>
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
        <xsl:message select="concat('processing isDataType:', $pType)"/>

        <xsl:choose>
            <xsl:when test="starts-with($pType, 'xsd:')">
                <xsl:sequence select="boolean(true())"/>
            </xsl:when>
            <xsl:when test="contains($pType, ':')">
                <xsl:message select="$gDataTypes/descendant-or-self::node()/@name = substring-after($pType, ':')"/>
                <xsl:sequence select="$gDataTypes/descendant-or-self::node()/@name = substring-after($pType, ':')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:message select="boolean($gDataTypes/descendant-or-self::node()/@name = $pType)"/>
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
            <!--
            <xsl:message select="concat('CheckDataType: cannot find data type: ', $pTypeName)"/>

            <!-\- not found! -\->
            <xsl:sequence select="''"/>-->
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
