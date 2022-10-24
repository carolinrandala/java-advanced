package org.sda;

import org.sda.model.Dog;
import org.sda.model.Passenger;
import org.sda.model.Person;
import org.sda.model.PrivatePassenger;

public class Main {
    public static void main(String[] args) {
        //ENCAPSULATION
        //No-argument constructor call
        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(person.getId());


        //All argument constructor call
        Person person1 = new Person(12345L, "Carolin", "Randala", "abc@gmail.com", "+3725020220", "Tallinn, Kaupmehe");
        System.out.println(person1.toString());
        System.out.println(person1.getEmail());

        Person person2 = new Person();
        person2.setFirstName("Tony");
        person2.setLastName("Stark");
        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());


        Dog dog = new Dog(true, "German Shepperd");
        System.out.println(dog.toString());
        System.out.println(dog.getAge());
        System.out.println(dog.getWeigth());

        //INHERITANCE
        Passenger passenger = new Passenger("CARD", "PÄRNU");
        passenger.setEmail("passenger@gmail.com"); //Access Person fields using Passenger object

        PrivatePassenger privatePassenger = new PrivatePassenger("CARD", "Viljandi");
        privatePassenger.setPersonalIDCode("4976765328"); //Access privatePassenger's field
        privatePassenger.setDestinationAddress("Tartu");  //Access passenger's field
        privatePassenger.setPhoneNumber("+3725258768");   //Access person's field


    }
}