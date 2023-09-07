package Exercise.controle;

import java.util.Scanner;

public class DesafioFinal1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = entrada.nextInt();
        if (num >= 0 && num <= 10) {
            if (num % 2 == 0) {
                System.out.printf("O número [%d] está entre 0 e 10 e é par.", num);
            }
        }else
            System.out.printf("O número [%d] não está entre 0 e 10 ou não é par.", num);

        entrada.close();
    }
}
