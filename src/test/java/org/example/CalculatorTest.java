package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import static org.mockito.Mockito.*;

class CalculatorTest {

    private Scanner scanner;
    private  Calculator calculator;
    private UserInteraction userInteraction;

    @BeforeEach
    void setUp() {
        scanner = mock(Scanner.class);
        calculator = mock(Calculator.class);
        userInteraction = new UserInteraction(scanner, calculator);
    }

    @Test
    void add() {
        when(scanner.next()).thenReturn("+", "2", "3", "quit");
        when(calculator.add(2,3)).thenReturn(5.0);

        userInteraction.start();

        verify(calculator, times(1)).add(2,3);
        verify(scanner,times(4)).next();
    }

    @Test
    void subtract() {
        when(scanner.next()).thenReturn("-", "2", "3", "quit");
        when(calculator.subtract(2,3)).thenReturn(-1.0);

        userInteraction.start();

        verify(calculator, times(1)).subtract(2,3);
        verify(scanner,times(4)).next();
    }

    @Test
    void multiply() {
        when(scanner.next()).thenReturn("*", "2", "3", "quit");
        when(calculator.multiply(2,3)).thenReturn(6.0);

        userInteraction.start();

        verify(calculator, times(1)).multiply(2,3);
        verify(scanner,times(4)).next();
    }

    @Test
    void divide() {

        when(scanner.next()).thenReturn("/", "10", "2", "quit");
        when(calculator.divide(10,2)).thenReturn(5.0);

        userInteraction.start();

        verify(calculator, times(1)).divide(10,2);
        verify(scanner,times(4)).next();
    }

    @Test
    void invalidOperation() {
        when(scanner.next()).thenReturn("invalide", "quit");

        userInteraction.start();

        verify(calculator, never()).add(anyDouble(), anyDouble());
        verify(calculator, never()).subtract(anyDouble(), anyDouble());
        verify(calculator, never()).multiply(anyDouble(), anyDouble());
        verify(calculator, never()).divide(anyDouble(), anyDouble());
        verify(scanner, times(2)).next();
    }
}