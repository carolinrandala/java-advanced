package org.sda.homework;

/**
 * Create classes Dog and Cat.
 * a) Move common methods and fields to the class Animal.
 * b) Create method „yieldVoice”.
 * c) Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
 * d) Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
 *
 * Task 2: Change Shape and Animal classes to be abstract. Which methods sould/may be abstract?
 *  * Add getPerimeter and getArea methods declaration to the Shape abstract class.
 *  * Implement and vertify those methods for both Circle and Rectangle classes.
 *  */
public abstract class Animal {

    String voice;
    String breed;

    public Animal() {

    }

    public Animal(String voice, String breed) {
        this.voice = voice;
        this.breed = breed;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "voice='" + voice + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public static Animal[] yieldVoice() {


        Dog dog1 = new Dog("Whoof-whoof", "Dog");

        Cat cat1 = new Cat("Meow", "Cat");


        return new Animal[] {dog1, cat1};

    }


}
