package main.java.com.example;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String estado;
    private String cidade;
    private String cep;
    private String telefone;

    public Endereco(
            String rua,
            int numero,
            String bairro,
            String estado,
            String cidade,
            String cep,
            String telefone) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.telefone = telefone;

    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "{" +
                " rua='" + getRua() + "'" +
                ", numero='" + getNumero() + "'" +
                ", bairro='" + getBairro() + "'" +
                ", estado='" + getEstado() + "'" +
                ", cidade='" + getCidade() + "'" +
                ", cep='" + getCep() + "'" +
                ", telefone='" + getTelefone() + "'" +
                "}";
    }

}
