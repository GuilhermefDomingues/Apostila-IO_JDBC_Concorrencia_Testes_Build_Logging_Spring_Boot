package com.gui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Exercicio05 {

    public static void main(String[] args) throws IOException {
        System.out.println("5 - Arquivos do diretório atual");
        try (Stream<Path> caminhos = Files.list(Path.of("."))) {
            caminhos.filter(Files::isRegularFile)
                    .forEach(caminho -> System.out.println(caminho.getFileName()));
        }
    }
}
