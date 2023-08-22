package Exercise.fudamentos;

import javax.swing.*;
import java.util.Scanner;

public class desafioFinalFundamentos5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String baseTrianguloInput = JOptionPane.showInputDialog("Digite o valor da base do triângulo:");
        double baseTriangulo = Double.parseDouble(baseTrianguloInput);
        String alturaTrianguloInput = JOptionPane.showInputDialog("Digite o valor da altura do triângulo:");
        double alturaTriangulo = Double.parseDouble(alturaTrianguloInput);

        double area = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("A área do triângulo é: " + area);
    }
}
