package com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.access_modifers;

/**
 * There are four access_modifers modifiers public, package/private package/default, protected and private.
 * This modifiers are used to limit access_modifers of a class, field, constructor or method.
 *
 * Without access_modifers modifiers OOP would be a mess, because we could not ensure encapsulating.
 *
 * In this section we will cover only public classes.
 *
 */
public class AccessModifier {

    /**
     * Private field can be only accessed by the class where it is declared (not considering section7_nested_classes classes).
     * It is the most
     *
     */
    private String privateField = "Private";

    /**
     * It is not a popular modifiers, but it indeed one of the most useful.
     * Only classes in the same package of the class where it was declared are allowed to access_modifers this type of field.
     *
     * It a good practice to create a TestClass/TestMethod with this modifiers,
     * but we will ensure that the Test suit will be hidden for anyone that want use our library.
     *
     */
    String packageField = "Private Package";

    /**
     * Because of protected modifier this field can be directly accessed:
     *
     * 1- By any class that are in the same package of the the class where was is declared.
     *
     * 2- By any subclass of the the class where was is declared. There are some limitations on this rule, we will see.
     *
     */
    protected String protectedField = "Protected";

    /**
     * Public modifiers are the less restrictive of them.
     * Any class can access_modifers this one (not considering root classes that are not covered in this certification).
     *
     */
    public String publicField = "Public";


    /**
     * Likewise any other methods constructors are affected by access_modifers modifiers.
     *
     * Declaring a public constructor allow any use freely.
     *
     * NOTE: Remember that classes can have more than one constructor, by overload them.
     *
     */
    public AccessModifier() {
        super();
    }

    /**
     * Basically follow the same idea of the private field.
     *
     * If you do not want to allow to create instances of the class, create a unique private constructor.
     *
     * NOTE: It is commented because it is a overload constructor.
     *
     */
//  private AccessModifier() {
//      super();
//  }

    /**
     * Basically follow the same idea of the package field.
     *
     * If you want to allow subclasses only in the same package of the super class, create a unique package constructor.
     *
     * NOTE: It is commented because it is a overload constructor.
     *
     */
//  AccessModifier() {
//      super();
//  }

    /**
     * Basically follow the same idea of the package field.
     *
     * If you want to not allow the instantiation outside of the package, but want to allow subclasses freely.
     *
     * NOTE: It is commented because it is a overload constructor.
     *
     */
//  AccessModifier() {
//      super();
//  }


    /**
     * Basically follow the same idea of the private field.
     *
     */
    private String privateMethod() {
        return this.privateField;
    }

    /**
     * Basically follow the same idea of the package field.
     *
     */
    String packageMethod() {
        return this.packageField;
    }

    /**
     * Basically follow the same idea of the protected field.
     *
     */
    protected String protectedMethod() {
        return this.protectedField;
    }

    /**
     * Basically follow the same idea of the public field.
     *
     */
    public String publicMethod() {
        return this.publicField;
    }

}
