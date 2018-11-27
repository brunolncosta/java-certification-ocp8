package com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.access_modifers.subpackage;

import com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.access_modifers.AccessModifier;

public class Subclass extends AccessModifier {

    /**
     * Subclass can not access_modifers private field, methods or constructors of other classes,
     * even if there are in the same package.
     *
     */
//  public Boolean accessPrivate() {
//      return this.privateMethod().equals(this.privateField);
//  }

    /**
     * Subclass can not access_modifers package fields, methods or constructors of other classes,
     * if they are not in the same package.
     *
     */
//  public Boolean accessPackage() {
//      return this.packageMethod().equals(this.packageField);
//  }

    /**
     * As we can see, subclasses can access_modifers protected fields, methods and constructor,
     * even when they are in tha different package of the super class.
     *
     */
    public Boolean accessProtected() {
        return this.protectedMethod().equals(this.protectedField);
    }

    /**
     * Subclasses can access_modifers public fields, methods and constructors of any class;
     *
     */
    public Boolean accessPublic() {
        return this.publicMethod().equals(this.publicField);
    }

    public void main(String[] args) {

        Subclass subclass = new Subclass();
        subclass.protectedMethod().equals(subclass.protectedField);

//      This a special case, where we are inside a subclass that are in different package of this superclass,
//      and we a using polymorphic reference to access_modifers subclass object with a super class variable,
//      in this case we can not access_modifers protected fields and method,
//      because JVM believes that we are not in the subclass context.

//      AccessModifier superclass = new Subclass();
//      superclass.protectedMethod().equals(superclass.protectedField);
    }

}
