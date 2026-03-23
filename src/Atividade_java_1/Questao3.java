package Atividade_java_1;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = sc.nextInt();

        System.out.print("Agora digite um número real: ");
        double c = sc.nextDouble();

        double r1 = (a * 2) * (b / 2.0);
        double r2 = (a * 3) + c;
        double r3 = Math.pow(c, 3);

        System.out.println("Resultado da letra a: " + r1);
        System.out.println("Resultado da letra b: " + r2);
        System.out.println("Resultado da letra c: " + r3);
    }
}
