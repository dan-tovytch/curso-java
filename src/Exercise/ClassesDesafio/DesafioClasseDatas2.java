package Exercise.ClassesDesafio;

public class DesafioClasseDatas2 {

    int Mes;
    int Dia;
    int Ano;

    String obterDataFormatada() {
        return String.format("%d/%d/%d", Dia, Mes, Ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
