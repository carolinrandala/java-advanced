package org.sda.exceptions;
/**
 * Exception to handle if the person is not found
 * Creating a new exception
 *
 * @author carolinrandala
 */
public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(String name) {
        super(String.format("The person (%s) in not found!", name));
    }

    public PersonNotFoundException(int age) {
        super(String.format("The person (age: %d) in not found!", age));
    }
}
