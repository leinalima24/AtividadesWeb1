package Atividade_java_1;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;
        double dobro = area * 2;

        System.out.println("Área calculada: " + area);
        System.out.println("Dobro da área: " + dobro);
    }
}
