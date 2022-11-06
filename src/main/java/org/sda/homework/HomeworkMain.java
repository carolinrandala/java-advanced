package org.sda.homework;

import java.util.ArrayList;

public class HomeworkMain {
    public static void main(String[] args) {


        //initialize new array objects
        Generic<Integer> arr1 = new Generic<>(new Integer[]{2,4,6,8,10});
        System.out.print("Array with Integer type:" + " ");
        System.out.println(arr1);

        Generic<String> arr2 = new Generic<>(new String[]{"aa", "bb", "cc", "dd"});
        System.out.print("Array with String type:" + " ");
        System.out.println(arr2);

        Generic<Double> arr3 = new Generic<>(new Double[]{10.2d, 1.2d, 10.1d, 7.6d});
        System.out.println("Array with Double type:" + " ");
        System.out.println(arr3);



    }
}

