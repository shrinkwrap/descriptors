package org.jboss.shrinkwrap.descriptor.metadata.codegen;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.text.WordUtils;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataClass;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataEnum;

import com.sun.codemodel.ClassType;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JDocComment;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JType;
import com.sun.codemodel.JTypeVar;

public class CodeGen
{

    private final Metadata metadata;
//    private final JCodeModel cm = new JCodeModel();
//    private final Map<String, JDefinedClass> definedClassMap = new HashMap<String, JDefinedClass>();

    public CodeGen(final Metadata metadata)
    {
        this.metadata = metadata;
    }

//	public void generateCode() throws JClassAlreadyExistsException, IOException
//	{
//		JCodeModel cm = new JCodeModel();
//		JDefinedClass dc = cm._class("foo.Bar");
//		JMethod m = dc.method(0, int.class, "foo");
//		m.body()._return(JExpr.lit(5));
//
//		File file = new File("./src/test/java");
//		file.mkdirs();
//		cm.build(file);
//
//	}
    /**
     * Generates all enumeration classes.
     * @param metadata
     * @throws JClassAlreadyExistsException
     * @throws IOException 
     */
    public void generateEnums() throws JClassAlreadyExistsException, IOException
    {
        final JCodeModel cm = new JCodeModel();
        for (final MetadataEnum metadataEnum : metadata.getEnumList()) {
            final String fqnEnum = metadataEnum.getPackageApi() + "." + getPascalizeCase(metadataEnum.getName());
            final JDefinedClass dc = cm._class(fqnEnum, ClassType.ENUM);
            final JDocComment javaDocComment = dc.javadoc();
            final Map<String, String> part = javaDocComment.addXdoclet("author");
            part.put("<a href", "'mailto:ralf.battenfeld@bluewin.ch'>Ralf Battenfeld</a>");

            for (final String enumConstant : metadataEnum.getValueList()) {
                dc.enumConstant(getEnumConstantName(enumConstant));
            }

            final JMethod toStringMethod = dc.method(1, String.class, "toString");
            toStringMethod.body()._return(JExpr.direct("name().substring(1)"));
        }

        final File file = new File("./src/test/java");
        file.mkdirs();
        cm.build(file);
    }

    public void generateInferfaces() throws JClassAlreadyExistsException, IOException, ClassNotFoundException
    { 	       
        final JCodeModel cm = new JCodeModel();
//        
//        final JType child = cm.parseType("org.jboss.shrinkwrap.descriptor.api.Child");
      
        
        final JDefinedClass childInterface = cm._class("org.jboss.shrinkwrap.descriptor.api.ChildFFF", ClassType.INTERFACE);
        childInterface.generify("T");
        
        for (final MetadataClass metadataClass : metadata.getClassList()) {
            final String fqnInterface = metadataClass.getPackageApi() + "." + getPascalizeCase(metadataClass.getName());
            final JDefinedClass dc = cm._class(fqnInterface, ClassType.INTERFACE);
                        
//            JClass clazz = cm.directClass("FFFFF");
//            JTypeVar typeVat = new JTypeVar(cm, "T");
            
//            final JDefinedClass dcChild = cm._class(Child.class.getCanonicalName(), ClassType.INTERFACE); 
            final JClass child = cm.ref(Child.class);
            if (child.isParameterized())
            {
            	List<JClass> types = child.getTypeParameters();
            	for (JClass jclass: types)
            	{
            		jclass.toString();
            	}
            }
            
            dc._extends(childInterface);
            JTypeVar type = dc.generify("T");
            child.narrow(type);
            JType erasureType = dc.erasure();
            List<JClass> types = dc.getTypeParameters();
            for (JClass jclass: types)
        	{
            	child.narrow(erasureType);
        	}
            
            final JDocComment javaDocComment = dc.javadoc();
            final Map<String, String> part = javaDocComment.addXdoclet("author");
            part.put("<a href", "'mailto:ralf.battenfeld@bluewin.ch'>Ralf Battenfeld</a>");

            for (final MetadataElement element : metadataClass.getElements()) {
                if (isEnum(element.getType())) {
                    final String fqn = getFqnClass(element);
                    if (fqn != null) {
                        final String localname = splitElementType(element.getType())[1];
                        final String argName = getCamelCase(localname);
                        final JClass refClass = cm.ref(fqn);
                        final JMethod setMethod = dc.method(1, dc, argName);
                        setMethod.param(refClass, argName);
                    }
                }
            }

        }

        final File file = new File("./src/test/java");
        file.mkdirs();
        cm.build(file);

    }

    public static String getPascalizeCase(final String str)
    {
        return WordUtils.capitalize(str, new char[]{'_', '-'}).replaceAll("_", "").replaceAll("-", "");
    }

    private String getCamelCase(String value)
    {
        return WordUtils.uncapitalize(getPascalizeCase(value));
    }

