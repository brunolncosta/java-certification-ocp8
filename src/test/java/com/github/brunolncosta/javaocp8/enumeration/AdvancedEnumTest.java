package com.github.brunolncosta.javaocp8.enumeration;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AdvancedEnumTest {

    /**
     * It does the same as the AbstractEnum, but with a more elegant approach.
     */
    @Test
    void calculateTest() {
        Stream.of(AdvancedEnum.values())
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

                        default:
                            assertFalse(true);

                    }

                });

    }

    /**
     * Interface in enums work, just like in normal classes.
     *
     */
    @Test
    void operationTest() {
        Operation operation = AdvancedEnum.ADDITION;
        assertTrue(operation instanceof Operation);
    }

}
