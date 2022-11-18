package org.sda.homework;

import java.util.Arrays;

/**
 * Create a simple Generic class, that will give a possibility to store any kind of value within.
 * Add object of type String, Interger and Double to array of that Generic type.
 * Print all the values of the array within a loop.
 */
public class Generic<T> {

    private T array[];

    Generic(T myarray[]) {
        array = myarray;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
