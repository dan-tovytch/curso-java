package Exercise.ClassesDesafio;

public class Data {

    public int Mes;
    public int Dia;
    public int Ano;

    Data() {
//        Dia = 1;
//        Mes = 1;
//        Ano = 1970;
        this(1, 1, 1970);
    }

    public Data(int Dia, int Mes, int Ano) {
        this.Dia = Dia;
        this.Mes = Mes;
        this.Ano = Ano;
    }

    public String obterDataFormatada() {
        return String.format("%d/%d/%d", this.Dia, Mes, Ano);
    }

    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }

}
