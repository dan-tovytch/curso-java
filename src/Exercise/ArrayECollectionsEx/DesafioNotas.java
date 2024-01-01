package Exercise.ArrayECollectionsEx;

import java.util.Scanner;

public class DesafioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaMedia = 0;
        System.out.print("Digite a quantidade de notas: ");
        int Qtdnota = scanner.nextInt();
        double[] notasAlunos = new double[Qtdnota];

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.print("Digite a nota: ");
            notasAlunos[i] = scanner.nextDouble();
            notaMedia += notasAlunos[i];
        }

        double resultado = notaMedia / Qtdnota;


        if (resultado >= 7) {
            System.out.println("a média final é: " + notaMedia/Qtdnota + " APROVADO!");
        } else {
            System.out.println("a média final é: " + notaMedia/Qtdnota + " REPROVADO!");
        }

        scanner.close();
    }
}
