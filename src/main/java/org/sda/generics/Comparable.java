package org.sda.generics;

/**
 * Generic comparable interface
 */
public interface Comparable<T> {
    /**
     * To compare two objects field and return then to the better object
     * @param item Generic
     * @return true or false
     */
    boolean isBetter(T item);
}
