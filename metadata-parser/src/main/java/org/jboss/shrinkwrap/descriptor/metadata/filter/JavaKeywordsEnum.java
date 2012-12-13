/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.shrinkwrap.descriptor.metadata.filter;

/**
 * Enum class defining all reserved Java key words. This is quite important because XSD's can use such reserved key
 * words.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public enum JavaKeywordsEnum {
    abstract_keyword("abstract"),
    continue_keyword("continue"),
    for_keyword("for"),
    new_keyword("new"),
    switch_keyword("switch"),
    assert_keyword("assert"),
    default_keyword("default"),
    goto_keyword("goto"),
    package_keyword("package"),
    synchronized_keyword("synchronized"),
    boolean_keyword("boolean"),
    do_keyword("do"),
    if_keyword("if"),
    private_keyword("private"),
    this_keyword("this"),
    break_keyword("break"),
    double_keyword("double"),
    implements_keyword("implements"),
    protected_keyword("protected"),
    throw_keyword("throw"),
    byte_keyword("byte"),
    else_keyword("else"),
    import_keyword("import"),
    public_keyword("public"),
    throws_keyword("throws"),
    case_keyword("case"),
    enum_keyword("enum"),
    instanceof_keyword("instanceof"),
    return_keyword("return"),
    transient_keyword("transient"),
    catch_keyword("catch"),
    extends_keyword("extends"),
    int_keyword("int"),
    short_keyword("short"),
    try_keyword("try"),
    char_keyword("char"),
    final_keyword("final"),
    interface_keyword("interface"),
    static_keyword("static"),
    void_keyword("void"),
    class_keyword("class"),
    finally_keyword("finally"),
    long_keyword("long"),
    strictfp_keyword("strictfp"),
    volatile_keyword("volatile"),
    const_keyword("const"),
    float_keyword("float"),
    native_keyword("native"),
    super_keyword("super"),
    while_keyword("while");

    private String description;

    JavaKeywordsEnum(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isJavaKeyword(final String ElementName) {
        // System.out.println("isJavaKeyword: " + ElementName);
        if (ElementName != null) {
            for (XsdDatatypeEnum value : XsdDatatypeEnum.values()) {
                if (ElementName.equals(value.getDescription())) {
                    System.out.println("isJavaKeyword: " + ElementName + " found");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isElementNameEqual(final String elementName) {
        if (elementName != null) {
            if (elementName.equals(name()))
                return true;
        }
        return false;
    }
}
