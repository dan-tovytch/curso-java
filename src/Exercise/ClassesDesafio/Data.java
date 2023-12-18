package Exercise.ClassesDesafio;

public class Data {

    public int Mes;
    public int Dia;
    public int Ano;

    Data() {
        Dia = 1;
        Mes = 1;
        Ano = 1970;
    }

    public Data(int diaInicial, int mesInicial, int anoIncial) {
        Dia = diaInicial;
        Mes = mesInicial;
        Ano = anoIncial;
    }

    public String obterDataFormatada() {
        return String.format("%d/%d/%d", Dia, Mes, Ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
