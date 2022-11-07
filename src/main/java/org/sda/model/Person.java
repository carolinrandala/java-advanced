package org.sda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Person model
 *
 */
@AllArgsConstructor
@Getter
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isAdult() {
        return age >= 18;
    }

}
