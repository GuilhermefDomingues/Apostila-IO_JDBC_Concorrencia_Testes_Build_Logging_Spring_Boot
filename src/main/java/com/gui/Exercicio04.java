package com.gui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Exercicio04 {

    public static void main(String[] args) throws IOException {
        Path arquivo = Path.of("target", "exercicios", "mensagem.txt");
        if (Files.notExists(arquivo)) {
            System.out.println("Execute o Exercicio01 para criar mensagem.txt.");
            return;
        }

        System.out.println("4 - Copiar arquivo");
        Path backup = arquivo.getParent().resolve("backup");
        Files.createDirectories(backup);

        Path destino = backup.resolve(arquivo.getFileName());
        Files.copy(arquivo, destino, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Cópia em: " + destino);
    }
}
