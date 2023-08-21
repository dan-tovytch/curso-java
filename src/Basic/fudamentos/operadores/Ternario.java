package Basic.fudamentos.operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 7.6;
        String resultadoFinal = media >= 7.0 ? "Aprovado" : "Em recuperação." ;

        System.out.println("O aluno está " + resultadoFinal);

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPormedia = nota >= 7;
        boolean temdesconto = bomComportamento && passouPormedia;
        String resultado = temdesconto ? "sim" : "não";

        System.out.printf("Tem desconto? %s", resultado);

    }
}
