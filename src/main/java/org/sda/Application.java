package org.sda;
/**
 * Write an application that will read the input and print back value that the user provided,
 * use try-catch statements to parse the input, e.g. I/O:
 */
import java.util.Scanner;
public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        float b = scanner.nextFloat();
        System.out.println("Enter a integer, double or String: ");
        try {
            if (scanner.hasNextInt()) {
                System.out.println("int ->" + a);
            } else if (scanner.hasNextFloat()) {
                System.out.println("double ->" + b);
            } else {
                System.out.println("Hey! That's not a value! Try once more.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}



