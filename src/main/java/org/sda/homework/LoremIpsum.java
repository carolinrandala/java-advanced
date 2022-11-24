package org.sda.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LoremIpsum {

    public static void main(String[] args) throws IOException {

        File absoluteFile = new File("/Users/carolinrandala/Documents/Documents/java-advanced/src/main/resources/loremIpsum.txt");
        File relativeFile = new File("loremIpsum.txt");

        //Reading a file and Counting words
        String[] words = null;
        int wordCount = 0;
        FileReader fileReader = new FileReader(absoluteFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string;

        while((string= bufferedReader.readLine()) !=null){
            words=string.split( " ");
            wordCount = wordCount + words.length;
        }

        System.out.println("There are " + wordCount + " words in the file.");



    }



    static int countOccurrences(String str, String word)
    {
        // split the string by spaces in a
        String a[] = str.split(" ");

        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            // if match found increase count
            if (word.equals(a[i]))
                count++;
        }

        return count;
    }

}

