package Basic.fudamentos.operadores;

public class Logicos {
    public static void main(String[] args) {

        boolean codicao1 = true;
        boolean codicao2 = 3 > 7;

        System.out.println(codicao1 && !codicao2);
        System.out.println(codicao1 || codicao2);
        System.out.println(codicao1 ^ codicao2);
        System.out.println(!!codicao1);
        System.out.println(!codicao2);

        System.out.println("Tabela verdade E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("\nTabela verdade OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);
    }
}
