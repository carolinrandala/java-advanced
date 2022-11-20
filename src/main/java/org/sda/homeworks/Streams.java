package org.sda.homeworks;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Using streams, for a given lists:
 * [John, Sarah, Mark, Tyla, Ellisha, Eamonn]
 * [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
 * a) Sort the list
 * b) Print only those names, that start with E letter
 * c) Print values greater than 30 and lower than 200
 * d) Print names uppercase
 * e) Remove first and last letter, sort and print names
 * f) *Sort backwards by implementing reverse Comparator and using lambda expression
 */
public class Streams {
    public static void main(String[] args) {

        // a) Sorting list of names
        System.out.println("List of names sorted alphabetically:");
        List<String> namesList = List.of("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        namesList.stream()
                .sorted()
                .forEach(System.out::println);

        // a) Sorting list of numbers
        System.out.println("List of numbers sorted in ascending order");
        List<Integer> numbersList = List.of(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);
        numbersList.stream()
                .sorted()
                .forEach(System.out::println);

        // b) Print only those names, that start with E letter
        System.out.println("Names that start with E:");
        namesList.stream().map(name -> name.startsWith("E")).forEach(System.out::println);

        // c) Print values greater than 30 and lower than 200
        System.out.println("Values greater than 30 and lower than 200");
        List<Integer> sortedNumbers = numbersList.stream()
                .filter(x -> x >= 30)
                .filter(x -> x <= 200)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        // d) Print names uppercase
        System.out.println("Names to uppercase: ");
        List<String> namesToUpperCase = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        namesList.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name + " "));

        // e) Remove first and last letter, sort and print names
        System.out.println("Sorting and printing names after removing first and last letter:");
        List<String> removeChar = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        removeChar.stream().map(name -> name.substring(1, name.length()-1)).sorted().forEach(name -> System.out.println(name + " "));

        // f) *Sort backwards by implementing reverse Comparator and using lambda expression
        System.out.println("List of names sorted backwards:");
        namesList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("List of numbers sorted backwards:");
        numbersList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }
}
