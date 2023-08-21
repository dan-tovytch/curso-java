package Exercise.fudamentos;

import javax.swing.*;

public class desafioFinalFundamentos2 {
    public static void main(String[] args) {
        String celsiusInput = JOptionPane.showInputDialog("Digite a temperatura em celsius:");
        double celsius = Double.parseDouble(celsiusInput);

        // Realize os cálculos corretamente para converter de Fahrenheit para Celsius
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Celsius é: " + fahrenheit + " ºF");
    }
}
