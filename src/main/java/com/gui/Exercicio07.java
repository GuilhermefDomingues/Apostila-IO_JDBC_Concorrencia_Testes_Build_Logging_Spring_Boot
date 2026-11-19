package com.gui;

import java.util.concurrent.atomic.AtomicInteger;

public class Exercicio07 {

    public static void main(String[] args) {
        System.out.println("7 - Contador atômico");
        AtomicInteger contador = new AtomicInteger(0);

        for (int i = 0; i < 100; i++) {
            contador.incrementAndGet();
        }

        System.out.println("Contador: " + contador.get());
    }
}
