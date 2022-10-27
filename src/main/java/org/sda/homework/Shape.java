package org.sda.homework;

/**
 * Create a Shape class.
 * a) Add fields, create constructor, getters and setters.
 * b) Create classes Rectangle and Circle. Both of them should inherit class Shape. (getter and setter)
 * c) Which fields and methods are common? (override)
 */
public class Shape {

    private int size;
    private String name;

    public Shape(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public Shape() {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

