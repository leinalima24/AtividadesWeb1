package Atividade_Criação_classes_metodos_basicos;

public class Carro {

    private String nome;
    private double peso;
    private String fabricante;
    private String cor;
    private double valor;

    public Carro(String nome, double peso, String fabricante, String cor, double valor) {
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valor = valor;
    }

    public void darDesconto(double desconto) {
        valor -= desconto;
    }

    public void pintar(String novaCor) {
        this.cor = novaCor;
    }

    public double getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }
}