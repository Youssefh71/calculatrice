package org.example;

import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Application {


      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        UserInteraction userInteraction = new UserInteraction(scanner, calculator);
        userInteraction.start();

    }
}