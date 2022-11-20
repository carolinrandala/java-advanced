package org.sda.homework;

import java.util.*;

/**
 * 1. Create a set consisting of colors - given from the user.
 * 2. Present the removal of individual elements from the set.
 * 3. Display the collection before and after sorting.
 */
public class Colors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> colorSet = new HashSet<>();

        //adding colors to the set
        boolean isAdd = true;

        while (isAdd) {
            System.out.println("Enter a color:");
            colorSet.add(scanner.next());
            System.out.println("" + colorSet + " added to the set. Do you want to add more colors? (true/false)");
            isAdd = scanner.nextBoolean();
        }
        System.out.println("Colorset before sorting: " + colorSet);

        //delete colors from the set
        boolean isDelete = true;

        while (isDelete) {
            System.out.println("Do you want to delete any colors? (true/false)");
            if (scanner.nextBoolean()) {
                System.out.println("Enter a color you want to delete: ");
            } else {
                break;
            }

            String deleteColor = scanner.next();

            if (colorSet.contains(deleteColor)) {
                colorSet.remove(deleteColor);
                System.out.println("" + deleteColor + " deleted from the set. Do you want to delete more colors? (true/false");

            } else {
                System.out.println("The color does not exists. Do you want to delete another color? (true/false)");
            }
            isDelete = scanner.nextBoolean();
        }
        //set before sorting
        System.out.println("Colorset before sorting: " + colorSet);

        //set after sorting
        TreeSet<String> colorTreeSet = new TreeSet<>(colorSet);
        System.out.println("After sorting:" + colorTreeSet);



    }

}
