package org.sda;

import org.sda.model.*;

import java.util.Arrays;

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
        Passenger passenger = new Passenger(PaymentType.CARD, "PÄRNU");
        passenger.setEmail("passenger@gmail.com"); //Access Person fields using Passenger object

        PrivatePassenger privatePassenger = new PrivatePassenger(PaymentType.CARD, "Viljandi");
        privatePassenger.setPersonalIDCode("4976765328"); //Access privatePassenger's field
        privatePassenger.setDestinationAddress("Tartu");  //Access passenger's field
        privatePassenger.setPhoneNumber("+3725258768");   //Access person's field

        //Overriding
        Person personOverride = new Person();
        personOverride.setEmail("carolinrandala@gmail.com");
        System.out.println(personOverride.getEmail());

        Passenger passengerOverride = new Passenger();
        passengerOverride.setEmail("carolin@gmail.com");
        System.out.println(passengerOverride.getEmail());

        //Polymorphism
        Person person3 = new Person(12345L, "Pärnu");
        Person person4 = new Passenger(PaymentType.CARD, "VILJANDI");
        System.out.println(person3.toString());
        System.out.println(person4.toString());



        //Calling parent methods
        Passenger passenger1 = new Passenger();
        passenger1.setAddress("Tallinn"); //Person.address
        passenger1.setDestinationAddress("Tartu"); //Passenger.destinationAddress
        System.out.println(passenger1.getAddresses());

        //Calling parent's hidden field
        passenger1.getHiddenAlive();

        //passing parameters
        Passenger passenger2 = new Passenger(123456L, "Tallinn", PaymentType.CASH, "Tartu");
        printPersonAddress(passenger2);
        printPassengerWithPrefix("Passenger", passenger2);

        //Composition exercise (MUZZEL)
        Muzzel muzzel = new Muzzel();
        muzzel.setId(890L);
        muzzel.setNoiseRange(10);
        muzzel.setTooNoisy(true);

        Dog dog1 = new Dog(true, "Doberman");
        dog1.setMuzzel(muzzel);

        System.out.println(dog1.getMuzzel().toString());

        //enums
        System.out.println(PaymentType.CARD);
        System.out.println(Arrays.toString(PaymentType.values())); //prints all the enum values
        System.out.println(PaymentType.BANK_TRANSFER.getValue());

    }


    private static void printPersonAddress(Person person) {
        System.out.println(person.getAddress());
    }

    private static void printPassengerWithPrefix(String prefix, Object object) {
        System.out.println(prefix + object);
    }
}