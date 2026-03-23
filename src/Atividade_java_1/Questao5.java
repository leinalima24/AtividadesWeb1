package Atividade_java_1;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int c = sc.nextInt();

        int maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        System.out.println("O maior número informado foi: " + maior);
    }
}
