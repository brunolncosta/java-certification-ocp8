package com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.access_modifers.subpackage;

import com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.access_modifers.AccessModifier;

/**
 * I call Not Related classes, classes that are not in the same package or descends of other determinate class.
 *
 */
public class NotRelatedClass {

    /**
     * Not Related class can not access_modifers private field, methods or constructors.
     *
     */
//  public Boolean accessPrivate() {
//    AccessModifier accessModifier = new AccessModifier();
//    return accessModifier.privateMethod()
//                         .equals(accessModifier.privateField);
//  }

    /**
     * Not Related class can not access_modifers package fields, methods or constructors.
     *
     */
//  public Boolean accessPackage() {
//    AccessModifier accessModifier = new AccessModifier();
//    return accessModifier.packageMethod()
//                         .equals(accessModifier.packageField);
//  }

    /**
     * Not Related class can not access_modifers protected fields, methods or constructors.
     *
     */
//  public Boolean accessProtected() {
//  AccessModifier accessModifier = new AccessModifier();
//      return accessModifier.protectedMethod()
//                           .equals(accessModifier.protectedField);
//  }

    /**
     * Any class can access_modifers public fields, methods and constructors of any class;
     *
     */
    public Boolean accessPublic() {
        AccessModifier accessModifier = new AccessModifier();
        return accessModifier.publicMethod()
                             .equals(accessModifier.publicField);
    }

}
