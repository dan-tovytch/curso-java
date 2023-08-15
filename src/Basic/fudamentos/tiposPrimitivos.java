package Basic.fudamentos;

public class tiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionario

        // tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        // Tipos númericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // tipos booleano
        boolean estaDeFerias = false; // true

        // tipo caractere
        String status = "A"; // Ativo


        // Dias de Empresa
        System.out.println(anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por reais
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": Ganha -> " + salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
