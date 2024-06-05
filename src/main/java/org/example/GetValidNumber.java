package org.example;

import java.util.Scanner;

/**
 * La classe GetValidNumber fournit une méthode pour obtenir un nombre valide de l'utilisateur.
 * Elle utilise un scanner pour lire l'entrée de l'utilisateur et gère les entrées invalides.
 */
public class GetValidNumber {

    /**
     * Demande à l'utilisateur d'entrer un nombre valide jusqu'à ce qu'une entrée valide soit fournie.
     *
     * @param scanner l'objet Scanner utilisé pour lire l'entrée de l'utilisateur
     * @param message le message affiché à l'utilisateur pour l'inviter à entrer un nombre
     * @return le nombre valide entré par l'utilisateur
     */
    public static double getValidNumber(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.println(message);
                String userInput = scanner.next().replace(",", ".");
                return Double.parseDouble(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide.");
            }
        }
    }
}

