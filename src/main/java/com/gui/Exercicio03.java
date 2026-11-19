package com.gui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercicio03 {

    public static void main(String[] args) throws IOException {
        Path pastaDeExercicios = Path.of("target", "exercicios");

        System.out.println("3 - Criar pasta");
        Path pasta = pastaDeExercicios.resolve(Path.of("dados", "alunos"));
        Files.createDirectories(pasta);
        System.out.println("Pasta criada: " + pasta);
    }
}
