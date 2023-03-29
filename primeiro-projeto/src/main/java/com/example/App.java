package com.example;

import main.java.com.example.Pessoa;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 28, "Escorpião");
        p1.setNome("Pedro");
        p1.setIdade(30);
        p1.setSigno("Sagitário");

        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getSigno());

    }
}
