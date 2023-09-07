package Exercise.controle.desafioFinalControle;

import java.util.Scanner;

public class DesafioFinal7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somadorNumeros = 0;
        int numero = 0;

        while (numero >= 0) {
            System.out.print("Digite um numero inteiro (ou negativo para sair): ");
            numero = entrada.nextInt();
            if (numero >= 0) {
                somadorNumeros += numero;
                System.out.printf("\nSoma até o momento: %d\n", somadorNumeros);
            }
        }
        entrada.close();
    }
}
