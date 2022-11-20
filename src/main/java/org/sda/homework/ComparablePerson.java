package org.sda.homework;
/**
 * Compare two object fields and return to taller object
 *
 * @param <T> Generic
 * @return true or false
 */
public interface ComparablePerson<T> {

    boolean isTaller(T item);

    boolean compareTo(T item);
}
