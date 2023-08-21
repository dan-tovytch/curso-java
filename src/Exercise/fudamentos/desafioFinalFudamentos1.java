package Exercise.fudamentos;
// desafio converter fahrenheit para celsius
import javax.swing.*;
import java.util.Scanner;

public class desafioFinalFudamentos1 {
    public static void main(String[] args) {
        String fahrenheitInput = JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit:");
        double fahrenheit = Double.parseDouble(fahrenheitInput);

        // Realize os cálculos corretamente para converter de Fahrenheit para Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius é: " + celsius + " ºC");
    }
}
