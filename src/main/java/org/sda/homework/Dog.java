package org.sda.homework;

/**
 * Create classes Dog and Cat.
 * a) Move common methods and fields to the class Animal.
 * b) Create method „yieldVoice”.
 * c) Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
 * d) Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
 */
public class Dog extends Animal{
    private boolean walks;

    public boolean isBarks() {
        return walks;
    }

    public void setBarks(boolean barks) {
        this.walks = barks;
    }

    public String getFavouriteToy() {
        return food;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.food = favouriteToy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String food;
    private String name;

    public Dog(String voice, String breed) {
        super(voice, breed);
    }

    public Dog() {
        super();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "voice='" + voice + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}