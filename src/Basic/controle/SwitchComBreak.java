package Basic.controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.print("Informe a nota: ");
        int nota = entrada.nextInt();
        switch (nota) {
            case 10, 9:
                conceito = "A";
                break;
            case 8, 7:
                conceito = "B";
                break;
            case 6, 5:
                conceito = "C";
                break;
            case 4, 3:
                conceito = "D";
                break;
            case 2, 1, 0:
                conceito = "E";
                break;
            default:
                conceito = "Não encontrado";
                break;
        }

        System.out.println("Conceito é " + conceito);
    }
}