    public static String getEnumConstantName(final String enumConstant)
    {
        return "_" + enumConstant;
    }

    public String getFqnClass(final MetadataElement element)
    {
        final String namespace = splitElementType(element.getType())[0];
        final String localname = splitElementType(element.getType())[1];

        // search in all enumeration
        for (final MetadataEnum metadataEnum : metadata.getEnumList()) {
            if (metadataEnum.getName().equals(localname) && metadataEnum.getNamespace().equals(namespace)) {
                return metadataEnum.getPackageApi() + "." + getPascalizeCase(metadataEnum.getName());
            }
        }

        // search in all classes
        for (final MetadataClass metadataClass : metadata.getClassList()) {
            if (metadataClass.getName().equals(localname) && metadataClass.getNamespace().equals(namespace)) {
                return metadataClass.getPackageApi() + "." + getPascalizeCase(metadataClass.getName());
            }
        }

        return null;
    }

    public String[] splitElementType(final String elementType)
    {
        if (elementType.contains(":")) {
            String[] items = elementType.split(":", -1);
            if (items.length == 2) {
                return items;
            }
        }

        final String[] dummyArray = new String[2];
        dummyArray[0] = elementType;
        dummyArray[1] = elementType;
        return dummyArray;
    }

    /**
     * Returns true, if the given string argument represents a enumeration class.
     * @param elementName
     * @return true, if the string represents a enumeration, otherwise false.
     */
    public boolean isEnum(final String elementType)
    {
        final String namespace = splitElementType(elementType)[0];
        final String localname = splitElementType(elementType)[1];

        boolean isEnum = false;
        for (final MetadataEnum metadataEnum : metadata.getEnumList()) {
            if (metadataEnum.getName().equals(localname) && metadataEnum.getNamespace().equals(namespace)) {
                isEnum = true;
                break;
            }
        }

        return isEnum;
    }

    //---------------------------------------------------------------------------------------------------------------------||
    //-- Print Methods ----------------------------------------------------------------------------------------------------||
    //---------------------------------------------------------------------------------------------------------------------||
    private void generateEnumMethods(final JDefinedClass dc, final MetadataElement element, final boolean isInterface)
    {
//        cm.ref(null)
//        final JMethod setEnumMethod = dc.method(1, String.class, getCamelCase(element.getName()));  
//        
//        cm.
//        setEnumMethod.param(1, null, null);
//                
//        if (!isInterface)
//        {
//            toStringMethod.body()._return(JExpr.direct("name().substring(1)"));   
//        }
    }
//     <!-- *********************************************************** -->
//    <!-- ****** Function which writes the GetOrCreate       Body *** -->
//    <!-- *********************************************************** -->
//    <xsl:function name="xdd:printSetEnum">
//        <xsl:param name="pClassType"/>
//        <xsl:param name="pElementType"/>
//        <xsl:param name="pMethodName"/>
//        <xsl:param name="pNodeNameLocal"/>
//        <xsl:param name="pElementName"/>
//        <xsl:param name="pReturnTypeName"/>
//        <xsl:param name="pIsInterface" as="xs:boolean"/>
//        <xsl:variable name="vSetSignature" select="concat('   public ', $pClassType, ' ', xdd:checkForClassType(xdd:LowerCaseFirstChar($pMethodName)), '(',  xdd:createPascalizedName($pElementType,''),' ',xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ')')"/>
//        <xsl:value-of select="concat('   /**', '&#10;')"/>
//        <xsl:value-of select="concat('    * Sets the &lt;code&gt;', $pElementName,'&lt;/code&gt; element&#10;')"/>
//        <xsl:value-of select="concat('    * @param ', xdd:checkForClassType(xdd:createCamelizedName($pElementName)), ' the value for the element &lt;code&gt;', $pElementName,'&lt;/code&gt; &#10;')"/>
//        <xsl:value-of select="concat('    * @return ', 'the current instance of &lt;code&gt;', $pReturnTypeName, '&lt;/code&gt; &#10;')"/>
//        <xsl:value-of select="concat('    */', '&#10;')"/>
//        <xsl:choose>
//            <xsl:when test="$pIsInterface=true()">
//                <xsl:value-of select="concat($vSetSignature, ';&#10;')"/>
//            </xsl:when>
//            <xsl:otherwise>
//                <xsl:value-of select="concat($vSetSignature, '&#10;')"/>
//                <xsl:value-of select="concat('   {', '&#10;')"/>
//                <xsl:value-of select="concat('      ', $pNodeNameLocal, '.getOrCreate(&quot;', $pElementName, '&quot;).text(', xdd:checkForClassType(xdd:createCamelizedName($pElementName)) , ');', '&#10;')"/>
//                <xsl:value-of select="concat('      return this;', '&#10;')"/>
//                <xsl:value-of select="concat('   }', '&#10;')"/>
//            </xsl:otherwise>
//        </xsl:choose>
//    </xsl:function>
}
