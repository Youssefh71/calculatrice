package org.example;

import java.util.Scanner;

public class UserInteraction {

    private final Scanner scanner;
    private final Calculator calculator;

    public UserInteraction(Scanner scanner, Calculator calculator) {
        this.scanner = scanner;
        this.calculator = calculator;
    }

    public void start(){

        while (true){

            System.out.println("Choisissez une opération: +, -, *, / ou tapez 'quit' pour sortir.");

            System.out.print("votre choix :");

            // Trim pour supprimer les espaces et toLowerCase pour mettre les caractères en minuscule
            String userInput = scanner.next().trim().toLowerCase();

            if (userInput.equals("quit")){
                System.out.println("Merci d'avoir utilisé notre programme" + ", à bientôt");
                break;
            }

            Operation userOperation = Operation.fromSymbol(userInput);

            if (userOperation == null){
                System.out.println("Opération demandée invalide");
                continue;
            }

            double num1 = GetValidNumber.getValidNumber(scanner, "Entrez le premier nombre");
            double num2 = GetValidNumber.getValidNumber(scanner, "Entrez le deuxième nombre");

            double result = 0;
            try{
                result = switch (userOperation){
                    case ADD -> calculator.add(num1,num2);
                    case SUBTRACT -> calculator.subtract(num1,num2);
                    case MULTIPLY -> calculator.multiply(num1,num2);
                    case DIVIDE -> calculator.divide(num1,num2);
                };

            }catch (Exception e){
                System.out.println("Erreur : " + e.getMessage());
            }

            System.out.println("Le résultat de " + num1 + " " + userInput
                    + " " + num2 + " est : " + result);

        }
    }
}
