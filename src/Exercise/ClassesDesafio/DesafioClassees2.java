package Exercise.ClassesDesafio;

public class DesafioClassees2 {
    public static void main(String[] args) {

        DesafioClasseDatas2 d1 = new DesafioClasseDatas2();
        d1.Dia = 24;
        d1.Mes = 11;
        d1.Ano = 2023;


        var d2 = new DesafioClasseDatas2();
        d2.Dia = 25;
        d2.Mes = 11;
        d2.Ano = 2023;

        String obterDataFormatada1 = d1.obterDataFormatada();
        System.out.println(obterDataFormatada1);
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();

    }
}
