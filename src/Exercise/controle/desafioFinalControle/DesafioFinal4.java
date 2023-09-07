package Exercise.controle;

import java.util.Scanner;

public class DesafioFinal4 {
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
        if (contadorDivisor == 0) {
            System.out.println("\nO numero " + numero + " é primo.");
        } else {
            System.out.println("\nO numero " + numero + " não é primo.");
        }


        entrada.close();
    }
}
