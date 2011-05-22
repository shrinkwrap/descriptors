<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsd="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs" version="2.0">

    <xsl:template match="/">
        <metadata>
            <xsl:call-template name="GenerateDataTypes"/>
            <xsl:call-template name="GenerateEnums"/>
            <xsl:call-template name="GenerateGroups"/>
            <xsl:call-template name="GenerateClasses"/>
        </metadata>
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
                </xsl:call-template>
            </xsl:for-each>
        </classes>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which writes the data types     ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WriteDataTypes">
        <xsl:param name="pDocument"/>
        <xsl:for-each select="document($pDocument)//xsd:complexType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:for-each select="//xsd:complexType[@name=$complexTypeName]//@base">
                <xsl:if test="contains(../@base, 'xsd:') or contains(../@base, 'javaee:')">
                    <xsl:text>&#10;</xsl:text>
                    <datatype>
                        <xsl:attribute name="complexTypeName">
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
            </xsl:for-each>
        </xsl:for-each>
    </xsl:template>


    <!-- ****************************************************** -->
    <!-- ****** Template which writes the enumerations   ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WriteEnums">
        <xsl:param name="pDocument"/>
        <xsl:for-each select="document($pDocument)//xsd:complexType">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:for-each select="xsd:simpleContent/xsd:restriction">
                <xsl:if test="@base='javaee:string'">
                    <xsl:if test="count(xsd:enumeration) > 0">
                        <xsl:text>&#10;</xsl:text>
                        <enum>
                            <xsl:attribute name="complexTypeName">
                                <xsl:value-of select="$complexTypeName"/>
                            </xsl:attribute>
                            <xsl:attribute name="schemaName">
                                <xsl:value-of select="$pDocument"/>
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
        <xsl:for-each select="document($pDocument)//xsd:group">
            <xsl:variable name="complexTypeName" select="@name"/>
            <xsl:if test="count(xsd:sequence/xsd:element) > 0">
                <group>
                    <xsl:attribute name="complexTypeName">
                        <xsl:value-of select="$complexTypeName"/>
                    </xsl:attribute>
                    <xsl:attribute name="schemaName">
                        <xsl:value-of select="$pDocument"/>
                    </xsl:attribute>

                    <xsl:for-each select="xsd:sequence/xsd:element">
                        <element>
                            <xsl:value-of select="@name"/>
                        </element>
                    </xsl:for-each>

                    <xsl:for-each select="xsd:sequence/xsd:group">
                        <include>
                            <xsl:value-of select="@ref"/>
                        </include>
                    </xsl:for-each>
                </group>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>
    

    <!-- ****************************************************** -->
    <!-- ****** Template which writes the classes        ****** -->
    <!-- ****************************************************** -->
    <xsl:template name="WriteClasses">
        <xsl:param name="pDocument"/>
        <xsl:for-each select="document($pDocument)//xsd:complexType">
            <xsl:variable name="complexTypeName" select="@name"/>

            <xsl:if test="count(xsd:sequence/xsd:element) > 0">
                <class>
                    <xsl:attribute name="complexTypeName">
                        <xsl:value-of select="$complexTypeName"/>
                    </xsl:attribute>
                    <xsl:attribute name="schemaName">
                        <xsl:value-of select="$pDocument"/>
                    </xsl:attribute>

                    <xsl:for-each select="xsd:sequence/xsd:element">
                        <element>
                            <xsl:value-of select="@name"/>
                        </element>
                    </xsl:for-each>

                    <xsl:for-each select="xsd:sequence/xsd:group">
                        <include>
                            <xsl:value-of select="@ref"/>
                        </include>
                    </xsl:for-each>
                </class>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>
    
</xsl:stylesheet>
