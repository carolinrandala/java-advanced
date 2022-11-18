package org.sda.homework;


public class HomeworkMain {
    public static void main(String[] args) {
/**
 * Create a simple Generic class, that will give a possibility to store any kind of value within.
 * Add object of type String, Interger and Double to array of that Generic type.
 * Print all the values of the array within a loop.
 */

        //initialize new array objects
        Generic<Integer> arr1 = new Generic<>(new Integer[]{2,4,6,8,10});
        System.out.println("Array with Integer type:" + " " + arr1);


        Generic<String> arr2 = new Generic<>(new String[]{"Apple", "Orange", "Strawberry", "Mango"});
        System.out.println("Array with String type:" + " " + arr2);


        Generic<Double> arr3 = new Generic<>(new Double[]{10.2d, 1.2d, 10.1d, 7.6d});
        System.out.println("Array with Double type:" + " " + arr3);




    }
}

