package org.sda.homework;

public class Rectangle extends Shape{

    private float perimeter;
    private float area;

    public Rectangle(int size, String name, float perimeter, float area) {
        super(size, name);
        this.perimeter = perimeter;
        this.area = area;
    }

    public Rectangle() {

    }
    @Override
    public float getPerimeter() {

        return 0;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public float getArea() {
        return 0;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
