package Exercise.controle.desafioFinalControle;

import java.util.Scanner;

public class DesafioFinal3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2;
        System.out.print("Informe a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Informe a segunda nota: ");
        nota2 = entrada.nextDouble();

        // Calcula a média das notas
        double media = (nota1 + nota2) / 2;

        String situacao;
        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media >= 4.0) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.printf("A média final é %.2f, e a situação é: %s%n", media, situacao);
        entrada.close();
    }
}
