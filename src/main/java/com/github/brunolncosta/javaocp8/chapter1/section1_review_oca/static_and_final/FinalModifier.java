package com.github.brunolncosta.javaocp8.chapter1.section1_review_oca.static_and_final;

/**
 * Final modifier in class declaration prevent the class to be extended.
 * String class are final.
 *
 * NOTE: Final modifier do maKe distinction with instance member or static member os a class,
 * so the example bellow works in the static context too.
 *
 */
public final class FinalModifier {

    /**
     * The rule of thumb to final field is that, it must be initialize in the instantiation moment,
     * and it value can not changed after that.
     *
     * There is basically three way to initialize a final variable, are they:
     *
     * Assignment in the declaration;
     * Assignment in a block;
     * Assignment in the constructor;
     *
     */
    public final Integer field = 0;

    public final Integer fieldSetOnConstructor;

    public final Integer fieldSetOneBlock;

    /**
     * Block are a not conventional way to initialize a variable.
     *
     */
    {
        fieldSetOneBlock = 10;
    }

    /**
     * Constructors can receive final parameters,
     * but can not accept the final modifier themselves.
     *
     */
    public FinalModifier(final Integer fieldSetOnConstructor) {
        this.fieldSetOnConstructor = fieldSetOnConstructor;
    }

    /**
     * You can not provide a way to create a instance without initialize the final fields.
     * That why the constructor bellow does not compile.
     */
//  public FinalModifier() {
//
//  }

    /**
     * As you can see you can not change de value of a final field at any point of the class.
     *
     */
//  public void increment() {
//      field++;
//      fieldSetOnConstructor += 1;
//      fieldSetOneBlock = 70;
//  }

    /**
     * Final modifier in method prevent the method to be override.
     * Method could the final parameters as well, that can not be changed when the method is executed.
     *
     */
    public final Integer getLuckNumber(final Integer initial) {

//      initial+= 1; Final can not change a final parameter.

//      When a local variable a final it must assume a value only one time.
//      could be in the declaration or late with one assignment.
        final Integer result;

        if (initial > fieldSetOneBlock) {
            result = initial * 4;

        } else if (initial == field) {
            result = 20 + fieldSetOnConstructor * 4;

        } else {
            result = initial + fieldSetOnConstructor * 3;
        }

//      result += 5; The value of this variable can not the changed.

        return result;
    }

}
