package main.java.com.example;

public class Pessoa {
    private String nome;
    private int idade;
    private String signo;

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public void setSigno(String novoSigno) {
        this.signo = novoSigno;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getSigno() {
        return this.signo;
    }

    public Pessoa(String nome, int idade, String signo) {
        this.nome = nome;
        this.idade = idade;
        this.signo = signo;
    }

    public String toString() {
        return "Seu nome é " + nome + " e sua idade é " + idade + " e seu signo é " + signo;
    }
}
