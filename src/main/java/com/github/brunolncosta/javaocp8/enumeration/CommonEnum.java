package com.github.brunolncosta.javaocp8.enumeration;


public enum CommonEnum {

    /**
     * The declaration os the Element is the declaration of the possible instances.
     * It must to correspond to a valid constructor.
     *
     * Hence, when you declare a Element, you basically calling one of the enum's constructors.
     *
     */
    BLUE("2790CD"),
    GREEN("85E447"),
    RED("E62C2C"),
    YELLOW("FFD21A"),
    BROWN("3F2B1D"),
    GRAY("616161"),
    BLACK("000000"),
    PURPLE("BF26D0"),
    PINK("F554CA"),
//  NOTCOLOR, This element declaration does not compile, because there is no CommonEnum() compatible constructor.
    WHITE("FFFFFF", 100); // Note that this element is the only on that uses the BasisEnum(String, Integer) constructor.


    /**
     * Enum can have any kind of field, just like a normal class.
     * Beware that enum instance are singletons, so, changing values of an enum will be a problem in a not thread safe scenario.
     *
     */
    private static Integer globalCount = 0;

    private final String rgb;

    public Integer count = 0;

    /**
     * Enum can have many constructors, but all of them must be private.
     * Even if you do not do it explicitly, it will me private.
     *
     * This is because only JVM will instance the Enums elements.
     *
     * The JVM makes sure that will be only one instance of each element of the Enum,
     * that why you can not call the "new" operator of a enum.
     *
     * The instantiation will occur in Run Time,
     * when any element is invoked for the first time, JVM will create all instances.
     *
     * So if there is no other instance of the same enum's element, you can compare it with "==" operator.
     *
     */
    CommonEnum(String rgb) {
//      super(); It is not allowed to call super in Enums' constructor, it will be called automatic.
        this.rgb = rgb;

        // For curiosity, call a enum element for the first time, and see how JVM do his job.
        System.out.println(" I am the color " + this + " and I was instantiated by JVM right now!");
    }


    CommonEnum(String rgb, Integer initialCount) {
        this(rgb);
        this.count = initialCount;
    }

    /**
     * If you uncomment the line bellow, you will get a compile error.
     *
     */
//    public CommonEnum() {
//        this.rgb = "000000";
//    }

    /**
     * Likewise the field, you can create methods just like you do in normal classes.
     *
     */
    public void increment() {
        this.count++;
        globalCount++;
    }

    public static Integer getGlobalCount() {
        return globalCount;
    }

    public String getRgb() {
        return rgb;
    }

    public Integer getCount() {
        return count;
    }

}
