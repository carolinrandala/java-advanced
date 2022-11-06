package org.sda.generics.homework;

public class HomeworkMain {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Liza");
        person.setHeight(167);

        Person person1 = new Person();
        person1.setName("Mary");
        person1.setHeight(172);

        System.out.println(person.getName().compareTo(person1.getName()));

    }
}
