package org.example;

/**
 * La classe Calculator fournit des méthodes pour effectuer des opérations arithmétiques de base.
 * Ces opérations incluent l'addition, la soustraction, la multiplication et la division.
 */
public class Calculator {

    /**
     * Additionne deux nombres.
     *
     * @param a le premier nombre
     * @param b le deuxième nombre
     * @return la somme de a et b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Soustrait le deuxième nombre du premier nombre.
     *
     * @param a le premier nombre
     * @param b le deuxième nombre
     * @return la différence entre a et b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplie deux nombres.
     *
     * @param a le premier nombre
     * @param b le deuxième nombre
     * @return le produit de a et b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divise le premier nombre par le deuxième nombre.
     *
     * @param a le premier nombre
     * @param b le deuxième nombre
     * @return le quotient de a divisé par b
     * @throws IllegalArgumentException si b est égal à 0 (division par zéro non autorisée)
     */
    public double divide(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
