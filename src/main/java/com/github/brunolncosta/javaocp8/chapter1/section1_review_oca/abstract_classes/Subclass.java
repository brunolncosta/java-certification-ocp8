package com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.abstract_classes;

/**
 * There is no secret to extends a abstract class,
 * the only difference is that you must implement all abstract method defined in supers classes,
 * or you it will be required to mark the class as abstract too.
 *
 */
public class Subclass extends AbstractSubClass {

    /**
     * Overriding a abstract is the same as override a normal method.
     *
     */
    @Override
    public String saySomeThingAgain() {
        return "I was overridden by " + this.getClass().getSimpleName() + ".";
    }

    /**
     * This does not compile because, if you declare a abstract method in class,
     * the class must be marked as abstract.
     *
     */
//  public abstract void doSomeThing();

}
