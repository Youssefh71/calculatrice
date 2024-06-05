package org.example;

import java.util.Scanner;



public class Application {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        UserInteraction userInteraction = new UserInteraction(scanner, calculator);
        userInteraction.start();

    }
}