package Exercise.fudamentos;

import javax.swing.*;
import java.util.Scanner;

public class DesafioCalculadora{
    // ler num1
    // ler num2
    // + - * / %
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String num1Input = JOptionPane.showInputDialog("Digite o primeiro número:");
        double num1 = Double.parseDouble(num1Input);
        String num2Input = JOptionPane.showInputDialog("Digite o segundo número:");
        double num2 = Double.parseDouble(num2Input);
        String operador = JOptionPane.showInputDialog("Digite o operador(+ - * / %):");
        double resultado = 0.0;

        resultado = operador.equals("+") ? num1 + num2 : resultado;
        resultado = operador.equals("-") ? num1 - num2 : resultado;
        resultado = operador.equals("*") ? num1 * num2 : resultado;
        resultado = operador.equals("/") ? num1 / num2 : resultado;
        resultado = operador.equals("%") ? num1 % num2 : resultado;

        entrada.close();
        System.out.printf("%n  %s  %n ", num1 + operador + num2);
        System.out.println("Resultado: " + resultado);

    }
}
