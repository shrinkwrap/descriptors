package org.jboss.shrinkwrap.descriptor.metadata.filter;

public enum XsdDatatypeEnum
{
    normalizedString("normalizedString"),
    token("token"),
    language("language"),
    NMTOKEN("NMTOKEN"),
    NMTOKENS("NMTOKENS"),
    Name("Name"),
    NCName("NCName"),
    ID("ID"),
    IDREF("IDREF"),
    IDREFS("IDREFS"),
    ENTITY("ENTITY"),
    ENTITIES("ENTITIES"),
    integer("integer"),
    nonPositiveInteger("nonPositiveInteger"),
    negativeInteger("negativeInteger"),
    _long("long"),
    _int("int"),
    _short("short"),
    _byte("byte"),
    nonNegativeInteger("nonNegativeInteger"),
    unsignedLong("unsignedLong"),
    unsignedInt("unsignedInt"),
    unsignedShort("unsignedShort"),
    unsignedByte("unsignedByte"),
    positiveInteger("positiveInteger");
    
    
    private String description;

    XsdDatatypeEnum(final String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public boolean isTagNameEqual(final String tagName)
    {
        if (tagName != null) {
            final String[] items = tagName.split(":", -1);
            if (items.length == 2 && items[1].equals(getDescription())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isDataType(final String tagName)
    {
        System.out.println("isDataType: "+ tagName);
        if (tagName != null) {
            final String[] items = tagName.split(":", -1);
            if (items.length == 2) {
                for (XsdDatatypeEnum value: XsdDatatypeEnum.values())
                {
                    if (items[1].equals(value.getDescription()))
                    {
                        System.out.println("isDataType: "+ tagName + " found");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
