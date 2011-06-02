<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xs" version="2.0">

    <xsl:template match="/">
        <metadata>
            <xsl:call-template name="GenerateStatistic"/>
            <xsl:call-template name="GenerateDataTypes"/>
            <xsl:call-template name="GenerateEnums"/>
            <xsl:call-template name="GenerateGroups"/>
            <xsl:call-template name="GenerateClasses"/>
            <xsl:call-template name="GenerateDescriptors"/>
        </metadata>
    </xsl:template>

    <!-- ****************************************************** -->
    <!-- ****** Template which generates the data types  ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateStatistic">
        <statistics>
            <xsl:for-each select="//schemaName">
                <xsl:call-template name="WriteStatistic">
                    <xsl:with-param name="pDocument" select="text()"/>
                    <xsl:with-param name="pArea" select="'groups'"/>
                </xsl:call-template>
            </xsl:for-each>

            <xsl:for-each select="//schemaName">
                <xsl:call-template name="WriteStatistic">
                    <xsl:with-param name="pDocument" select="text()"/>
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
            <xsl:for-each select="//schemaName">
                <xsl:call-template name="WriteDataTypes">
                    <xsl:with-param name="pDocument" select="text()"/>
                </xsl:call-template>
            </xsl:for-each>
        </datatypes>

    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the enumarations ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateEnums">
        <enums>
            <xsl:for-each select="//schemaName">
                <xsl:call-template name="WriteEnums">
                    <xsl:with-param name="pDocument" select="text()"/>
                    <xsl:with-param name="pPackage" select="@packageApi"/>
                </xsl:call-template>
            </xsl:for-each>

        </enums>
    </xsl:template>



    <!-- ****************************************************** -->
    <!-- ****** Template which generates the grpups       ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateGroups">
        <groups>
            <xsl:for-each select="//schemaName">
                <xsl:call-template name="WriteGroups">
                    <xsl:with-param name="pDocument" select="text()"/>
                    <xsl:with-param name="pPackage" select="@packageApi"/>
                </xsl:call-template>
            </xsl:for-each>
        </groups>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the classes      ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateClasses">
        <classes>
            <xsl:for-each select="//schemaName">
                <xsl:call-template name="WriteClasses">
                    <xsl:with-param name="pDocument" select="text()"/>
                    <xsl:with-param name="pPackage" select="@packageApi"/>
                </xsl:call-template>
            </xsl:for-each>
        </classes>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which generates the descriptors  ***** -->
    <!-- ****************************************************** -->
    <xsl:template name="GenerateDescriptors">
        <descriptors>
            <xsl:for-each select="//schemaName">
                <xsl:if test="@generateDDClass='true'">
                    <descriptor>
                        <xsl:attribute name="schemaName">
                            <xsl:value-of select="text()"/>
                        </xsl:attribute>
                        <xsl:attribute name="packageApi">
                            <xsl:value-of select="@packageApi"/>
                        </xsl:attribute>
                        <xsl:attribute name="packageImpl">
                            <xsl:value-of select="@packageImpl"/>
                        </xsl:attribute>
                        <xsl:for-each select="document(text())/*/xsd:element">
                            <!--                            <xsl:if test="local-name() = 'element'">-->
                            <element>
                                <xsl:attribute name="name">
                                    <xsl:value-of select="@name"/>
                                </xsl:attribute>
                                <xsl:attribute name="type">
                                    <xsl:value-of select="@type"/>
                                </xsl:attribute>
                            </element>
                            <!--                            </xsl:if>-->
                        </xsl:for-each>
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
                        <xsl:value-of select="'javaee:xsdBooleanType'"/>
                    </xsl:attribute>
                    <xsl:attribute name="schemaName">
                        <xsl:value-of select="$pDocument"/>
                    </xsl:attribute>
                </datatype>
                <xsl:text>&#10;</xsl:text>
            </xsl:if>

            <xsl:if test="$complexTypeName='protocol-bindingType' or $complexTypeName='protocol-bindingType'">
                <datatype>
                    <xsl:attribute name="name">
                        <xsl:value-of select="$complexTypeName"/>
                    </xsl:attribute>
                    <xsl:attribute name="mappedTo">
                        <xsl:value-of select="'javaee:string'"/>
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
        <xsl:for-each select="document($pDocument)//xsd:complexType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:for-each select="xsd:simpleContent/xsd:restriction">
                <xsl:if test="@base='javaee:string'">
                    <xsl:if test="count(xsd:enumeration) > 0">
                        <xsl:text>&#10;</xsl:text>
                        <enum>
                            <xsl:attribute name="name">
                                <xsl:value-of select="$complexTypeName"/>
                            </xsl:attribute>
                            <xsl:attribute name="schemaName">
                                <xsl:value-of select="$pDocument"/>
                            </xsl:attribute>
                            <xsl:attribute name="package">
                                <xsl:value-of select="$pPackage"/>
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
            <xsl:for-each select="xsd:restriction">
                <xsl:if test="@base='javaee:string' or 'xsd:string'">
                    <xsl:if test="count(xsd:enumeration) > 0">
                        <xsl:text>&#10;</xsl:text>
                        <enum>
                            <xsl:attribute name="name">
                                <xsl:value-of select="$complexTypeName"/>
                            </xsl:attribute>
                            <xsl:attribute name="schemaName">
                                <xsl:value-of select="$pDocument"/>
                            </xsl:attribute>
                            <xsl:attribute name="package">
                                <xsl:value-of select="$pPackage"/>
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

        <xsl:for-each select="document($pDocument)//xsd:attributeGroup">
            <xsl:if test="@name!=''">
                <xsl:variable name="groupName" select="@name"/>

                <class>
                    <xsl:attribute name="name">
                        <xsl:value-of select="$groupName"/>
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
                <class>
                    <xsl:attribute name="name">
                        <xsl:value-of select="$groupName"/>
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
                                <xsl:if test="@maxOccurs">
                                    <xsl:attribute name="maxOccurs">
                                        <xsl:value-of select="@maxOccurs"/>
                                    </xsl:attribute>
                                </xsl:if>
                            </element>
                        </xsl:if>
                        <xsl:if test="local-name() = 'group'">
                            <include>
                                <xsl:value-of select="@ref"/>
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
    <xsl:template name="WriteClasses">
        <xsl:param name="pDocument"/>
        <xsl:param name="pPackage"/>
        <xsl:for-each select="document($pDocument)//xsd:complexType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:if test="count(xsd:sequence/xsd:element) > 0 or count(xsd:choice/xsd:element) > 0 or count(xsd:sequence/xsd:choice/xsd:element) > 0 or count(xsd:choice/xsd:group) > 0">
                <class>
                    <xsl:attribute name="name">
                        <xsl:value-of select="$complexTypeName"/>
                    </xsl:attribute>
                    <xsl:attribute name="schemaName">
                        <xsl:value-of select="$pDocument"/>
                    </xsl:attribute>
                    <xsl:attribute name="package">
                        <xsl:value-of select="$pPackage"/>
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
                            <xsl:if test="@maxOccurs">
                                <xsl:attribute name="maxOccurs">
                                    <xsl:value-of select="@maxOccurs"/>
                                </xsl:attribute>
                            </xsl:if>
                        </element>
                    </xsl:for-each>

                    <xsl:for-each select="xsd:sequence/xsd:group">
                        <include>
                            <xsl:value-of select="@ref"/>
                        </include>
                    </xsl:for-each>

                    <xsl:for-each select="xsd:choice/xsd:group">
                        <include>
                            <xsl:value-of select="@ref"/>
                        </include>
                    </xsl:for-each>

                    <xsl:for-each select="xsd:attributeGroup">
                        <include>
                            <xsl:value-of select="@ref"/>
                        </include>
                    </xsl:for-each>
                </class>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>

</xsl:stylesheet>
