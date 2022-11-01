package org.sda;
/**
 * Write an application that will read the input and print back value that the user provided,
 * use try-catch statements to parse the input, e.g. I/O:
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {

        try {
            displayNumber();
        } catch (InputMismatchException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    private static void displayNumber() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println("int -> " + a);
        } else if (scanner.hasNextDouble()) {
            double d = scanner.nextDouble();
            System.out.println("double ->" + d);
        } else {
            throw new InputMismatchException("Hey, it's not a value! Try once more.");
        }
    }
}



