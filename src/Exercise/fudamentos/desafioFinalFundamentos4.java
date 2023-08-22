package Exercise.fudamentos;

import java.util.Scanner;

public class desafioFinalFundamentos4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do quadrado: ");
        String valorQuadrado = entrada.next();
        double quadrado = Double.parseDouble(valorQuadrado);
        double somaQuadrado = quadrado * quadrado;
        double cubo = quadrado * quadrado * quadrado;

        System.out.println("O valor do quadrado é: " + quadrado);
        System.out.println("O valor do cubo é: " + cubo);

    }
}
