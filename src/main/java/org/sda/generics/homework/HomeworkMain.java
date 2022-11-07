package org.sda.generics.homework;

public class HomeworkMain {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Anna");
        person.setHeight(165);
        System.out.println(person);
        Person person1 = new Person();
       person1.setName("Mary");
       person1.setHeight(170);
        System.out.println(person1);

        System.out.println(person.compareTo(person1));




    }
}
