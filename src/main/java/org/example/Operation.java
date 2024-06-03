package org.example;

public enum Operation {

    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    public final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Operation fromSymbol( String symbol){

        for (Operation op: Operation.values()){

            if (op.getSymbol().equals(symbol)){

                return op;
            }
        }

        return null;
    }

}
