<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:functx="http://www.functx.com" xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xs" version="2.0" xmlns:xdd="http://org.jboss/shrinkwrap">
    <!--    <xsl:output method="text"/>-->

    <xsl:output method="text" indent="yes" media-type="text/plain"/>
    <xsl:param name="gOutputFolder" select="'../../../../../impl-gen/src/main/java'"/>
    <xsl:param name="gOutputFolderApi" select="'../../../../../api/src/main/java'"/>
    <xsl:param name="gOutputFolderTest" select="''"/>
    <xsl:param name="gOutputFolderService" select="''"/>
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

<!--    <xsl:include href="../lib/xdd-printElement.xsl"/>-->

    <xsl:template match="/">
        <xsl:call-template name="GenerateEnums"/>
        <xsl:call-template name="GenerateInterfaces"/>
        <xsl:call-template name="GenerateDescriptors"/>
        <xsl:call-template name="GenerateDescriptorsImpl"/>
        <xsl:call-template name="GenerateImplClasses"/>
        <xsl:call-template name="GenerateTestClasses"/>
        <xsl:call-template name="GeneratePackageInfos"/>
        <xsl:call-template name="GenerateServiceFiles"/>
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
                    <xsl:value-of select="xdd:writeClassJavaDoc(@documentation, @name, false(), true(), $gContributors)"/>
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

    <!-- ****************************************************** -->
    <!-- ****** Template which generates the descriptors  ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateServiceFiles">
        <xsl:for-each select="//descriptors/descriptor">
            <xsl:call-template name="WriteServiceFiles">
                <xsl:with-param name="pDescriptor" select="."/>
            </xsl:call-template>
        </xsl:for-each>
    </xsl:template>

    <!-- ******************************************************* -->
    <!-- ****** Template which generates the service files ***** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteServiceFiles">
        <xsl:param name="pDescriptor" select="."/>

        <xsl:if test="$gOutputFolderService != ''">
            <xsl:variable name="vPackage" select="./@packageApi"/>
            <xsl:variable name="vSchema" select=" substring-after(@schemaName, '../xsd/')"/>
            <xsl:variable name="vInterfaceName" select="@name"/>
            <xsl:variable name="vFileName" select="concat($gOutputFolderService, '/' , $vPackage, '.' , $vInterfaceName)"/>
            <xsl:message select="concat('Generating service file: ', $vFileName)"/>

            <xsl:result-document href="{$vFileName}">
                <xsl:variable name="vPackageImpl" select="@packageImpl"/>
<!--                <xsl:variable name="vClassnameImpl" select="xdd:createPascalizedName($pDescriptor/@schemaName, 'DescriptorImpl')"/>-->
                <xsl:variable name="vClassnameImpl" select=" concat(@name, 'Impl')"/>
                <xsl:variable name="vImplClass" select="concat($vPackageImpl, '.' , $vClassnameImpl)"/>
                <xsl:value-of select="concat('implClass=', $vImplClass, '&#10;')"/>
                <xsl:value-of select="concat('importerClass=', 'org.jboss.shrinkwrap.descriptor.spi.node.dom.XmlDomNodeDescriptorImporterImpl', '&#10;')"/>
                <xsl:value-of select="concat('defaultName=', 'default.xml', '&#10;')"/>
            </xsl:result-document>

        </xsl:if>
    </xsl:template>


    <!-- ******************************************************* -->
    <!-- ****** Template which generates the interfaces   ****** -->
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
        <xsl:variable name="vClassname" select="xdd:createPascalizedName(xdd:checkForClassType($pClassNode/@name), '')"/>
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
                <xsl:value-of select="xdd:writeClassJavaDoc(@documentation, $pClassNode/@name, true(), true(), $gContributors)"/>
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
        <xsl:if test="$gOutputFolderTest != ''">
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
                        <xsl:with-param name="pName" select="@name"/>
                        <xsl:with-param name="pIsDescriptor" select="'true'"/>
                    </xsl:call-template>
                </xsl:if>
            </xsl:for-each>
        </xsl:if>
    </xsl:template>

    <!-- ******************************************************* -->
    <!-- ****** Template which generates the descriptors  ****** -->
    <!-- ******************************************************* -->
    <xsl:template name="WriteDescriptor">
        <xsl:param name="pDescriptor" select="."/>
        <xsl:variable name="vPackage" select="./@packageApi"/>
        <xsl:variable name="vSchema" select=" substring-after(@schemaName, '../xsd/')"/>
