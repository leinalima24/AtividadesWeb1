package Atividade_java_2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número (" + i + "/10): ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Você digitou " + pares + " números pares.");
        System.out.println("E também " + impares + " números ímpares.");
    }
}