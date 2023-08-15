package Basic.fudamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Bom");
        System.out.print(" dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n",
                1, 2,3,4,5,6);
        System.out.printf("Salário: %.1f%n", 1234.5678);
        System.out.printf("Nome: %s%n", "Daniel");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite seu idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.%n",
        nome, sobrenome, idade);

        entrada.close();
    }
}
