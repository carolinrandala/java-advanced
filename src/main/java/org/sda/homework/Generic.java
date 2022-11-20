package org.sda.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a simple Generic class, that will give a possibility to store any kind of value within.
 * Add object of type String, Interger and Double to array of that Generic type.
 * Print all the values of the array within a loop.
 */
public class Generic<T> {

        @Override
        public String toString() {
            return "GenericType{" +
                    "items=" + items +
                    '}';
        }

        private T items;

        public static <T> void main(String[] args) {


            List<String> stringList = new ArrayList<>();
            stringList.add("Mango");
            List<Double> doubleList = new ArrayList<>();
            doubleList.add(10.3d);
            List<Integer> integerList = new ArrayList<>();
            integerList.add(77);


            List<T> allLists = (List<T>) List.of(stringList, doubleList, integerList);
            System.out.println(allLists);

            for(T itemList: allLists){
                System.out.println(itemList); //it will loop and print all the values of the list
            }
        }



    }