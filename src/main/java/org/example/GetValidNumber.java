package org.example;

import java.util.Scanner;

public class GetValidNumber {

    public static double getValidNumber(Scanner scanner, String message){

        while (true){
            try{
                System.out.println(message);
                String userInput = scanner.next().replace(",",".");

                return  Double.parseDouble(userInput);
            }catch (NumberFormatException e){
                System.out.println("Entrée invalide.");
            }
        }
    }
}
