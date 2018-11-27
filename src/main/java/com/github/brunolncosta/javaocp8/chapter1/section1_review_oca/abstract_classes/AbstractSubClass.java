package com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.abstract_classes;

/**
 * If want to extends an abstract class,
 * but you do no want to override all abstract method,
 * you must mark the class as abstract too.
 *
 * With that behavior, you can build a hierarchy of abstract classes.
 *
 */
public abstract class AbstractSubClass extends AbstractClass {

    public abstract String saySomeThingAgain();

    /**
     * You can implement methods in abstract classes, even the super class abstract methods or interface.
     *
     * This behavior provides a base implementation for the Adapter pattern.
     *
     */
    @Override
    public String saySomeThing() {
        return "I was overridden by AbstractSubClass.class.";
    }

}
