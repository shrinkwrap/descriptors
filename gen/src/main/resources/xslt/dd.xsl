<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:exsl="http://exslt.org/common"
	xmlns:xsd="http://www.w3.org/2001/XMLSchema">
	<xsl:output method="text" indent="yes" name="text" />

	<xsl:variable name="vJavaeeDoc" select="'javaee_6.xsd'" />
	<xsl:variable name="vJavaeeNs" select="'javaee'" />
	<xsl:variable name="vLower" select="'abcdefghijklmnopqrstuvwxyz'" />
	<xsl:variable name="vUpper" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'" />


	<!-- ******************************************************* -->
	<!-- ****** Root Node Template Processing             ****** -->
	<!-- ******************************************************* -->
	<xsl:template match="/">

		<xsl:for-each select="//xsd:complexType[@name]">
			<xsl:variable name="interfaceName" select="@name" />

			<!-- generate all enumerations -->
			<xsl:call-template name="GenerateEnums">
				<xsl:with-param name="pTypeName" select="$interfaceName" />
			</xsl:call-template>

			<!-- generate all interfaces -->
			<xsl:call-template name="GenerateInterfaces">
				<xsl:with-param name="pTypeName" select="$interfaceName" />
			</xsl:call-template>

		</xsl:for-each>
	</xsl:template>


	<!-- ******************************************************* -->
	<!-- ****** Template which generates the enumerations ****** -->
	<!-- ******************************************************* -->
	<xsl:template name="GenerateEnums">
		<xsl:param name="pTypeName" />
		<xsl:for-each select="xsd:simpleContent/xsd:restriction">
			<xsl:if test="@base='javaee:string'">

				<xsl:for-each select="xsd:enumeration">
					<xsl:if test="position() = 1">
						<xsl:text>public enum </xsl:text>
						<xsl:call-template name="Pascalize">
							<xsl:with-param name="pText" select="$pTypeName" />
						</xsl:call-template>
						<xsl:text>&#10;</xsl:text>
						<xsl:text>{</xsl:text>
						<xsl:text>&#10;</xsl:text>
						<xsl:text>   </xsl:text>
					</xsl:if>

					<xsl:value-of select="@value" />
					<xsl:if test="position() != last()">
						<xsl:text>,</xsl:text>
					</xsl:if>
					<xsl:if test="position() = last()">
						<xsl:text>&#10;</xsl:text>
						<xsl:text>}</xsl:text>
						<xsl:text>&#10;</xsl:text>
						<xsl:text>&#10;</xsl:text>
					</xsl:if>
				</xsl:for-each>
			</xsl:if>
		</xsl:for-each>
	</xsl:template>


	<!-- ******************************************************* -->
	<!-- ****** Template which generates the interfaces ****** -->
	<!-- ******************************************************* -->
	<xsl:template name="GenerateInterfaces">
		<xsl:param name="pTypeName" />

		<!-- **** loop through all elements **** -->
		<xsl:for-each select="xsd:sequence/xsd:element">

			<xsl:if test="position() = 1">
				<xsl:text>public interface </xsl:text>
				<xsl:call-template name="Pascalize">
					<xsl:with-param name="pText" select="$pTypeName" />
				</xsl:call-template>
				<xsl:text>&lt;T&gt; extends Child&lt;T&gt;</xsl:text>
				<xsl:text>&#10;</xsl:text>
				<xsl:text>{</xsl:text>
			</xsl:if>
			<xsl:text>&#10;</xsl:text>

			<!-- **** generate set element **** -->
			<xsl:text>   public </xsl:text>
			<xsl:call-template name="Pascalize">
				<xsl:with-param name="pText" select="$pTypeName" />
			</xsl:call-template>
			<xsl:text>&lt;T&gt; </xsl:text>

			<xsl:text>set</xsl:text>
			<xsl:call-template name="Pascalize">
				<xsl:with-param name="pText" select="@name" />
			</xsl:call-template>

			<xsl:text>(</xsl:text>
			<xsl:call-template name="JavaTypeReplace">
				<xsl:with-param name="pText" select="@type" />
				<xsl:with-param name="pClassName" select="$pTypeName" />
			</xsl:call-template>

			<xsl:text> </xsl:text>
			<xsl:call-template name="Pascalize">
				<xsl:with-param name="pText" select="@name" />
			</xsl:call-template>
			<xsl:text>);</xsl:text>
			<xsl:text>&#10;</xsl:text>

			<!-- **** generate get element **** -->
			<xsl:text>   public </xsl:text>
			<xsl:call-template name="JavaTypeReplace">
				<xsl:with-param name="pText" select="@type" />
				<xsl:with-param name="pClassName" select="$pTypeName" />
			</xsl:call-template>
			<xsl:text> </xsl:text>

			<xsl:text>get</xsl:text>
			<xsl:call-template name="Pascalize">
				<xsl:with-param name="pText" select="@name" />
			</xsl:call-template>
			<xsl:text>();</xsl:text>
			<xsl:text>&#10;</xsl:text>

			<xsl:if test="position() = last()">
				<xsl:text>}</xsl:text>
				<xsl:text>&#10;</xsl:text>
				<xsl:text>&#10;</xsl:text>
			</xsl:if>
		</xsl:for-each>
	</xsl:template>

	<!-- ****************************************************** -->
	<!-- ****** Template which generates pascalize names ****** -->
	<!-- ****************************************************** -->
	<xsl:template name="Pascalize">
		<xsl:param name="pText" />

		<xsl:if test="$pText">
			<xsl:value-of select="translate(substring($pText,1,1), $vLower, $vUpper)" />
			<xsl:choose>
				<xsl:when test="contains($pText, '-')">
					<xsl:value-of select="substring-before(substring($pText,2), '-')" />
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="substring($pText,2)" />
				</xsl:otherwise>
			</xsl:choose>
			<xsl:call-template name="Pascalize">
				<xsl:with-param name="pText"
					select="substring-after(substring($pText,2), '-')" />
			</xsl:call-template>
		</xsl:if>
	</xsl:template>


