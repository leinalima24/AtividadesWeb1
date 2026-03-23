package Atividade_java_2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número (" + i + "/10): ");
            int num = sc.nextInt();

            if (i == 1 || num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número que você digitou foi: " + maior);
    }
}
