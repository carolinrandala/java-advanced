package org.sda.homework;

/**
 * Create a Shape class.
 * a) Add fields, create constructor, getters and setters.
 * b) Create classes Rectangle and Circle. Both of them should inherit class Shape. (getter and setter)
 * c) Which fields and methods are common? (override)
 *
 * Task 2: Change Shape and Animal classes to be abstract. Which methods sould/may be abstract?
 * Add getPerimeter and getArea methods declaration to the Shape abstract class.
 * Implement and vertify those methods for both Circle and Rectangle classes.
 */
public abstract class Shape {

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

    public abstract float getPerimeter();

    public abstract float getArea();
}

