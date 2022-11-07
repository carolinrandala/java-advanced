package org.sda;

import org.sda.generics.*;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // GENERIC TYPE
        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setColor("Green");
        fruit.setPrice(BigDecimal.valueOf(1.99)); //converting a double to BigDecimal

        GenericFood<Fruit> genericFoodWithFruit = new GenericFood<>(fruit);
        System.out.println(genericFoodWithFruit.getItem());

        String str = "I'm a great developer!";
        GenericFood<String> genericFoodWithString = new GenericFood<>(str);
        System.out.println(genericFoodWithString.getItem());

        genericFoodWithString.setItem("I'm a good person!");
        System.out.println(genericFoodWithString.getItem());

        //Generic type - extends
        Vegetable vegetable = new Vegetable();
        GenericExtendFood<Vegetable> vegetableGenericExtendFood = new GenericExtendFood<>(vegetable);
        System.out.println(vegetableGenericExtendFood.getRating());


        //Generic type - interface
        Snack snack1 = new Snack(5);
        Snack snack2 = new Snack(3);
        System.out.println("Snack 1 is better than Snack 2: " + snack1.isBetter(snack2));

        //LIST
        List<String> animalList = new ArrayList<>();
        animalList.add("Lion"); // 0
        animalList.add("Tiger"); // 1
        animalList.add("Dog"); // 2
        animalList.add("Cat");
        animalList.add("Bear");
        animalList.add("Panda");

        System.out.println(animalList.get(1)); // prints tiger

        animalList.remove(1); // tiger will be deleted
        animalList.remove("Dog");

        for (String animal : animalList) {
            System.out.println(animal);
        }

        Iterator<String> stringIterator = animalList.listIterator();

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + " ,");
        }

        // List of items to be removed
        List<String> removeAnimalList = new ArrayList<>();
        removeAnimalList.add("Cat");
        removeAnimalList.add("Panda");

        animalList.removeAll(removeAnimalList);

        //Final Removed list
        for (String animal : animalList) {
            System.out.println(animal);
        }


        //SET
        Set<String> countrySet = new HashSet<>(); // Non-sorted, randomly stored
        countrySet.add("Eesti");    // 525632
        countrySet.add("Saksmaa");  // 152635
        countrySet.add("Poola");
        countrySet.add("Rootsi");
        // countrySet.add("Eesti"); -> Duplicates not allowed!

        for (String country : countrySet) {
            System.out.println(country);
        }

        System.out.println("Before sorting: " + countrySet);
        TreeSet<String> countryTreeSet = new TreeSet<>(countrySet); // Stored as Sorted
        System.out.println("After sorting: " + countryTreeSet);


        //MAP
        Map<String, String> fullName = new HashMap<>(); //not stored as sorted

        fullName.put("Vinod", "John");
        fullName.put("Martti", "Triksberg");
        fullName.put("Helena", "Pinsel");
        fullName.put("Marko", "Piir");

        System.out.println(fullName); // helena=pinsel, marko=piir etc

        System.out.println(fullName.get("Vinod")); // john
        System.out.println(fullName.remove("Marko"));
        System.out.println(fullName);

        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Maria", 30);
        ageMap.put("Kaisa", 26);
        ageMap.put("Martin", 21);
        System.out.println(ageMap);

        //Map of list
        Map<String, List<String>> friendsMap = new HashMap<>();
        List<String> vinodFriendsList = List.of("Tony", "Martin", "Kelly");
        List<String> mariaFriendsList = List.of("Eva", "Kaisa", "Tiina");
        friendsMap.put("Vinod", vinodFriendsList);
        friendsMap.put("Maria", mariaFriendsList);

        //Map of map
        Map<String, Map<String, String>> detailsMap = new HashMap<>();
        Map<String, String> vinodInfoMap = new HashMap<>();
        vinodInfoMap.put("age", "15");
        vinodInfoMap.put("residence", "Estonia");
        vinodInfoMap.put("Phone", "732882");
        detailsMap.put("Vinod", vinodInfoMap);

        //Input and Output I/O
        File absoluteFile = new File("/Users/carolinrandala/Documents/Documents/java-advanced/src/main/resources/myText.txt");
        File relativeFile = new File("myText.txt");

        //File reading
        try {
            FileReader fileReader = new FileReader(absoluteFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine; // To store the line of text from the file

            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }

            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //File writing
        try {
            FileWriter fileWriter = new FileWriter(absoluteFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String fileLine = "\nI can write an error-less Java code :D";
            bufferedWriter.write(fileLine);
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Serialization: Writing an object to a file
        String fileName = "file.ser";

        try{
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(file);

            outputStream.writeObject(fruit);
            outputStream.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Deserialization: To get/read an object from the file
        Fruit deserializedFruit = null;

        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream inputStream = new ObjectInputStream(file);

            deserializedFruit = (Fruit) inputStream.readObject();
            inputStream.close();
            file.close();

            System.out.println(deserializedFruit.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //New I/O
        Path absolutePath = Paths.get("/Users/carolinrandala/Documents/Documents/java-advanced/src/main/resources/myText.txt");
        Path relativePath = Paths.get("myText.txt");

        try{
            //File Reading
        List<String> fileLines = Files.readAllLines(absolutePath, StandardCharsets.UTF_8);

        //Just to print the file which was read above
        for(String fileLine: fileLines) {
            System.out.println(fileLine);
        }

        //File writing
            List<String> fileLinesToWrite = List.of("I love Java", "Estonia is my country!");
        Files.write(absolutePath, fileLinesToWrite, StandardOpenOption.APPEND);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}