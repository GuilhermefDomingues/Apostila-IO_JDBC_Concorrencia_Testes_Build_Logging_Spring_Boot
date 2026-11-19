package com.gui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercicio01 {

    public static void main(String[] args) throws IOException {
        Path arquivo = Path.of("target", "exercicios", "mensagem.txt");

        System.out.println("1 - Escrever e ler um arquivo");
        Files.createDirectories(arquivo.getParent());
        Files.writeString(arquivo, "Olá, Java!");

        String texto = Files.readString(arquivo);
        System.out.println(texto);
    }
}