<!-- **************************************************************************
-->
<!-- ****** Template which replaces schema defined types with java types ******
-->
<!-- **************************************************************************
-->
	<xsl:template name="JavaTypeReplace">
		<xsl:param name="pText" />
		<xsl:param name="pClassName" />

		<xsl:variable name="vDataType" select="substring-after($pText, ':')" />
		
<!--		<xsl:apply-templates name="CheckDataType">-->
<!--		    <xsl:with-param name="pBase" select="//xsd:complexType[@name=$vDataType]/xsd:simpleContent/xsd:extension"/>-->
<!--		</xsl:apply-templates>-->

		
			<xsl:for-each select="//xsd:complexType[@name=$vDataType]/xsd:simpleContent/xsd:extension | //xsd:complexType[@name=$vDataType]/xsd:simpleContent/xsd:restriction |document($vJavaeeDoc)//xsd:complexType[@name=$vDataType]/xsd:simpleContent/xsd:extension | document($vJavaeeDoc)//xsd:complexType[@name=$vDataType]/xsd:simpleContent/xsd:restriction">
				<xsl:variable name="vSubDataType" select="substring-after(@base, ':')" />
				<xsl:choose>
					<xsl:when test="$vSubDataType">
						<xsl:call-template name="JavaTypeMapping">
							<xsl:with-param name="pText" select="$vSubDataType" />
						</xsl:call-template>
					</xsl:when>
					<xsl:otherwise>
						<xsl:call-template name="JavaTypeMapping">
							<xsl:with-param name="pText" select="$vDataType" />
						</xsl:call-template>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:for-each>

            <xsl:if test="count(//xsd:complexType[@name=$vDataType]//xsd:element) > 0">
                <xsl:call-template name="Pascalize">
					<xsl:with-param name="pText" select="$vDataType" />
				</xsl:call-template>
				<xsl:text>&lt;</xsl:text>
				<xsl:call-template name="Pascalize">
					<xsl:with-param name="pText" select="$pClassName" />
				</xsl:call-template>
				<xsl:text>&lt;T&gt;&gt;</xsl:text>
			</xsl:if>
			
			<xsl:if test="count(document($vJavaeeDoc)//xsd:complexType[@name=$vDataType]//xsd:element) > 0">
				<xsl:call-template name="Pascalize">
					<xsl:with-param name="pText" select="$vDataType" />
				</xsl:call-template>
				<xsl:text>&lt;</xsl:text>
				<xsl:call-template name="Pascalize">
					<xsl:with-param name="pText" select="$pClassName" />
				</xsl:call-template>
				<xsl:text>&lt;T&gt;&gt;</xsl:text>
			</xsl:if>

	</xsl:template>


	<xsl:template match="CheckDataType">
		<xsl:param name="pBase" select="@base"/>
		
		CheckDataType <xsl:value-of select="$pBase"/> : 
		<xsl:if test="$pBase != ''">
		<xsl:variable name="vSubDataType" select="substring-after($pBase, ':')" />
			<xsl:choose>
				<xsl:when test="$vSubDataType">
					<xsl:call-template name="JavaTypeMapping">
						<xsl:with-param name="pText" select="$vSubDataType" />
					</xsl:call-template>
				</xsl:when>
				<xsl:otherwise>
					<xsl:call-template name="JavaTypeMapping">
						<xsl:with-param name="pText" select="$pBase" />
					</xsl:call-template>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
	</xsl:template>

	<!--
		**************************************************************************
	-->
	<!--
		****** Template which maps schema defined types with java types ******
	-->
	<!--
		**************************************************************************
	-->
	<xsl:template name="JavaTypeMapping">
		<xsl:param name="pText" />

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
			<xsl:when test="$pText='integer'">
				<xsl:text>Integer</xsl:text>
			</xsl:when>
			<xsl:when test="$pText='xsdStringType'">
				<xsl:text>String</xsl:text>
			</xsl:when>
			<xsl:when test="$pText='string'">
				<xsl:text>String</xsl:text>
			</xsl:when>
			<xsl:when test="$pText='string'">
				<xsl:text>String</xsl:text>
			</xsl:when>
			<xsl:when test="$pText='nonEmptyStringType'">
				<xsl:text>String</xsl:text>
			</xsl:when>
			<xsl:when test="$pText='xsdBooleanType'">
				<xsl:text>Boolean</xsl:text>
			</xsl:when>
			<xsl:when test="$pText='token'">
				<xsl:text>String</xsl:text>
			</xsl:when>			
			<xsl:when test="$pText='long'">
				<xsl:text>Long</xsl:text>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$pText" />
			</xsl:otherwise>
		</xsl:choose>

	</xsl:template>

</xsl:stylesheet>
