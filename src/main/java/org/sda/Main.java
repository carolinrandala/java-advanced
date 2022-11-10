package org.sda;

import org.sda.concurrency.StopWatchRunnableImpl;
import org.sda.concurrency.StopWatchThread;
import org.sda.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    //Lambda expression
    //predicate
    public static void main(String[] args) throws InterruptedException {
        Person person = new Person("Carolin", "Randala", "CarR" , 20);
        Predicate<Person> personTest = test -> test.getAge() > 18; //lambda expression
        System.out.println(personTest.test(person));

        //New way of writing method : Functional Interface
        Function<String, Integer> getStringLen = s -> {
            int increment = 10;
            return s.length() + increment;
        };

        System.out.println(getStringLen.apply("Java is not easy. Joke ;)"));

        //Method reference
        Predicate<Person> personTest2 = Person::isAdult; //Method reference
        System.out.println(personTest2.test(person));

        //Supplier: Doesn't take any arguments but returns/supplies only the value
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(); //No argument but returns random value
        System.out.println(randomNumberSupplier.get()); //get() should be called always

        //Consumer: It takes an argument, do the operations  and returns nothing
        Consumer<Person> printPerson = p -> System.out.println("Person first name: " + p.getFirstName() + " last name: " + p.getLastName());
        printPerson.accept(person); //accept() should be called always

        //Operator
        UnaryOperator<Integer> toSquare = i -> i * i;
        System.out.println(toSquare.apply(4)); //apply() should be called always

        //Optional

        Person person3 = new Person("Tony", "Stark", "TonyS", 54);
        Optional<Person> optionalPerson = Optional.of(person3);

        if(optionalPerson.isEmpty()) {
            System.out.println("Person cannot be printed");
        } else {
            System.out.println(optionalPerson.get().toString());
        }

        optionalPerson.ifPresent(System.out::println);

        System.out.println(getRandomPerson().toString());

        //Streams

        List<String> carList = List.of("BMW","Audi", "Skoda", "Toyota", "Ford");

        carList.stream()
                .findFirst()
                .ifPresent(System.out::println);//findFirst() -> Optional<T>

        carList.stream()
                .findAny()
                .ifPresent(System.out::println); //findAny() -> Optional<T>

        //Filter: Used to apply a condition to the list and filter list
        List<String> filtredCars = carList.stream()
                .filter(s -> s.length() >= 3) //Filter returns Stream<T>
                .collect(Collectors.toList()); //Convert Stream<T> to List<T>

        filtredCars.forEach(s -> {
            String prefixed = "Car: " + s;
            System.out.println(prefixed);
        });

        //Map: Used to apply an operation to all the elements in the list
        List<Integer> carLengths = carList.stream()
                .map(String::length)
                .collect(Collectors.toList());

        carLengths.forEach(System.out::println);
        //System.out.println(carLengths.size()); to print how many items are in the list

        //allMatch(): Used to check if all the elements in the list matching a given condition
        boolean isAllCarsGreaterThanFive = carList.stream()
                .allMatch(s -> s.length() >= 5);
        System.out.println(isAllCarsGreaterThanFive);

        //anyMatch(): Used to check if at least one element in the list matches the given condition
        boolean isAnyCarStartingWithB = carList.stream()
                .anyMatch(s -> s.startsWith("B"));
        System.out.println(isAnyCarStartingWithB);

        //reduce(): Used to condense/reduce the list to String / other type
        String cars = carList.stream()
                .reduce("", ((s, s2) -> (s.equals("") ? "" : s + ", ") + s2));
        System.out.println(cars);

        //sorted(): Used to sort the list in the ascending order
        carList.stream()
                .sorted()
                .forEach(System.out::println);

        //descending order sorting
        carList.stream()
                .sorted((car1, car2) -> car2.compareTo(car1))
                .forEach(System.out::println);

        //alternative descending sort using Comparator
        carList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        //Nested class
        //Non-static
        Person person4 = new Person("Helar", "Random", "HelRn", 85);
        System.out.println(person4.getUsername()); // outer class method call

        Person.Employee employee = person4.new Employee();
        employee.username(); // inner class method call
        System.out.println(person4.getUsername());

        //Static
        Person person5 = new Person("Anna", "Liisa", "AnnaLis", 22);
        System.out.println(person5.getUsername()); // outer-class method call

        Person.Customer customer = new Person.Customer(); // Difference in the object instantiation
        customer.username(person5);
        System.out.println(person5.getUsername());

        //CONCURRENCY
        System.out.println("Main is running after nested classes...");
        Thread.sleep(5000);
        System.out.println("Thread test ended!");

        //Thread
        StopWatchThread stopWatchThread = new StopWatchThread("SW1");
        StopWatchThread stopWatchThread2 = new StopWatchThread("SW2");
        stopWatchThread.start(); //Starting the StopWatchThread
        stopWatchThread2.start(); //Starting the second StopWatchThread2
        System.out.println("Main thread starts running...");
        Thread.sleep(5000); // This is for main method
        System.out.println("Main thread is still running..");
        Thread.sleep(3000);
        System.out.println("Main thread end running!");

        //Runnable
        System.out.println("Runnable stopWatch started...");
        Thread stopWatchRunnableThread = new Thread(new StopWatchRunnableImpl()); //Only Object instantiation varies from Thread above
        stopWatchRunnableThread.start();

    }

    //Old-school way of method definition
    private static Integer getLengthOfString(String inputString) {
        int increment = 10;
        return inputString.length() + increment;
    }

    //orElse example
    private static Person getRandomPerson() {
        //Optional<Person> optionalPerson = Optional.empty();
        Optional<Person> optionalPerson = Optional.of(new Person("Captain", "Estonia", "CapEst", 35));
        Person person2 = new Person("Mary", "Jane", "MaryJ", 22);

        return optionalPerson.orElse(person2);
    }
}