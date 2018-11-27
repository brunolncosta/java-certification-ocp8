package com.github.brunolncosta.javaocp8.chapter1.section6_work_with_enum;


/**
 * Enums follow the same rules of a normal class declaration, with some differences,
 *
 * All enums are final, but you can not write it explicitly.
 * Enum can not extends other classes.
 *
 * Thus if a enum is public, the name of the java file must be the same of the enum.
 *
 */
public enum BasicEnum {

    /**
     * If you uncomment the line bellow, you will get a compile error.
     *
     */
    // public Integer statementBeforeElementsDeclaration = 10;


    /**
     * The first statement must be the declarations of the enum's elements, otherwise you will get a compile error.
     *
     * The elements are separated with commas.
     *
     * Note that it is not need to put ";" in the end of the elements declaration, but that is allowed,
     * if and only if, there is no statements after the declaration.
     *
     */
    ONE, TWO, THREE, FOUR, FIVE

    /**
     * If you uncomment the line bellow, you will get a compile error.
     *
     */
    //public Integer statementAfterElementsDeclaration = 10;

    /**
     * Enumerations use the name() method to find the correct enum instance given a String,
     * that is the why this method is final.
     *
     *
     */
    // @Override
    // public String name() {
    //    return "You not can override!";
    // }

    /**
     * Enumations use the orginal() method to find the correct enum instance given a element order,
     * that is the why this method is final.
     *
     *
     */
    // @Override
    // public int ordinal() {
    //    return "You not can override!";
    // }

}
