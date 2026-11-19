package com.gui;

public class Exercicio06 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("6 - Duas threads");
        Runnable tarefa = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread primeira = new Thread(tarefa, "Thread 1");
        Thread segunda = new Thread(tarefa, "Thread 2");

        primeira.start();
        segunda.start();
        primeira.join();
        segunda.join();
    }
}
