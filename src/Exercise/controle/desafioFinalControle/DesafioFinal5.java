package Exercise.controle.desafioFinalControle;

import java.util.Scanner;

public class DesafioFinal5 {
    public static void main(String[] args) {
        int contadorDivisor = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = entrada.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDivisor++;
            }
        }

        switch (contadorDivisor) {
            case 0:
                System.out.println("O numero " + numero + " é um numero primo.");
                break;
            default:
                System.out.println("O numero " + numero + "  não é um numero primo.");
        }
    }
}
