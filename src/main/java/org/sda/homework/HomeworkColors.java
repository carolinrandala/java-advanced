package org.sda.homework;

import java.util.*;

/**
 * 1. Create a set consisting of colors - given from the user.
 * 2. Present the removal of individual elements from the set.
 * 3. Display the collection before and after sorting.
 */
public class HomeworkColors {
    public static void main(String[] args) {
        final Scanner SCANNER = new Scanner(System.in);
        boolean removeIteam = true;
        System.out.println("Enter five colors:");
        List<String> colorSet = new ArrayList<>();

        int counter = 0;
        do {
            colorSet.add(SCANNER.next());
            counter++;
        } while (counter < 5);
        System.out.println("Your colors are: " + colorSet);
        System.out.println("Before sorting: " + colorSet);
        TreeSet<String> colorTreeSet = new TreeSet<>(colorSet);
        System.out.println("After sorting: " + colorTreeSet);

        System.out.println("Would you like to remove items from the list?");
        if(removeIteam) {
            colorSet.remove(SCANNER.hasNext());
            List<String> removeColorSet = new ArrayList<>();
            counter--;
            for (String color : colorSet) {
                System.out.println();
            }
        } else {
            System.out.println();
        }
    }


}
