<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xs" version="2.0">

    <xsl:template match="/">
        <metadata>
            <xsl:call-template name="GenerateStatistic"/>
            <xsl:call-template name="GenerateCopyright"/>
            <xsl:call-template name="GenerateContributors"/>
            <xsl:call-template name="GeneratePackages"/>
            <xsl:call-template name="GenerateDataTypes"/>
            <xsl:call-template name="GenerateEnums"/>
            <xsl:call-template name="GenerateGroups"/>
            <xsl:call-template name="GenerateClasses"/>
            <xsl:call-template name="GenerateDescriptors"/>
        </metadata>
    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ****** Template which generates the copyright   ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateCopyright">
        <copyright>
            <xsl:for-each select="//copyright">
                <xsl:for-each select="document(@name)/copyright/line">
                    <line>
                        <xsl:value-of select="text()"/>
                    </line>
                </xsl:for-each>
            </xsl:for-each>
        </copyright>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the contributors ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateContributors">
        <contributors>
            <xsl:for-each select="//contributors">
                <xsl:for-each select="document(@name)//contributor">
                    <contributor>
                        <xsl:attribute name="name">
                            <xsl:value-of select="@name"/>
                        </xsl:attribute>
                        <xsl:attribute name="mailto">
                            <xsl:value-of select="@mailto"/>
                        </xsl:attribute>
                    </contributor>
                </xsl:for-each>
            </xsl:for-each>
        </contributors>
    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ****** Template which generates the data types  ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateStatistic">
        <statistics>
            <xsl:for-each select="//schema">
                <xsl:call-template name="WriteStatistic">
                    <xsl:with-param name="pDocument" select="@name"/>
                    <xsl:with-param name="pArea" select="'groups'"/>
                </xsl:call-template>
            </xsl:for-each>

            <xsl:for-each select="//schema">
                <xsl:call-template name="WriteStatistic">
                    <xsl:with-param name="pDocument" select="@name"/>
                    <xsl:with-param name="pArea" select="'enums'"/>
                </xsl:call-template>
            </xsl:for-each>

        </statistics>

    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ****** Template which generates the data types  ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateDataTypes">
        <datatypes>
            <xsl:for-each select="//schema">
                <xsl:call-template name="WriteDataTypes">
                    <xsl:with-param name="pDocument" select="@name"/>
                    <xsl:with-param name="pNamespace" select="@namespace"/>
                </xsl:call-template>
            </xsl:for-each>
        </datatypes>

    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the packages    ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="GeneratePackages">
        <packages>
            <xsl:for-each select="//@packageApi">
                <api>
                    <xsl:attribute name="name">
                        <xsl:value-of select="."/>
                    </xsl:attribute>
                    <xsl:attribute name="schema">
                        <xsl:value-of select="../@name"/>
                    </xsl:attribute>
                </api>
            </xsl:for-each>
            <xsl:for-each select="//@packageImpl">
                <impl>
                    <xsl:attribute name="name">
                        <xsl:value-of select="."/>
                    </xsl:attribute>
                    <xsl:attribute name="schema">
                        <xsl:value-of select="../@name"/>
                    </xsl:attribute>
                </impl>
            </xsl:for-each>

        </packages>

    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ****** Template which generates the enumarations ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateEnums">
        <enums>
            <xsl:for-each select="//schema">
                <xsl:call-template name="WriteEnums">
                    <xsl:with-param name="pDocument" select="@name"/>
                    <xsl:with-param name="pPackage" select="@packageApi"/>
                    <xsl:with-param name="pNamespace" select="@namespace"/>
                </xsl:call-template>
            </xsl:for-each>

        </enums>
    </xsl:template>



    <!-- ****************************************************** -->
    <!-- ****** Template which generates the grpups       ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateGroups">
        <groups>
            <xsl:for-each select="//schema">
                <xsl:call-template name="WriteGroups">
                    <xsl:with-param name="pDocument" select="@name"/>
                    <xsl:with-param name="pPackage" select="@packageApi"/>
                    <xsl:with-param name="pNamespace" select="@namespace"/>
                </xsl:call-template>
            </xsl:for-each>
        </groups>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the classes      ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateClasses">
        <classes>
            <xsl:for-each select="//schema">
                <xsl:choose>
                    <xsl:when test="contains(@name, 'persistence_2_0.xsd')">
                        <xsl:call-template name="WritePersistenceClasses">
                            <xsl:with-param name="pDocument" select="@name"/>
                            <xsl:with-param name="pPackageApi" select="@packageApi"/>
                            <xsl:with-param name="pPackageImpl" select="@packageImpl"/>
                            <xsl:with-param name="pNamespace" select="@namespace"/>
                        </xsl:call-template>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:call-template name="WriteClasses">
                            <xsl:with-param name="pDocument" select="@name"/>
                            <xsl:with-param name="pPackageApi" select="@packageApi"/>
                            <xsl:with-param name="pPackageImpl" select="@packageImpl"/>
                            <xsl:with-param name="pNamespace" select="@namespace"/>
                        </xsl:call-template>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:for-each>
        </classes>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the descriptors  ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateDescriptors">
        <descriptors>
            <xsl:for-each select="//schema">
                <xsl:if test="@generateDDClass='true'">
                    <xsl:variable name="vNameSpaces" select="namespace/text()"/>
                    <descriptor>
                        <xsl:choose>
                            <xsl:when test="contains(@name, 'persistence_2_0.xsd')">
                                <xsl:attribute name="schemaName">
                                    <xsl:value-of select="@name"/>
                                </xsl:attribute>
                                <xsl:attribute name="namespace">
                                    <xsl:value-of select="@namespace"/>
                                </xsl:attribute>
                                <xsl:attribute name="packageApi">
                                    <xsl:value-of select="@packageApi"/>
                                </xsl:attribute>
                                <xsl:attribute name="packageImpl">
                                    <xsl:value-of select="@packageImpl"/>
                                </xsl:attribute>

                                <xsl:for-each select="namespace">
                                    <namespace>
                                        <xsl:attribute name="name">
                                            <xsl:value-of select="@name"/>
                                        </xsl:attribute>
                                        <xsl:attribute name="value">
                                            <xsl:value-of select="@value"/>
                                        </xsl:attribute>
                                    </namespace>
                                </xsl:for-each>

                                <element>
                                    <xsl:attribute name="name">
                                        <xsl:value-of select="'persistence'"/>
                                    </xsl:attribute>
                                    <xsl:attribute name="type">
                                        <xsl:value-of select="'persistence:persistence'"/>
                                    </xsl:attribute>
                                    <xsl:attribute name="defaultNamespaces">
                                        <xsl:value-of select="$vNameSpaces"/>
                                    </xsl:attribute>
                                </element>

                            </xsl:when>

                            <xsl:otherwise>
                                <xsl:attribute name="schemaName">
                                    <xsl:value-of select="@name"/>
                                </xsl:attribute>
                                <xsl:attribute name="namespace">
                                    <xsl:value-of select="@namespace"/>
                                </xsl:attribute>
                                <xsl:attribute name="packageApi">
                                    <xsl:value-of select="@packageApi"/>
                                </xsl:attribute>
                                <xsl:attribute name="packageImpl">
                                    <xsl:value-of select="@packageImpl"/>
                                </xsl:attribute>

                                <xsl:for-each select="namespace">
                                    <namespace>
                                        <xsl:attribute name="name">
                                            <xsl:value-of select="@name"/>
                                        </xsl:attribute>
                                        <xsl:attribute name="value">
                                            <xsl:value-of select="@value"/>
                                        </xsl:attribute>
                                    </namespace>
                                </xsl:for-each>

                                <xsl:for-each select="document(@name)/*/xsd:element">
                                    <!--                            <xsl:if test="local-name() = 'element'">-->
                                    <element>
                                        <xsl:attribute name="name">
                                            <xsl:value-of select="@name"/>
                                        </xsl:attribute>
                                        <xsl:attribute name="type">
                                            <xsl:value-of select="@type"/>
                                        </xsl:attribute>
                                        <xsl:attribute name="defaultNamespaces">
                                            <xsl:value-of select="$vNameSpaces"/>
                                        </xsl:attribute>
                                    </element>
                                    <!--                            </xsl:if>-->
                                </xsl:for-each>

                            </xsl:otherwise>
                        </xsl:choose>
                    </descriptor>
                </xsl:if>
            </xsl:for-each>
        </descriptors>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which writes the groups         ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WriteStatistic">
        <xsl:param name="pDocument"/>
        <xsl:param name="pPackage"/>
        <xsl:param name="pArea"/>

        <xsl:if test="$pArea='groups'">
            <groups>
                <xsl:attribute name="schemaName">
                    <xsl:value-of select="$pDocument"/>
                </xsl:attribute>
                <xsl:attribute name="count">
                    <xsl:value-of select="count(document($pDocument)//xsd:group/@name) + count(document($pDocument)//xsd:attributeGroup/@name) "/>
                </xsl:attribute>
            </groups>
        </xsl:if>

        <xsl:if test="$pArea='enums'">
            <enums>
                <xsl:attribute name="schemaName">
                    <xsl:value-of select="$pDocument"/>
                </xsl:attribute>
                <xsl:attribute name="count">
                    <xsl:value-of select="count(document($pDocument)//xsd:enumeration) "/>
                </xsl:attribute>
            </enums>
        </xsl:if>

    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which writes the data types     ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WriteDataTypes">
        <xsl:param name="pDocument"/>
        <xsl:param name="pNamespace"/>
        <xsl:for-each select="document($pDocument)//xsd:complexType">
            <xsl:variable name="complexTypeName" select="@name"/>

            <xsl:if test="count(xsd:sequence/xsd:any) = 1 or $complexTypeName='faces-config-valueType'">
                <datatype>
                    <xsl:attribute name="name">
                        <xsl:value-of select="$complexTypeName"/>
                    </xsl:attribute>
                    <xsl:attribute name="mappedTo">
                        <xsl:value-of select="'javaee:string'"/>
                    </xsl:attribute>
                    <xsl:attribute name="namespace">
                        <xsl:value-of select="$pNamespace"/>
                    </xsl:attribute>
                    <xsl:attribute name="schemaName">
                        <xsl:value-of select="$pDocument"/>
                    </xsl:attribute>
                </datatype>
            </xsl:if>

            <xsl:for-each select="//xsd:complexType[@name=$complexTypeName]//@base">
                <xsl:if test="contains(../@base, 'xsd:') or contains(../@base, 'javaee:')">
                    <xsl:if test="count(../xsd:enumeration) = 0">
                        <xsl:text>&#10;</xsl:text>
                        <datatype>
                            <xsl:attribute name="name">
                                <xsl:value-of select="$complexTypeName"/>
                            </xsl:attribute>
                            <xsl:attribute name="mappedTo">
                                <xsl:value-of select="../@base"/>
                            </xsl:attribute>
                            <xsl:attribute name="namespace">
                                <xsl:value-of select="$pNamespace"/>
                            </xsl:attribute>
                            <xsl:attribute name="schemaName">
                                <xsl:value-of select="$pDocument"/>
                            </xsl:attribute>
                        </datatype>
                    </xsl:if>
                </xsl:if>
            </xsl:for-each>
        </xsl:for-each>

        <xsl:for-each select="document($pDocument)//xsd:simpleType">
            <xsl:variable name="complexTypeName" select="@name"/>

            <xsl:if test="$complexTypeName='load-on-startupType'">
                <datatype>
                    <xsl:attribute name="name">
                        <xsl:value-of select="$complexTypeName"/>
                    </xsl:attribute>
                    <xsl:attribute name="mappedTo">
                        <xsl:value-of select="'xsd:integer'"/>
                    </xsl:attribute>
                    <xsl:attribute name="namespace">
                        <xsl:value-of select="$pNamespace"/>
                    </xsl:attribute>
                    <xsl:attribute name="schemaName">
                        <xsl:value-of select="$pDocument"/>
                    </xsl:attribute>
                </datatype>
                <xsl:text>&#10;</xsl:text>
            </xsl:if>

            <xsl:if test="$complexTypeName='protocol-bindingType'">
                <datatype>
                    <xsl:attribute name="name">
                        <xsl:value-of select="$complexTypeName"/>
                    </xsl:attribute>
                    <xsl:attribute name="mappedTo">
                        <xsl:value-of select="'javaee:string'"/>
                    </xsl:attribute>
                    <xsl:attribute name="namespace">
                        <xsl:value-of select="$pNamespace"/>
                    </xsl:attribute>
                    <xsl:attribute name="schemaName">
                        <xsl:value-of select="$pDocument"/>
                    </xsl:attribute>
                </datatype>
                <xsl:text>&#10;</xsl:text>
            </xsl:if>

            <xsl:for-each select="xsd:restriction">
                <xsl:if test="count(xsd:enumeration) = 0">
                    <xsl:text>&#10;</xsl:text>
                    <datatype>
                        <xsl:attribute name="name">
                            <xsl:value-of select="$complexTypeName"/>
                        </xsl:attribute>
                        <xsl:attribute name="mappedTo">
                            <xsl:value-of select="@base"/>
                        </xsl:attribute>
                        <xsl:attribute name="namespace">
                            <xsl:value-of select="$pNamespace"/>
                        </xsl:attribute>
                        <xsl:attribute name="schemaName">
                            <xsl:value-of select="$pDocument"/>
                        </xsl:attribute>
                    </datatype>
                </xsl:if>
            </xsl:for-each>
        </xsl:for-each>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which writes the enumerations   ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WriteEnums">
        <xsl:param name="pDocument"/>
        <xsl:param name="pPackage"/>
        <xsl:param name="pNamespace"/>
        <xsl:for-each select="document($pDocument)//xsd:complexType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:variable name="vDocumentation" select="xsd:annotation/xsd:documentation/text()"/>
            <xsl:for-each select="xsd:simpleContent/xsd:restriction">
                <xsl:if test="@base='javaee:string'">
                    <xsl:if test="count(xsd:enumeration) > 0">
                        <xsl:message select="concat('Metadata describing enum: ', $complexTypeName)"/>
                        <xsl:text>&#10;</xsl:text>
                        <enum>
                            <xsl:attribute name="name">
                                <xsl:value-of select="$complexTypeName"/>
                            </xsl:attribute>
                            <xsl:attribute name="namespace">
                                <xsl:value-of select="$pNamespace"/>
                            </xsl:attribute>
                            <xsl:attribute name="schemaName">
                                <xsl:value-of select="$pDocument"/>
                            </xsl:attribute>
                            <xsl:attribute name="package">
                                <xsl:value-of select="$pPackage"/>
                            </xsl:attribute>
                            <xsl:attribute name="documentation">
                                <xsl:value-of select="$vDocumentation"/>
                            </xsl:attribute>
                            <xsl:for-each select="xsd:enumeration">
                                <value>
                                    <xsl:value-of select="@value"/>
                                </value>
                            </xsl:for-each>
                        </enum>
                    </xsl:if>
                </xsl:if>
            </xsl:for-each>
        </xsl:for-each>
        <xsl:for-each select="document($pDocument)//xsd:simpleType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:variable name="vDocumentation" select="xsd:annotation/xsd:documentation/text()"/>
            <xsl:for-each select="xsd:restriction">
                <xsl:if test="@base='javaee:string' or 'xsd:string'">
                    <xsl:if test="count(xsd:enumeration) > 0">
                        <xsl:message select="concat('Metadata describing enum: ', $complexTypeName)"/>
                        <xsl:text>&#10;</xsl:text>
                        <enum>
                            <xsl:attribute name="name">
                                <xsl:value-of select="$complexTypeName"/>
                            </xsl:attribute>
                            <xsl:attribute name="namespace">
                                <xsl:value-of select="$pNamespace"/>
                            </xsl:attribute>
                            <xsl:attribute name="schemaName">
                                <xsl:value-of select="$pDocument"/>
                            </xsl:attribute>
                            <xsl:attribute name="package">
                                <xsl:value-of select="$pPackage"/>
                            </xsl:attribute>
                            <xsl:attribute name="documentation">
                                <xsl:value-of select="$vDocumentation"/>
                            </xsl:attribute>
                            <xsl:for-each select="xsd:enumeration">
                                <value>
                                    <xsl:value-of select="@value"/>
                                </value>
                            </xsl:for-each>
                        </enum>
                    </xsl:if>
                </xsl:if>
            </xsl:for-each>
        </xsl:for-each>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which writes the groups         ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WriteGroups">
        <xsl:param name="pDocument"/>
        <xsl:param name="pPackage"/>
        <xsl:param name="pNamespace"/>

        <xsl:for-each select="document($pDocument)//xsd:attributeGroup">
            <xsl:if test="@name!=''">
                <xsl:variable name="groupName" select="@name"/>
                <xsl:message select="concat('Metadata describing group: ', $groupName)"/>
                <class>
                    <xsl:attribute name="name">
                        <xsl:value-of select="$groupName"/>
                    </xsl:attribute>
                    <xsl:attribute name="namespace">
                        <xsl:value-of select="$pNamespace"/>
                    </xsl:attribute>
                    <xsl:attribute name="schemaName">
                        <xsl:value-of select="$pDocument"/>
                    </xsl:attribute>
                    <xsl:attribute name="package">
                        <xsl:value-of select="$pPackage"/>
                    </xsl:attribute>
                    <xsl:for-each select="descendant::node()">
                        <xsl:if test="local-name() = 'attribute'">
                            <xsl:if test="@type!='xsd:ID'">
                                <element>
                                    <xsl:attribute name="name">
                                        <xsl:value-of select="@name"/>
                                    </xsl:attribute>
                                    <xsl:attribute name="type">
                                        <xsl:value-of select="@type"/>
                                    </xsl:attribute>
                                    <xsl:attribute name="attribute">
                                        <xsl:value-of select="true()"/>
                                    </xsl:attribute>
                                    <xsl:if test="@maxOccurs">
                                        <xsl:attribute name="maxOccurs">
                                            <xsl:value-of select="@maxOccurs"/>
                                        </xsl:attribute>
                                    </xsl:if>
                                </element>
                            </xsl:if>
                        </xsl:if>
                    </xsl:for-each>
                </class>
            </xsl:if>
        </xsl:for-each>

        <xsl:for-each select="document($pDocument)//xsd:group">
            <xsl:if test="@name!=''">
                <xsl:variable name="groupName" select="@name"/>
                <xsl:message select="concat('Metadata describing group: ', $groupName)"/>
                <class>
                    <xsl:attribute name="name">
                        <xsl:value-of select="$groupName"/>
                    </xsl:attribute>
                    <xsl:attribute name="namespace">
                        <xsl:value-of select="$pNamespace"/>
                    </xsl:attribute>
                    <xsl:attribute name="schemaName">
                        <xsl:value-of select="$pDocument"/>
                    </xsl:attribute>
                    <xsl:attribute name="package">
                        <xsl:value-of select="$pPackage"/>
                    </xsl:attribute>
                    <xsl:for-each select="descendant::node()">
                        <xsl:if test="local-name() = 'element'">
                            <element>
                                <xsl:attribute name="name">
                                    <xsl:value-of select="@name"/>
                                </xsl:attribute>
                                <xsl:attribute name="type">
                                    <xsl:value-of select="@type"/>
                                </xsl:attribute>
                                <xsl:attribute name="attribute">
                                    <xsl:value-of select="false()"/>
                                </xsl:attribute>
                                <xsl:if test="@maxOccurs">
                                    <xsl:attribute name="maxOccurs">
                                        <xsl:value-of select="@maxOccurs"/>
                                    </xsl:attribute>
                                </xsl:if>
                            </element>
                        </xsl:if>
                        <xsl:if test="local-name() = 'group'">
                            <include>
                                <xsl:attribute name="name">
                                    <xsl:value-of select="@ref"/>
                                </xsl:attribute>
                                <xsl:if test="@maxOccurs='unbounded' or ../@maxOccurs='unbounded'">
                                    <xsl:attribute name="maxOccurs">
                                        <xsl:value-of select="'unbounded'"/>
                                    </xsl:attribute>
                                </xsl:if>
                                <!--                            <xsl:value-of select="@ref"/>-->
                            </include>
                        </xsl:if>
                    </xsl:for-each>
                </class>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which writes the classes        ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WritePersistenceClasses">
        <xsl:param name="pDocument"/>
        <xsl:param name="pPackageApi"/>
        <xsl:param name="pPackageImpl"/>
        <xsl:param name="pNamespace"/>

        <!--
        <xsl:for-each select="document($pDocument)//xsd:simpleType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:variable name="vDocumentation" select="xsd:annotation/xsd:documentation/text()"/>
        </xsl:for-each>-->

        <xsl:for-each select="document($pDocument)//xsd:element">
            <!--            <xsl:if test="position()!=1">-->
            <xsl:if test="exists(xsd:complexType)=true()">

                <xsl:variable name="complexTypeName" select="@name"/>
                <xsl:variable name="vDocumentation" select="xsd:annotation/xsd:documentation/text()"/>
                <class>
                    <xsl:attribute name="name">
                        <xsl:value-of select="$complexTypeName"/>
                    </xsl:attribute>
                    <xsl:attribute name="namespace">
                        <xsl:value-of select="$pNamespace"/>
                    </xsl:attribute>
                    <xsl:attribute name="schemaName">
                        <xsl:value-of select="$pDocument"/>
                    </xsl:attribute>
                    <xsl:attribute name="packageApi">
                        <xsl:value-of select="$pPackageApi"/>
                    </xsl:attribute>
                    <xsl:attribute name="packageImpl">
                        <xsl:value-of select="$pPackageImpl"/>
                    </xsl:attribute>
                    <xsl:attribute name="documentation">
                        <xsl:value-of select="$vDocumentation"/>
                    </xsl:attribute>
                    <xsl:call-template name="AddPersistenceElements"/>
                </class>
            </xsl:if>
            <!--            </xsl:if>-->
        </xsl:for-each>
    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ****** Template which writes the classes        ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="AddPersistenceElements">
        <xsl:for-each select="xsd:complexType/xsd:sequence/xsd:element">
            <element>
                <xsl:attribute name="name">
                    <xsl:value-of select="@name"/>
                </xsl:attribute>
                <xsl:attribute name="type">
                    <xsl:choose>
                        <xsl:when test="exists(@type)">
                            <xsl:value-of select="@type"/>
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:value-of select="concat('persistence:', @name)"/>
                        </xsl:otherwise>
                    </xsl:choose>
                </xsl:attribute>
                <xsl:if test="@maxOccurs">
                    <xsl:attribute name="maxOccurs">
                        <xsl:value-of select="@maxOccurs"/>
                    </xsl:attribute>
                </xsl:if>
            </element>
        </xsl:for-each>

        <xsl:for-each select="xsd:complexType/xsd:attribute">
            <element>
                <xsl:attribute name="name">
                    <xsl:value-of select="@name"/>
                </xsl:attribute>
                <xsl:attribute name="type">
                    <xsl:value-of select="@type"/>
                </xsl:attribute>
                <xsl:attribute name="attribute">
                    <xsl:value-of select="'true'"/>
                </xsl:attribute>
            </element>
        </xsl:for-each>
    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ****** Template which writes the classes        ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WriteClasses">
        <xsl:param name="pDocument"/>
        <xsl:param name="pPackageApi"/>
        <xsl:param name="pPackageImpl"/>
        <xsl:param name="pNamespace"/>

        <xsl:for-each select="document($pDocument)//xsd:simpleType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:variable name="vDocumentation" select="xsd:annotation/xsd:documentation/text()"/>

            <xsl:if test="$complexTypeName='protocol-bindingListType' or $complexTypeName='service-ref_protocol-bindingListType'">
                <xsl:message select="concat('Metadata describing class: ', $complexTypeName)"/>
                <class>
                    <xsl:attribute name="name">
                        <xsl:value-of select="$complexTypeName"/>
                    </xsl:attribute>
                    <xsl:attribute name="schemaName">
                        <xsl:value-of select="$pDocument"/>
                    </xsl:attribute>
                    <xsl:attribute name="namespace">
                        <xsl:value-of select="$pNamespace"/>
                    </xsl:attribute>
                    <xsl:attribute name="packageApi">
                        <xsl:value-of select="$pPackageApi"/>
                    </xsl:attribute>
                    <xsl:attribute name="packageImpl">
                        <xsl:value-of select="$pPackageImpl"/>
                    </xsl:attribute>
                    <xsl:attribute name="documentation">
                        <xsl:value-of select="$vDocumentation"/>
                    </xsl:attribute>

                    <element>
                        <xsl:attribute name="name">
                            <xsl:value-of select="'protocol-bindingType'"/>
                        </xsl:attribute>
                        <xsl:attribute name="type">
                            <xsl:value-of select="'xsd:string'"/>
                        </xsl:attribute>
                        <xsl:attribute name="maxOccurs">
                            <xsl:value-of select="'unbounded'"/>
                        </xsl:attribute>
                    </element>
                </class>
            </xsl:if>
        </xsl:for-each>

        <xsl:for-each select="document($pDocument)//xsd:complexType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:variable name="vDocumentation" select="xsd:annotation/xsd:documentation/text()"/>

            <xsl:if test="$complexTypeName">
                <xsl:if test="count(xsd:sequence/xsd:element) > 0 or count(xsd:choice/xsd:element) > 0 or count(xsd:sequence/xsd:choice/xsd:element) > 0 or count(xsd:choice/xsd:group) > 0 or count(xsd:attribute) > 1">
                    <xsl:message select="concat('Metadata describing class: ', $complexTypeName)"/>

                    <class>
                        <xsl:attribute name="name">
                            <xsl:value-of select="$complexTypeName"/>
                        </xsl:attribute>
                        <xsl:attribute name="namespace">
                            <xsl:value-of select="$pNamespace"/>
                        </xsl:attribute>
                        <xsl:attribute name="schemaName">
                            <xsl:value-of select="$pDocument"/>
                        </xsl:attribute>
                        <xsl:attribute name="packageApi">
                            <xsl:value-of select="$pPackageApi"/>
                        </xsl:attribute>
                        <xsl:attribute name="packageImpl">
                            <xsl:value-of select="$pPackageImpl"/>
                        </xsl:attribute>
                        <xsl:attribute name="documentation">
                            <xsl:value-of select="$vDocumentation"/>
                        </xsl:attribute>
                        <xsl:for-each select="xsd:sequence/xsd:element">
                            <element>
                                <xsl:attribute name="name">
                                    <xsl:value-of select="@name"/>
                                </xsl:attribute>
                                <xsl:attribute name="type">
                                    <xsl:value-of select="@type"/>
                                </xsl:attribute>
                                <xsl:if test="@maxOccurs">
                                    <xsl:attribute name="maxOccurs">
                                        <xsl:value-of select="@maxOccurs"/>
                                    </xsl:attribute>
                                </xsl:if>
                                <!-- <xsl:attribute name="documentation">
                               <xsl:value-of select="xsd:annotation/xsd:documentation/text()"/>
                            </xsl:attribute>-->
                            </element>
                        </xsl:for-each>

                        <xsl:for-each select="xsd:sequence/xsd:choice/xsd:element">
                            <element>
                                <xsl:attribute name="name">
                                    <xsl:value-of select="@name"/>
                                </xsl:attribute>
                                <xsl:attribute name="type">
                                    <xsl:value-of select="@type"/>
                                </xsl:attribute>
                                <xsl:if test="@maxOccurs">
                                    <xsl:attribute name="maxOccurs">
                                        <xsl:value-of select="@maxOccurs"/>
                                    </xsl:attribute>
                                </xsl:if>
                                <!--  <xsl:attribute name="documentation">
                               <xsl:value-of select="xsd:annotation/xsd:documentation/text()"/>
                            </xsl:attribute>-->
                            </element>
                        </xsl:for-each>

                        <xsl:for-each select="xsd:choice/xsd:element">
                            <element>
                                <xsl:attribute name="name">
                                    <xsl:value-of select="@name"/>
                                </xsl:attribute>
                                <xsl:attribute name="type">
                                    <xsl:value-of select="@type"/>
                                </xsl:attribute>
                                <xsl:if test="@maxOccurs='unbounded' or ../@maxOccurs='unbounded'">
                                    <xsl:attribute name="maxOccurs">
                                        <xsl:value-of select="'unbounded'"/>
                                    </xsl:attribute>
                                </xsl:if>
                                <!-- <xsl:attribute name="documentation">
                               <xsl:value-of select="xsd:annotation/xsd:documentation/text()"/>
                            </xsl:attribute>-->
                            </element>
                        </xsl:for-each>

                        <xsl:for-each select="xsd:sequence/xsd:group">
                            <include>
                                <xsl:attribute name="name">
                                    <xsl:value-of select="@ref"/>
                                </xsl:attribute>
                                <xsl:if test="@maxOccurs='unbounded' or ../@maxOccurs='unbounded'">
                                    <xsl:attribute name="maxOccurs">
                                        <xsl:value-of select="'unbounded'"/>
                                    </xsl:attribute>
                                </xsl:if>
                                <!--                            <xsl:value-of select="@ref"/>-->
                            </include>
                        </xsl:for-each>

                        <xsl:for-each select="xsd:choice/xsd:group">
                            <include>
                                <xsl:attribute name="name">
                                    <xsl:value-of select="@ref"/>
                                </xsl:attribute>
                                <xsl:if test="@maxOccurs='unbounded' or ../@maxOccurs='unbounded'">
                                    <xsl:attribute name="maxOccurs">
                                        <xsl:value-of select="'unbounded'"/>
                                    </xsl:attribute>
                                </xsl:if>
                                <!--                            <xsl:value-of select="@ref"/>-->
                            </include>
                        </xsl:for-each>

                        <xsl:for-each select="xsd:attributeGroup">
                            <include>
                                <xsl:attribute name="name">
                                    <xsl:value-of select="@ref"/>
                                </xsl:attribute>
                                <xsl:if test="@maxOccurs='unbounded' or ../@maxOccurs='unbounded'">
                                    <xsl:attribute name="maxOccurs">
                                        <xsl:value-of select="'unbounded'"/>
                                    </xsl:attribute>
                                </xsl:if>
                                <!--                            <xsl:value-of select="@ref"/>-->
                            </include>
                        </xsl:for-each>

                        <xsl:for-each select="xsd:attribute">
                            <xsl:if test="@name!='id'">
                                <element>
                                    <xsl:attribute name="name">
                                        <xsl:value-of select="@name"/>
                                    </xsl:attribute>
                                    <xsl:attribute name="type">
                                        <xsl:value-of select="@type"/>
                                    </xsl:attribute>
                                    <xsl:attribute name="attribute">
                                        <xsl:value-of select="'true'"/>
                                    </xsl:attribute>
                                </element>
                            </xsl:if>
                        </xsl:for-each>
                    </class>
                </xsl:if>
            </xsl:if>
        </xsl:for-each>

    </xsl:template>

</xsl:stylesheet>
