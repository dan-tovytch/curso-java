package Exercise.controle;

import javax.swing.*;
import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um dia da semana: ");
        String diaSemana = entrada.nextLine();


        if (diaSemana.equalsIgnoreCase("Domingo") ) {
            System.out.println("1");
        } else if (diaSemana.equalsIgnoreCase("Segunda")) {
            System.out.println("2");
        } else if (diaSemana.equalsIgnoreCase("Terça")) {
            System.out.println("3");
        } else if (diaSemana.equalsIgnoreCase("Quarta") ) {
            System.out.println("4");
        } else if (diaSemana.equalsIgnoreCase("Quinta")) {
            System.out.println("5");
        } else if (diaSemana.equalsIgnoreCase("Sexta")) {
            System.out.println("6");
        } else if (diaSemana.equalsIgnoreCase("Sabado")) {
            System.out.println("7");
        } else {
            System.out.println("Este dia da semana não exixte!");
        }
        entrada.close();
    }
}
