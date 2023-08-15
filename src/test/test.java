package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");

        float nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2)/2;

        if (media >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");

    }
}
