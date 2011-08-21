<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:functx="http://www.functx.com" xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xs" version="2.0" xmlns:xdd="http://org.jboss/shrinkwrap">
    <!--    <xsl:output method="text"/>-->

    <xsl:output method="text" indent="yes" media-type="text/plain"/>
    <xsl:param name="gOutputFolder" select="'../../../../../impl-gen/src/main/java'"/>
    <xsl:param name="gOutputFolderApi" select="'../../../../../api/src/main/java'"/>
    <xsl:param name="gOutputFolderTest" select="'../../../../../impl-gen/src/test/java'"/>
    <xsl:variable name="vLower" select="'abcdefghijklmnopqrstuvwxyz'"/>
    <xsl:variable name="vUpper" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'"/>
    <xsl:variable name="gDataTypes" select="//datatypes"/>
    <xsl:variable name="gEnums" select="//enums"/>
    <xsl:variable name="gGroups" select="//groups"/>
    <xsl:variable name="gClasses" select="//classes"/>
    <xsl:variable name="gPackageApis" select="//packages/api"/>
    <xsl:variable name="gPackageImpls" select="//packages/impl"/>
    <xsl:variable name="gCopyright" select="//copyright"/>
    <xsl:variable name="gContributors" select="//contributors"/>

    <xsl:template match="/">
        <xsl:call-template name="GenerateEnums"/>
        <xsl:call-template name="GenerateInterfaces"/>
        <xsl:call-template name="GenerateDescriptors"/>
        <xsl:call-template name="GenerateDescriptorsImpl"/>
        <xsl:call-template name="GenerateImplClasses"/>
        <xsl:call-template name="GenerateTestClasses"/>
        <xsl:call-template name="GeneratePackageInfos"/>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the interfaces   ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateInterfaces">
        <xsl:for-each select="//classes/class">
            <xsl:if test="xdd:isGenerateClassTrue(@packageApi)">
                <xsl:call-template name="WriteInterface2">
                    <xsl:with-param name="pClassNode" select="."/>
                </xsl:call-template>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>


    <!-- ******************************************************* -->
    <!-- ****** Template which generates the enumerations ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="GenerateEnums">
        <xsl:param name="pTypeName" select="."/>
        <xsl:for-each select="//enums/enum">
            <xsl:if test="xdd:isGenerateClassTrue(@package)">
                <xsl:variable name="vClassname" select="xdd:createPascalizedName(@name, '')"/>
                <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolderApi, @package, $vClassname, 'java')"/>
                <xsl:message select="concat('Generating Enum: ', $vClassname)"/>
                <xsl:result-document href="{$vFilename}">
                    <xsl:value-of select="xdd:writeCopyright()"/>
                    <xsl:value-of select="xdd:writePackageLine(@package)"/>
                    <xsl:value-of select="xdd:writeClassJavaDoc(@documentation, @name, false(), true())"/>
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
                    <xsl:text>&#10;&#10;</xsl:text>
                    <xsl:value-of select="concat('   public static ', $vClassname, ' getFromStringValue(String value)', '&#10;')"/>
                    <xsl:value-of select="concat('   {', '&#10;')"/>
                    <xsl:value-of select="concat('      for(', $vClassname, ' type: ', $vClassname, '.values())', '&#10;')"/>
                    <xsl:value-of select="concat('      {', '&#10;')"/>
                    <xsl:value-of select="concat('         if(value != null &amp;&amp; type.toString().equals(value))', '&#10;')"/>
                    <xsl:value-of select="concat('        { return type;}', '&#10;')"/>
                    <xsl:value-of select="concat('      }', '&#10;')"/>
                    <xsl:value-of select="concat('      return null;', '&#10;')"/>
                    <xsl:value-of select="concat('   }', '&#10;')"/>
                    <xsl:text>&#10;}&#10;</xsl:text>
                    <xsl:text>&#10;</xsl:text>
                </xsl:result-document>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>

    <!-- ******************************************************* -->
    <!-- ****** Template which generates the package-infos ***** -->
    <!-- ******************************************************* -->
    <xsl:template name="GeneratePackageInfos">
        <xsl:param name="pTypeName" select="."/>
        <xsl:for-each select="$gPackageApis[@generateClass!='false']">
            <xsl:variable name="vClassname" select="'package-info'"/>
            <xsl:variable name="vSchema" select=" substring-after(@schema, '../xsd/')"/>
            <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolderApi, @name, $vClassname,'java')"/>
            <xsl:message select="concat('Generating api package-info: ', $vFilename)"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="concat(' /**', '&#10;')"/>
                <xsl:value-of select="concat('  * Provides the interfaces and enumeration types as defined in the schema ', $vSchema, '&#10;')"/>
                <xsl:value-of select="concat('  */', '&#10;')"/>
                <xsl:value-of select="concat('', '&#10;')"/>
                <xsl:value-of select="concat('package ', @name, ';&#10;')"/>
            </xsl:result-document>
        </xsl:for-each>
        <xsl:for-each select="$gPackageImpls[@generateClass!='false']">
            <xsl:variable name="vClassname" select="'package-info'"/>
            <xsl:variable name="vSchema" select=" substring-after(@schema, '../xsd/')"/>
            <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolder, @name, $vClassname,'java')"/>
            <xsl:message select="concat('Generating impl package-info: ', $vFilename)"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="concat(' /**', '&#10;')"/>
                <xsl:value-of select="concat('  * Provides the implementation classes as defined in the schema ', $vSchema, '&#10;')"/>
                <xsl:value-of select="concat('  */', '&#10;')"/>
                <xsl:value-of select="concat('', '&#10;')"/>
                <xsl:value-of select="concat('package ', @name, ';&#10;')"/>
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
            <xsl:if test="xdd:isGenerateClassTrue(@package)">
                <xsl:call-template name="WriteInterface2">
                    <xsl:with-param name="pClassNode" select="."/>
                </xsl:call-template>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>


    <!-- ******************************************************* -->
    <!-- ****** Template which generates the interfaces2  ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteInterface2">
        <xsl:param name="pClassNode" select="."/>
        <xsl:variable name="vClassname" select="xdd:createPascalizedName($pClassNode/@name, '')"/>
        <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolderApi, @packageApi, $vClassname, 'java')"/>
        <xsl:if test="$vClassname=''">
            <xsl:value-of select="'cannot process'"/>: <xsl:value-of select=" name()"/>: <xsl:value-of select="position()"/>
            <xsl:text>&#10;</xsl:text>
        </xsl:if>
        <xsl:if test="$vClassname">
            <xsl:message select="concat('Generating Interface: ', $vClassname)"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writeCopyright()"/>
                <xsl:value-of select="xdd:writePackageLine(@packageApi)"/>
                <xsl:value-of select="xdd:writeImports(true())"/>
                <xsl:value-of select="xdd:writeDynamicImports($pClassNode/@name, $pClassNode/@namespace, true())"/>
                <xsl:value-of select="xdd:writeClassJavaDoc(@documentation, $pClassNode/@name, true(), true())"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('interface', $vClassname)"/>
                <xsl:text>&lt;T&gt;</xsl:text>
                <xsl:text> extends Child&lt;T&gt;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>{</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:for-each select="include">
                    <xsl:value-of select="xdd:includeGroupRefs($vClassname, @name, false(), true(), true(), '', @maxOccurs='unbounded')"/>
                </xsl:for-each>
                <xsl:for-each select="element">
                    <xsl:variable name="vMaxOccurs" select="concat('-',  @maxOccurs)"/>
                    <xsl:choose>
                        <xsl:when test="@type='javaee:ejb-relationship-roleType' and position()=4"/>
                        <xsl:otherwise>
                            <xsl:value-of select="xdd:writeMethodOrAttribute($vClassname, @name, @type, $vMaxOccurs, false(), true(), true(), '', exists(@attribute))"/>
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
            <xsl:if test="xdd:isGenerateClassTrue(@packageApi)">
                <xsl:call-template name="WriteImplClasses">
                    <xsl:with-param name="pClass" select="."/>
                </xsl:call-template>
            </xsl:if>

        </xsl:for-each>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the test classes  **** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateTestClasses">
        <xsl:for-each select="//classes/class">
            <xsl:if test="xdd:isGenerateClassTrue(@packageApi)">
                <xsl:call-template name="WriteTestClasses">
                    <xsl:with-param name="pClass" select="."/>
                    <xsl:with-param name="pPackage" select="@packageImpl"/>
                    <xsl:with-param name="pName" select="@name"/>
                    <xsl:with-param name="pIsDescriptor" select="'false'"/>
                </xsl:call-template>
            </xsl:if>
        </xsl:for-each>

        <xsl:for-each select="//descriptors/descriptor">
            <xsl:variable name="vPackageApi" select="@packageApi"/>
            <xsl:if test="xdd:isGenerateClassTrue(@packageApi)">
                <xsl:call-template name="WriteTestClasses">
                    <xsl:with-param name="pClass" select="."/>
                    <xsl:with-param name="pPackage" select="@packageImpl"/>
                    <xsl:with-param name="pName" select="xdd:createPascalizedName(@schemaName, 'Descriptor')"/>
                    <xsl:with-param name="pIsDescriptor" select="'true'"/>
                </xsl:call-template>
            </xsl:if>
        </xsl:for-each>

    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ****** Template which generates theimpl classes  * -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateTestDescriptorClasses">
        <xsl:for-each select="//descriptors/descriptor">
            <xsl:call-template name="WriteTestClasses">
                <xsl:with-param name="pClass" select="."/>
                <xsl:with-param name="pPackage" select="@packageImpl"/>
                <xsl:with-param name="pName" select="xdd:createPascalizedName(@schemaName, 'Descriptor')"/>
            </xsl:call-template>
        </xsl:for-each>

    </xsl:template>

    <!-- ******************************************************* -->
    <!-- ****** Template which generates the descriptors  ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteDescriptor">
        <xsl:param name="pDescriptor" select="."/>
        <xsl:variable name="vPackage" select="./@packageApi"/>
        <xsl:variable name="vSchema" select=" substring-after(@schemaName, '../xsd/')"/>
        <xsl:variable name="vClassname" select="xdd:createPascalizedName($pDescriptor/@schemaName, 'Descriptor')"/>
        <xsl:message select="concat('Generating Descriptor Api: ', $vClassname)"/>
        <xsl:if test="$vClassname">
            <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolderApi, $vPackage, $vClassname, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writeCopyright()"/>
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:value-of select="xdd:writeImports(true())"/>

                <xsl:for-each select="element">
                    <xsl:variable name="vType" select=" substring-after(./@type, ':')"/>
                    <xsl:variable name="vNamespace" select=" substring-before(./@type, ':')"/>
                    <xsl:value-of select="xdd:writeDynamicImports($vType, $vNamespace, true())"/>
                </xsl:for-each>

                <xsl:text>import org.jboss.shrinkwrap.descriptor.api.Descriptor;&#10;</xsl:text>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;&#10;&#10;</xsl:text>
                <xsl:value-of select=" xdd:writeDescriptorJavaDoc($vClassname, $vSchema)"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('interface', $vClassname)"/>
                <xsl:value-of select="concat(' extends Descriptor, DescriptorNamespace', '&lt;', $vClassname, '&gt;')"/>

                <!--                <xsl:text> extends Descriptor, DescriptorNamespace</xsl:text>-->
                <xsl:text>&#10;{&#10;</xsl:text>
                <xsl:variable name="vType" select=" substring-after($pDescriptor/element/@type, ':')"/>
                <xsl:variable name="vNamespace" select=" substring-before($pDescriptor/element/@type, ':')"/>
                <xsl:for-each select="//classes/class[@name=$vType and @namespace=$vNamespace]">
                    <xsl:for-each select="include">
                        <xsl:value-of select="xdd:includeGroupRefs($vClassname, @name, false(), true(), false(), '', @maxOccurs='unbounded')"/>
                    </xsl:for-each>
                    <xsl:for-each select="element">
                        <xsl:variable name="vMaxOccurs" select="concat('-',  @maxOccurs)"/>
                        <xsl:value-of select="xdd:writeMethodOrAttribute($vClassname, @name, @type, $vMaxOccurs, false(), true(), false(), '', false())"/>
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
                <xsl:value-of select="xdd:writeCopyright()"/>
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.spi.Node;&#10;</xsl:text>
                <xsl:value-of select="concat('import ', $pClass/@packageApi, '.', xdd:createPascalizedName($vInterfaceName,''), ';&#10;')"/>
                <xsl:value-of select="xdd:writeImports(true())"/>
                <xsl:value-of select="xdd:writeImports(false())"/>
                <xsl:value-of select="xdd:writeDynamicImports($pClass/@name, $pClass/@namespace, false())"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select="xdd:writeClassJavaDoc(@documentation, $pClass/@name, false(), true())"/>
                <xsl:variable name="vName" select="@name"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('class', $vClassnameImpl)"/>
                <xsl:text>&lt;T&gt;</xsl:text>
                <xsl:text> implements Child&lt;T&gt;, </xsl:text>
                <xsl:value-of select="xdd:createPascalizedName($vInterfaceName, '&lt;T&gt;')"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>{</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <!-- write constructor attributes -->
                <!--<xsl:call-template name="writeNodeName">
                    <xsl:with-param name="pTypeName" select="$vName"/>
                </xsl:call-template>-->
                <xsl:value-of select=" xdd:writeAttribute('T', 't', true())"/>
                <!--                <xsl:value-of select=" xdd:writeAttribute('Node', 'node', false())"/>-->
                <xsl:value-of select=" xdd:writeAttribute('Node', 'childNode', false())"/>
                <xsl:value-of select=" xdd:writeImplClassConstructor($vClassnameImpl, 'nodeName', 'childNode')"/>
                <xsl:value-of select="xdd:writeChildUp()"/>
                <xsl:for-each select="include">
                    <xsl:value-of select="xdd:includeGroupRefs($vInterfaceName, @name, false(), false(), true(), 'childNode', @maxOccurs='unbounded')"/>
                </xsl:for-each>
                <xsl:for-each select="element">
                    <xsl:variable name="vMaxOccurs" select="concat('-',  @maxOccurs)"/>
                    <xsl:choose>
                        <xsl:when test="@type='javaee:ejb-relationship-roleType' and position()=4"/>
                        <xsl:otherwise>
                            <xsl:value-of select="xdd:writeMethodOrAttribute($vInterfaceName, @name, @type, $vMaxOccurs, false(), false(), true(), 'childNode', exists(@attribute))"/>
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
        <xsl:variable name="vSchema" select=" substring-after(@schemaName, '../xsd/')"/>
        <xsl:variable name="vInterfaceName" select="xdd:createPascalizedName($pDescriptor/@schemaName, 'Descriptor')"/>
        <xsl:variable name="vClassnameImpl" select="xdd:createPascalizedName($pDescriptor/@schemaName, 'DescriptorImpl')"/>
        <xsl:message select="concat('Generating DescriptorImpl: ', $vClassnameImpl)"/>
        <xsl:if test="$vClassnameImpl">
            <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolder, $vPackage, $vClassnameImpl, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writeCopyright()"/>
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:value-of select="concat('import ', @packageApi, '.', xdd:createPascalizedName($vInterfaceName,''), ';&#10;')"/>
                <xsl:value-of select="xdd:writeImports(true())"/>
                <xsl:value-of select="xdd:writeImports(false())"/>

                <xsl:for-each select="element">
                    <xsl:variable name="vType" select=" substring-after(./@type, ':')"/>
                    <xsl:variable name="vNamespace" select=" substring-before(./@type, ':')"/>
                    <xsl:value-of select="xdd:writeDynamicImports($vType, $vNamespace, false())"/>
                </xsl:for-each>

                <xsl:text>import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;&#10;&#10;</xsl:text>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;&#10;</xsl:text>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;&#10;</xsl:text>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.spi.Node;&#10;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select=" xdd:writeDescriptorJavaDoc($vInterfaceName, $vSchema)"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('class', $vClassnameImpl)"/>
                <!--                <xsl:text> extends NodeProviderImplBase implements DescriptorNamespace, </xsl:text>-->
                <xsl:value-of select="concat(' extends NodeProviderImplBase implements DescriptorNamespace', '&lt;', $vInterfaceName, '&gt;', ', ')"/>
                <xsl:value-of select="xdd:createPascalizedName($vInterfaceName, '')"/>
                <xsl:text>&#10;{</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <!-- write all attributes -->
                <xsl:value-of select="xdd:writeAttribute('Node', $vNodeName, true())"/>
                <xsl:text>&#10;</xsl:text>
                <!-- write the constructor -->
                <xsl:value-of select="xdd:writeDescriptorImplConstructor($vClassnameImpl, $pDescriptor/element/@name, $vNodeName)"/>
                <xsl:value-of select="xdd:writeMethodComment()"/>
                <!-- write all methods -->
                <xsl:value-of select="xdd:writeNodeProviderMethods($vNodeName)"/>
                <xsl:value-of select="xdd:writeDescriptorNamespaceMethods($pDescriptor, $vInterfaceName)"/>
                <xsl:for-each select="element">
                    <xsl:variable name="vType" select=" substring-after(@type, ':')"/>
                    <xsl:for-each select="//classes/class[@name=$vType]">
                        <xsl:for-each select="element">
                            <xsl:variable name="vMaxOccurs" select="concat('-',  @maxOccurs)"/>
                            <xsl:value-of select="xdd:writeMethodOrAttribute($vInterfaceName, @name, @type, $vMaxOccurs, false(), false(), false(), $vNodeName, exists(@attribute))"/>
                        </xsl:for-each>
                        <xsl:for-each select="include">
                            <xsl:value-of select="xdd:includeGroupRefs($vInterfaceName, @name, false(), false(), false(), $vNodeName, @maxOccurs='unbounded')"/>
                        </xsl:for-each>
                    </xsl:for-each>
                </xsl:for-each>
                <xsl:text>&#10;}</xsl:text>
                <xsl:text>&#10;</xsl:text>
            </xsl:result-document>
        </xsl:if>
    </xsl:template>


    <!-- ******************************************************* -->
    <!-- ****** Template which generates the impl classes  ***** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteTestClasses">
        <xsl:param name="pClass" select="."/>
        <xsl:param name="pPackage"/>
        <xsl:param name="pName"/>
        <xsl:param name="pIsDescriptor"/>

        <xsl:variable name="vPackage" select="$pPackage"/>
        <xsl:variable name="vNodeName" select="$pName"/>
        <xsl:variable name="vInterfaceName" select="xdd:createPascalizedName($pName, '')"/>
        <xsl:variable name="vClassnameImpl" select="xdd:createPascalizedName($pName, 'Impl')"/>
        <xsl:variable name="vTestClassname" select="xdd:createPascalizedName($pName, 'ImplTestCase')"/>

        <xsl:message select="concat('Generating Test Class: ', $vTestClassname)"/>
        <xsl:if test="$vTestClassname">
            <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolderTest, $vPackage, $vTestClassname, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writeCopyright()"/>
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.spi.Node;&#10;</xsl:text>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;&#10;</xsl:text>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.api.Descriptors;</xsl:text>
                <xsl:text>import org.junit.Test;&#10;</xsl:text>
                <xsl:text>import static org.junit.Assert.*;&#10;</xsl:text>
                <xsl:value-of select="concat('import ', $pClass/@packageApi, '.', $vInterfaceName, ';&#10;')"/>
                <xsl:value-of select="xdd:writeImports(true())"/>
                <xsl:value-of select="xdd:writeImports(false())"/>

                <xsl:choose>
                    <xsl:when test="$pIsDescriptor='true'">
                        <xsl:for-each select="element">
                            <xsl:variable name="vType" select=" substring-after(./@type, ':')"/>
                            <xsl:variable name="vNamespace" select=" substring-before(./@type, ':')"/>
                            <xsl:value-of select="xdd:writeDynamicImports($vType, $vNamespace, false())"/>
                        </xsl:for-each>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:writeDynamicImports($pClass/@name, $pClass/@namespace, false())"/>
                    </xsl:otherwise>
                </xsl:choose>

                <xsl:text>&#10;</xsl:text>
                <!--                <xsl:variable name="vName" select="@name"/>-->
                <!--                <xsl:variable name="vNodeName" select="//class/element[contains(@type, $vName)][1]/@name"/>-->

                <xsl:value-of select="xdd:classHeaderDeclaration('class', $vTestClassname)"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>{</xsl:text>

                <xsl:value-of select=" xdd:WriteNullTestMethod($vNodeName,$vClassnameImpl,$vInterfaceName,$pIsDescriptor)"/>
                <xsl:choose>
                    <xsl:when test="$pIsDescriptor='true'">
                        <xsl:for-each select="element">
                            <xsl:variable name="vType" select=" substring-after(@type, ':')"/>
                            <xsl:variable name="vNamespace" select=" substring-before(@type, ':')"/>
                            <xsl:for-each select="//classes/class[@name=$vType and @namespace=$vNamespace]">
                                <xsl:for-each select="element">
                                    <xsl:call-template name="WriteTestMethods">
                                        <xsl:with-param name="pElement" select="."/>
                                        <xsl:with-param name="pNodeName" select="$vNodeName"/>
                                        <xsl:with-param name="pClassNameImpl" select="$vClassnameImpl"/>
                                        <xsl:with-param name="pInterfaceName" select="$vInterfaceName"/>
                                        <xsl:with-param name="pIsDescriptor" select="'true'"/>
                                        <xsl:with-param name="pIsMaxOccursUnbounded" select="false()"/>
                                    </xsl:call-template>
                                </xsl:for-each>
                                <xsl:for-each select="include">
                                    <xsl:variable name="vIsMaxOccursUnbounded" select="@maxOccurs='unbounded'" as="xs:boolean"/>
                                    <xsl:variable name="vGroupName" select=" substring-after(@name, ':')"/>

                                    <xsl:message select="concat('include in text case group: ', $vGroupName, ' namespace: ', $vNamespace)"/>
                                    <xsl:value-of select="xdd:includeGroupInTestCase($vClassnameImpl,$vInterfaceName,$vNodeName, $vGroupName,$vNamespace,$vIsMaxOccursUnbounded,$pIsDescriptor)"/>

                                    <!--   <xsl:for-each select="$gGroups/class[@name=$vGroupName and @namespace=$vNamespace]/element">
                                        <xsl:variable name="vMaxOccurs" select="concat('-', @maxOccurs)"/>
                                        <xsl:call-template name="WriteTestMethods">
                                            <xsl:with-param name="pElement" select="."/>
                                            <xsl:with-param name="pNodeName" select="$vNodeName"/>
                                            <xsl:with-param name="pClassNameImpl" select="$vClassnameImpl"/>
                                            <xsl:with-param name="pInterfaceName" select="$vInterfaceName"/>
                                            <xsl:with-param name="pIsDescriptor" select="$pIsDescriptor"/>
                                            <xsl:with-param name="pIsMaxOccursUnbounded" select="$vIsMaxOccursUnbounded"/>
                                        </xsl:call-template>
                                    </xsl:for-each>-->
                                </xsl:for-each>
                            </xsl:for-each>
                        </xsl:for-each>
                    </xsl:when>

                    <xsl:otherwise>
                        <xsl:for-each select="include">
                            <xsl:variable name="vIsMaxOccursUnbounded" select="@maxOccurs='unbounded'" as="xs:boolean"/>
                            <xsl:variable name="vGroupName" select=" substring-after(@name, ':')"/>
                            <xsl:variable name="vNamespace" select=" substring-before(@name, ':')"/>

                            <xsl:message select="concat('include in text case group: ', $vGroupName, ' namespace: ', $vNamespace)"/>
                            <xsl:value-of select="xdd:includeGroupInTestCase($vClassnameImpl,$vInterfaceName,$vNodeName, $vGroupName,$vNamespace,$vIsMaxOccursUnbounded,$pIsDescriptor)"/>

                            <!-- <xsl:message select="concat('include in text case group: ', $vGroupName, ' namespace: ', $vNamespace)"/>
                            <xsl:for-each select="$gGroups/class[@name=$vGroupName and @namespace=$vNamespace]/element">
                                <xsl:message select="concat('include in text case method: ', @name)"/>
                                <xsl:variable name="vMaxOccurs" select="concat('-', @maxOccurs)"/>
                                <xsl:call-template name="WriteTestMethods">
                                    <xsl:with-param name="pElement" select="."/>
                                    <xsl:with-param name="pNodeName" select="$vNodeName"/>
                                    <xsl:with-param name="pClassNameImpl" select="$vClassnameImpl"/>
                                    <xsl:with-param name="pInterfaceName" select="$vInterfaceName"/>
                                    <xsl:with-param name="pIsDescriptor" select="$pIsDescriptor"/>
                                    <xsl:with-param name="pIsMaxOccursUnbounded" select="$vIsMaxOccursUnbounded"/>
                                </xsl:call-template>
                            </xsl:for-each>-->
                        </xsl:for-each>

                        <xsl:for-each select="element">
                            <xsl:choose>
                                <xsl:when test="@type='javaee:ejb-relationship-roleType' and position()=4"/>
                                <xsl:otherwise>
                                    <xsl:call-template name="WriteTestMethods">
                                        <xsl:with-param name="pElement" select="."/>
                                        <xsl:with-param name="pNodeName" select="$vNodeName"/>
                                        <xsl:with-param name="pClassNameImpl" select="$vClassnameImpl"/>
                                        <xsl:with-param name="pInterfaceName" select="$vInterfaceName"/>
                                        <xsl:with-param name="pIsDescriptor" select="$pIsDescriptor"/>
                                        <xsl:with-param name="pIsMaxOccursUnbounded" select="false()"/>
                                    </xsl:call-template>
                                </xsl:otherwise>
                            </xsl:choose>
                            <xsl:if test="position()!= last()">
                                <xsl:text>&#10;</xsl:text>
                            </xsl:if>
                        </xsl:for-each>
                    </xsl:otherwise>
                </xsl:choose>
                <xsl:text>}</xsl:text>
                <xsl:text>&#10;</xsl:text>
            </xsl:result-document>
        </xsl:if>
    </xsl:template>


    <!-- ********************************************************************* -->
    <!-- ****** Template which includes groups for generating test cases ***** -->
    <!-- ********************************************************************* -->
    <xsl:function name="xdd:includeGroupInTestCase">
        <xsl:param name="pClassNameImpl"/>
        <xsl:param name="pInterfaceName"/>
        <xsl:param name="pNodeName"/>
        <xsl:param name="pGroupName"/>
        <xsl:param name="pNamespace"/>
        <xsl:param name="pIsMaxOccursUnbounded"/>
        <xsl:param name="pIsDescriptor"/>

        <xsl:for-each select="$gGroups/class[@name=$pGroupName and @namespace=$pNamespace]/element">
            <xsl:message select="concat('include in text case method: ', @name)"/>
            <xsl:variable name="vMaxOccurs" select="concat('-', @maxOccurs)"/>
            <xsl:call-template name="WriteTestMethods">
                <xsl:with-param name="pElement" select="."/>
                <xsl:with-param name="pNodeName" select="$pNodeName"/>
                <xsl:with-param name="pClassNameImpl" select="$pClassNameImpl"/>
                <xsl:with-param name="pInterfaceName" select="$pInterfaceName"/>
                <xsl:with-param name="pIsDescriptor" select="$pIsDescriptor"/>
                <xsl:with-param name="pIsMaxOccursUnbounded" select="$pIsMaxOccursUnbounded"/>
            </xsl:call-template>
        </xsl:for-each>

        <xsl:for-each select="$gGroups/class[@name=$pGroupName and @namespace=$pNamespace]/include">
            <xsl:variable name="vIsMaxOccursUnbounded" select="@maxOccurs='unbounded'" as="xs:boolean"/>
            <xsl:variable name="vGroupName" select=" substring-after(@name, ':')"/>
            <xsl:variable name="vNamespace" select=" substring-before(@name, ':')"/>
            <xsl:value-of select="xdd:includeGroupInTestCase($pClassNameImpl,$pInterfaceName,$pNodeName, $vGroupName,$vNamespace,$vIsMaxOccursUnbounded,$pIsDescriptor)"/>
        </xsl:for-each>
    </xsl:function>

    <!-- ******************************************************* -->
    <!-- ****** Template which generates a test method     ***** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteTestMethods">
        <xsl:param name="pElement" select="."/>
        <xsl:param name="pNodeName"/>
        <xsl:param name="pClassNameImpl"/>
        <xsl:param name="pInterfaceName"/>
        <xsl:param name="pIsDescriptor"/>
        <xsl:param name="pIsMaxOccursUnbounded" as="xs:boolean"/>

        <xsl:variable name="vMaxOccurs" select="concat('-',  @maxOccurs)"/>
        <xsl:variable name="vElementName" select="concat('-',  @name)"/>
        <xsl:choose>
            <xsl:when test="@type='javaee:ejb-relationship-roleType' and position()=4"/>
            <xsl:otherwise>
                <xsl:variable name="vMethodName" select="xdd:createPascalizedName(@name,'')"/>
                <xsl:value-of select="concat('   ', '&#10;')"/>
                <xsl:value-of select="concat('   @Test', '&#10;')"/>
                <xsl:value-of select="concat('   public void test', $vMethodName, '() throws Exception', '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>

                <xsl:choose>
                    <xsl:when test="$pIsDescriptor='true'">
                        <xsl:value-of select="concat('      ', $pInterfaceName, ' type = Descriptors.create(', $pInterfaceName, '.class);', '&#10;')"/>
                    </xsl:when>

                    <xsl:otherwise>
                        <xsl:value-of select="concat('      TestDescriptorImpl provider = new TestDescriptorImpl(&quot;test&quot;);', '&#10;')"/>
                        <xsl:value-of select="concat('      ', $pInterfaceName,'&lt;', 'TestDescriptorImpl', '&gt; type = new ', $pClassNameImpl, '&lt;', 'TestDescriptorImpl', '&gt;(provider, &quot;', $pNodeName  ,'&quot;, provider.getRootNode());', '&#10;')"/>
                    </xsl:otherwise>
                </xsl:choose>

                <xsl:choose>
                    <xsl:when test="@type='javaee:emptyType' or @type='javaee:ordering-othersType' or @type='faces-config-ordering-othersType' or @type='extensibleType'">
                        <xsl:value-of select="concat('      type.', xdd:createCamelizedName(@name), '();', '&#10;')"/>
                        <xsl:value-of select="concat('      assertTrue(type.is', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                    </xsl:when>

                    <xsl:when test="xdd:isEnumType(@type)">
                        <xsl:variable name="vDataType" select=" substring-after(@type, ':')"/>
                        <xsl:value-of select="concat('      for(', xdd:createPascalizedName($vDataType,''), ' e: ', xdd:createPascalizedName($vDataType,''), '.values())', '&#10;')"/>
                        <xsl:value-of select="concat('      {', '&#10;')"/>
                        <xsl:value-of select="concat('         type.set', xdd:createPascalizedName(@name,''), '(e);', '&#10;')"/>
                        <xsl:value-of select="concat('         assertEquals(type.get', xdd:createPascalizedName(@name,''), '(), e);', '&#10;')"/>
                        <xsl:value-of select="concat('         type.set', xdd:createPascalizedName(@name,''), '(e.toString());', '&#10;')"/>
                        <xsl:value-of select="concat('         assertEquals(type.get', xdd:createPascalizedName(@name,''), 'AsString(), e.toString());', '&#10;')"/>
                        <xsl:value-of select="concat('      }', '&#10;')"/>
                    </xsl:when>

                    <!--<xsl:when test="exists($pElement/@attribute)"> 
                    <xsl:message select="concat('attribute called for generating test method: ',@name)"></xsl:message>
                    </xsl:when>-->

                    <xsl:when test="xdd:isDataType(@type) and (@maxOccurs != 'unbounded' or exists(@maxOccurs)=false()) and $pIsMaxOccursUnbounded=false()">
                        <xsl:variable name="vDataType" select="xdd:CheckDataType(@type)"/>
                        <xsl:choose>
                            <xsl:when test="$vDataType='Boolean'">
                                <xsl:value-of select="concat('      type.set', xdd:createPascalizedName(@name,''), '(true);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.is', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                                <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertFalse(type.is', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                            </xsl:when>
                            <xsl:when test="$vDataType='Integer'">
                                <xsl:value-of select="concat('      type.set', xdd:createPascalizedName(@name,''), '(8);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.get', xdd:createPascalizedName(@name,''), '() == 8);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertNull(type.get', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                            </xsl:when>
                            <xsl:when test="$vDataType='Long'">
                                <xsl:value-of select="concat('      type.set', xdd:createPascalizedName(@name,''), '(8L);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.get', xdd:createPascalizedName(@name,''), '() == 8L);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertNull(type.get', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                            </xsl:when>
                            <xsl:when test="$vDataType='java.util.Date'">
                                <xsl:value-of select="concat('      java.util.Date testDate = new java.util.Date();', '&#10;')"/>
                                <xsl:value-of select="concat('      type.set', xdd:createPascalizedName(@name,''), '(testDate);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.get', xdd:createPascalizedName(@name,''), '(), testDate);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertNull(type.get', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="concat('      type.set', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '(&quot;test&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.get', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '(), &quot;test&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertNull(type.get', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '());', '&#10;')"/>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:when>

                    <xsl:when test="xdd:isDataType(@type) and (@maxOccurs = 'unbounded' or $pIsMaxOccursUnbounded=true())">
                        <xsl:variable name="vDataType" select="xdd:CheckDataType(@type)"/>
                        <xsl:choose>
                            <xsl:when test="$vDataType='Integer'">
                                <!--<xsl:value-of select="concat('      type.set', xdd:createPascalizedName(@name,''), '(8);', '&#10;')"/>
                                            <xsl:value-of select="concat('      assertTrue(type.get', xdd:createPascalizedName(@name,''), '() == 8);', '&#10;')"/>-->
                            </xsl:when>
                            <xsl:when test="$vDataType='Long'">
                                <!--<xsl:value-of select="concat('      type.set', xdd:createPascalizedName(@name,''), '(8L);', '&#10;')"/>
                                            <xsl:value-of select="concat('      assertTrue(type.get', xdd:createPascalizedName(@name,''), '() == 8L);', '&#10;')"/>-->
                            </xsl:when>
                            <xsl:when test="$vDataType='java.util.Date'">
                                <!--   <xsl:value-of select="concat('      java.util.Date() testDate = new java.util.Date();', '&#10;')"/>
                                            <xsl:value-of select="concat('      type.set', xdd:createPascalizedName(@name,''), '(testDate);', '&#10;')"/>
                                            <xsl:value-of select="concat('      assertEquals(type.get', xdd:createPascalizedName(@name,''), '(), testDate);', '&#10;')"/>-->
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="concat('      type.set', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '(&quot;value1&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.set', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '(&quot;value2&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.set', xdd:createPascalizedName(xdd:checkForClassType(@name),''), 'List(&quot;value3&quot;, &quot;value4&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.get', xdd:createPascalizedName(xdd:checkForClassType(@name),''), 'List().size() == 4);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.get', xdd:createPascalizedName(xdd:checkForClassType(@name),''), 'List().get(0), &quot;value1&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.get', xdd:createPascalizedName(xdd:checkForClassType(@name),''), 'List().get(1), &quot;value2&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.get', xdd:createPascalizedName(xdd:checkForClassType(@name),''), 'List().get(2), &quot;value3&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.get', xdd:createPascalizedName(xdd:checkForClassType(@name),''), 'List().get(3), &quot;value4&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.removeAll', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.get', xdd:createPascalizedName(xdd:checkForClassType(@name),''), 'List().size() == 0);', '&#10;')"/>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:when>

                    <xsl:otherwise>
                        <!-- it is a complex type -->
                        <xsl:choose>
                            <xsl:when test="contains($vMaxOccurs, 'unbounded') or $pIsMaxOccursUnbounded=true()">
                                <xsl:value-of select="concat('      type.', xdd:createCamelizedName(@name), '().up();', '&#10;')"/>
                                <xsl:value-of select="concat('      type.', xdd:createCamelizedName(@name), '().up();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.get', xdd:createPascalizedName(@name,''), 'List().size() == 2);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.removeAll', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.get', xdd:createPascalizedName(@name,''), 'List().size() == 0);', '&#10;')"/>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="concat('      type.', xdd:createCamelizedName(@name), '().up();', '&#10;')"/>
                                <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                                <xsl:choose>
                                    <xsl:when test="$pIsDescriptor='true'">
                                        <xsl:value-of select="concat('      assertNull(((', $pClassNameImpl, ')type).getRootNode().getSingle(&quot;',  @name, '&quot;));', '&#10;')"/>
                                    </xsl:when>
                                    <xsl:otherwise>
                                        <xsl:value-of select="concat('      assertNull(provider.getRootNode().getSingle(&quot;',  @name, '&quot;));', '&#10;')"/>
                                    </xsl:otherwise>
                                </xsl:choose>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:otherwise>
                </xsl:choose>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>


    <!-- ******************************************************* -->
    <!-- ****** Template which generates a test method     ***** -->
    <!-- ******************************************************* -->
    <xsl:function name="xdd:WriteNullTestMethod">
        <xsl:param name="pNodeName"/>
        <xsl:param name="pClassNameImpl"/>
        <xsl:param name="pInterfaceName"/>
        <xsl:param name="pIsDescriptor"/>

        <xsl:variable name="vMethodName" select="'NullArg'"/>
        <xsl:value-of select="concat('   ', '&#10;')"/>
        <xsl:value-of select="concat('   @Test', '&#10;')"/>
        <xsl:value-of select="concat('   public void test', $vMethodName, '() throws Exception', '&#10;')"/>
        <xsl:value-of select="concat('   {', '&#10;')"/>

        <xsl:choose>
            <xsl:when test="$pIsDescriptor='true'">
                <xsl:value-of select="concat('      ', $pInterfaceName, ' type = Descriptors.create(', $pInterfaceName, '.class);', '&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('      TestDescriptorImpl provider = new TestDescriptorImpl(&quot;test&quot;);', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pInterfaceName,'&lt;', 'TestDescriptorImpl', '&gt; type = new ', $pClassNameImpl, '&lt;', 'TestDescriptorImpl', '&gt;(provider, &quot;', $pNodeName  ,'&quot;, provider.getRootNode());', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
        <xsl:value-of select="concat('      TestDescriptorImpl.testNullArgs(type);', '&#10;')"/>
        <xsl:value-of select="concat('   }', '&#10;')"/>

    </xsl:function>


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
    <!-- ****** Function which creates a type   name     ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:LowerCaseFirstChar">
        <xsl:param name="name"/>
        <xsl:sequence select="concat(lower-case(substring($name,1,1)), substring($name,2))"/>
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
    <!-- ****** Function which writes the copyright      ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeCopyright">
        <xsl:for-each select="$gCopyright//line">
            <xsl:value-of select="concat(text(), '&#10;')"/>
        </xsl:for-each>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the contributors   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeContributors">
        <xsl:for-each select="$gContributors/contributor">
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
    <!-- ****** Function which writes a set method          *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeTypeCommentLines">
        <xsl:param name="vElementType"/>
        <xsl:param name="vMaxOccurs"/>
        <xsl:param name="vIsComplexType"/>
        <xsl:param name="pIsGeneric" as="xs:boolean"/>
        <xsl:param name="pIsAttribute" as="xs:boolean"/>
        <xsl:value-of select="concat('   // -------------------------------------------------------------------------------------||', '&#10;')"/>
        <xsl:value-of select="concat('   // Element type : ', $vElementType, '&#10;')"/>
        <xsl:value-of select="concat('   // isComplexType: ', $vIsComplexType, '   maxOccurs: ', $vMaxOccurs, '   isAttribute: ', $pIsAttribute, '&#10;')"/>
        <xsl:value-of select="concat('   // -------------------------------------------------------------------------------------||', '&#10;')"/>
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
        <xsl:value-of select="concat('   public ', $pReturnType,' addDefaultNamespaces()', '&#10;')"/>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:for-each select="$pDefaultNamespaces/namespace">
            <xsl:value-of select="concat('      addNamespace(&quot;', @name, '&quot;, &quot;', @value, '&quot;)', ';&#10;')"/>
        </xsl:for-each>
        <xsl:value-of select="concat('      return this;', '&#10;')"/>
        <xsl:text>   }&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <xsl:value-of select="concat('   public ', $pReturnType,' addNamespace(String name, String value)', '&#10;')"/>
        <xsl:text>   {&#10;</xsl:text>
        <xsl:value-of select="concat('      ', 'model', '.attribute(name, value);', '&#10;')"/>
        <xsl:value-of select="concat('      return this;', '&#10;')"/>
        <xsl:text>   }&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
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
        <xsl:value-of select="xdd:writeContributors()"/>
        <xsl:value-of select="concat(' * @since Generation date :', current-dateTime(), '&#10;')"/>
        <xsl:value-of select="' */&#10;'"/>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the class header   ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeDescriptorJavaDoc">
        <xsl:param name="pDescriptorName"/>
        <xsl:param name="pDescriptorSchema"/>
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
        <xsl:value-of select="xdd:writeContributors()"/>
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
        <xsl:param name="pIsMaxOccursFromParent" as="xs:boolean"/>
        <xsl:variable name="vGroupName" select=" substring-after($pGroupName, ':')"/>
        <xsl:variable name="vNamespace" select=" substring-before($pGroupName, ':')"/>
        <xsl:for-each select="$gGroups/class[@name=$vGroupName and @namespace=$vNamespace]/element">
            <xsl:variable name="vMaxOccurs" select="concat('-', @maxOccurs)"/>
            <xsl:choose>
                <xsl:when test="$pIsMaxOccursFromParent=true()">
                    <xsl:value-of select=" xdd:writeMethodOrAttribute($pClassname, @name, @type, '-unbounded', $pWriteAttribute, $pWriteInterface, $pIsGeneric, $pNodeNameLocal, @attribute)"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select=" xdd:writeMethodOrAttribute($pClassname, @name, @type, $vMaxOccurs, $pWriteAttribute, $pWriteInterface, $pIsGeneric, $pNodeNameLocal, @attribute)"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>
        <xsl:for-each select="$gGroups/class[@name=$vGroupName and @namespace=$vNamespace]/include">
            <xsl:variable name="vMaxOccurs" select="concat('-', @maxOccurs)"/>
            <xsl:value-of select="xdd:includeGroupRefs($pClassname, @name, $pWriteAttribute, $pWriteInterface, $pIsGeneric, $pNodeNameLocal, @maxOccurs='unbounded')"/>
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
        <xsl:param name="pIsAttribute" as="xs:boolean"/>
        <xsl:variable name="vMethodName" select="xdd:createPascalizedName($pElementName,'')"/>
        <xsl:variable name="vReturn" select=" xdd:getReturnType($pClassName, $pIsGeneric)"/>

        <xsl:choose>
            <xsl:when test="$pElementType='javaee:emptyType' or $pElementType='javaee:ordering-othersType' or 
                            $pElementType='faces-config-ordering-othersType' or $pElementType='extensibleType'">
                <xsl:variable name="vStandardSetBooleanEmptySignature" select="concat('   public ', $vReturn, ' ', xdd:checkForClassType( xdd:LowerCaseFirstChar($vMethodName)), '()')"/>
                <xsl:variable name="vStandardGetBooleanEmptySignature" select="concat('   public Boolean is', xdd:checkForClassType($vMethodName), '()')"/>

                <xsl:choose>
                    <xsl:when test="$pWriteInterface=true()">
                        <xsl:value-of select="concat($vStandardSetBooleanEmptySignature, ';&#10;')"/>
                        <xsl:value-of select="concat($vStandardGetBooleanEmptySignature, ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select=" xdd:writeTypeCommentLines($pElementName, $pMaxOccurs, false(), $pIsGeneric, $pIsAttribute)"/>
                        <xsl:value-of select="concat($vStandardSetBooleanEmptySignature, '&#10;')"/>
                        <xsl:text>   {&#10;</xsl:text>
                        <xsl:value-of select="concat('      ', $pNodeNameLocal, '.getOrCreate(&quot;', $pElementName, '&quot;);', '&#10;')"/>
                        <xsl:value-of select="'      return this;&#10;'"/>
                        <xsl:text>   }&#10;&#10;</xsl:text>

                        <!-- WRONG HERE -->
                        <xsl:value-of select="concat($vStandardGetBooleanEmptySignature, '&#10;')"/>
                        <xsl:text>   {&#10;</xsl:text>
                        <xsl:value-of select="concat('      return ', $pNodeNameLocal, '.getSingle(&quot;', $pElementName, '&quot;) != null;', '&#10;')"/>
                        <xsl:text>   }&#10;&#10;</xsl:text>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>
            <xsl:when test="xdd:isEnumType($pElementType)">
                <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, $pElementType, $pElementName, '-', $pWriteInterface, false(), $pIsGeneric, $pNodeNameLocal, $pIsAttribute)"/>
                <xsl:value-of select="xdd:writeGetMethodSignature($vReturn, $pElementType, concat($vMethodName, ''), $pElementName, '-', $pWriteInterface, false(), $pIsGeneric, $pNodeNameLocal, $pIsAttribute)"/>
            </xsl:when>
            <xsl:when test="xdd:isDataType($pElementType)">
                <xsl:variable name="vDataType" select="xdd:CheckDataType($pElementType)"/>
                <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, $vDataType, $pElementName, $pMaxOccurs, $pWriteInterface, false(), $pIsGeneric, $pNodeNameLocal, $pIsAttribute)"/>
                <xsl:value-of select="xdd:writeGetMethodSignature($vReturn, $vDataType, $vMethodName, $pElementName, $pMaxOccurs, $pWriteInterface, false(), $pIsGeneric, $pNodeNameLocal, $pIsAttribute)"/>
            </xsl:when>
            <xsl:when test="$pIsGeneric=false()">
                <xsl:variable name="vReturnGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&gt;'))"/>
                <xsl:variable name="vElementTypeGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&gt;'))"/>
                <xsl:value-of select="xdd:writeSetMethodSignature($pClassName, $vMethodName, $vElementTypeGeneric, $pElementName, $pMaxOccurs, $pWriteInterface, true(), $pIsGeneric, $pNodeNameLocal, $pIsAttribute)"/>
                <xsl:value-of select="xdd:writeGetMethodSignature($pClassName, $vReturnGeneric, $vMethodName, $pElementName, $pMaxOccurs, $pWriteInterface, true(), $pIsGeneric, $pNodeNameLocal, $pIsAttribute)"/>
                <xsl:text>&#10;</xsl:text>
            </xsl:when>
            <xsl:otherwise>
                <!-- it is a complex type -->
                <xsl:variable name="vReturnGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&lt;T&gt;&gt;'))"/>
                <xsl:variable name="vElementTypeGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&lt;T&gt;&gt;'))"/>
                <xsl:value-of select="xdd:writeSetMethodSignature($vReturn, $vMethodName, $vElementTypeGeneric, $pElementName, $pMaxOccurs, $pWriteInterface, true(), $pIsGeneric, $pNodeNameLocal, $pIsAttribute)"/>
                <xsl:value-of select="xdd:writeGetMethodSignature($vReturn, $vReturnGeneric, $vMethodName, $pElementName, $pMaxOccurs, $pWriteInterface, true(), $pIsGeneric, $pNodeNameLocal, $pIsAttribute)"/>
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
        <xsl:param name="vIsComplexType"/>
        <xsl:param name="pIsGeneric" as="xs:boolean"/>
        <xsl:param name="vNodeNameLocal"/>
        <xsl:param name="pIsAttribute" as="xs:boolean"/>
        <xsl:variable name="vClassType" select="xdd:createPascalizedName($vElementType,'')"/>

        <xsl:text>&#10;</xsl:text>
        <xsl:variable name="vStandardSetSignature" select="concat('   public ', $vReturnType, ' set', xdd:checkForClassType($vMethodName), '(',  xdd:createPascalizedName($vElementType,''),' ',xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ')')"/>
        <xsl:variable name="vStandardSetStringSignature" select="concat('   public ', $vReturnType, ' set', xdd:checkForClassType($vMethodName), '(String', ' ',xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ')')"/>
        <xsl:variable name="vStandardSetVarArgSignature" select="concat('   public ', $vReturnType, ' set', xdd:checkForClassType($vMethodName), 'List(',  xdd:createPascalizedName($vElementType,''),' ... values)')"/>
        <xsl:variable name="vStandardRemoveSignature" select="concat('   public ', $vReturnType, ' remove', xdd:checkForClassType($vMethodName), '()')"/>
        <xsl:variable name="vStandardRemoveAllSignature" select="concat('   public ', $vReturnType, ' removeAll', xdd:checkForClassType($vMethodName), '()')"/>

        <xsl:choose>
            <xsl:when test="$vIsComplexType=false() and contains($vMaxOccurs, 'unbounded')">
                <xsl:value-of select="xdd:writeTypeCommentLines($vElementName, $vMaxOccurs, $vIsComplexType, $pIsGeneric, $pIsAttribute)"/>
                <xsl:value-of select="xdd:writeBodyForSetUnboundedNodes($vStandardSetSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                <xsl:value-of select="xdd:writeBodyForSetVarArgNodes($vStandardSetVarArgSignature, $vNodeNameLocal, $vElementType, $vElementName, $vMethodName, $vReturnType, $vIsInterface)"/>
                <xsl:value-of select="xdd:writeBodyForRemoveNode($vStandardRemoveAllSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>

                <!--<xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:value-of select="concat($vStandardSetSignature, ';&#10;')"/>
                        <xsl:value-of select="concat($vStandardSetVarArgSignature, ';&#10;')"/>
                        <xsl:value-of select="concat($vStandardRemoveAllSignature, ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:writeTypeCommentLines($vElementName, $vMaxOccurs, $vIsComplexType, $pIsGeneric, $pIsAttribute)"/>
                        <xsl:value-of select="xdd:writeBodyForSetUnboundedNodes($vStandardSetSignature, $vNodeNameLocal, $vElementName, $vReturnType, false())"/>
                        <xsl:value-of select="xdd:writeBodyForSetVarArgNodes($vStandardSetVarArgSignature, $vNodeNameLocal, $vElementType, $vElementName, $vMethodName, $vReturnType, false())"/>
                        <xsl:value-of select="xdd:writeBodyForRemoveNode($vStandardRemoveAllSignature, $vNodeNameLocal, $vElementName, $vReturnType, false())"/>
                    </xsl:otherwise>
                </xsl:choose>-->
            </xsl:when>

            <xsl:when test="$vIsComplexType=true() and contains($vMaxOccurs, 'unbounded')">
                <xsl:value-of select=" xdd:writeTypeCommentLines($vElementName, $vMaxOccurs, $vIsComplexType, $pIsGeneric, $pIsAttribute)"/>
                <xsl:value-of select=" xdd:writeBodyForRemoveAllNode($vStandardRemoveAllSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                <!-- <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:value-of select="concat($vStandardRemoveAllSignature, ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:variable name="vinterfaceClass" select="substring-before($vElementType, '&lt;')"/>
                        <xsl:value-of select=" xdd:writeTypeCommentLines($vElementName, $vMaxOccurs, $vIsComplexType, $pIsGeneric, $pIsAttribute)"/>
                        <xsl:value-of select=" xdd:writeBodyForRemoveAllNode($vStandardRemoveAllSignature, $vNodeNameLocal, $vElementName, $vReturnType)"/>
                    </xsl:otherwise>
                </xsl:choose>-->
            </xsl:when>

            <xsl:when test="$vIsComplexType=true() and contains($vMaxOccurs, 'unbounded')=false()">
                <!--<xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:value-of select="concat($vStandardRemoveSignature, ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>-->
                <xsl:value-of select=" xdd:writeTypeCommentLines($vElementName, $vMaxOccurs, $vIsComplexType, $pIsGeneric, $pIsAttribute)"/>
                <xsl:value-of select=" xdd:writeBodyForRemoveNode($vStandardRemoveSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                <!-- </xsl:otherwise>
                </xsl:choose>-->
            </xsl:when>

            <xsl:when test="$pIsAttribute=true()">
                <!-- <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:choose>
                            <xsl:when test="xdd:isEnumType($vElementType)">
                                <xsl:value-of select="concat($vStandardSetSignature, ';&#10;')"/>
                                <xsl:value-of select="concat($vStandardSetStringSignature, ';&#10;')"/>
                                <xsl:value-of select="concat($vStandardRemoveSignature, ';&#10;')"/>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="concat($vStandardSetSignature, ';&#10;')"/>
                                <xsl:value-of select="concat($vStandardRemoveSignature, ';&#10;')"/>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:when>
                    <xsl:otherwise>-->
                <xsl:choose>
                    <xsl:when test="xdd:isEnumType($vElementType)">
                        <xsl:value-of select=" xdd:writeTypeCommentLines($vElementName, $vMaxOccurs, $vIsComplexType, $pIsGeneric, $pIsAttribute)"/>
                        <xsl:value-of select=" xdd:writeBodyForSetAttribute($vStandardSetSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                        <xsl:value-of select=" xdd:writeBodyForSetAttribute($vStandardSetStringSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                        <xsl:value-of select=" xdd:writeBodyForRemoveAttribute($vStandardRemoveSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select=" xdd:writeTypeCommentLines($vElementName, $vMaxOccurs, $vIsComplexType, $pIsGeneric, $pIsAttribute)"/>
                        <xsl:value-of select=" xdd:writeBodyForSetAttribute($vStandardSetSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                        <xsl:value-of select=" xdd:writeBodyForRemoveAttribute($vStandardRemoveSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                    </xsl:otherwise>
                </xsl:choose>
                <!--    </xsl:otherwise>
                </xsl:choose>-->
            </xsl:when>

            <xsl:when test="xdd:isEnumType($vElementType)">
                <!--  <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:value-of select="concat($vStandardSetSignature, ';&#10;')"/>
                        <xsl:value-of select="concat($vStandardSetStringSignature, ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>-->
                <xsl:value-of select=" xdd:writeTypeCommentLines($vElementName, $vMaxOccurs, $vIsComplexType, $pIsGeneric, $pIsAttribute)"/>
                <xsl:value-of select=" xdd:writeBodyForSetSingleNode($vStandardSetSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                <xsl:value-of select=" xdd:writeBodyForSetSingleNode($vStandardSetStringSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                <!--</xsl:otherwise>
                </xsl:choose>-->
            </xsl:when>

            <xsl:otherwise>
                <xsl:choose>
                    <!-- <xsl:when test="$vIsInterface=true()">
                        <xsl:value-of select="concat($vStandardSetSignature, ';&#10;')"/>
                        <xsl:value-of select="concat($vStandardRemoveSignature, ';&#10;')"/>
                    </xsl:when>-->
                    <xsl:when test="$vElementType='java.util.Date'">
                        <xsl:value-of select=" xdd:writeTypeCommentLines($vElementName, $vMaxOccurs, $vIsComplexType, $pIsGeneric, $pIsAttribute)"/>
                        <xsl:value-of select=" xdd:writeBodyForSetSingleXMLDateNode($vStandardSetSignature, $vNodeNameLocal, $vElementType, $vElementName, $vReturnType, $vIsInterface)"/>
                        <xsl:value-of select=" xdd:writeBodyForRemoveNode($vStandardRemoveSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select=" xdd:writeTypeCommentLines($vElementName, $vMaxOccurs, $vIsComplexType, $pIsGeneric, $pIsAttribute)"/>
                        <xsl:value-of select=" xdd:writeBodyForSetSingleNode($vStandardSetSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                        <xsl:value-of select=" xdd:writeBodyForRemoveNode($vStandardRemoveSignature, $vNodeNameLocal, $vElementName, $vReturnType, $vIsInterface)"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:otherwise>
        </xsl:choose>
        <xsl:text>&#10;</xsl:text>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes a get method          *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeMethods">
        <xsl:param name="vReturnType"/>
        <xsl:param name="vClassType"/>
        <xsl:param name="vElementType"/>
        <xsl:param name="vMethodName"/>
        <xsl:param name="vElementName"/>
        <xsl:param name="vMaxOccurs"/>
        <xsl:param name="vIsInterface" as="xs:boolean"/>
        <xsl:param name="vIsComplexType"/>
        <xsl:param name="pIsGeneric" as="xs:boolean"/>
        <xsl:param name="vNodeNameLocal"/>
        <xsl:param name="pIsAttribute" as="xs:boolean"/>

        <xsl:variable name="vStandardSetSignature" select="concat('   public ', $vReturnType, ' set', xdd:checkForClassType($vMethodName), '(',  xdd:createPascalizedName($vElementType,''),' ',xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ')')"/>
        <xsl:variable name="vStandardSetStringSignature" select="concat('   public ', $vReturnType, ' set', xdd:checkForClassType($vMethodName), '(String', ' ',xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ')')"/>
        <xsl:variable name="vStandardSetVarArgSignature" select="concat('   public ', $vReturnType, ' set', xdd:checkForClassType($vMethodName), 'List(',  xdd:createPascalizedName($vElementType,''),' ... values)')"/>
        <xsl:variable name="vStandardRemoveSignature" select="concat('   public ', $vReturnType, ' remove', xdd:checkForClassType($vMethodName), '()')"/>
        <xsl:variable name="vStandardRemoveAllSignature" select="concat('   public ', $vReturnType, ' removeAll', xdd:checkForClassType($vMethodName), '()')"/>

        <xsl:variable name="vStandardGetSignature" select="concat('public ', xdd:createPascalizedName($vElementType,''), ' get', xdd:checkForClassType($vMethodName), '()')"/>
        <xsl:variable name="vStandardGetStringSignature" select="concat('public String ', ' get', xdd:checkForClassType($vMethodName), 'AsString()')"/>
        <xsl:variable name="vStandardGetBooleanSignature" select="concat('public ', xdd:createPascalizedName($vElementType,''), ' is', xdd:checkForClassType($vMethodName), '()')"/>
        <xsl:variable name="vStandardGetComplexSignature" select="concat('public ', xdd:createPascalizedName($vElementType,''), ' ', xdd:checkForClassType( xdd:LowerCaseFirstChar($vMethodName)), '()')"/>
        <xsl:variable name="vStandardGetListSignature" select="concat('public List&lt;', xdd:createPascalizedName($vElementType,''), '&gt; get', xdd:checkForClassType($vMethodName), 'List()')"/>

        <xsl:choose>
            <xsl:when test="$vIsComplexType=false() and contains($vMaxOccurs, 'unbounded')">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()"> </xsl:when>
                    <xsl:otherwise> </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="$vIsComplexType=true() and contains($vMaxOccurs, 'unbounded')">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()"> </xsl:when>
                    <xsl:otherwise> </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="$vIsComplexType=true() and contains($vMaxOccurs, 'unbounded')=false()">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()"> </xsl:when>
                    <xsl:otherwise> </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="$pIsAttribute=true()">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:choose>
                            <xsl:when test="xdd:isEnumType($vElementType)"> </xsl:when>
                            <xsl:otherwise> </xsl:otherwise>
                        </xsl:choose>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:choose>
                            <xsl:when test="xdd:isEnumType($vElementType)"> </xsl:when>
                            <xsl:otherwise> </xsl:otherwise>
                        </xsl:choose>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="xdd:isEnumType($vElementType)">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()"> </xsl:when>
                    <xsl:otherwise> </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:otherwise>
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()"> </xsl:when>
                    <xsl:when test="$vElementType='java.util.Date'"> </xsl:when>
                    <xsl:otherwise> </xsl:otherwise>
                </xsl:choose>
            </xsl:otherwise>
        </xsl:choose>

        <xsl:choose>
            <xsl:when test="$vIsComplexType=true()">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true() and contains($vMaxOccurs, 'unbounded')=false()">
                        <xsl:value-of select=" concat('   ', $vStandardGetComplexSignature, ';&#10;')"/>
                    </xsl:when>

                    <xsl:when test="$vIsInterface=true() and contains($vMaxOccurs, 'unbounded')=true()">
                        <xsl:value-of select=" concat('   ', $vStandardGetComplexSignature, ';&#10;')"/>
                        <xsl:value-of select=" concat('   ', $vStandardGetListSignature, ';&#10;')"/>
                    </xsl:when>

                    <xsl:when test="contains($vMaxOccurs, 'unbounded')=true()">
                        <xsl:value-of select=" concat('   ', $vStandardGetComplexSignature, '&#10;   {&#10;')"/>
                        <xsl:variable name="vConstructor" select="concat(substring-before($vElementType, '&lt;'), 'Impl&lt;', $vClassType, '&gt;')"/>
                        <xsl:value-of select=" concat('      return new ', $vConstructor, '(this, &quot;&quot;, ', $vNodeNameLocal, ');', '&#10;')"/>
                        <xsl:text>   }&#10;&#10;</xsl:text>

                        <xsl:value-of select=" concat('   ', $vStandardGetListSignature, '&#10;   {&#10;')"/>
                        <xsl:variable name="vinterfaceClass" select="substring-before($vElementType, '&lt;')"/>

                        <xsl:variable name="vConstructor" select="concat($vinterfaceClass, '&lt;', $vClassType, '&gt;')"/>
                        <xsl:variable name="vConstructorImpl" select="concat($vinterfaceClass, 'Impl&lt;', $vClassType, '&gt;')"/>

                        <xsl:value-of select="concat('      List', '&lt;', $vConstructor, '&gt;', ' list = new ArrayList', '&lt;', $vConstructor, '&gt;', '();', '&#10;')"/>
                        <xsl:value-of select="concat('      List', '&lt;', 'Node', '&gt;', ' nodeList = ', $vNodeNameLocal , '.get(', $vinterfaceClass, 'Impl.nodeName', ');', '&#10;')"/>
                        <xsl:value-of select="concat('      for(Node node: nodeList)', '&#10;')"/>
                        <xsl:value-of select="concat('      {', '&#10;')"/>
                        <xsl:value-of select="concat('         ', $vConstructor, '  type = new ', $vConstructorImpl, '(this, &quot;&quot;, ', $vNodeNameLocal, ', node);', '&#10;')"/>
                        <xsl:value-of select="concat('         list.add(type);', '&#10;')"/>
                        <xsl:value-of select="concat('      }', '&#10;')"/>
                        <xsl:value-of select="concat('      return list;', '&#10;')"/>
                        <xsl:text>   }&#10;</xsl:text>
                    </xsl:when>

                    <xsl:otherwise>
                        <xsl:value-of select=" concat('   ', $vStandardGetComplexSignature, '&#10;   {&#10;')"/>
                        <xsl:variable name="vinterfaceClass" select="substring-before($vElementType, '&lt;')"/>
                        <xsl:variable name="vConstructor" select="concat(substring-before($vElementType, '&lt;'), 'Impl&lt;', $vClassType, '&gt;')"/>
                        <xsl:value-of select=" concat('      Node node = ', $vNodeNameLocal, '.getOrCreate(', $vinterfaceClass, 'Impl.nodeName);',  '&#10;')"/>
                        <xsl:value-of select=" concat('      ', xdd:createPascalizedName($vElementType,''), ' ', xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ' = new ', $vConstructor, '(this, &quot;&quot;, ', $vNodeNameLocal, ', node);', '&#10;')"/>
                        <xsl:value-of select=" concat('      return ', xdd:createCamelizedName($vElementName), ';&#10;')"/>
                        <xsl:text>   }&#10;</xsl:text>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="$pIsAttribute=true()">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:choose>
                            <xsl:when test="xdd:isEnumType($vElementType)">
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, ';&#10;')"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetStringSignature, ';&#10;')"/>
                            </xsl:when>
                            <xsl:when test="$vElementType='Boolean'">
                                <xsl:value-of select=" concat('   ', $vStandardGetBooleanSignature, ';&#10;')"/>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, ';&#10;')"/>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:choose>
                            <xsl:when test="xdd:isEnumType($vElementType)">
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', xdd:createPascalizedName($vElementType,''), '.valueOf(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:text>   }&#10;&#10;</xsl:text>
                                <xsl:value-of select=" concat('   ', $vStandardGetStringSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;);' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:when test="$vElementType='Boolean'">
                                <xsl:value-of select=" concat('   ', $vStandardGetBooleanSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return Strings.isTrue(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', $vNodeNameLocal, '.getAttribute(&quot;', $vElementName, '&quot;);' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="$vIsComplexType=false() and contains($vMaxOccurs, 'unbounded')=false()">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:choose>
                            <xsl:when test="xdd:isEnumType($vElementType)">
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, ';&#10;')"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetStringSignature, ';&#10;')"/>
                            </xsl:when>
                            <xsl:when test="$vElementType='Boolean'">
                                <xsl:value-of select=" concat('   ', $vStandardGetBooleanSignature, ';&#10;')"/>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, ';&#10;')"/>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:choose>
                            <xsl:when test="xdd:isEnumType($vElementType)">
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', xdd:createPascalizedName($vElementType,''), '.valueOf(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:text>   }&#10;&#10;</xsl:text>
                                <xsl:value-of select=" concat('   ', $vStandardGetStringSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;);' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>

                            <xsl:when test="$vElementType='Boolean'">
                                <xsl:value-of select=" concat('   ', $vStandardGetBooleanSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return Strings.isTrue(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:when test="$vElementType='Integer'">
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      if (', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;) != null) {' , '&#10;')"/>
                                <xsl:value-of select=" concat('         return Integer.valueOf(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:value-of select=" concat('      }' , '&#10;')"/>
                                <xsl:value-of select=" concat('     return null;' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:when test="$vElementType='Long'">
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return Long.valueOf(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:when test="$vElementType='java.util.Date'">
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return XMLDate.toDate(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;);' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="$vIsComplexType=false() and contains($vMaxOccurs, 'unbounded')=true()">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:value-of select=" concat('   ', $vStandardGetListSignature, ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select=" concat('   ', $vStandardGetListSignature, '&#10;   {&#10;')"/>
                        <xsl:choose>
                            <xsl:when test="$vElementType='Boolean'">
                                <xsl:value-of select="'      List&lt;Boolean&gt; result = new ArrayList&lt;Boolean&gt;();&#10;'"/>
                                <xsl:value-of select="concat('      List&lt;Node&gt; nodes = ', $vNodeNameLocal, '.get(&quot;', $vElementName, '&quot;);&#10;')"/>
                                <xsl:value-of select="'      for (Node node : nodes)&#10;'"/>
                                <xsl:value-of select="'      {&#10;'"/>
                                <xsl:value-of select="'         result.add(Boolean.valueOf(node.getText()));&#10;'"/>
                                <xsl:value-of select="'      }&#10;'"/>
                                <xsl:value-of select="'      return result;&#10;'"/>
                            </xsl:when>
                            <xsl:when test="$vElementType='Integer'">
                                <xsl:value-of select="'      List&lt;Integer&gt; result = new ArrayList&lt;Integer&gt;();&#10;'"/>
                                <xsl:value-of select="concat('      List&lt;Node&gt; nodes = ', $vNodeNameLocal, '.get(&quot;', $vElementName, '&quot;);&#10;')"/>
                                <xsl:value-of select="'      for (Node node : nodes)&#10;'"/>
                                <xsl:value-of select="'      {&#10;'"/>
                                <xsl:value-of select="'         result.add(Integer.valueOf(node.getText()));&#10;'"/>
                                <xsl:value-of select="'      }&#10;'"/>
                                <xsl:value-of select="'      return result;&#10;'"/>
                            </xsl:when>
                            <xsl:when test="$vElementType='Long'">
                                <xsl:value-of select="'      List&lt;Long&gt; result = new ArrayList&lt;Long&gt;();&#10;'"/>
                                <xsl:value-of select="concat('      List&lt;Node&gt; nodes = ', $vNodeNameLocal, '.get(&quot;', $vElementName, '&quot;);&#10;')"/>
                                <xsl:value-of select="'      for (Node node : nodes)&#10;'"/>
                                <xsl:value-of select="'      {&#10;'"/>
                                <xsl:value-of select="'         result.add(Long.valueOf(node.getText()));&#10;'"/>
                                <xsl:value-of select="'      }&#10;'"/>
                                <xsl:value-of select="'      return result;&#10;'"/>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="'      List&lt;String&gt; result = new ArrayList&lt;String&gt;();&#10;'"/>
                                <xsl:value-of select="concat('      List&lt;Node&gt; nodes = ', $vNodeNameLocal, '.get(&quot;', $vElementName, '&quot;);&#10;')"/>
                                <xsl:value-of select="'      for (Node node : nodes)&#10;'"/>
                                <xsl:value-of select="'      {&#10;'"/>
                                <xsl:value-of select="'         result.add(node.getText());&#10;'"/>
                                <xsl:value-of select="'      }&#10;'"/>
                                <xsl:value-of select="'      return result;&#10;'"/>
                            </xsl:otherwise>
                        </xsl:choose>
                        <xsl:text>   }&#10;</xsl:text>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:otherwise>
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:value-of select=" concat('   ', $vStandardGetSignature, ';')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                        <xsl:value-of select=" concat('      return ', xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ';' , '&#10;   }&#10;')"/>
                    </xsl:otherwise>
                </xsl:choose>

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
        <xsl:param name="pIsGeneric" as="xs:boolean"/>
        <xsl:param name="vNodeNameLocal"/>
        <xsl:param name="pIsAttribute" as="xs:boolean"/>

        <xsl:variable name="vStandardGetSignature" select="concat('public ', xdd:createPascalizedName($vElementType,''), ' get', xdd:checkForClassType($vMethodName), '()')"/>
        <xsl:variable name="vStandardGetStringSignature" select="concat('public String ', ' get', xdd:checkForClassType($vMethodName), 'AsString()')"/>
        <xsl:variable name="vStandardGetBooleanSignature" select="concat('public ', xdd:createPascalizedName($vElementType,''), ' is', xdd:checkForClassType($vMethodName), '()')"/>
        <xsl:variable name="vStandardGetComplexSignature" select="concat('public ', xdd:createPascalizedName($vElementType,''), ' ', xdd:checkForClassType( xdd:LowerCaseFirstChar($vMethodName)), '()')"/>
        <xsl:variable name="vStandardGetListSignature" select="concat('public List&lt;', xdd:createPascalizedName($vElementType,''), '&gt; get', xdd:checkForClassType($vMethodName), 'List()')"/>

        <xsl:choose>
            <xsl:when test="$vIsComplexType=true()">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true() and contains($vMaxOccurs, 'unbounded')=false()">
                        <xsl:value-of select="xdd:writeStandardGetComplexTypeJavaDoc($vElementType, $vElementName)"/>
                        <xsl:value-of select=" concat('   ', $vStandardGetComplexSignature, ';&#10;')"/>
                    </xsl:when>

                    <xsl:when test="$vIsInterface=true() and contains($vMaxOccurs, 'unbounded')=true()">
                        <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                        <xsl:value-of select=" concat('   ', $vStandardGetComplexSignature, ';&#10;')"/>
                        <xsl:value-of select="xdd:writeStandardGetAllElementJavaDoc($vElementType, $vElementName)"/>
                        <xsl:value-of select=" concat('   ', $vStandardGetListSignature, ';&#10;')"/>
                    </xsl:when>

                    <xsl:when test="contains($vMaxOccurs, 'unbounded')=true()">
                        <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                        <xsl:value-of select=" concat('   ', $vStandardGetComplexSignature, '&#10;   {&#10;')"/>
                        <xsl:variable name="vConstructor" select="concat(substring-before($vElementType, '&lt;'), 'Impl&lt;', $vClassType, '&gt;')"/>
                        <xsl:value-of select=" concat('      return new ', $vConstructor, '(this, &quot;', $vElementName, '&quot;, ', $vNodeNameLocal, ');', '&#10;')"/>
                        <xsl:text>   }&#10;&#10;</xsl:text>

                        <xsl:value-of select="xdd:writeStandardGetAllElementJavaDoc($vElementType, $vElementName)"/>
                        <xsl:value-of select=" concat('   ', $vStandardGetListSignature, '&#10;   {&#10;')"/>
                        <xsl:variable name="vinterfaceClass" select="substring-before($vElementType, '&lt;')"/>

                        <xsl:variable name="vConstructor" select="concat($vinterfaceClass, '&lt;', $vClassType, '&gt;')"/>
                        <xsl:variable name="vConstructorImpl" select="concat($vinterfaceClass, 'Impl&lt;', $vClassType, '&gt;')"/>

                        <xsl:value-of select="concat('      List', '&lt;', $vConstructor, '&gt;', ' list = new ArrayList', '&lt;', $vConstructor, '&gt;', '();', '&#10;')"/>
                        <xsl:value-of select="concat('      List', '&lt;', 'Node', '&gt;', ' nodeList = ', $vNodeNameLocal , '.get(&quot;', $vElementName, '&quot;);', '&#10;')"/>
                        <xsl:value-of select="concat('      for(Node node: nodeList)', '&#10;')"/>
                        <xsl:value-of select="concat('      {', '&#10;')"/>
                        <xsl:value-of select="concat('         ', $vConstructor, '  type = new ', $vConstructorImpl, '(this, &quot;', $vElementName, '&quot;, ', $vNodeNameLocal, ', node);', '&#10;')"/>
                        <xsl:value-of select="concat('         list.add(type);', '&#10;')"/>
                        <xsl:value-of select="concat('      }', '&#10;')"/>
                        <xsl:value-of select="concat('      return list;', '&#10;')"/>
                        <xsl:text>   }&#10;</xsl:text>
                    </xsl:when>

                    <xsl:otherwise>
                        <xsl:value-of select="xdd:writeStandardGetComplexTypeJavaDoc($vElementType, $vElementName)"/>
                        <xsl:value-of select=" concat('   ', $vStandardGetComplexSignature, '&#10;   {&#10;')"/>
                        <xsl:variable name="vinterfaceClass" select="substring-before($vElementType, '&lt;')"/>
                        <xsl:variable name="vConstructor" select="concat(substring-before($vElementType, '&lt;'), 'Impl&lt;', $vClassType, '&gt;')"/>
                        <xsl:value-of select=" concat('      Node node = ', $vNodeNameLocal, '.getOrCreate(&quot;', $vElementName, '&quot;);',  '&#10;')"/>
                        <xsl:value-of select=" concat('      ', xdd:createPascalizedName($vElementType,''), ' ', xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ' = new ', $vConstructor, '(this, &quot;', $vElementName, '&quot;, ', $vNodeNameLocal, ', node);', '&#10;')"/>
                        <xsl:value-of select=" concat('      return ', xdd:createCamelizedName($vElementName), ';&#10;')"/>
                        <xsl:text>   }&#10;</xsl:text>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="$pIsAttribute=true()">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:choose>
                            <xsl:when test="xdd:isEnumType($vElementType)">
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, ';&#10;')"/>
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetStringSignature, ';&#10;')"/>
                            </xsl:when>
                            <xsl:when test="$vElementType='Boolean'">
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetBooleanSignature, ';&#10;')"/>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, ';&#10;')"/>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:choose>
                            <xsl:when test="xdd:isEnumType($vElementType)">
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', xdd:createPascalizedName($vElementType,''), '.getFromStringValue(', $vNodeNameLocal, '.getAttribute(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:text>   }&#10;&#10;</xsl:text>
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetStringSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', $vNodeNameLocal, '.getAttribute(&quot;', $vElementName, '&quot;);' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:when test="$vElementType='Boolean'">
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetBooleanSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return Strings.isTrue(', $vNodeNameLocal, '.getAttribute(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', $vNodeNameLocal, '.getAttribute(&quot;', $vElementName, '&quot;);' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="$vIsComplexType=false() and contains($vMaxOccurs, 'unbounded')=false()">
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:choose>
                            <xsl:when test="xdd:isEnumType($vElementType)">
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, ';&#10;')"/>
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetStringSignature, ';&#10;')"/>
                            </xsl:when>
                            <xsl:when test="$vElementType='Boolean'">
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetBooleanSignature, ';&#10;')"/>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, ';&#10;')"/>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:choose>
                            <xsl:when test="xdd:isEnumType($vElementType)">
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', xdd:createPascalizedName($vElementType,''), '.getFromStringValue(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:text>   }&#10;&#10;</xsl:text>
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetStringSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;);' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>

                            <xsl:when test="$vElementType='Boolean'">
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetBooleanSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return Strings.isTrue(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:when test="$vElementType='Integer'">
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      if (', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;) != null &amp;&amp; !', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;).equals(&quot;null&quot;)) {' , '&#10;')"/>
                                <xsl:value-of select=" concat('         return Integer.valueOf(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:value-of select=" concat('      }' , '&#10;')"/>
                                <xsl:value-of select=" concat('      return null;' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:when test="$vElementType='Long'">
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      if (', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;) != null &amp;&amp; !', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;).equals(&quot;null&quot;)) {' , '&#10;')"/>
                                <xsl:value-of select=" concat('         return Long.valueOf(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:value-of select=" concat('      }' , '&#10;')"/>
                                <xsl:value-of select=" concat('      return null;' , '&#10;')"/>

                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:when test="$vElementType='java.util.Date'">
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      if (', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;) != null) {' , '&#10;')"/>
                                <xsl:value-of select=" concat('         return XMLDate.toDate(', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;));' , '&#10;')"/>
                                <xsl:value-of select=" concat('      }' , '&#10;')"/>
                                <xsl:value-of select=" concat('      return null;' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="xdd:writeStandardGetElementJavaDoc($vElementType, $vElementName)"/>
                                <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                                <xsl:value-of select=" concat('      return ', $vNodeNameLocal, '.getTextValueForPatternName(&quot;', $vElementName, '&quot;);' , '&#10;')"/>
                                <xsl:text>   }&#10;</xsl:text>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:when test="$vIsComplexType=false() and contains($vMaxOccurs, 'unbounded')=true()">
                <!-- <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:value-of select=" concat('   ', $vStandardGetListSignature, ';&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>-->
                <xsl:variable name="vReturnType" select="concat('List&lt;', xdd:createPascalizedName($vElementType,'&gt;'))"/>
                <xsl:value-of select=" xdd:writeBodyForGetSimpleDataTypeUnbounded($vStandardGetListSignature, $vNodeNameLocal, $vElementType, $vElementName, $vReturnType, $vIsInterface)"/>
                <!-- </xsl:otherwise>
                </xsl:choose>-->
            </xsl:when>

            <xsl:otherwise>
                <xsl:choose>
                    <xsl:when test="$vIsInterface=true()">
                        <xsl:value-of select=" concat('   ', $vStandardGetSignature, ';')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select=" concat('   ', $vStandardGetSignature, '&#10;   {&#10;')"/>
                        <xsl:value-of select=" concat('      return ', xdd:checkForClassType(xdd:createCamelizedName($vElementName)), ';' , '&#10;   }&#10;')"/>
                    </xsl:otherwise>
                </xsl:choose>

            </xsl:otherwise>
        </xsl:choose>

        <xsl:text>&#10;</xsl:text>
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


    <!-- *********************************************************************** -->
    <!-- ****** Function which writes the GetBodyForSimpleDataTypeUnbounded  *** -->
    <!-- *********************************************************************** -->
    <xsl:function name="xdd:writeBodyForGetSimpleDataTypeUnbounded">
        <xsl:param name="pSignature"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vValueOf" select=" xdd:writeGetValueOf($pElementType, $pElementName)"/>
        <xsl:variable name="vValueOfDataType" select=" xdd:writeGetValueOfDataType($pElementType)"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Returns all &lt;code&gt;', $pElementName, '&lt;/code&gt; elements&#10;')"/>
        <xsl:value-of select="concat('    * @return list of &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($pSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($pSignature, '&#10;')"/>
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
    <!-- ****** Function which writes the GetOrCreateXMLDateBody *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:writeBodyForSetSingleXMLDateNode">
        <xsl:param name="pSignature"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * If not already created, a new &lt;code&gt;', $pElementName,'&lt;/code&gt; element with the given value will be created.&#10;')"/>
        <xsl:value-of select="concat('    * Otherwise, the existing &lt;code&gt;', $pElementName,'&lt;/code&gt; element will be updated with the given value.&#10;')"/>
        <xsl:value-of select="concat('    * @param ', xdd:createPascalizedName($pElementType,''), '&#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of {@link ', $pReturnTypeName, '} &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($pSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($pSignature, '&#10;')"/>
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
    <!-- ****** Function which writes the SetVarArgBody          *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:writeBodyForSetVarArgNodes">
        <xsl:param name="pSignature"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Creates for all ', $pElementType, ' objects representing &lt;code&gt;', $pElementName,'&lt;/code&gt; elements, &#10;')"/>
        <xsl:value-of select="concat('    * a new &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @param list of &lt;code&gt;', $pElementName,'&lt;/code&gt; objects &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of {@link ', $pReturnTypeName, '} &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($pSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($pSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      if (values != null)', '&#10;')"/>
                <xsl:value-of select="concat('      {', '&#10;')"/>
                <xsl:value-of select="concat('         for(', xdd:createPascalizedName($pElementType,''), ' name: values)', '&#10;')"/>
                <xsl:value-of select="concat('         {', '&#10;')"/>
                <xsl:value-of select="concat('            set', xdd:checkForClassType($pMethodName), '(', 'name', ');&#10;')"/>
                <xsl:value-of select="concat('         }', '&#10;')"/>
                <xsl:value-of select="concat('      }', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- ************************************************************* -->
    <!-- ****** Function which writes the AttributeBody            *** -->
    <!-- ************************************************************* -->
    <xsl:function name="xdd:writeBodyForSetAttribute">
        <xsl:param name="pSignature"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Sets the &lt;code&gt;', $pElementName,'&lt;/code&gt; attribute&#10;')"/>
        <xsl:value-of select="concat('    * @param ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ' the value for the attribute &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of {@link ', $pReturnTypeName, '} &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($pSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($pSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.attribute(&quot;', $pElementName, '&quot;, ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the GetOrCreate       Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:writeBodyForSetSingleNode">
        <xsl:param name="pSignature"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * If not already created, a new &lt;code&gt;', $pElementName,'&lt;/code&gt; element with the given value will be created.&#10;')"/>
        <xsl:value-of select="concat('    * Otherwise, the existing &lt;code&gt;', $pElementName,'&lt;/code&gt; element will be updated with the given value.&#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of {@link ', $pReturnTypeName, '} &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($pSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($pSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.getOrCreate(&quot;', $pElementName, '&quot;).text(', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>



    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Create Node  Body      *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:writeBodyForSetUnboundedNodes">
        <xsl:param name="pSignature"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Creates a new &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of {@link ', $pReturnTypeName, '} &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($pSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($pSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.createChild(&quot;', $pElementName, '&quot;).text(', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Remove            Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:writeBodyForRemoveNode">
        <xsl:param name="pSignature"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Removes the &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of {@link ', $pReturnTypeName, '} &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($pSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($pSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.removeChildren(&quot;', $pElementName, '&quot;', ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Remove Attribute  Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:writeBodyForRemoveAttribute">
        <xsl:param name="pSignature"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Removes the &lt;code&gt;', $pElementName,'&lt;/code&gt; attribute &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of {@link ', $pReturnTypeName, '} &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($pSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($pSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.removeAttribute(&quot;', $pElementName, '&quot;', ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Remove            Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:writeBodyForRemoveAllNode">
        <xsl:param name="pSignature"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Removes all &lt;code&gt;', $pElementName,'&lt;/code&gt; elements &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of {@link ', $pReturnTypeName, '} &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($pSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($pSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.removeChildren(&quot;', $pElementName, '&quot;', ');', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>

    <!-- *********************************************************** -->
    <!-- ****** Function which returns correct valueof           *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:writeGetValueOf">
        <xsl:param name="pElementType"/>
        <xsl:param name="pElementName"/>
        <xsl:choose>
            <xsl:when test="$pElementType='Boolean'">
                <xsl:sequence select="'result.add(Boolean.valueOf(node.getText()));'"/>
            </xsl:when>
            <xsl:when test="$pElementType='Integer'">
                <xsl:sequence select="'result.add(Integer.valueOf(node.getText()));'"/>
            </xsl:when>
            <xsl:when test="$pElementType='Long'">
                <xsl:sequence select="'result.add(Long.valueOf(node.getText()));'"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:sequence select="'result.add(node.getText());'"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which returns the node of a class       *** -->
    <!-- *********************************************************** -->
    <xsl:template name="writeNodeName">
        <xsl:param name="pTypeName" as="xs:string"/>

        <xsl:for-each select=" distinct-values(//element/@type)">
            <xsl:if test="substring-after(., ':') = $pTypeName">
                <xsl:variable name="vNodeName" select="$gClasses/class/element[substring-after(@type, ':') = $pTypeName]/@name"/>

                <xsl:choose>
                    <xsl:when test="$vNodeName">
                        <xsl:value-of select="concat('   public final static String nodeName = &quot;', $vNodeName[1], '&quot;;&#10;&#10;')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:variable name="vNodeNameGroup" select="$gGroups/class/element[substring-after(@type, ':') = $pTypeName]/@name"/>
                        <xsl:value-of select="concat('   public final static String nodeName = &quot;', $vNodeNameGroup[1], '&quot;;&#10;&#10;')"/>
                    </xsl:otherwise>
                </xsl:choose>
                <!--                <xsl:value-of select="concat('   public final static String nodeName = &quot;', $vNodeName[1], '&quot;;&#10;&#10;')"/>-->
            </xsl:if>
        </xsl:for-each>

        <!-- <xsl:for-each select=" distinct-values(//descriptor/element/@type)">
            <xsl:if test="substring-after(., ':') = $pTypeName">
                <xsl:variable name="vNodeName" select="$gClasses/class/element[substring-after(@type, ':') = $pTypeName]/@name"/>
                <xsl:value-of select="concat('   public final static String nodeName = &quot;', $vNodeName[1], '&quot;;&#10;&#10;')"/>
            </xsl:if>
        </xsl:for-each>-->
    </xsl:template>

    <!-- *********************************************************** -->
    <!-- ****** Function which returns correct valueof           *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:writeGetValueOfDataType">
        <xsl:param name="pElementType"/>
        <xsl:choose>
            <xsl:when test="$pElementType='Boolean'">
                <xsl:sequence select="'Boolean'"/>
            </xsl:when>
            <xsl:when test="$pElementType='Integer'">
                <xsl:sequence select="'Integer'"/>
            </xsl:when>
            <xsl:when test="$pElementType='Long'">
                <xsl:sequence select="'Long'"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:sequence select="'String'"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which writes the imports           *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeDynamicImports">
        <xsl:param name="pClassName" as="xs:string"/>
        <xsl:param name="pNamespace" as="xs:string"/>
        <xsl:param name="pIsApi" as="xs:boolean"/>

        <xsl:for-each select="$gClasses/class[@name=$pClassName and @namespace=$pNamespace]">
            <xsl:for-each select="element">
                <xsl:value-of select="xdd:writeDynamicImport(@type, $pIsApi)"/>
            </xsl:for-each>
            <xsl:for-each select="include">
                <xsl:variable name="vName" select=" substring-after(@name, ':')"/>
                <xsl:variable name="vNamespace" select=" substring-before(@name, ':')"/>
                <xsl:value-of select="xdd:writeDynamicImports($vName, $vNamespace, $pIsApi)"/>
            </xsl:for-each>
        </xsl:for-each>

        <xsl:for-each select="$gGroups/class[@name=$pClassName and @namespace=$pNamespace]">
            <xsl:for-each select="element">
                <xsl:value-of select="xdd:writeDynamicImport(@type, $pIsApi)"/>
            </xsl:for-each>
            <xsl:for-each select="include">
                <xsl:variable name="vName" select=" substring-after(@name, ':')"/>
                <xsl:variable name="vNamespace" select=" substring-before(@name, ':')"/>
                <xsl:value-of select="xdd:writeDynamicImports($vName, $vNamespace, $pIsApi)"/>
            </xsl:for-each>
        </xsl:for-each>

    </xsl:function>

    <!-- ****************************************************** -->
    <!-- ****** Function which writes the imports           *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeDynamicImport">
        <xsl:param name="pType" as="xs:string"/>
        <xsl:param name="pIsApi" as="xs:boolean"/>

        <xsl:variable name="vType" select=" substring-after($pType, ':')"/>
        <xsl:variable name="vNamespace" select=" substring-before($pType, ':')"/>

        <xsl:for-each select="$gClasses/class[@name=$vType and @namespace=$vNamespace]">
            <xsl:variable name="vPackageApi" select="@packageApi"/>
            <xsl:variable name="vPackageImpl" select="@packageImpl"/>
            <xsl:value-of select="concat('import ', $vPackageApi, '.', xdd:createPascalizedName(@name, ''), ';&#10;')"/>
            <xsl:if test="$pIsApi=false()">
                <xsl:value-of select="concat('import ', $vPackageImpl, '.', xdd:createPascalizedName(@name, 'Impl'), ';&#10;')"/>
            </xsl:if>
        </xsl:for-each>

        <xsl:for-each select="$gEnums/enum[@name=$vType and @namespace=$vNamespace]">
            <xsl:variable name="vPackageApi" select="@package"/>
            <xsl:value-of select="concat('import ', $vPackageApi, '.', xdd:createPascalizedName($vType, ''), ';&#10;')"/>
        </xsl:for-each>

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
                <!-- <xsl:for-each select="$gPackageApis">
                    <xsl:value-of select="concat('import ', @name, '.*;&#10;')"/>
                </xsl:for-each>-->
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;&#10;'"/>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;&#10;'"/>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.impl.base.Strings;&#10;'"/>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;&#10;'"/>
                <!-- <xsl:for-each select="$gPackageImpls">
                    <xsl:value-of select="concat('import ', @name, '.*;&#10;')"/>
                </xsl:for-each>-->
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
    <!-- ****** Function which checks a data type           *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:isGenerateClassTrue" as="xs:boolean">
        <xsl:param name="pPackageApi" as="xs:string"/>
        <xsl:choose>
            <xsl:when test="$gPackageApis[@name=$pPackageApi]/@generateClass='true'">
                <xsl:sequence select="boolean(true())"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:sequence select="boolean(false())"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which checks the type and return   *** -->
    <!-- ****** a java data type, if possible               *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:CheckDataType" as="xs:string">
        <xsl:param name="pTypeName"/>
        <!--        <xsl:message select="concat('checkdatatype: ', $pTypeName)"/>-->
        <xsl:choose>
            <xsl:when test=" starts-with($pTypeName, 'xsd:')">
                <xsl:sequence select="xdd:getJavaDataType($pTypeName)"/>
            </xsl:when>
            <xsl:when test="starts-with($pTypeName, 'javaee:')">
                <xsl:sequence select="xdd:CheckDataType( substring-after($pTypeName, 'javaee:'))"/>
            </xsl:when>
            <xsl:when test="starts-with($pTypeName, 'jboss:')">
                <xsl:sequence select="xdd:CheckDataType( substring-after($pTypeName, 'jboss:'))"/>
            </xsl:when>
            <xsl:when test="starts-with($pTypeName, 'persistence:')">
                <xsl:sequence select="xdd:CheckDataType( substring-after($pTypeName, 'persistence:'))"/>
            </xsl:when>
            <xsl:when test="starts-with($pTypeName, 'j2ee:')">
                <xsl:sequence select="xdd:CheckDataType( substring-after($pTypeName, 'j2ee:'))"/>
            </xsl:when>
            <xsl:when test="contains($pTypeName, ':')">
                <xsl:sequence select="xdd:CheckDataType( substring-after($pTypeName, ':'))"/>
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
                        <xsl:if test="starts-with(@mappedTo, 'j2ee:')">
                            <xsl:sequence select="xdd:CheckDataType(substring-after(@mappedTo, 'j2ee:'))"/>
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
            <xsl:when test="$pText='xsd:decimal'">
                <xsl:sequence select="'String'"/>
                <!-- workaround -->
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


    <xsl:function name="xdd:writeTestDesriptorClass">
        <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolderTest, 'org.jboss.shrinkwrap.descriptor.gen.test', 'TestDescriptorImpl', 'java')"/>
        <!--        <xsl:message select="$vFilename"/>-->
        <xsl:result-document href="{$vFilename}">
            <xsl:value-of select="concat('    package org.jboss.shrinkwrap.descriptor.gen.test;', '&#10;&#10;')"/>
            <xsl:value-of select="concat('    import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;', '&#10;')"/>
            <xsl:value-of select="concat('    import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;', '&#10;')"/>
            <xsl:value-of select="concat('    import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;', '&#10;')"/>
            <xsl:value-of select="concat('    import org.jboss.shrinkwrap.descriptor.spi.Node;', '&#10;')"/>

            <xsl:value-of select="concat('    private class TestDescriptorImpl extends NodeProviderImplBase', '&#10;')"/>
            <xsl:value-of select="concat('    {', '&#10;')"/>
            <xsl:value-of select="concat('        private Node model;', '&#10;')"/>

            <xsl:value-of select="concat('        public TestDescriptorImpl(String descriptorName)', '&#10;')"/>
            <xsl:value-of select="concat('        {', '&#10;')"/>
            <xsl:value-of select="concat('           this(descriptorName, new Node(&quot;some-app&quot;))', '&#10;')"/>
            <xsl:value-of select="concat('        }', '&#10;')"/>

            <xsl:value-of select="concat('        public TestDescriptorImpl(String descriptorName, Node node)', '&#10;')"/>
            <xsl:value-of select="concat('        {', '&#10;')"/>
            <xsl:value-of select="concat('           super(descriptorName);', '&#10;')"/>
            <xsl:value-of select="concat('           this.model = node;', '&#10;')"/>
            <xsl:value-of select="concat('        }', '&#10;')"/>

            <xsl:value-of select="concat('        public Node getRootNode()', '&#10;')"/>
            <xsl:value-of select="concat('        {', '&#10;')"/>
            <xsl:value-of select="concat('           return model;', '&#10;')"/>
            <xsl:value-of select="concat('        }', '&#10;')"/>

            <xsl:value-of select="concat('        protected DescriptorExporter getExporter()', '&#10;')"/>
            <xsl:value-of select="concat('        {', '&#10;')"/>
            <xsl:value-of select="concat('           return new XmlDomExporter();', '&#10;')"/>
            <xsl:value-of select="concat('        }', '&#10;')"/>
            <xsl:value-of select="concat('    }', '&#10;')"/>
        </xsl:result-document>
    </xsl:function>

</xsl:stylesheet>
