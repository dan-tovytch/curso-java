package Basic.fudamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(3 > 4);
        System.out.println(3 >= 3);
        System.out.println(3 < 7);
        System.out.println(30 <= 7);

        double nota = 7.3;
        boolean bomComportamento = false;
        boolean passouPormedia = nota >= 7;
        boolean temdesconto = bomComportamento && passouPormedia;

        System.out.println("Tem desconto? " + temdesconto);
    }
}
