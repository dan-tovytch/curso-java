package Basic.controle;

import java.util.Scanner;

public class aulaif {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();

        if(media <= 10 && media >= 7.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabens!");
        }
        if (media < 7 && media >= 5) {
            System.out.println("Recuperação");
        }
        boolean criterioReprovacaoAtingido = media < 4.5 && media >= 0;
        if (criterioReprovacaoAtingido) {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
