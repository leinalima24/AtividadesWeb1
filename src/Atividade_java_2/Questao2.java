package Atividade_java_2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Em qual turno você estuda? (M/V/N): ");
        String turno = sc.next();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia! ☀️");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde! 😊");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite! 🌙");
        } else {
            System.out.println("Não entendi esse turno 🤔");
        }
    }
}
