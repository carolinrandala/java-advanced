package org.sda.homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1. Create a set consisting of colors - given from the user.
 * 2. Present the removal of individual elements from the set.
 * 3. Display the collection before and after sorting.
 */
public class HomeworkColors {
    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
        System.out.println("Enter five colors:");
        Set<String> colorSet = new HashSet<>();

        int counter = 0;
        do {
            colorSet.add(SCANNER.next());
            counter++;
        } while (counter < 5);
        System.out.println("Your colors are: " + colorSet);

        System.out.println("Before sorting: " + colorSet);
        TreeSet<String> colorTreeSet = new TreeSet<>(colorSet);
        System.out.println("After sorting: " + colorTreeSet);

    }


}
