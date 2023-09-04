package Exercise.controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double total = 0;
        double soma = 0;
        double contador = 0;

        do {
            System.out.print("Digite a nota que deseja calcular: ");
            total = entrada.nextDouble();
            if ((total <= 10 && total >= 0)) {
                System.out.println("Nota inválida");
            } else {
                soma += total;
            } if (total != 0) {

                contador++;
            }
        } while (total != -1);
            System.out.println(contador);
            System.out.println("A média das notas são de: " + soma / contador);
        entrada.close();
    }
}
