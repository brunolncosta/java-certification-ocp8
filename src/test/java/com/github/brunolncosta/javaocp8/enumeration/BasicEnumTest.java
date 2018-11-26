package com.github.brunolncosta.javaocp8.enumeration;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BasicEnumTest {

    /**
     * Enums' toString() method calls by default the method name(),
     * but you can override this behavior.
     *
     */
    @Test
    void toStringTest() {
        Assertions.assertEquals(BasicEnum.ONE.name(), BasicEnum.ONE.toString());
    }

    /**
     * The name() method will evaluate the name of the element CONSTANT that represent the enum instance,
     * hence if you declare a enum element as ONE, BasicEnum.ONE.name() will evaluate "ONE" as String.
     *
     */
    @Test
    void nameTest() {
        Assertions.assertEquals("ONE", BasicEnum.ONE.name());
    }

    /**
     * The orginal() method will evaluate the order of the element CONSTANT that represent the enum instance.
     *
     * Keep in mind that elements sequence start with 0, like in a array or list,
     * thus if you declare a element the FIVE as the sixth, the call Common.ONE.ordinal() will evaluate 7.
     *
     */
    @Test
    void ordinalTest() {
        Assertions.assertEquals(3, BasicEnum.FOUR.ordinal());
    }

    /**
     * Enum has a static valueOf() method, that allows to find a enum instance given the element name.
     *
     */
    @Test
    void valueOfTest() {
        Assertions.assertEquals(BasicEnum.valueOf("TWO"), BasicEnum.TWO);
    }

    /**
     * With there is no Enum element with the given name, it will rise a IllegalArgumentException.
     *
     */
    @Test
    void valueOfNotFoundTest() {
        assertThrows(IllegalArgumentException.class, () -> BasicEnum.valueOf("NO EXISTS"));
    }

    /**
     * Every enum has a static method values() that return all instances of a enum as a array.
     * The instances are returned in the order that the elements are declared.
     *
     */
    @Test
    void valuesTest() {
        BasicEnum[] array = BasicEnum.values();
        List<BasicEnum> list = Arrays.asList(BasicEnum.ONE, BasicEnum.TWO, BasicEnum.THREE, BasicEnum.FOUR, BasicEnum.FIVE);

        for(int i = 0; array.length > i; i++) {
            assertEquals(list.get(i), array[i]);
        }
    }

    /**
     * The enum class has another overload of the static valueOf() method.
     * It follows the same idea of the other one.
     *
     */
    @Test
    public void enumValueOfTest() {
        Assertions.assertEquals(BasicEnum.ONE, Enum.valueOf(BasicEnum.class, "ONE"));
    }

}
