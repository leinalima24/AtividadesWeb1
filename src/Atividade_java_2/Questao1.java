package Atividade_java_2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Oi! Digite F ou M pra gente identificar: ");
        String letra = sc.next();

        if (letra.equalsIgnoreCase("F")) {
            System.out.println("Você informou feminino.");
        } else if (letra.equalsIgnoreCase("M")) {
            System.out.println("Você informou masculino.");
        } else {
            System.out.println("Hmm... isso não é válido 😅");
        }
    }
}
