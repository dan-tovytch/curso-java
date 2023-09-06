package Exercise.controle;

public class DesafioFor {
    public static void main(String[] args) {
//        String valor = "#";
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(valor);
//            valor += "#";
//        }

        // versão do desafio
        // Não pode usar valor númerico para controlar o laço!
        String valor = "#";
        String objetivo = "#####";

        for (; !valor.equals(objetivo); valor += "#") {
            System.out.println(valor);
        }


    }
}
