package Trabalho;

public class Agencia {
    private String nome;
    private int numero;
    private int digito;

    public Agencia(String n, int num, int dig){
        this.nome = n;
        this.numero = num;
        this.digito = dig;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }  
}