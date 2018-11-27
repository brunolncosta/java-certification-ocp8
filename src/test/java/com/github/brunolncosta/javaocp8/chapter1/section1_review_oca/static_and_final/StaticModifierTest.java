package com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.static_and_final;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticModifierTest {

    /**
     * One of the ways to access static members you need to import the class,
     * and use her name as identifier.
     *
     * NOTE: With that approach you do not to create a instance of the class at all.
     *
     */
    @Test
    void contanstTest() {
//      StaticModifier.CONSTANT = "I am not a constant"; You can not modify a constant, it is final
        assertEquals("I am a constant.", StaticModifier.CONSTANT);
    }

    /**
     * The globalCount was initiated by the JVM, not instance was needed.
     *
     */
    @Test
    void staticBlockTest() {
        assertEquals(Integer.valueOf(0), StaticModifier.getGlobalCount());
    }

    /**
     * Other way to access static member is to use a instance.
     *
     * Instance members of a class can access static members normally.
     *
     */
    @Test
    void staticMethodTest() {
        Integer globalCount = StaticModifier.getGlobalCount();

        StaticModifier instance = new StaticModifier();
        instance.increment();

        assertEquals(Integer.valueOf(globalCount + 1), StaticModifier.getGlobalCount());
    }

}