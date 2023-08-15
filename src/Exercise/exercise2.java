package Exercise;

public class exercise2 {
    public static void main(String[] args) {
        final double fator = 5 / 9.0;
        final double ajuste = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - ajuste) * fator;
        System.out.println("O resultado é " + celsius + "ºC.");

        fahrenheit = 150;
        celsius = (fahrenheit - ajuste) * fator;

        System.out.println("O resultado é " + celsius + "ºC.");

    }

}
