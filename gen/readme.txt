README
------

This readme describes the xslt based transformation producing various deployment descriptor API and IMPL classes.

Rational
--------
Why producing the classes via xslt transformation? The reason for this are simply the amount of 
classes which have to be created manually. Pending on the particular XSD schema, you will end up 
writing hundreds of interfaces and classes. Covering various deployment descriptors 
and versions will cause thousands of self created interfaces and classes. This will be 
a never ending job and an error prone job as well. To keep a well defined interface across all 
interfaces and classes is also difficult.

It doesn't have to be a xslt transformation, of course. JAXB or other frameworks will probably 
do the same job but XSLT allows to produce dedicated interfaces tailored to this project.


Transformation Steps
--------------------
There are two transformation steps required. The first one collects all the metadata out of the 
configured schema files into one xml file. The second transformation produces then the classes 
based on this metadata information.

More detailed:

Step 1: schemas.xml  --> metadata.xsl  --> metadata.xml
Step 2: metadata.xml --> ddJava.xsl    --> interfaces and classes (Api and Impl)

schemas.xml:    This is the root of all. This file describes which schemas are part of the transformation. 
metadata.xsl:   Produces the metadata.xml based on the configured schemas in schemas.xml
ddJava.xsl:     Produces the interface and implementation classes. Requires as input the metadata.xml file.


Required Libraries
------------------_
The transformation is based on the saxon 9.3 xslt library but version 8.7 onwards works as well. The transformation itself uses xslt 2.0.


Maven Integration
-----------------
This is not done yet but will come soon. All the described steps will be integrated 
into the maven build process. 

Moving the classes
------------------
At the moment, the classes will be produced in the gen module only. After producing the 
classes, a manual copy step to the API and IMPL folder is required.

Note: Before moving the generated classes, please run via Eclipse 'Source/Organize Imports' for
      all generated packages.

TODO
----
From the code generation point of view, the following is not done yet:
- Certainly writing more test cases.
- Providing the enums as arguments. The enums are generated but not integrated into the interfaces.
- Namespace handling. This should probably part of the the descriptor API and not of each descriptor itself
- Each node implements the descriptor interface. In the current version, all subnodes inherit from the descriptorImpl,
  which is from the re-usability point of view, problematic.

