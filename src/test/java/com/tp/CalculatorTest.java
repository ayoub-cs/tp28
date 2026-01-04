package com.tp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests unitaires de la classe Calculator")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("L'addition doit fonctionner avec des nombres positifs, négatifs et nuls")
    void shouldAddTwoIntegersCorrectly() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    @DisplayName("La soustraction doit gérer correctement les cas négatifs")
    void shouldSubtractIntegersCorrectly() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-2, calculator.subtract(-1, 1));
    }

    @Test
    @DisplayName("La multiplication doit retourner zéro avec 0 et gérer les signes")
    void shouldMultiplyIntegersCorrectly() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    @Test
    @DisplayName("La division doit retourner un double précis")
    void shouldDivideIntegersAndReturnDoubleResult() {
        assertEquals(2.0, calculator.divide(4, 2), 1e-6);
        assertEquals(2.5, calculator.divide(5, 2), 1e-6);
    }

    @Test
    @DisplayName("La division par zéro doit lever une IllegalArgumentException")
    void shouldThrowExceptionWhenDividingByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    @DisplayName("isEven doit correctement identifier les nombres pairs et impairs")
    void shouldCorrectlyIdentifyEvenAndOddNumbers() {
        assertTrue(calculator.isEven(2));
        assertTrue(calculator.isEven(0));
        assertTrue(calculator.isEven(-4));
        assertFalse(calculator.isEven(3));
        assertFalse(calculator.isEven(-1));
    }
}