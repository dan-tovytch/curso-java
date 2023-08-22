package Basic.fudamentos;

import javax.swing.*;
import java.util.Scanner;

public class desafioFinalFundamentos3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String alturaInput = JOptionPane.showInputDialog("Digite a sua altura:");
        double altura = Double.parseDouble(alturaInput);
        String pesoInput = JOptionPane.showInputDialog("Digite seu peso:");
        double peso = Double.parseDouble(pesoInput);

        double resultado = peso / (altura * altura);

        System.out.println("Seu IMC é: " + resultado);
    }
}
