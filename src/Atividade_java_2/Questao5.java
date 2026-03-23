package Atividade_java_2;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular a soma: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("A soma de 1 até " + n + " dá: " + soma);
    }
}
