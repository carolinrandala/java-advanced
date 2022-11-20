package org.sda.homework;

public class HomeworkMain {
    public static void main(String[] args) {

        //Homework (Comparing exercise)
        Person person1 = new Person(180);
        Person person2 = new Person(167);
        System.out.println("Person 1 is taller than person 2: " + person1.isTaller(person2));
        System.out.println(person1.compareTo(person2));
    }
}

