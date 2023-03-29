package com.example;

import main.java.com.example.Endereco;
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

        Endereco e1 = new Endereco(
                "Pedro dos Anjos",
                406,
                "Cobé ",
                "RN",
                "Vera Cruz",
                "59182600",
                "84996300756");

        e1.setTelefone("84999048140");
        e1.setEstado("RNN");

        System.out.println(e1.toString());

    }
}
