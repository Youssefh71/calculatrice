package org.example;

/**
 * L'énumération Operation représente les opérations arithmétiques de base.
 * Chaque opération est associée à un symbole correspondant.
 */
public enum Operation {

    /**
     * Addition, représentée par le symbole "+".
     */
    ADD("+"),

    /**
     * Soustraction, représentée par le symbole "-".
     */
    SUBTRACT("-"),

    /**
     * Multiplication, représentée par le symbole "*".
     */
    MULTIPLY("*"),

    /**
     * Division, représentée par le symbole "/".
     */
    DIVIDE("/");

    /**
     * Le symbole associé à l'opération.
     */
    public final String symbol;

    /**
     * Constructeur pour initialiser une opération avec son symbole.
     *
     * @param symbol le symbole de l'opération
     */
    Operation(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Retourne le symbole de l'opération.
     *
     * @return le symbole de l'opération
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Retourne l'opération correspondant au symbole donné.
     *
     * @param symbol le symbole de l'opération
     * @return l'opération correspondant au symbole, ou null si le symbole n'est pas valide
     */
    public static Operation fromSymbol(String symbol) {
        for (Operation op : Operation.values()) {
            if (op.getSymbol().equals(symbol)) {
                return op;
            }
        }
        return null;
    }
}
