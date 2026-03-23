package Atividade_Criação_classes_metodos_basicos;

import java.time.LocalDate;

public class Jogador {

    private String nome;
    private String posicao;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Jogador(String nome, String posicao, LocalDate dataNascimento,
                   String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public int calcularIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    public int tempoAposentadoria() {
        int idade = calcularIdade();

        if (posicao.equalsIgnoreCase("defesa")) {
            return 40 - idade;
        } else if (posicao.equalsIgnoreCase("meio-campo")) {
            return 38 - idade;
        } else {
            return 35 - idade;
        }
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Idade: " + calcularIdade());
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Tempo para aposentar: " + tempoAposentadoria());
    }
}
