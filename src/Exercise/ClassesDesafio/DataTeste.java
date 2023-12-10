package Exercise.ClassesDesafio;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.Ano = 2021;

        var d2 = new Data(31, 12, 2020);

        String obterDataFormatada1 = d1.obterDataFormatada();
        System.out.println(obterDataFormatada1);
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

    }
}