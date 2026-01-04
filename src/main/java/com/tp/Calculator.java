package com.tp;

/**
 * Calculatrice utilitaire offrant des opérations arithmétiques de base.
 * Toutes les méthodes sont statiques : pas besoin d'instancier la classe.
 */
public final class Calculator {

    private Calculator() {
        // Constructeur privé pour empêcher l'instanciation (classe utilitaire)
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed!");
        }
        return (double) a / b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}