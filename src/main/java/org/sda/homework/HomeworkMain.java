package org.sda.homework;

import java.util.Arrays;

public class HomeworkMain {


    public static void main(String[] args) {

            // Homework for circle and rectangle

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


            // Homework for Animal (Dog and Cat)

        Dog dog = new Dog();
        dog.setName("Dog's name is Tommy");
        Cat cat = new Cat();
        cat.setName("Cat's name is Cherry");

        System.out.println(dog.getName());
        System.out.println(cat.getName());

        Animal[] animals = Animal.yieldVoice();
        for(Animal animal: animals){
            System.out.println(Arrays.toString(animals));
            break;
        }

    }
}



