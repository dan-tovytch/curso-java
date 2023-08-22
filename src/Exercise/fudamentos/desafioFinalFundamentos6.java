package Exercise.fudamentos;

import java.util.Scanner;

public class desafioFinalFundamentos6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do A: ");
        String valorA = entrada.next();
        double a = Double.parseDouble(valorA);
        System.out.print("Digite o valor do B: ");
        String valorB = entrada.next();
        double b = Double.parseDouble(valorB);
        System.out.print("Digite o valor do C: ");
        String valorC = entrada.next();
        double c = Double.parseDouble(valorC);

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("O valor do delta é: " + delta);
    }
}
