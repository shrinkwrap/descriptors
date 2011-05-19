<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:exsl="http://exslt.org/common"
	xmlns:xsd="http://www.w3.org/2001/XMLSchema">
	<xsl:output method="text" indent="yes" name="text" />

	<xsl:variable name="vLower" select="'abcdefghijklmnopqrstuvwxyz'" />

	<xsl:variable name="vUpper" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'" />

	<!-- ******************************************************************** 
		** Generate the class skeleton. Other templates will generate ** portions 
		of the class. ***************************************************************** -->

	<xsl:template match="/">
	
<!-- 	    <xsl:for-each select="//xsd:simpleContent/xsd:restriction"> -->
<!-- 	         <xsl:if test="@base='javaee:string'"> -->
	         
<!-- 	             <xsl:text>public enum </xsl:text><xsl:value-of select="@name" /> -->
<!-- 	             { -->
<!-- 	             <xsl:for-each select="xsd:enumeration"> -->
<!-- 	                 <xsl:if test="position() = first()"> -->
<!-- 	                      public enum  -->
<!-- 	                      { -->
<!-- 	            	 </xsl:if> -->
	             
<!-- 	            	 <xsl:value-of select="@value" /> -->
<!-- 	            	 <xsl:if test="position() != last()"> -->
<!-- 	            	 	<xsl:text>,</xsl:text> -->
<!-- 	            	 </xsl:if> -->
<!-- 	             </xsl:for-each> -->
<!-- 	             } -->
<!-- 	         </xsl:if> -->
<!-- 	    </xsl:for-each> -->
	
	
		<xsl:for-each select="//xsd:complexType[@name]">
			<xsl:variable name="interfaceName" select="@name" />
			
			<xsl:for-each select="xsd:simpleContent/xsd:restriction">
	         <xsl:if test="@base='javaee:string'">
	         
	             <xsl:for-each select="xsd:enumeration">
	                 <xsl:if test="position() = 1">
	                      <xsl:text>public enum </xsl:text>
	                      <xsl:call-template name="Pascalize">
								<xsl:with-param name="pText" select="$interfaceName" />
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
			
			
			
			
			<!-- ************************************************ ** generate interface 
				header ************************************************ -->
			<xsl:text>public interface </xsl:text>
			<xsl:call-template name="Pascalize">
				<xsl:with-param name="pText" select="$interfaceName" />
			</xsl:call-template>
			<xsl:text>&lt;T&gt; extends Child&lt;T&gt;</xsl:text>

			<xsl:text>&#10;</xsl:text>
			<xsl:text>{</xsl:text>

			<!-- **** loop through all elements **** -->
			<xsl:for-each select="xsd:sequence/xsd:element">
				<xsl:text>&#10;</xsl:text>

				<!-- **** generate element **** -->
				<xsl:text>   public </xsl:text>
				<xsl:call-template name="Pascalize">
					<xsl:with-param name="pText" select="$interfaceName" />
				</xsl:call-template>
				<xsl:text>&lt;T&gt; </xsl:text>

                <xsl:text>set</xsl:text>
				<xsl:call-template name="Pascalize">
					<xsl:with-param name="pText" select="@name" />
				</xsl:call-template>

				<xsl:text>(</xsl:text>
				<xsl:call-template name="Pascalize">
					<xsl:with-param name="pText" select="@type" />
				</xsl:call-template>
				<xsl:text> </xsl:text>
				<xsl:call-template name="Pascalize">
					<xsl:with-param name="pText" select="@name" />
				</xsl:call-template>

				<xsl:text>)</xsl:text>
			</xsl:for-each>

			<xsl:text>&#10;</xsl:text>
			<xsl:text>}</xsl:text>

			<xsl:text>&#10;</xsl:text>
			<xsl:text>&#10;</xsl:text>
		</xsl:for-each>
	</xsl:template>

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

</xsl:stylesheet>
