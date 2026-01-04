package com.tp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("Tests de la méthode main de App")
class AppTest {

    private ByteArrayOutputStream capturedOutput;
    private PrintStream originalOut;

    @BeforeEach
    void setUp() {
        capturedOutput = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(capturedOutput));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("La méthode main doit produire une sortie sur la console")
    void shouldPrintOutputWhenMainIsCalled() {
        App.main(new String[0]);

        String output = capturedOutput.toString().trim();

        assertNotNull(output);
        assertFalse(output.isEmpty(), "La sortie standard ne doit pas être vide");
    }
}