package Basic.fudamentos;

public class Aula1 {
    public static void main(String[] args) {
        double raio = 3.4;
        final double pi = 3.14159;

        double area = pi * raio * raio;
        System.out.println(area);
        raio = 10;
        area = pi * raio * raio;
        System.out.println("Ária = " + area + "m2.");
    }
}
