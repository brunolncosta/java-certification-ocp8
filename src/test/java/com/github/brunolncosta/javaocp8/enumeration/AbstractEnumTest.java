package com.github.brunolncosta.javaocp8.enumeration;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AbstractEnumTest {

    /**
     * With abstract enum we can make use of polymorphism,
     * but there a better ways to do so.
     *
     */
    @Test
    void calculateTest() {
       Stream.of(AbstractEnum.values())
               .forEach(e -> {

                   BigDecimal result = e.calculate(BigDecimal.TEN, BigDecimal.TEN);

                   switch (e) {

                       case MULTIPLICATION: {
                           assertEquals(new BigDecimal(100), result);
                           break;
                       }

                       case ADDITION: {
                           assertEquals(new BigDecimal(20), result);
                           break;
                       }

                       case SUBTRACTION: {
                           assertEquals(BigDecimal.ZERO, result);
                           break;
                       }

                       case DIVISION: {
                           assertEquals(BigDecimal.ONE, result);
                           break;
                       }

                       default: assertFalse(true);

                   }

               });

    }

}
