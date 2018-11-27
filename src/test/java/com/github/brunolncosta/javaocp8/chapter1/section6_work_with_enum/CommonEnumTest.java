package com.github.brunolncosta.javaocp8.chapter1.section6_work_with_enum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CommonEnumTest {

    /**
     * Enums can use static fields and methods freely.
     *
     */
    @Test
    void staticTest() {
        Integer realCount = CommonEnum.getGlobalCount() + 1;
        CommonEnum.BLACK.increment();
        assertEquals(realCount, CommonEnum.getGlobalCount());
        Assertions.assertEquals(realCount, CommonEnum.BLUE.getGlobalCount());
    }

    /**
     * Enums can use no static fields and methods freely.
     *
     */
    @Test
    void noStaticTest() {
        Integer realCount = CommonEnum.WHITE.getCount() + 1;
        CommonEnum.WHITE.increment();
        Assertions.assertEquals(realCount, CommonEnum.WHITE.getCount());
    }

    /**
     * A curiosity is that the switch statement accepts enum values.
     *
     */
    @Test
    void enumSwichTest() {
        CommonEnum color = CommonEnum.BLUE;

        switch(color) {

            // In switch case, you can not put CommonEnum.BLUE, it must be only BLUE;
            case BLUE: {
                assertTrue(true);
                break;
            }

            default: assertFalse(true);

        }

    }

    /**
     * There will be only one instance of each element of an enum,
     * so you can use the "==" operator, it is the same object in memory!
     *
     */
    @Test
    void compereOperatorTest() {
        assertTrue(CommonEnum.BLACK == CommonEnum.valueOf("BLACK"));
    }

}
