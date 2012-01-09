package org.jboss.shrinkwrap.descriptor.metadata.filter;

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
   JavaKeywordsEnum(final String description)
   {
      this.description = description;
   }
   
   public String getDescription()
   {
      return description;
   }
   
   public boolean isTagNameEqual(final String tagName)
   {
      if (tagName != null)
      {
         final String[] items = tagName.split(":", -1);
         if (items.length == 2 && items[1].equals(name()))
            return true;
      }
      return false;
   }
}
