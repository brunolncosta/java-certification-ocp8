package com.github.brunolncosta.javaocp8.enumeration;

import java.math.BigDecimal;

/**
 * Enums are able to have abstracts method too, but this will make the things a little complicated.
 * The abstract operator it not allowed in enum's declaration.
 *
 */
public enum AbstractEnum {
    /**
     * All elements of a abstract enum have to implement the abstract methods.
     *
     * In this case each element are in fact a anonymous subclass of the AbstractEnum.
     *
     */
    MULTIPLICATION()  {

        public BigDecimal calculate(BigDecimal first, BigDecimal second)  {
            return first.multiply(second);
        }

    },
    ADDITION() {

        public BigDecimal calculate(BigDecimal first, BigDecimal second)  {
            return first.add(second);
        }

    },
    SUBTRACTION() {

        public BigDecimal calculate(BigDecimal first, BigDecimal second)  {
            return first.subtract(second);
        }

    },

    DIVISION() {

        public BigDecimal calculate(BigDecimal first, BigDecimal second)  {
            return first.divide(second);
        }

    };

    /**
     * It is a normal abstract method. It will enforce the all subclass' instances must to implement this method.
     *
     */
    public abstract BigDecimal calculate(BigDecimal first, BigDecimal second);

}
