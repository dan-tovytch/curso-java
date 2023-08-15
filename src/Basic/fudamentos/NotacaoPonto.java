package Basic.fudamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        String x = "Dan".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Dan").toUpperCase().concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem operador "."
        int a = 3;
        System.out.println(a);
    }
}