<!--        <xsl:variable name="vClassname" select="xdd:createPascalizedName(xdd:checkForClassType($pDescriptor/@schemaName), 'Descriptor')"/>-->
        <xsl:variable name="vClassname" select="@name"/>
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
                <xsl:value-of select=" xdd:writeDescriptorJavaDoc($vClassname, $vSchema, $gContributors)"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('interface', $vClassname)"/>
                <xsl:value-of select="concat(' extends Descriptor, DescriptorNamespace', '&lt;', $vClassname, '&gt;')"/>
                <xsl:text>&#10;{&#10;</xsl:text>
                <xsl:variable name="vType" select=" substring-after($pDescriptor/element/@type, ':')"/>
                <xsl:variable name="vNamespace" select=" substring-before($pDescriptor/element/@type, ':')"/>
                <xsl:for-each select="//classes/class[@name=$vType and @namespace=$vNamespace]">
                    <xsl:for-each select="include">
                        <xsl:value-of select="xdd:includeGroupRefs($vClassname, @name, false(), true(), false(), '', @maxOccurs='unbounded')"/>
                    </xsl:for-each>
                    <xsl:for-each select="element">
                        <xsl:variable name="vMaxOccurs" select="concat('-',  @maxOccurs)"/>
                        <xsl:value-of select="xdd:writeMethodOrAttribute($vClassname, @name, @type, $vMaxOccurs, false(), true(), false(), '', exists(@attribute))"/>
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
        <xsl:variable name="vInterfaceName" select="xdd:createPascalizedName(xdd:checkForClassType($pClass/@name), '')"/>
        <xsl:variable name="vClassnameImpl" select="xdd:createPascalizedName(xdd:checkForClassType($pClass/@name), 'Impl')"/>
        <xsl:message select="concat('Generating Implementation Class: ', $vClassnameImpl)"/>
        <xsl:if test="$vClassnameImpl">
            <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolder, $vPackage, $vClassnameImpl, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writeCopyright()"/>
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.spi.node.Node;&#10;</xsl:text>
                <xsl:value-of select="concat('import ', $pClass/@packageApi, '.', xdd:createPascalizedName($vInterfaceName,''), ';&#10;')"/>
                <xsl:value-of select="xdd:writeImports(true())"/>
                <xsl:value-of select="xdd:writeImports(false())"/>
                <xsl:value-of select="xdd:writeDynamicImports($pClass/@name, $pClass/@namespace, false())"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select="xdd:writeClassJavaDoc(@documentation, $pClass/@name, false(), true(), $gContributors)"/>
                <xsl:variable name="vName" select="@name"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('class', $vClassnameImpl)"/>
                <xsl:text>&lt;T&gt;</xsl:text>
                <xsl:text> implements Child&lt;T&gt;, </xsl:text>
                <xsl:value-of select="xdd:createPascalizedName($vInterfaceName, '&lt;T&gt;')"/>
                <xsl:text>&#10;</xsl:text>
                <xsl:text>{</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select=" xdd:writeAttribute('T', 't', true())"/>
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
        <!--<xsl:variable name="vInterfaceName" select="xdd:createPascalizedName($pDescriptor/@schemaName, 'Descriptor')"/>
        <xsl:variable name="vClassnameImpl" select="xdd:createPascalizedName($pDescriptor/@schemaName, 'DescriptorImpl')"/>-->
        
        <xsl:variable name="vInterfaceName" select="@name"/>
        <xsl:variable name="vClassnameImpl" select=" concat(@name, 'Impl')"/>
        
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
                <xsl:text>import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;&#10;</xsl:text>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;&#10;</xsl:text>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.spi.node.Node;&#10;</xsl:text>
                <xsl:text>&#10;</xsl:text>
                <xsl:value-of select=" xdd:writeDescriptorJavaDoc($vInterfaceName, $vSchema, $gContributors)"/>
                <xsl:value-of select="xdd:classHeaderDeclaration('class', $vClassnameImpl)"/>
                <xsl:value-of select="concat(' extends NodeDescriptorImplBase implements DescriptorNamespace', '&lt;', $vInterfaceName, '&gt;', ', ')"/>
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
        <xsl:variable name="vInterfaceName" select="xdd:createPascalizedName(xdd:checkForClassType($pName), '')"/>
        <xsl:variable name="vClassnameImpl" select="xdd:createPascalizedName(xdd:checkForClassType($pName), 'Impl')"/>
        <xsl:variable name="vTestClassname" select="xdd:createPascalizedName(xdd:checkForClassType($pName), 'ImplTestCase')"/>
        <xsl:message select="concat('Generating Test Class: ', $vTestClassname)"/>
        <xsl:if test="$vTestClassname">
            <xsl:variable name="vFilename" select="xdd:createPath($gOutputFolderTest, $vPackage, $vTestClassname, 'java')"/>
            <xsl:result-document href="{$vFilename}">
                <xsl:value-of select="xdd:writeCopyright()"/>
                <xsl:value-of select="xdd:writePackageLine($vPackage)"/>
                <xsl:text>import org.jboss.shrinkwrap.descriptor.spi.node.Node;&#10;</xsl:text>
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
                                    <xsl:value-of select="xdd:includeGroupInTestCase($vClassnameImpl,$vInterfaceName,$vNodeName, $vGroupName,$vNamespace,$vIsMaxOccursUnbounded,$pIsDescriptor)"/>
                                </xsl:for-each>
                            </xsl:for-each>
                        </xsl:for-each>
                    </xsl:when>

                    <xsl:otherwise>
                        <xsl:for-each select="include">
                            <xsl:variable name="vIsMaxOccursUnbounded" select="@maxOccurs='unbounded'" as="xs:boolean"/>
                            <xsl:variable name="vGroupName" select=" substring-after(@name, ':')"/>
                            <xsl:variable name="vNamespace" select=" substring-before(@name, ':')"/>
                            <xsl:value-of select="xdd:includeGroupInTestCase($vClassnameImpl,$vInterfaceName,$vNodeName, $vGroupName,$vNamespace,$vIsMaxOccursUnbounded,$pIsDescriptor)"/>
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
            <xsl:when test="@type='text'"> </xsl:when>
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
                        <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                        <xsl:value-of select="concat('      assertFalse(type.is', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                    </xsl:when>

                    <xsl:when test="xdd:isEnumType(@type)">
                        <xsl:variable name="vDataType" select=" substring-after(@type, ':')"/>
                        <xsl:value-of select="concat('      for(', xdd:createPascalizedName($vDataType,''), ' e: ', xdd:createPascalizedName($vDataType,''), '.values())', '&#10;')"/>
                        <xsl:value-of select="concat('      {', '&#10;')"/>
                        <xsl:value-of select="concat('         type.', xdd:createCamelizedName(@name), '(e);', '&#10;')"/>
                        <xsl:value-of select="concat('         assertEquals(type.get', xdd:createPascalizedName(@name,''), '(), e);', '&#10;')"/>
                        <xsl:value-of select="concat('         type.', xdd:createCamelizedName(@name), '(e.toString());', '&#10;')"/>
                        <xsl:value-of select="concat('         assertEquals(type.get', xdd:createPascalizedName(@name,''), 'AsString(), e.toString());', '&#10;')"/>
                        <xsl:value-of select="concat('      }', '&#10;')"/>
                    </xsl:when>

                    <xsl:when test="xdd:isDataType(@type) and (@maxOccurs != 'unbounded' or exists(@maxOccurs)=false()) and $pIsMaxOccursUnbounded=false()">
                        <xsl:variable name="vDataType" select="xdd:CheckDataType(@type)"/>
                        <xsl:choose>
                            <xsl:when test="$vDataType='Boolean'">
                                <xsl:value-of select="concat('      type.', xdd:stripNumbersFromString(xdd:createCamelizedName(@name)), '(true);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.is', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                                <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertFalse(type.is', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                            </xsl:when>
                            <xsl:when test="$vDataType='Integer'">
                                <xsl:value-of select="concat('      type.', xdd:createCamelizedName(@name), '(8);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.get', xdd:createPascalizedName(@name,''), '() == 8);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertNull(type.get', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                            </xsl:when>
                            <xsl:when test="$vDataType='Long'">
                                <xsl:value-of select="concat('      type.', xdd:createCamelizedName(@name), '(8L);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.get', xdd:createPascalizedName(@name,''), '() == 8L);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertNull(type.get', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                            </xsl:when>
                            <xsl:when test="$vDataType='java.util.Date'">
                                <xsl:value-of select="concat('      java.util.Date testDate = new java.util.Date();', '&#10;')"/>
                                <xsl:value-of select="concat('      type.', xdd:createCamelizedName(@name), '(testDate);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.get', xdd:createPascalizedName(@name,''), '(), testDate);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertNull(type.get', xdd:createPascalizedName(@name,''), '());', '&#10;')"/>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="concat('      type.', xdd:createCamelizedName(xdd:checkForClassType(@name)), '(&quot;test&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.get', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '(), &quot;test&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.remove', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertNull(type.get', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '());', '&#10;')"/>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:when>

                    <xsl:when test="xdd:isDataType(@type) and (@maxOccurs = 'unbounded' or $pIsMaxOccursUnbounded=true())">
                        <xsl:variable name="vDataType" select="xdd:CheckDataType(@type)"/>
                        <xsl:choose>
                            <xsl:when test="$vDataType='Integer'"> </xsl:when>
                            <xsl:when test="$vDataType='Long'"> </xsl:when>
                            <xsl:when test="$vDataType='java.util.Date'"> </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="concat('      type.', xdd:createCamelizedName(xdd:checkForClassType(@name)), '(&quot;value1&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.', xdd:createCamelizedName(xdd:checkForClassType(@name)), '(&quot;value2&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.', xdd:createCamelizedName(xdd:checkForClassType(@name)), '(&quot;value3&quot;, &quot;value4&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.getAll', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '().size() == 4);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.getAll', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '().get(0), &quot;value1&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.getAll', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '().get(1), &quot;value2&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.getAll', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '().get(2), &quot;value3&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      assertEquals(type.getAll', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '().get(3), &quot;value4&quot;);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.removeAll', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.getAll', xdd:createPascalizedName(xdd:checkForClassType(@name),''), '().size() == 0);', '&#10;')"/>
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:when>

                    <xsl:otherwise>
                        <!-- it is a complex type -->
                        <xsl:choose>
                            <xsl:when test="contains($vMaxOccurs, 'unbounded') or $pIsMaxOccursUnbounded=true()">
                                <xsl:value-of select="concat('      type.create', xdd:createPascalizedName(@name,''), '().up();', '&#10;')"/>
                                <xsl:value-of select="concat('      type.create', xdd:createPascalizedName(@name,''), '().up();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.getAll', xdd:createPascalizedName(@name,''), '().size() == 2);', '&#10;')"/>
                                <xsl:value-of select="concat('      type.removeAll', xdd:createPascalizedName(@name,''), '();', '&#10;')"/>
                                <xsl:value-of select="concat('      assertTrue(type.getAll', xdd:createPascalizedName(@name,''), '().size() == 0);', '&#10;')"/>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:value-of select="concat('      type.getOrCreate', xdd:createPascalizedName(@name,''), '().up();', '&#10;')"/>
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
    <!-- ****** Function which writes the copyright      ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeCopyright">
        <xsl:for-each select="$gCopyright//line">
            <xsl:value-of select="concat(text(), '&#10;')"/>
        </xsl:for-each>
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
                    <xsl:value-of select=" xdd:writeMethodOrAttribute($pClassname, @name, @type, '-unbounded', $pWriteAttribute, $pWriteInterface, $pIsGeneric, $pNodeNameLocal, exists(@attribute))"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select=" xdd:writeMethodOrAttribute($pClassname, @name, @type, $vMaxOccurs, $pWriteAttribute, $pWriteInterface, $pIsGeneric, $pNodeNameLocal, exists(@attribute))"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>
        <xsl:for-each select="$gGroups/class[@name=$vGroupName and @namespace=$vNamespace]/include">
            <xsl:variable name="vMaxOccurs" select="concat('-', @maxOccurs)"/>
            <xsl:value-of select="xdd:includeGroupRefs($pClassname, @name, $pWriteAttribute, $pWriteInterface, $pIsGeneric, $pNodeNameLocal, @maxOccurs='unbounded')"/>
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
        <xsl:param name="pWriteInterface" as="xs:boolean"/>
        <xsl:param name="pIsGeneric" as="xs:boolean"/>
        <xsl:param name="pNodeNameLocal" as="xs:string"/>
        <xsl:param name="pIsAttribute" as="xs:boolean"/>
        <xsl:variable name="vMethodName" select="xdd:createPascalizedName($pElementName,'')"/>
        <xsl:variable name="vReturn" select=" xdd:getReturnType($pClassName, $pIsGeneric)"/>

        <xsl:value-of select="xdd:writeTypeCommentLines($pClassName, $pElementType, $pElementName, $pMaxOccurs, $pWriteAttribute, $pWriteInterface, $pIsGeneric, $pNodeNameLocal,$pIsAttribute, xdd:isEnumType($pElementType), xdd:isDataType($pElementType))"/>

        <xsl:choose>
            <xsl:when test="$pElementType='text'">
                <xsl:value-of select="xdd:printBodyText($vReturn, 'String', $vMethodName, $pNodeNameLocal, $pElementName, $vReturn, $pWriteInterface, false())"/>
            </xsl:when>

            <xsl:when test="$pElementType='javaee:emptyType' or $pElementType='javaee:ordering-othersType' or 
                            $pElementType='faces-config-ordering-othersType' or $pElementType='extensibleType'">
                <xsl:value-of select="xdd:printEmptyBoolean($vReturn, 'Boolean', $vMethodName, $pNodeNameLocal, $pElementName, $vReturn, $pWriteInterface)"/>
            </xsl:when>

            <xsl:when test="xdd:isEnumType($pElementType)">
                <xsl:value-of select="xdd:printEnums($vReturn, $pElementType, $vMethodName, $pNodeNameLocal, $pElementName, $vReturn, $pWriteInterface, xdd:isEnumType($pElementType), $pIsAttribute)"/>
            </xsl:when>

            <xsl:when test="$pIsAttribute">
                <xsl:variable name="vDataType" select="xdd:CheckDataType($pElementType)"/>
                <xsl:value-of select="xdd:printAttributes($vReturn, $vDataType, $vMethodName, $pNodeNameLocal, $pElementName, $vReturn, $pWriteInterface, xdd:isEnumType($pElementType))"/>
            </xsl:when>

            <xsl:when test="xdd:isDataType($pElementType)">
                <xsl:variable name="vDataType" select="xdd:CheckDataType($pElementType)"/>

                <xsl:value-of select="xdd:printDataType($vReturn, $vDataType, $vMethodName, $pNodeNameLocal, $pElementName, $vReturn, $pWriteInterface, contains($pMaxOccurs, 'unbounded'))"/>
            </xsl:when>

            <xsl:when test="$pIsGeneric=false()">
                <xsl:variable name="vReturnGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&gt;'))"/>
                <xsl:variable name="vElementTypeGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', $pClassName, '&gt;'))"/>
                <xsl:choose>
                    <xsl:when test="contains($pMaxOccurs, 'unbounded')">
                        <xsl:value-of select="xdd:printComplexTypeUnboundedXX($vReturn, $vElementTypeGeneric, $vMethodName, $pNodeNameLocal, $pElementName, $vReturnGeneric, $pWriteInterface)"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:printComplexTypeSingleXX($vReturn, $vElementTypeGeneric, $vMethodName, $pNodeNameLocal, $pElementName, $vReturnGeneric, $pWriteInterface)"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:when>

            <xsl:otherwise>
                <!-- it is a complex type -->
                <xsl:variable name="vReturnGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', xdd:checkForClassType($pClassName), '&lt;T&gt;&gt;'))"/>
                <xsl:variable name="vElementTypeGeneric" select="xdd:createPascalizedName($pElementType, concat('&lt;', xdd:checkForClassType($pClassName), '&lt;T&gt;&gt;'))"/>
                <xsl:variable name="vClassType" select="xdd:createPascalizedName($vElementTypeGeneric,'')"/>
                <xsl:choose>
                    <xsl:when test="contains($pMaxOccurs, 'unbounded')">
                        <xsl:value-of select="xdd:printComplexTypeUnboundedXX($vReturn, $vElementTypeGeneric, $vMethodName, $pNodeNameLocal, $pElementName, $vReturnGeneric, $pWriteInterface)"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="xdd:printComplexTypeSingleXX($vReturn, $vElementTypeGeneric, $vMethodName, $pNodeNameLocal, $pElementName, $vReturnGeneric, $pWriteInterface)"/>
                    </xsl:otherwise>
                </xsl:choose>
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

        <xsl:for-each select="$gEnums/enum[@name=$pClassName and @namespace=$pNamespace]">
            <xsl:value-of select="xdd:writeDynamicImport(@type, $pIsApi)"/>
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
        <xsl:message select="concat('xdd:CheckDataType: ', $pTypeName)"/>
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
            <xsl:when test="xdd:getJavaDataType($pTypeName) != ''">
                <xsl:sequence select="xdd:getJavaDataType($pTypeName)"/>
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
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pClassType, '&lt;/code&gt; &#10;')"/>
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
    <!-- ****** Body Text          ********************************* -->
    <!-- *********************************************************** -->
    <!-- *********************************************************** -->


    <!-- *********************************************************** -->
    <!-- ****** ENTRY FUNCTION - prints body text                *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printBodyText">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:param name="pIsEnum" as="xs:boolean"/>
        <xsl:value-of select="xdd:printSetBodyText($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
        <xsl:value-of select="xdd:printGetBodyText($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
    </xsl:function>


    <!-- ************************************************************* -->
    <!-- ****** Function which writes the set Body Text            *** -->
    <!-- ************************************************************* -->
    <xsl:function name="xdd:printSetBodyText">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vSetBodyTextSignature" select="concat('   public ', $pClassType, ' text(String value)')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Sets the body text for the element &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    * @param ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ' the value for the body text &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vSetBodyTextSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vSetBodyTextSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.text(value);', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>



    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Get Body Text          *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetBodyText">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vGetSignature" select="concat('public ', xdd:createPascalizedName($pElementType,''), ' getText()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Returns the body text of the element &lt;code&gt;', $pElementName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the value defined for the text &lt;code&gt;', $pElementName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat('   ',$vGetSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('   ', $vGetSignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      return ', $pNodeNameLocal, '.getText();' , '&#10;')"/>
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
            <xsl:when test="$pElementType='Integer'">
                <xsl:value-of select="xdd:printSetAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printGetIntegerAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
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
        <xsl:variable name="vGetSignature" select="concat('   public ', xdd:createPascalizedName($pElementType,''), ' get', xdd:checkForClassType($pMethodName), '()')"/>
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
    <!-- ****** Function which writes the Getbbb Attribute  Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetEnumAttribute">
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
                <xsl:value-of select="concat('      return ', xdd:createPascalizedName($pElementType,''), '.getFromStringValue(', $pNodeNameLocal, '.getAttribute(&quot;', $pElementName, '&quot;));' , '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:function>


    <!-- *********************************************************** -->
    <!-- ****** Function which writes the GetOrCreate       Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetEnumAttributeAsString">
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
        <xsl:value-of select="concat('    * Returns the &lt;code&gt;', $pElementName, '&lt;/code&gt; attribute&#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the value found for the element &lt;code&gt;', $pElementName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat('   ', $vGetStringSignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat('   ', $vGetStringSignature, '&#10;')"/>
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
    <!-- ****** Function which writes the Getbooleab Attribute   *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printGetIntegerAttribute">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vGetBooleanSignature" select="concat('public ', xdd:createPascalizedName($pElementType,''), ' get', xdd:checkForClassType($pMethodName), '()')"/>
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
                <xsl:value-of select="concat('      if(', $pNodeNameLocal, '.getAttribute(&quot;', $pElementName, '&quot;) != null &amp;&amp; !', $pNodeNameLocal, '.getAttribute(&quot;', $pElementName, '&quot;).equals(&quot;null&quot;))' , '&#10;')"/>
                <xsl:value-of select="concat('      {', '&#10;')"/>
                <xsl:value-of select="concat('         return Integer.valueOf(', $pNodeNameLocal, '.getAttribute(&quot;', $pElementName, '&quot;));' , '&#10;')"/>
                <xsl:value-of select="concat('      }', '&#10;')"/>
                <xsl:value-of select="concat('      return null;' , '&#10;')"/>
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
        <xsl:param name="pIsAttribute" as="xs:boolean"/>
        <xsl:choose>
            <xsl:when test="$pIsAttribute=true()">
                <xsl:value-of select="xdd:printSetAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printSetEnumAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printGetEnumAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printGetEnumAttributeAsString($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printRemoveAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="xdd:printSetEnum($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printSetEnumAsString($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printGetEnum($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printGetEnumAsString($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
                <xsl:value-of select="xdd:printRemoveAttribute($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
            </xsl:otherwise>
        </xsl:choose>
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
        <xsl:value-of select=" xdd:printRemoveEmptyBoolean($pClassType, $pElementType, $pMethodName, $pNodeNameLocal, $pElementName, $pReturnTypeName, $pIsInterface)"/>
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

    <!-- *********************************************************** -->
    <!-- ****** Function which writes the Remove            Body *** -->
    <!-- *********************************************************** -->
    <xsl:function name="xdd:printRemoveEmptyBoolean">
        <xsl:param name="pClassType"/>
        <xsl:param name="pElementType"/>
        <xsl:param name="pMethodName"/>
        <xsl:param name="pNodeNameLocal"/>
        <xsl:param name="pElementName"/>
        <xsl:param name="pReturnTypeName"/>
        <xsl:param name="pIsInterface" as="xs:boolean"/>
        <xsl:variable name="vRemoveBooleanEmptySignature" select="concat('   public ', $pClassType, ' remove', xdd:checkForClassType($pMethodName), '()')"/>
        <xsl:value-of select="concat('', '&#10;')"/>
        <xsl:value-of select="concat('   /**', '&#10;')"/>
        <xsl:value-of select="concat('    * Removes the &lt;code&gt;', $pElementName,'&lt;/code&gt; element &#10;')"/>
        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
        <xsl:value-of select="concat('    */', '&#10;')"/>
        <xsl:choose>
            <xsl:when test="$pIsInterface=true()">
                <xsl:value-of select="concat($vRemoveBooleanEmptySignature, ';&#10;')"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="concat($vRemoveBooleanEmptySignature, '&#10;')"/>
                <xsl:value-of select="concat('   {', '&#10;')"/>
                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.removeChild(&quot;', $pElementName, '&quot;);', '&#10;')"/>
                <xsl:value-of select="concat('      return this;', '&#10;')"/>
                <xsl:value-of select="concat('   }', '&#10;')"/>
            </xsl:otherwise>
        </xsl:choose>
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
    <!-- ****** Function which writes the imports           *** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:writeImports">
        <xsl:param name="vIsApi" as="xs:boolean"/>
        <xsl:choose>
            <xsl:when test="$vIsApi=true()">
                <xsl:value-of select="'import java.util.ArrayList;&#10;'"/>
                <xsl:value-of select="'import java.util.List;&#10;'"/>
                <!--<xsl:value-of select="'import java.util.Map;&#10;'"/>-->
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.api.Child;&#10;'"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;&#10;'"/>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.impl.base.Strings;&#10;'"/>
                <xsl:value-of select="'import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;&#10;'"/>
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
        <xsl:text>      addDefaultNamespaces();&#10;</xsl:text>
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
        <xsl:value-of select="concat('     return this;', '&#10;')"/>
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
        <xsl:value-of select="concat('      java.util.Map&lt;String, String&gt; attributes = model.getAttributes();', '&#10;')"/>
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
        <xsl:value-of select="concat('      java.util.Map&lt;String, String&gt; attributes = model.getAttributes();', '&#10;')"/>
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


    <!-- ****************************************************** -->
    <!-- ******  Utility Functions **************************** -->
    <!-- ****************************************************** -->
    

    <!-- ****************************************************** -->
    <!-- ******  Function which generates a camel case string * -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:words-to-camel-case" as="xs:string">
        <xsl:param name="arg" as="xs:string?"/>
        <xsl:sequence select=" 
            string-join((tokenize($arg,'\s+')[1],
            for $word in tokenize($arg,'\s+')[position() > 1]
            return xdd:capitalize-first($word))
            ,'')
            "/>
    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ******  Function which capitalize tje first char     * -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:capitalize-first" as="xs:string?">
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
        <xsl:variable name="retValue" select="xdd:words-to-camel-case($retValue)"/>
        <xsl:variable name="retValue" select="concat(upper-case(substring($retValue,1,1)), substring($retValue,2))"/>
        <xsl:variable name="retValue" select="xdd:stripNumbersFromString($retValue)"/>
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
    
    <xsl:function name="xdd:stripNumbersFromString">
      <xsl:param name="name" />
        <xsl:sequence
            select="
             if (contains($name, '0')) then
                   xdd:stripNumbersFromString(replace($name,'0',''))
             else if (contains($name, '1')) then
                   xdd:stripNumbersFromString(replace($name,'1',''))                   
             else if (contains($name, '2')) then
                   xdd:stripNumbersFromString(replace($name,'2',''))
             else if (contains($name, '3')) then
                   xdd:stripNumbersFromString(replace($name,'3',''))
             else if (contains($name, '4')) then
                   xdd:stripNumbersFromString(replace($name,'4',''))
             else if (contains($name, '5')) then
                   xdd:stripNumbersFromString(replace($name,'5',''))
             else if (contains($name, '6')) then
                   xdd:stripNumbersFromString(replace($name,'6',''))
             else if (contains($name, '7')) then
                   xdd:stripNumbersFromString(replace($name,'7',''))
             else if (contains($name, '8')) then
                   xdd:stripNumbersFromString(replace($name,'8',''))
             else if (contains($name, '9')) then
                   xdd:stripNumbersFromString(replace($name,'9',''))
             else
                 string($name)
        "
        />

    </xsl:function>


    <!-- ****************************************************** -->
    <!-- ****** Function which creates a type   name     ****** -->
    <!-- ****************************************************** -->
    <xsl:function name="xdd:createCamelizedName">
        <xsl:param name="name"/>
        <xsl:sequence select="xdd:words-to-camel-case(xdd:normalizeString($name))"/>
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
            <xsl:when test="$pText='xsd:int'">
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
             <xsl:when test="$pText='int'">
                <xsl:sequence select="'Integer'"/>
            </xsl:when>
            <xsl:when test="$pText='xsdStringType'">
                <xsl:sequence select="'String'"/>
            </xsl:when>
            <xsl:when test="$pText='xsdNMTOKENType'">
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
            <xsl:when test="$pText='xsd:ID'">
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
            <xsl:when test="$vMethodName='default'">
                <xsl:sequence select="'_default'"/>
            </xsl:when>
            <xsl:when test="$vMethodName='Default'">
                <xsl:sequence select="'_Default'"/>
            </xsl:when>
           <xsl:when test="$vMethodName='package'">
                <xsl:sequence select="'_package'"/>
            </xsl:when>
           <!-- <xsl:when test="$vMethodName='Set'">
                <xsl:sequence select="'_Set'"/>
            </xsl:when>-->
            <xsl:otherwise>
                <xsl:sequence select="$vMethodName"/>
            </xsl:otherwise>
        </xsl:choose>
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
    
</xsl:stylesheet>
