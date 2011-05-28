<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:functx="http://www.functx.com" xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xs" version="2.0" xmlns:xdd="http://org.jboss/shrinkwrap">
    <!--    <xsl:output method="text"/>-->
    <xsl:output method="text" indent="yes" media-type="text/plain"/>

    <xsl:variable name="vLower" select="'abcdefghijklmnopqrstuvwxyz'"/>
    <xsl:variable name="vUpper" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'"/>

    <xsl:template match="/">
        <xsl:call-template name="GenerateEnums"/>
        <xsl:call-template name="GenerateGroups"/>
        <xsl:call-template name="GenerateInterfaces"/>
        <xsl:call-template name="GenerateDescriptors"/>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the interfaces   ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateInterfaces">
        <xsl:for-each select="//classes/class">
            <xsl:call-template name="WriteInterface">
                <xsl:with-param name="pClass" select="."/>
            </xsl:call-template>
        </xsl:for-each>
    </xsl:template>


    <!-- ******************************************************* -->
    <!-- ****** Template which generates the enumerations ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="GenerateEnums">
        <xsl:param name="pTypeName" select="."/>
        <xsl:for-each select="//enums/enum">

            <xsl:variable name="vClassname" select="xdd:createClassName(@name, '')"/>
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

            <xsl:call-template name="WriteInterface">
                <xsl:with-param name="pClass" select="."/>
            </xsl:call-template>

        </xsl:for-each>
    </xsl:template>



    <!-- ******************************************************* -->
    <!-- ****** Template which generates the interfaces ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteInterface">
        <xsl:param name="pClass"/>

        <xsl:variable name="vClassname" select="replace($pClass/@name,'-',' ')"/>
        <xsl:variable name="vClassname" select="functx:words-to-camel-case($vClassname)"/>
        <xsl:variable name="vClassnameP" select="concat(upper-case(substring($vClassname,1,1)), substring($vClassname,2))"/>
        <xsl:variable name="vClassname" select="concat(upper-case(substring($vClassname,1,1)), substring($vClassname,2), '&lt;T&gt;')"/>

        <xsl:if test="$vClassnameP">

            <xsl:variable name="path" select="replace(@package,'\.','/')"/>
            <xsl:variable name="filename" select="concat('../', $path,'/' , $vClassnameP,'.java')"/>
            <xsl:value-of select="$filename"/>
            <xsl:result-document href="{$filename}">
                <xsl:text>package </xsl:text><xsl:value-of select="@package"/>; <xsl:text>&#10;</xsl:text>
                <xsl:text>public interface </xsl:text>
                <xsl:value-of select="$vClassname"/>
                <xsl:text> extends Child&lt;T&gt;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:for-each select="include">
                    <xsl:variable name="vClassnamePlain" select="text()"/>
                    <xsl:variable name="vClassnamePlain" select="concat(upper-case(substring($vClassnamePlain,1,1)), substring($vClassnamePlain,2))"/>
                    <xsl:text>, </xsl:text>
                    <xsl:call-template name="PrintDataType">
                        <xsl:with-param name="pDataType" select="text()"/>
                        <xsl:with-param name="pClassName" select="'T'"/>
                    </xsl:call-template>
                    <xsl:if test="position() = last()">
                        <xsl:text>&#10;</xsl:text>
                    </xsl:if>
                </xsl:for-each>
                <xsl:text>{</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:for-each select="element">
                    <xsl:variable name="vMethodName" select="replace(@name,'-',' ')"/>
                    <xsl:variable name="vMethodName" select="functx:words-to-camel-case($vMethodName)"/>
                    <!-- **** generate set element **** -->
                    <xsl:choose>
                        <xsl:when test="@type='javaee:emptyType' or @type='javaee:ordering-othersType' or @type='faces-config-ordering-othersType' or @type='extensibleType'">
                            <xsl:text>   public void </xsl:text>
                            <xsl:call-template name="Camalize">
                                <xsl:with-param name="pText" select="@name"/>
                            </xsl:call-template>
                            <xsl:text>();</xsl:text>
                            <xsl:text>&#10;</xsl:text>
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:text>   public </xsl:text>
                            <xsl:value-of select="$vClassname"/>
                            <xsl:text> set</xsl:text>
                            <xsl:call-template name="Pascalize">
                                <xsl:with-param name="pText" select="@name"/>
                            </xsl:call-template>
                            <xsl:text>(</xsl:text>
                            <xsl:call-template name="PrintDataType">
                                <xsl:with-param name="pDataType" select="@type"/>
                                <xsl:with-param name="pClassName" select="'T'"/>
                            </xsl:call-template>
                            <xsl:text> </xsl:text>
                            <xsl:choose>
                                <xsl:when test="$vMethodName='class'">
                                    <xsl:text>clzz</xsl:text>
                                </xsl:when>
                                <xsl:otherwise>
                                    <xsl:value-of select="$vMethodName"/>
                                </xsl:otherwise>
                            </xsl:choose>
                            <xsl:text>);</xsl:text>
                            <xsl:text>&#10;</xsl:text>
                            <!-- **** generate get element **** -->
                            <xsl:text>   public </xsl:text>
                            <xsl:call-template name="PrintDataType">
                                <xsl:with-param name="pDataType" select="@type"/>
                                <xsl:with-param name="pClassName" select="$vClassname"/>
                            </xsl:call-template>
                            <xsl:text> </xsl:text>
                            <xsl:text>get</xsl:text>
                            <xsl:call-template name="Pascalize">
                                <xsl:with-param name="pText" select="@name"/>
                            </xsl:call-template>
                            <xsl:text>();</xsl:text>
                            <xsl:text>&#10;</xsl:text>
                        </xsl:otherwise>
                    </xsl:choose>
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


    <!-- ******************************************************* -->
    <!-- ****** Template which generates the descriptors  ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteDescriptor">
        <xsl:param name="pDescriptor" select="."/>

        <xsl:variable name="vPackage" select="./@package"/>
        <xsl:variable name="vClassname" select="xdd:createClassName($pDescriptor/@schemaName, 'Descriptor')"/>
        <xsl:if test="$vClassname">
            <xsl:variable name="vFilename" select="xdd:createPath('..', $vPackage, $vClassname, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select="xdd:classHeaderComment('')"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('interface', $vClassname)"/>

                <xsl:text> extends </xsl:text>
                <xsl:variable name="vExtendsInterface" select="xdd:createClassName($pDescriptor/element/@type, ' ')"/>
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
                <xsl:variable name="vMappedTo" select="//datatype[@complexTypeName=$pJavaObject]/@mappedTo"/>
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
    <xsl:function name="xdd:createClassName">
        <xsl:param name="name"/>
        <xsl:param name="extension"/>

        <xsl:variable name="retValue" select="xdd:normalizeString($name)"/>
        <xsl:variable name="retValue" select="functx:words-to-camel-case($retValue)"/>
        <xsl:variable name="retValue" select="concat(upper-case(substring($retValue,1,1)), substring($retValue,2))"/>

        <xsl:choose>
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
    <xsl:function name="xdd:createTypeName">
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
        <xsl:value-of select="xdd:createClassName($className, '')"/>
    </xsl:function>
</xsl:stylesheet>
