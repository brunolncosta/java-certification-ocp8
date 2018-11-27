package com.github.brunolncosta.javaocp8.chapter1.section6_work_with_enum;

import java.math.BigDecimal;
import java.util.function.BiFunction;

/**
 * We can many things with enum, even implement an interface, although it is not common in Java community.
 *
 * There are JEPs proposals to upgrade enum's power, given support even to Generics.
 * Check it out on: http://openjdk.java.net/jeps/301.
 *
 * Enums are Life s2.
 *
 */
public enum AdvancedEnum implements Operation {

    /**
     * We can replace the abstract method approach with a more elegant one,
     * using Functional Interfaces do to the job.
     *
     */
    MULTIPLICATION((x,y) -> x.multiply(y)),
    ADDITION((x,y) -> x.add(y)),
    SUBTRACTION((x,y) -> x.subtract(y)),
    DIVISION((x,y) -> x.divide(y));

    private final BiFunction<BigDecimal, BigDecimal, BigDecimal> function;

    AdvancedEnum(BiFunction<BigDecimal, BigDecimal, BigDecimal> function) {
        this.function = function;
    }

    public BigDecimal calculate(BigDecimal first, BigDecimal second) {
        return function.apply(first, second);
    }

}

/**
 * It a normal interface that I declare as inner class just to make the example simpler.
 *
 */
interface Operation {

    BigDecimal calculate(BigDecimal first, BigDecimal second);

}