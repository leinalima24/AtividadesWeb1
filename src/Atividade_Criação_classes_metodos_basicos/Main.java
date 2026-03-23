package Atividade_Criação_classes_metodos_basicos;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Carro
        Carro c = new Carro("Fusca", 800, "VW", "Azul", 20000);
        System.out.println("Antes: " + c.getValor() + " - " + c.getCor());
        c.darDesconto(2000);
        c.pintar("Vermelho");
        System.out.println("Depois: " + c.getValor() + " - " + c.getCor());

        // Cartão
        CartaoCredito cartao = new CartaoCredito("Leina", 5000);
        cartao.realizaCompra(1000);
        cartao.realizaCompra(4500); // deve dar limite
        cartao.imprimeFatura();

        // Elevador
        Elevador e = new Elevador();
        e.inicializa(5, 10);
        e.entra();
        e.sobe();
        System.out.println("Andar: " + e.getAndarAtual());

        // Jogador
        Jogador j = new Jogador("Neymar", "atacante",
                LocalDate.of(1992, 2, 5),
                "Brasileiro", 1.75, 68);
        j.imprimirDados();
    }
}