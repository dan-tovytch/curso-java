package Exercise.ClassesDesafio;

public class Data {

    int Mes;
    int Dia;
    int Ano;

    Data() {
        Dia = 1;
        Mes = 1;
        Ano = 1970;
    }

    Data(int diaInicial, int mesInicial, int anoIncial) {
        Dia = diaInicial;
        Mes = mesInicial;
        Ano = anoIncial;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", Dia, Mes, Ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
