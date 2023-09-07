package Exercise.controle.desafioFinalControle;

import java.util.Scanner;

public class DesafioFinal8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a palavra: ");
        String palavra = entrada.nextLine();

        char letras[] = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        entrada.close();
    }
}
