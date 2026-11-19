package com.gui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercicio02 {

    public static void main(String[] args) throws IOException {
        Path arquivo = Path.of("target", "exercicios", "mensagem.txt");
        if (Files.notExists(arquivo)) {
            System.out.println("Execute o Exercicio01 para criar mensagem.txt.");
            return;
        }

        System.out.println("2 - Informações do arquivo");
        System.out.println("Caminho: " + arquivo.toAbsolutePath());
        System.out.println("Tamanho: " + Files.size(arquivo) + " bytes");
        System.out.println("Última modificação: " + Files.getLastModifiedTime(arquivo));
    }
}
