package org.sda.homework;

public class ShapeMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setName("Rectangle");
        rectangle.setArea(40);
        System.out.println(rectangle.getName());
        System.out.println(rectangle.getArea());

        Circle circle = new Circle();
        circle.setName("Circle");
        circle.setSize(30);
        System.out.println(circle.getName());
        System.out.println(circle.getSize());






    }
}
