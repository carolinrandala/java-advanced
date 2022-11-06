package org.sda.generics.homework;


/** HOMEWORK
 * Create a Person class that will implement a Comparable interface.
 * Person class should implement compareTo method, that will verify if one person is taller than another.
 */
public class Person implements Comparable<Person> {

    private String name;
    private int height;


    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.height - person.getHeight();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
