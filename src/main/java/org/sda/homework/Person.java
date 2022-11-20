package org.sda.homework;

public class Person implements ComparablePerson<Person> {
    private int height;


    public Person(int height) {
        this.height = height;
    }

    @Override
    public boolean isTaller(Person item) {
        return this.height > item.height;
    }

    @Override
    public boolean compareTo(Person person2) {
        return this.height > person2.height;
    }

}
