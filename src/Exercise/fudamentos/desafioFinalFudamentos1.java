package Exercise.fudamentos;

import javax.swing.*;
import java.util.Scanner;

public class desafioFinalFudamentos1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String fahrenheitInput = JOptionPane.showInputDialog("Digite a temperatura em fahrenheit:");
        double fahrenheit = Double.parseDouble(fahrenheitInput);
        double fator = 5 / 9.0;
        double ajuste = 32;
        double resultado = fahrenheit + fator + ajuste;

        System.out.println("O resultado é " +  + "ºC.");


    }

}
