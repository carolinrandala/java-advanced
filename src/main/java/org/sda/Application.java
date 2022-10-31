package org.sda;
/**
 * Write an application that will read the input and print back value that the user provided,
 * use try-catch statements to parse the input, e.g. I/O:
 */

import javax.management.StringValueExp;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        int a;
        float b;
        String input;
        input = scanner.nextLine();

        System.out.println("Please enter a integer, double or String value: ");
        try {
            a = scanner.nextInt();
            System.out.println("int ->" + a);
            return;
        } catch (NumberFormatException e) {
        }
        try {
            b = scanner.nextFloat();
            System.out.println("double ->" + b);
            return;
        } catch (NumberFormatException e) {
        }
        try {
            input = String.valueOf(input);
            System.out.println(input);
        } catch (NumberFormatException e) {
            System.out.println("Hey! That's not a value! Try once more.");
        }


    }


}
