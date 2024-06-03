package org.example;

public enum Operation {

    ADD("+"),
    SUBSTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    public final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

}
