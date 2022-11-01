package org.sda.homework;

public class Circle extends Shape {

    private float radius;

    private float diameter;

    public Circle(int size, String name, float radius, float diameter) {
        super(size, name);
        this.radius = radius;
        this.diameter = diameter;
    }

    public Circle() {

    }

    @Override
    public float getPerimeter() {

        return 0;
    }

    @Override
    public float getArea() {
        return 0;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
