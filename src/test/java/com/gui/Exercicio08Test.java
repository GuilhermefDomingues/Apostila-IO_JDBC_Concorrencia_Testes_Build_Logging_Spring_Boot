package com.gui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercicio08Test {

    @Test
    void deveSomarDoisNumeros() {
        int resultado = Exercicio08.soma(2, 3);

        assertEquals(5, resultado);
    }
}
