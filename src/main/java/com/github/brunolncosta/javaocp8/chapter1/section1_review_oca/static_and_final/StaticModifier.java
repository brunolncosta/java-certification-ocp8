package com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.static_and_final;

/**
 * Classes can have the static modifier, but only the nested ones.
 * Nested classes will be covered in section 7.
 *
 * Static modifier set the context of a class member to the class level,
 * which means that the statement has no bound with a instance object of the class where it is declared.
 *
 * Class level context are manager by the JVM itself, and started when the class are loaded.
 * Static members a bound to the class structure, they are singleton and global,
 * so do not use this approach in a not thread safe context.
 *
 */
public class StaticModifier {

    /**
     * public static final are modifiers that better describes constants.
     *
     * They can be access for everywhere because the public modifier.
     * They do not need to be bound to a instance because the static modifier, so it is easier to use.
     * They values do no change in runtime because of the final modifier.
     *
     */
    public static final String CONSTANT = "I am a constant.";

    /**
     * Example of static field.
     *
     */
    private static Integer globalCount;

    private Integer count;

    /**
     * Example of static block.
     * Static blocks are executed when the class are load by JVM.
     *
     * Static are not in the instance context so it can use this operator or access instance members.
     */
    static {
        globalCount = 0;

//      See for yourself when this block is executed.
        System.out.println("I am a static block of StaticModifier.class and I was executed when JVM loaded the classes.");

//      this.globalCount = 0; This is a reference of the current instance,
//                            which does not exist, because we are in the static context.
//      count = 0; Static context can not access instance context.
    }

    /**
     * Example of static method.
     * It follows the same rules for static block, can not access instance members.
     *
     */
    public static void increment() {
        globalCount++;
    }

    public static Integer getGlobalCount() {
        return globalCount;
    }

}
