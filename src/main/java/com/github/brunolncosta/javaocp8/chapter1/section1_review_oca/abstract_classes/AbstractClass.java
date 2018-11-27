package com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.abstract_classes;

/**
 * Abstract classes are like normal classes,
 * but with one main difference, they can not be instantiated, only extend.
 *
 * Any class could be marked as abstract, it not need to have an abstract method.
 *
 * Abstract classes are made to be extended, so it can not be marked as final,
 * if you do so it will result in a compile error.
 *
 */
public abstract class AbstractClass {

    /**
     *  Likewise any classes, abstract ones can have fields.
     *
     */
    private Integer count;

    /**
     *  Likewise any classes, abstract ones can have constructors.
     *
     */
    public AbstractClass() {
        super();
    }

    /**
     * Abstract methods are made to be override, so it can not be marked as final,
     * if you do so it will result in a compile error.
     *
     * Other access modifiers can be combined with the abstract, since they do forbid
     *
     */
//  private abstract void doSomeThing();

    /**
     * Abstract methods do not have body, only signature.
     *
     */
    public abstract String saySomeThing();

    /**
     * Likewise any classes, abstract ones can have normal methods.
     *
     */
    public void increment() {
        this.count++;
    }

}
