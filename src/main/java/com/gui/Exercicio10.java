package com.gui;

import java.util.logging.Logger;

public class Exercicio10 {

    public static void main(String[] args) {
        System.out.println("10 - Mensagem no log");
        Logger logger = Logger.getLogger(Exercicio10.class.getName());
        logger.info("Exercício de log executado.");
    }
}
