package Atividade_java_1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        System.out.println("Sua média foi: " + media);

        if (media == 10) {
            System.out.println("Parabéns! Aprovado com distinção.");
        } else if (media >= 7) {
            System.out.println("Você foi aprovado.");
        } else {
            System.out.println("Infelizmente, você foi reprovado.");
        }
    }
}