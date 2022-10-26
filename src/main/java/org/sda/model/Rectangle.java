package org.sda.model;

public class Rectangle extends Shape{

    private float perimeter;
    private float area;

    public Rectangle(int size, String name) {
        super(size, name);
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
